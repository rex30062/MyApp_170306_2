package com.cclz.myapp_170306_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button) findViewById(R.id.button); //指向畫面上的按鈕
        btn.setOnClickListener(new View.OnClickListener(){// 設定一個符合介面的物件
            @Override
            public void onClick(View v) {
                Log.d("BTN","Test1");
            }
        });
    }
}
