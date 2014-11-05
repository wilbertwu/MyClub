package com.example.myclubmy;

import java.util.ArrayList;
import java.util.List;

import com.example.myclubmy.R.string;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;

public class AllNote extends Activity {
	@SuppressWarnings("unchecked")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_all_note);
		ListView allnote = (ListView)findViewById(R.id.listviewmyplan);
		String []array = new String[]{"投票 ----游泳", "例会"};
		allnote.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, array));
		//上面是用listview实现的，用扩展的可能会更好些
		final CharSequence[] peopleStrings = {"方XX","吴XX"};
		final CharSequence[]  starttimeStrings = {"2014-12-10/22:00","2014-12-12/18:00"};
		final CharSequence[]  endtimeStrings = {"2014-12-10/23:00", "2014-12-12/20:00"};
		final CharSequence[]  somenoteStrings = {"有要报销的同学记得带上发票", "记得准时"};
		final CharSequence[]  adressSequences  = {"慎思园六号文化室","体育馆"};
		final CharSequence[] nameCharSequences = {"例会","游泳"};
		final TextView nameTextView  = (TextView )findViewById(R.id.textviewname);
		
		allnote.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				// TODO Auto-generated method stub
				//根据点击的位置确定弹出窗口的内容
				//未实现，现在只是弹出demo
				
				   LayoutInflater inflater = getLayoutInflater();
				   //
                   View layout = inflater.inflate(R.layout.event_layout,
                     (ViewGroup) findViewById(R.id.eventRelativeLayout));  
                   new AlertDialog.Builder(AllNote.this).setTitle("通知").setView(layout)
                     .setPositiveButton("已读", null)  //null要放的是返回已读的监听
                     .show();
                   
			}
		});
	}// end of the oncreat

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.all_note, menu);
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
	
	
	
	
	
	
	
	
}