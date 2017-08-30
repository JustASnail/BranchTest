package com.mydemo.mybranchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //第一次提交

        //第二次提交

        //第三次

        //第四次

        //第五次

        //这次是branch1上修改的东西  =1

        //第二次修改branch1分支上的东西

        TestActivity.start(this);
    }
}
