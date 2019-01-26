package com.example.lifen.techan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by lifen on 2017/4/24 0024.
 */

public class ganguoxilie extends Activity {
    private ImageView linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ganguo_te);
        linearLayout=(ImageView) findViewById(R.id.toshangpin1);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ganguoxilie.this,shangpinxiangqing.class);
                startActivity(intent);
            }
        });
    }
}
