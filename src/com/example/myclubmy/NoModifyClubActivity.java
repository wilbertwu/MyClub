package com.example.myclubmy;

import java.util.ArrayList;

import com.example.myclubmy.MyPlan.ListItem;
import com.example.myclubmy.MyPlan.ListItemView;
import com.example.myclubmy.MyPlan.MainListViewAdapter;

import android.app.Activity;
import android.content.Intent;
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

public class NoModifyClubActivity extends Activity {
	private ArrayList<ListItem > mlist;
	private ListView mListView ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_no_modify_club);
		Button backButton = (Button)findViewById(R.id.buttonback11);
		backButton .setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				NoModifyClubActivity .this.finish();
			}
		});
		Button homeButton = (Button)findViewById(R.id.buttonhome5);
		homeButton .setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(NoModifyClubActivity.this, MainActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		
		
		mListView = (ListView )findViewById(R.id.listViewclubactivityno);
		mListView.setDividerHeight(0);
		Resources res = this.getResources();
        mlist = new ArrayList<NoModifyClubActivity .ListItem>();  
        //���ĳһ���ͼ���viewlist
        ListItem item = new ListItem();
        for(int i = 0; i <= 5; i++) {
        item.setImage(res.getDrawable(R.drawable.timeline));  
        item.setTitle("");
        item.setTime("");
        mlist.add(item);
        }
        item = new ListItem();  
        item.setImage(res.getDrawable(R.drawable.timespot));  
        item.setTitle("����");
        item.setTime("2014-12-08");
        mlist.add(item);
        
        for (int i = 0; i <=2; i++) {
        item = new ListItem();
        item.setImage(res.getDrawable(R.drawable.timeline));
        item.setTitle("");
        mlist.add(item);
        }
        
        item = new ListItem();
        item.setImage(res.getDrawable(R.drawable.timespot));
        item.setTitle("��Ӿ");
        item.setTime("2014-12-12");
        mlist.add(item);
        
        for (int i = 0 ; i <= 3; i++) {
        	item = new ListItem();
            item.setImage(res.getDrawable(R.drawable.timeline));
            item.setTitle("");
            mlist.add(item);
        }
        
        MainListViewAdapter adapter = new MainListViewAdapter();
        // ��MainListAdapter���󴫵ݸ�ListView��ͼ  
        mListView.setAdapter(adapter);  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.no_modify_club, menu);
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
        ImageView imageView;  
        TextView textView;
        TextView timeTextView;
    }  
      
    /** 
     * ��װ��������Դ���� 
     */  
    class ListItem {  
        private Drawable image;  
        private String title;
        private String time;
  
        public Drawable getImage() {  
            return image;  
        }  
  
        public void setImage(Drawable image) {  
            this.image = image; 
        }  
  
        public String getTitle() {  
            return title;  
        }  
  
        public void setTitle(String title) {  
            this.title = title;  
        } 
        public String getTime() {
        	return time;
        }
        public void setTime(String timeString ) {
        	this.time = timeString ;
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
                convertView = LayoutInflater.from(NoModifyClubActivity .this).inflate(  
                        R.layout.items, null);  
  
                // ʵ����һ����װ��ListItemView����ʵ��������������  
                listItemView = new ListItemView();  
                listItemView.imageView = (ImageView) convertView  
                        .findViewById(R.id.image);
                listItemView.textView = (TextView) convertView  
                        .findViewById(R.id.title);
                listItemView.timeTextView = (TextView) convertView
                		.findViewById(R.id.time);
  
                // ��ListItemView���󴫵ݸ�convertView  
                convertView.setTag(listItemView);  
            } else {  
                // ��converView�л�ȡListItemView����  
                listItemView = (ListItemView) convertView.getTag();  
            }  
  
            // ��ȡ��mList��ָ������λ�õ���Դ  
            Drawable img = mlist.get(position).getImage();  
            String title = mlist.get(position).getTitle();  
            String time = mlist.get(position ).getTime();
  
            // ����Դ���ݸ�ListItemView����������� 
            listItemView .timeTextView .setText(time);
            listItemView.imageView.setImageDrawable(img);  
            listItemView.textView.setText(title);
            
  
            // ����convertView����  
            return convertView;  
        }  
  
    }  
}
