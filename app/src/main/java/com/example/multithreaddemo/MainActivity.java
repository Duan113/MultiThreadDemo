package com.example.multithreaddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnthread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnthread=findViewById(R.id.btn_thread);
        btnthread.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){

            case R.id.btn_thread:
                intent=new Intent(MainActivity.this,ThreadActivity.class);

                break;
        }
        startActivity(intent);
    }
}
