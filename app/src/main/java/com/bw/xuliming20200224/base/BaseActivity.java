package com.bw.xuliming20200224.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 时间：2020/2/24
 * 作者：徐黎明
 * 类的作用：
 */
public abstract class BaseActivity<P extends IBasePresenter> extends AppCompatActivity implements IBaseView {
    public P presenter;
    private Unbinder bind;
    protected  boolean userThecolor=false;
    protected  boolean userecolor=true;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        setcolor();
        bind = ButterKnife.bind(this);
        presenter=initPresenter();
        if (presenter != null) {
            presenter.attatch(this);
        }
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract P initPresenter();

    protected abstract int layoutId();
    public void setcolor(){

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.deatch();
        }
        if (bind != null) {
            bind.unbind();
        }
    }

}
