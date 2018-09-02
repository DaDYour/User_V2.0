package com.example.foolishfan.user_v10;


import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class User extends AppCompatActivity {
private Button Nbutton1;
private  Button Nbutton2;
private Button Nbutton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        Nbutton1=(Button)findViewById(R.id.buttonA);
        Nbutton2=(Button)findViewById(R.id.buttonB);
        Nbutton3=(Button)findViewById(R.id.buttonC);
    }
    public void back_to_login(View view) {
        //setContentView(R.layout.login);//点击back按钮回到登陆页面，这是一个监听器的实现
        Intent intent3 = new Intent(User.this,Login.class) ;
        startActivity(intent3);
        finish();

    }
}
