package com.example.myclubmy;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.buttonmyplan);
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, MyPlan.class);
				startActivity(intent);
			}
		});
        Button note = (Button)findViewById(R.id.buttonnote);
        note.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, AllNote.class);
				startActivity(intent);
			}
		});
        Button setbutton = (Button)findViewById(R.id.buttonset);
		setbutton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent2 = new Intent(MainActivity.this, SettingActivity.class);
				startActivity(intent2);
			}
		});
		Button planButton = (Button)findViewById(R.id.buttonmyplan);
		planButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, MyPlan.class);
				startActivity(intent);
			}
		});
		
		Button club = (Button)findViewById(R.id.buttonmyclub);
		club.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, MyClub.class);
				startActivity(intent);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
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
    
    
    //双击退出
    private long exitTime = 0; 
    
    @Override 
    public boolean onKeyDown(int keyCode, KeyEvent event) { 
    if(keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN){ 
    if((System.currentTimeMillis()-exitTime) > 2000){ 
    Toast.makeText(getApplicationContext(), "再按一次退出程序", Toast.LENGTH_SHORT).show(); 
    exitTime = System.currentTimeMillis(); 
    } else { 
    finish(); 
    System.exit(0); 
    } 
    return true; 
    } 
    return super.onKeyDown(keyCode, event); 
    } 
}
