package com.bw.xuliming20200224.view.activity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bw.xuliming20200224.R;
import com.bw.xuliming20200224.base.BaseActivity;
import com.bw.xuliming20200224.contracl.IContracl;
import com.bw.xuliming20200224.entity.ShopEntity;
import com.bw.xuliming20200224.presenter.ShopPresenter;
import com.bw.xuliming20200224.view.fragment.OneFragment;
import com.bw.xuliming20200224.view.fragment.TwoFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<ShopPresenter> implements IContracl.IView {


    @BindView(R.id.rb1)
    RadioButton rb1;
    @BindView(R.id.rb2)
    RadioButton rb2;
    @BindView(R.id.rg)
    RadioGroup rg;
    @BindView(R.id.vp)
    ViewPager vp;
    List<Fragment> fragments=new ArrayList<>();
    @Override
    protected void initData() {
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb1:
                        vp.setCurrentItem(0);
                        break;
                    case R.id.rb2:
                        vp.setCurrentItem(1);
                        break;
                }
            }
        });
        OneFragment oneFragment=new OneFragment();
        TwoFragment twoFragment=new TwoFragment();
        fragments.add(oneFragment);
        fragments.add(twoFragment);
        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });
    vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
        rg.check(rg.getChildAt(position).getId());
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    });
    }

    @Override
    protected void initView() {

    }

    @Override
    protected ShopPresenter initPresenter() {
        return new ShopPresenter();
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void sucess(ShopEntity shopEntity) {

    }

    @Override
    public void shibai(Throwable throwable) {

    }


}
