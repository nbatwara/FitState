package com.coms309.group11;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Register extends Activity{

    EditText ET_name;
    EditText ET_userName;
    EditText ET_password;
    String name;
    String userName;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        ET_name = (EditText)findViewById(R.id.name);
        ET_userName= (EditText)findViewById(R.id.new_user_name);
        ET_password = (EditText)findViewById(R.id.new_user_pass);
    }

     public void userReg(View view){
         name = ET_name.getText().toString();
         userName = ET_userName.getText().toString();
         password =ET_password.getText().toString();
         String method = "register";
         BackgroundTask backgroundTask = new BackgroundTask(this);
         backgroundTask.execute(method, name, userName, password);
         finish();
     }

}
