package com.bw.xuliming20200224.view.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bw.xuliming20200224.R;
import com.bw.xuliming20200224.base.BaseFragment;
import com.bw.xuliming20200224.contracl.IContracl;
import com.bw.xuliming20200224.entity.ShopEntity;
import com.bw.xuliming20200224.presenter.ShopPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends BaseFragment<ShopPresenter> implements IContracl.IView {

    @Override
    protected int layoutId() {
        return R.layout.fragment_two;
    }

    @Override
    protected ShopPresenter initPresenter() {
        return new ShopPresenter();
    }

    @Override
    protected void initData() {

    }

    @Override
    public void sucess(ShopEntity shopEntity) {

    }

    @Override
    public void shibai(Throwable throwable) {

    }
}
