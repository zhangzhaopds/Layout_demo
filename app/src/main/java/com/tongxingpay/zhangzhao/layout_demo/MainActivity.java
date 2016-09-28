package com.tongxingpay.zhangzhao.layout_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button frameBtn;
    private Button linearBtn;
    private Button absoluteBtn;
    private Button tableBtn;
    private Button relativeBtn;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setClickedBtn();
    }

    private void setClickedBtn() {

        frameBtn = (Button)findViewById(R.id.main_framelayoutBtn);
        linearBtn = (Button)findViewById(R.id.main_linearlayoutBtn);
        absoluteBtn = (Button)findViewById(R.id.mainabsolutelayoutBtn);
        tableBtn = (Button)findViewById(R.id.main_tablelayoutBtn);
        relativeBtn = (Button)findViewById(R.id.main_relativelayoutBtn);

        frameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: frameBtn");
                btnClicked(FrameActivity.class);
            }
        });

        linearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: linearBtn");
                btnClicked(LinearActivity.class);
            }
        });

        absoluteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: absoluteBtn");
                btnClicked(AbsoluteActivity.class);
            }
        });

        tableBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: tableBtn");
                btnClicked(TableActivity.class);
            }
        });

        relativeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: relativeBtn");
                btnClicked(RelativeActivity.class);
            }
        });

    }

    private void btnClicked(Class c) {
        Intent frameIntent = new Intent();
        Bundle frameBundle = new Bundle();
        frameIntent.putExtras(frameBundle);
        frameIntent.setClass(MainActivity.this, c);
        startActivity(frameIntent);
    }
}
