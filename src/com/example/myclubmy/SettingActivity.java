package com.example.myclubmy;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SettingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		
		Button logout = (Button)findViewById(R.id.buttonlogout);
		logout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(SettingActivity.this, LoginActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		
		Button modify = (Button)findViewById(R.id.buttonmodify);
		modify.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater inflater = getLayoutInflater();
				   View layout = inflater.inflate(R.layout.modifydialog,
				     (ViewGroup) findViewById(R.id.RelativeLayoutcreatnfind));
				   new AlertDialog.Builder(SettingActivity.this).setTitle("修改个人资料").setView(layout)
				     .setPositiveButton("确定", null)  //两个NULL这里要放的其实是这两个按钮点击的监听程序
				     .setNegativeButton("取消", null).show();
				 
			}
		});
		
		Button fankui = (Button)findViewById(R.id.buttonfankui);
		fankui.setOnClickListener(new View.OnClickListener() {
			
			@SuppressWarnings("null")
			@Override
			public void onClick(View v) {
				EditText textedit = new EditText(SettingActivity.this);
				// TODO Auto-generated method stub
				new AlertDialog.Builder(SettingActivity.this)
				                .setTitle("反馈")
				                .setView(textedit)
				                .setPositiveButton("确定", null)  
				                .setNegativeButton("取消",null)
				                .show();
			}
		});
		
		Button about = (Button)findViewById(R.id.buttonaboutus);
		about.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				new AlertDialog.Builder(SettingActivity.this)   
				.setTitle("关于我们")  
				.setMessage("SYSU--非常7+1")  
				.setPositiveButton("确定", null)
				.show();  
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.setting, menu);
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
