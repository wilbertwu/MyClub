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
        //���ĳһ���ͼ���viewlist
        ListItem item = new ListItem();  
        item.setTitle2("ͬ��");
        item.setTitle("��XX�������Ⱥ");
        mlist.add(item);
        
        item = new ListItem();
        item.setTitle2("��Ϊ����Ա");
        item.setTitle("��XX");
        mlist.add(item);
        
        MainListViewAdapter adapter = new MainListViewAdapter();
        // ��MainListAdapter���󴫵ݸ�ListView��ͼ  
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
	
	
	//��ͼ���listviewʵ��
		class ListItemView {  
	        TextView  textView2;  
	        TextView textView;  
	    }  
	      
	    /** 
	     * ��װ��������Դ���� 
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
	         * ����item�ĸ��� 
	         */  
	        @Override  
	        public int getCount() {  
	            // TODO Auto-generated method stub  
	            return mlist.size();  
	        }  
	  
	        /** 
	         * ����item������ 
	         */  
	        @Override  
	        public Object getItem(int position) {  
	            // TODO Auto-generated method stub  
	            return mlist.get(position);  
	        }  
	  
	        /** 
	         * ����item��id 
	         */  
	        @Override  
	        public long getItemId(int position) {  
	            // TODO Auto-generated method stub  
	            return position;  
	        }  
	  
	        /** 
	         * ����item����ͼ 
	         */  
	        @Override  
	        public View getView(int position, View convertView, ViewGroup parent) {  
	            ListItemView listItemView;  
	  
	            // ��ʼ��item view  
	            if (convertView == null) {  
	                // ͨ��LayoutInflater��xml�ж������ͼʵ������һ��View��  
	                convertView = LayoutInflater.from(MemberManagerActivity .this).inflate(  
	                        R.layout.items_member, null);  
	  
	                // ʵ����һ����װ��ListItemView����ʵ��������������  
	                listItemView = new ListItemView();  
	                listItemView.textView2 = (TextView) convertView  
	                        .findViewById(R.id.AgreeIn);
	                listItemView.textView = (TextView) convertView  
	                        .findViewById(R.id.textViewAttempt);
	  
	                // ��ListItemView���󴫵ݸ�convertView  
	                convertView.setTag(listItemView);  
	            } else {  
	                // ��converView�л�ȡListItemView����  
	                listItemView = (ListItemView) convertView.getTag();  
	            }  
	  
	            // ��ȡ��mList��ָ������λ�õ���Դ  
	            String title2 = mlist.get(position).getTitle2();
	            String title = mlist.get(position).getTitle();  
	  
	            // ����Դ���ݸ�ListItemView�����������  
	            listItemView.textView2 .setText(title2); 
	            listItemView.textView.setText(title);  
	  
	            // ����convertView����  
	            return convertView;  
	        }  
	  
	    }  
	
	
}