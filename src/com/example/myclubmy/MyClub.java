package com.example.myclubmy;



import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MyClub extends Activity {
	//private PopupWindow popupWindow ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_club);
		TextView firstclub = (TextView)findViewById(R.id.textViewclub1);
		firstclub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MyClub.this, ClubManagerActivity.class);
				startActivity(intent);   //点击进入管理社团
			}
		});
		//点击返回主页
		Button button = (Button)findViewById(R.id.buttonhome3);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MyClub.this, MainActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		
		Button backButton = (Button)findViewById(R.id.buttonback6);
		backButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				MyClub .this.finish();
			}
		});
		final View pview = getLayoutInflater().inflate(R.layout.creatnfind_layout,null);
		
		Button searchButton = (Button)pview.findViewById(R.id.buttonsearchclub);
		searchButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MyClub.this, SearchClubActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		
		Button creatButton = (Button)pview.findViewById(R.id.buttoncreatclub);
		creatButton .setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MyClub.this, CreateClubActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
			}
		});
		//初始化弹窗
		Button addclubButton = (Button)findViewById(R.id.buttoneditoption);
		addclubButton .setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			        final PopupWindow popupWindow  = new PopupWindow
			        		   (pview, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, true);
			        popupWindow .setBackgroundDrawable(new BitmapDrawable());
			        //popupWindow .setBackgroundDrawable();
					popupWindow.setFocusable(true);
					//popupWindow .setOutsideTouchable(true);
					
					popupWindow .showAsDropDown(v);//以这个Button为anchor（可以理解为锚，基准），在下方弹出
			}
		});
	    
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_club, menu);
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
