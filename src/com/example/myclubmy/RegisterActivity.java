package com.example.myclubmy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class RegisterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		final Spinner school = (Spinner)findViewById(R.id.spinnerschool);
		school.setPrompt("请选择所在学校");
		String[] schoolitems = {"中山大学","华南理工大学","广州外语外贸大学"};
		ArrayAdapter<String> Adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, schoolitems);
		school.setAdapter(Adapter);
		
		final Spinner major = (Spinner)findViewById(R.id.spinnermajor);
		school.setPrompt("请选择所在专业");
		String[] majoritems = {"软件学院", "管理学院","信科院"};
		ArrayAdapter<String> _AdapterMajor=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, majoritems);
		major.setAdapter(_AdapterMajor);
		Button enter = (Button)findViewById(R.id.buttonenter);
		enter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//注册完成确定键  需要有判断注册是否合法
				Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		Button cancle = (Button)findViewById(R.id.buttonlogout);
		cancle.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//注册完成确定键  需要有判断注册是否合法
				Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
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
