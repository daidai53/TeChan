package com.example.lifen.techan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

/**
 * Created by lifen on 2017/4/24 0024.
 */

public class yindao_page extends Activity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yindao_pa);
        textView=(TextView)findViewById(R.id.enter_text);
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                textView.setText("2秒后进入应用");
            }

        },1000);
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                textView.setText("1秒后进入应用");
            }

        },2000);
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent intent=new Intent(yindao_page.this,MainActivity.class);
                startActivity(intent);
                yindao_page.this.finish();
            }

        },3000);
    }
}
