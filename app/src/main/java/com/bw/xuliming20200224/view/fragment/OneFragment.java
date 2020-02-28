package com.bw.xuliming20200224.view.fragment;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bw.xuliming20200224.R;
import com.bw.xuliming20200224.base.BaseFragment;
import com.bw.xuliming20200224.contracl.IContracl;
import com.bw.xuliming20200224.entity.ShopEntity;
import com.bw.xuliming20200224.presenter.ShopPresenter;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends BaseFragment<ShopPresenter> implements IContracl.IView {



    @Override
    protected int layoutId() {
        return R.layout.one_adapter;
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
