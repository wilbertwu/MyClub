package com.example.myclubmy;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class WorkNoteActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_work_note);
		
		Button membernoteButton = (Button)findViewById(R.id.buttonmembernote);
		membernoteButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 LayoutInflater inflater = getLayoutInflater();
				   //
                 View layout = inflater.inflate(R.layout.member_note_dialoag,
                   (ViewGroup) findViewById(R.id.RelativeLayoutcreatnfind ));
                 new AlertDialog.Builder(WorkNoteActivity .this).setTitle("通知成员").setView(layout)
                   .setPositiveButton("确定", null)  //null要放的是返回已读的监听
                   .show();
			}
		});
		
		Button optionalButton  = (Button)findViewById(R.id.buttonoptionedit);
		optionalButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 LayoutInflater inflater = getLayoutInflater();
				   //
                 View layout = inflater.inflate(R.layout.optional_edit_dialog,
                   (ViewGroup) findViewById(R.id.optionallayout));
                 new AlertDialog.Builder(WorkNoteActivity .this).setTitle("选项编辑").setView(layout)
                   .setPositiveButton("确定", null)  //null要放的是返回已读的监听
                   .show();
			}
		});
		
		Button backButton = (Button)findViewById(R.id.buttonback10);
		backButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				WorkNoteActivity .this.finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.work_note, menu);
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
