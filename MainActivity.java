package com.coms309.group11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity{

    EditText ET_name;
    EditText ET_password;
    String login_name;
    String login_password;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET_name = (EditText)findViewById(R.id.user_name);
        ET_password = (EditText)findViewById(R.id.user_pass);
    }

    public void userReg(View view){
        startActivity(new Intent(this,Register.class));
    }

    public void userLogin(View view){
        login_name = ET_name.getText().toString();
        login_password = ET_password.getText().toString();
        String method = "login";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,login_name,login_password);
    }

}
