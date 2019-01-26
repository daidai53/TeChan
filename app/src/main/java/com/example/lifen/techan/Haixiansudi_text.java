package com.example.lifen.techan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by lifen on 2017/4/24 0024.
 */

public class Haixiansudi_text extends Activity{
    private ImageView linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.haixiansudi_te);
        linearLayout=(ImageView) findViewById(R.id.toshangpin);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Haixiansudi_text.this,shangpinxiangqing.class);
                startActivity(intent);
            }
        });
    }
}
