package com.example.myclubmy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ClubManagerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_club_manager);
		Button clubmanagerButton = (Button)findViewById(R.id.buttonclubmanager);
		clubmanagerButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ClubManagerActivity.this, SubClubManagerNewActivity .class);
				startActivity(intent);
			}
		});
		//home键返回主页
		Button button = (Button)findViewById(R.id.buttonhomemyplan);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ClubManagerActivity.this, MainActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		//back
		Button backButton = (Button)findViewById(R.id.buttonback3);
		backButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				ClubManagerActivity.this.finish();
			}
		});
		
		//button clubactivity 不可修改
		Button clubactivityButton = (Button )findViewById(R.id.buttoncreatclub );  //id warning
		clubactivityButton .setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ClubManagerActivity .this, NoModifyClubActivity .class);
				intent.setFlags(android.content.Intent .FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		Button gameButton = (Button)findViewById(R.id.buttonplaygame);
		gameButton .setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ClubManagerActivity.this, PlayingGamesActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		
		Button shareButton = (Button)findViewById(R.id.buttonresourceshare);
		shareButton .setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ClubManagerActivity.this, ResourceShareActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.club_manager, menu);
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
