package com.example.lifen.techan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by lifen on 2017/4/24 0024.
 */

public class GerenFragment extends Fragment {
    private ImageView imageView;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab5, container, false);
        imageView=(ImageView)view.findViewById(R.id.mail_button);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"您目前没有未读消息",Toast.LENGTH_LONG).show();
            }
        });
        imageView1=(ImageView)view.findViewById(R.id.gerenb1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),denglu_page.class);
                startActivity(intent);
            }
        });
        imageView2=(ImageView)view.findViewById(R.id.gerenb2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),dingdan_page.class);
                startActivity(intent);
            }
        });
        imageView3=(ImageView)view.findViewById(R.id.gerenb3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),yaoqing_page.class);
                startActivity(intent);
            }
        });
        imageView4=(ImageView)view.findViewById(R.id.gerenb4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),liquan_page.class);
                startActivity(intent);
            }
        });
        imageView5=(ImageView)view.findViewById(R.id.gerenb5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),xihuans_page.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
