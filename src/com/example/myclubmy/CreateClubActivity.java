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

public class CreateClubActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_club);
		Spinner schoolSpinner = (Spinner)findViewById(R.id.spinnerschool);
		schoolSpinner.setPrompt("请选择所在学校");
		String[] schoolitems = {"中山大学","华南理工大学","广州外语外贸大学"};
		ArrayAdapter<String> Adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, schoolitems);
		schoolSpinner .setAdapter(Adapter);
		Spinner majorSpinner = (Spinner )findViewById(R.id.spinnermajor);
		majorSpinner .setPrompt("请选择所在专业");
		String[] majorStrings = {"软件学院","管理学院","医学院"};
		ArrayAdapter<String> majorAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
																		majorStrings);
		majorSpinner .setAdapter(majorAdapter );
		//确定创建社团
		Button enterButton = (Button)findViewById(R.id.buttoncreatclubenter);
		enterButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(CreateClubActivity.this, ClubManagerActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		Button backButton = (Button)findViewById(R.id.buttonbackcreat);
		backButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(CreateClubActivity.this, MyClub .class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_club, menu);
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
