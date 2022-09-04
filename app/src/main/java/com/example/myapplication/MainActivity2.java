package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


}

    public void singIn(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);  
        finish();
    }
    public void login(View view)
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
