package com.example.lifen.techan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by lifen on 2017/4/23 0023.
 */

public class FaxianFragment extends Fragment {
    private ImageView imageView1;
    private ImageView imageView2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3, container, false);
        imageView1=(ImageView)view.findViewById(R.id.jinru3_1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),faxian_text1.class);
                startActivity(intent);
            }
        });
        imageView2=(ImageView)view.findViewById(R.id.jinru3_2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),faxian_text2.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
