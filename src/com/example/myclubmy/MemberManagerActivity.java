package com.example.myclubmy;

import java.util.ArrayList;

import com.example.myclubmy.MyPlan.ListItem;
import com.example.myclubmy.MyPlan.ListItemView;
import com.example.myclubmy.MyPlan.MainListViewAdapter;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MemberManagerActivity extends Activity {
	private ListView mListView ;
	private ArrayList<ListItem > mlist;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_member_manager);
		
		Button backButton = (Button)findViewById(R.id.buttonback4);
		backButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				MemberManagerActivity.this.finish();
			}
		});
		
		mListView = (ListView )findViewById(R.id.listViewMembermanager);
        mlist = new ArrayList<MemberManagerActivity.ListItem>();  
        //添加某一项带图标的viewlist
        ListItem item = new ListItem();  
        item.setTitle2("同意");
        item.setTitle("吴XX申请加入群");
        mlist.add(item);
        
        item = new ListItem();
        item.setTitle2("设为管理员");
        item.setTitle("方XX");
        mlist.add(item);
        
        MainListViewAdapter adapter = new MainListViewAdapter();
        // 将MainListAdapter对象传递给ListView视图  
        mListView.setAdapter(adapter); 
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.member_manager, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	//带图标的listview实现
		class ListItemView {  
	        TextView  textView2;  
	        TextView textView;  
	    }  
	      
	    /** 
	     * 封装了两个资源的类 
	     */  
	    class ListItem {  
	        private String title2;  
	        private String title;
	  
	        
	        public String getTitle() {  
	            return title;  
	        }  
	        public String getTitle2() {
	        	return title2;
	        }
	        public void setTitle(String title) {  
	            this.title = title;  
	        }  
	        public void setTitle2(String title2) {
	        	this.title2 = title2;
	        }
	  
	    }
	    
	    class MainListViewAdapter extends BaseAdapter {  
	    	  
	        /** 
	         * 返回item的个数 
	         */  
	        @Override  
	        public int getCount() {  
	            // TODO Auto-generated method stub  
	            return mlist.size();  
	        }  
	  
	        /** 
	         * 返回item的内容 
	         */  
	        @Override  
	        public Object getItem(int position) {  
	            // TODO Auto-generated method stub  
	            return mlist.get(position);  
	        }  
	  
	        /** 
	         * 返回item的id 
	         */  
	        @Override  
	        public long getItemId(int position) {  
	            // TODO Auto-generated method stub  
	            return position;  
	        }  
	  
	        /** 
	         * 返回item的视图 
	         */  
	        @Override  
	        public View getView(int position, View convertView, ViewGroup parent) {  
	            ListItemView listItemView;  
	  
	            // 初始化item view  
	            if (convertView == null) {  
	                // 通过LayoutInflater将xml中定义的视图实例化到一个View中  
	                convertView = LayoutInflater.from(MemberManagerActivity .this).inflate(  
	                        R.layout.items_member, null);  
	  
	                // 实例化一个封装类ListItemView，并实例化它的两个域  
	                listItemView = new ListItemView();  
	                listItemView.textView2 = (TextView) convertView  
	                        .findViewById(R.id.AgreeIn);
	                listItemView.textView = (TextView) convertView  
	                        .findViewById(R.id.textViewAttempt);
	  
	                // 将ListItemView对象传递给convertView  
	                convertView.setTag(listItemView);  
	            } else {  
	                // 从converView中获取ListItemView对象  
	                listItemView = (ListItemView) convertView.getTag();  
	            }  
	  
	            // 获取到mList中指定索引位置的资源  
	            String title2 = mlist.get(position).getTitle2();
	            String title = mlist.get(position).getTitle();  
	  
	            // 将资源传递给ListItemView的两个域对象  
	            listItemView.textView2 .setText(title2); 
	            listItemView.textView.setText(title);  
	  
	            // 返回convertView对象  
	            return convertView;  
	        }  
	  
	    }  
	
	
}