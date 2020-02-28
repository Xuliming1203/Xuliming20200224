package com.bw.xuliming20200224.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 时间：2020/2/24
 * 作者：徐黎明
 * 类的作用：
 */
public  abstract class BaseFragment<P extends IBasePresenter>  extends Fragment implements IBaseView {
    public P presenter;
    private Unbinder bind;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(layoutId(),null);
        bind = ButterKnife.bind(this,view);
        presenter=initPresenter();
        if (presenter != null) {
            presenter.attatch(this);
        }
        return view;

    }

    protected abstract int layoutId();

    protected abstract P initPresenter();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    protected abstract void initData();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.deatch();
        }
        if (bind != null) {
            bind.unbind();
        }
    }
}
