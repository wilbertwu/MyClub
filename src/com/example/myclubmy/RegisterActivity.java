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
		school.setPrompt("��ѡ������ѧУ");
		String[] schoolitems = {"��ɽ��ѧ","��������ѧ","����������ó��ѧ"};
		ArrayAdapter<String> Adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, schoolitems);
		school.setAdapter(Adapter);
		
		final Spinner major = (Spinner)findViewById(R.id.spinnermajor);
		school.setPrompt("��ѡ������רҵ");
		String[] majoritems = {"���ѧԺ", "����ѧԺ","�ſ�Ժ"};
		ArrayAdapter<String> _AdapterMajor=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, majoritems);
		major.setAdapter(_AdapterMajor);
		Button enter = (Button)findViewById(R.id.buttonenter);
		enter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//ע�����ȷ����  ��Ҫ���ж�ע���Ƿ�Ϸ�
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
				//ע�����ȷ����  ��Ҫ���ж�ע���Ƿ�Ϸ�
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
