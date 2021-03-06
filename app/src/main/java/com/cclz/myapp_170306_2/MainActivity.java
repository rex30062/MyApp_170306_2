package com.cclz.myapp_170306_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
    implements  View.OnClickListener{
    Button btn, btn2;
    ToggleButton tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.button); //指向畫面上的按鈕
        btn2=(Button) findViewById(R.id.button2);
        tb=(ToggleButton) findViewById(R.id.toggleButton);
        btn.setOnClickListener(this); // 設定一個符合介面的物件
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Log.d("BTN","Test1");
                break;
            case R.id.button2:
                Log.d("BTN","Test2");
                if(tb.isChecked()){
                    Log.d("TB", "有開");
                }
                else{
                    Log.d("TB", "關閉中");
                }
                break;
        }
    }
}
