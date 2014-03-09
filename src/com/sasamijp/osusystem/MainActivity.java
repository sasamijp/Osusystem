package com.sasamijp.osusystem;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.view.View.OnClickListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button1);
        final EditText edit = (EditText) findViewById(R.id.editText1);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this ,edit.getText() , Toast.LENGTH_LONG).show();
                Intent i = new Intent(MainActivity.this, SubActivity.class);
                //Editable a = edit.getText();
                String str = String.valueOf(edit.getText());
                i.putExtra("KEYWORD",str);
                startActivity(i);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

