package com.example.demo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener{
	
	private EditText input;
	private Button output;
	private TextView result;
	private String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        input=(EditText)findViewById(R.id.input);
        output=(Button)findViewById(R.id.output);
        result=(TextView)findViewById(R.id.result);
        
        output.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View v) {
		temp=input.getText().toString();
		result.setText(String.format("You just said %s", temp));
		
	}
}


   