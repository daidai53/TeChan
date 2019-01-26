package com.example.lifen.techan;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    //声明ViewPager
    private ViewPager mViewPager;
    //适配器
    private FragmentPagerAdapter mAdapter;
    //装载Fragment的集合
    private List<Fragment> mFragments;

    //四个Tab对应的布局
    private LinearLayout mTabWeixin;
    private LinearLayout mTabFrd;
    private LinearLayout mTabAddress;
    private LinearLayout mTabSetting;
    private LinearLayout mTabgeren;

    //四个Tab对应的ImageButton
    private ImageButton mImgWeixin;
    private ImageButton mImgFrd;
    private ImageButton mImgAddress;
    private ImageButton mImgSetting;
    private ImageButton mImgGeren;
    private boolean isExit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        initViews();//初始化控件
        initEvents();//初始化事件
        initDatas();//初始化数据
    }

    private void initDatas() {
        mFragments = new ArrayList<>();
        //将四个Fragment加入集合中
        mFragments.add(new ShouyeFragment());
        mFragments.add(new TemaiFragment());
        mFragments.add(new FaxianFragment());
        mFragments.add(new GouwucheFragment());
        mFragments.add(new GerenFragment());

        //初始化适配器
        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {//从集合中获取对应位置的Fragment
                return mFragments.get(position);
            }

            @Override
            public int getCount() {//获取集合中Fragment的总数
                return mFragments.size();
            }

        };
        //不要忘记设置ViewPager的适配器
        mViewPager.setAdapter(mAdapter);
        //设置ViewPager的切换监听
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            //页面滚动事件
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            //页面选中事件
            @Override
            public void onPageSelected(int position) {
                //设置position对应的集合中的Fragment
                mViewPager.setCurrentItem(position);
                resetImgs();
                selectTab(position);
            }

            @Override
            //页面滚动状态改变事件
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initEvents() {
        //设置四个Tab的点击事件
        mTabWeixin.setOnClickListener(this);
        mTabFrd.setOnClickListener(this);
        mTabAddress.setOnClickListener(this);
        mTabSetting.setOnClickListener(this);
        mTabgeren.setOnClickListener(this);

    }

    //初始化控件
    private void initViews() {
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);

        mTabWeixin = (LinearLayout) findViewById(R.id.id_tab_shouye);
        mTabFrd = (LinearLayout) findViewById(R.id.id_tab_temai);
        mTabAddress = (LinearLayout) findViewById(R.id.id_tab_faxian);
        mTabSetting = (LinearLayout) findViewById(R.id.id_tab_gouwuche);
        mTabgeren=(LinearLayout)findViewById(R.id.id_tab_geren);

        mImgWeixin = (ImageButton) findViewById(R.id.id_tab_shouye_img);
        mImgFrd = (ImageButton) findViewById(R.id.id_tab_temai_img);
        mImgAddress = (ImageButton) findViewById(R.id.id_tab_faxian_img);
        mImgSetting = (ImageButton) findViewById(R.id.id_tab_gouwuche_img);
        mImgGeren=(ImageButton)findViewById(R.id.id_tab_geren_img);

    }

    @Override
    public void onClick(View v) {
        //先将四个ImageButton置为灰色
        resetImgs();

        //根据点击的Tab切换不同的页面及设置对应的ImageButton为绿色
        switch (v.getId()) {
            case R.id.id_tab_shouye:
                selectTab(0);
                break;
            case R.id.id_tab_temai:
                selectTab(1);
                break;
            case R.id.id_tab_faxian:
                selectTab(2);
                break;
            case R.id.id_tab_gouwuche:
                selectTab(3);
                break;
            case R.id.id_tab_geren:
                selectTab(4);
                break;
        }
    }

    private void selectTab(int i) {
        //根据点击的Tab设置对应的ImageButton为绿色
        switch (i) {
            case 0:
                mImgWeixin.setImageResource(R.mipmap.tab_shouye_pressed);
                break;
            case 1:
                mImgFrd.setImageResource(R.mipmap.tab_temai_pressed);
                break;
            case 2:
                mImgAddress.setImageResource(R.mipmap.tab_faxian_pressed);
                break;
            case 3:
                mImgSetting.setImageResource(R.mipmap.tab_gouwuche_pressed);
                break;
            case 4:
                mImgGeren.setImageResource(R.mipmap.tab_geren_pressed);
        }
        //设置当前点击的Tab所对应的页面
        mViewPager.setCurrentItem(i);
    }

    //将四个ImageButton设置为灰色
    private void resetImgs() {
        mImgWeixin.setImageResource(R.mipmap.tab_shouye_normal);
        mImgFrd.setImageResource(R.mipmap.tab_temai_normal);
        mImgAddress.setImageResource(R.mipmap.tab_faxian_normal);
        mImgSetting.setImageResource(R.mipmap.tab_gouwuche_normal);
        mImgGeren.setImageResource(R.mipmap.tab_geren_normal);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            ToQuitTheApp();
            return false;
        }else{
            return super.onKeyDown(keyCode, event);
        }
    }
    private void ToQuitTheApp() {
        if (isExit) {
            MainActivity.this.finish();
        } else {
            isExit = true;
            Toast.makeText(this, "再点击一次back键退出", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable(){

                @Override
                public void run() {
                    isExit = false;
                }

            },3000);
        }
    }
}
