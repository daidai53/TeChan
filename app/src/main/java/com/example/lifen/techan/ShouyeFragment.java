package com.example.lifen.techan;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lifen on 2017/4/23 0023.
 */

public class ShouyeFragment extends Fragment implements SearchView.OnQueryTextListener{
    private SearchView searchView;
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, container, false);
        searchView=(SearchView)view.findViewById(R.id.search_view);
        searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(this);
        searchView.setSubmitButtonEnabled(true);
        searchView.setFocusable(false);
        searchView.setQueryHint("输入商品名");
        imageView1=(ImageView)view.findViewById(R.id.haixiansudi);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Haixiansudi_text.class);
                startActivity(intent);
            }
        });
        imageView2=(ImageView)view.findViewById(R.id.weihailaotiandian);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Haixiansudi_text.class);
                startActivity(intent);
            }
        });
        imageView3=(ImageView)view.findViewById(R.id.gangan);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),ganguoxilie.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return true;
    }

}
