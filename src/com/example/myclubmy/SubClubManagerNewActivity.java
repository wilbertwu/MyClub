package com.example.myclubmy;

import android.R.anim;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SubClubManagerNewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub_club_manager_new);
		
		//°´Å¥ÊÂ¼þ
		Button clubactivityButton = (Button)findViewById(R.id.buttonclubactivity);
		clubactivityButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent =new Intent(SubClubManagerNewActivity.this, ClubActivityActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		
		Button worknoteButton  = (Button)findViewById(R.id.buttonworknote );
		worknoteButton .setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent =new Intent(SubClubManagerNewActivity.this, WorkNoteActivity .class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		Button membermanagerButton   = (Button)findViewById(R.id.buttonmembermanager );
		membermanagerButton  .setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent =new Intent(SubClubManagerNewActivity.this, MemberManagerActivity  .class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		
		Button moneyButton   = (Button)findViewById(R.id.buttonmoneymanager );
		moneyButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent =new Intent(SubClubManagerNewActivity.this, MoneyManagerActivity  .class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});  //button
		
		Button homeButton  = (Button)findViewById(R.id.buttonhome3  );
		homeButton .setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent =new Intent(SubClubManagerNewActivity.this, MainActivity .class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		
		Button backButton = (Button)findViewById(R.id.buttonback9);
		backButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SubClubManagerNewActivity .this.finish();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sub_club_manager_new, menu);
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
