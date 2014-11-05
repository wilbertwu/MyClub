package com.example.myclubmy;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences; 
import android.content.SharedPreferences;
public class LoginActivity extends Activity {
	private SharedPreferences sharedPreferences;  
	  
    private SharedPreferences.Editor editor;  
	@SuppressLint({ "CommitPrefEdits", "WorldReadableFiles" }) @SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		sharedPreferences = this.getSharedPreferences("test",MODE_WORLD_READABLE);  
        editor = sharedPreferences.edit();  
  
        final EditText edtName = (EditText) this.findViewById(R.id.username);  
        final EditText edtPass = (EditText) this.findViewById(R.id.password);
        Button login = (Button)findViewById(R.id.buttonlogin);
        String name = sharedPreferences.getString("name", null);
        String pass = sharedPreferences.getString("pass", null);
        edtName.setText(name);
        edtPass.setText(pass);
        login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				NotificationManager manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
				Notification notification = new Notification(R.drawable.ic_launcher,"MyClub",System.currentTimeMillis());
				//notification .flags = Notification.FLAG_NO_CLEAR;
				Intent noteIntent = new Intent(LoginActivity .this, MainActivity .class);
				PendingIntent pendingIntent = PendingIntent.getActivity(LoginActivity.this,0,noteIntent,0);                                                                          notification.setLatestEventInfo
				(getApplicationContext(), "MyClub", "MyClub后台运行中", pendingIntent);
				manager .notify(1, notification );
				// TODO Auto-generated method stub
				String name = edtName.getText().toString();
				String pass = edtPass.getText().toString();
				editor.putString("name", name);
				editor.putString("pass", pass);
				editor.commit();
				//判断用户名密码是否相符后登陆
				//TODO
				Intent intent = new Intent(LoginActivity.this, MainActivity.class);
				intent.setFlags(android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				finish();
			}
		});
        
        Button register = (Button)findViewById(R.id.buttongame);
        register.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
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
