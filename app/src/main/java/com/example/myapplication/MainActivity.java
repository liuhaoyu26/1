package com.example.myapplication;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText etname;
    private EditText etage;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn_send);
        etage = (EditText) findViewById(R.id.et_age);
        etname = (EditText) findViewById(R.id.et_name);

        btn1.setOnClickListener(new View.OnClickListener() {  //用户点击按钮提交数据
            @Override
            public void onClick(View view) {
                pssDate();
            }
        });


    }

    public void pssDate(){
        Intent intent = new Intent(this,AnotherActivity.class);//创建Intent对象，启动MainActivity2

        intent.putExtra("name",etname.getText().toString().trim());  //将数据存入Intent对象
        intent.putExtra("age",etage.getText().toString().trim());
        startActivity(intent);
        finish();
    }
}