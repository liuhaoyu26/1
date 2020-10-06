package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class AnotherActivity extends Activity {
    private TextView tv1;
    private TextView tv2;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        tv1 = (TextView) findViewById(R.id.tv_1);
        tv2 = (TextView) findViewById(R.id.tv_2);
        btn2 = (Button) findViewById(R.id.btn_return);

        Intent intent1 = getIntent();//获取Intent对象

        //取出对key中的值
        String name = intent1.getStringExtra("name");
        String age = intent1.getStringExtra("age");
        //设置到对的控件中
        tv1.setText(name + "!");
        tv2.setText(age + "年。");

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updata();
            }
        });
    }

    private void updata() {
        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);
        finish();
    }
}
