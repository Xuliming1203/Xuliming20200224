package com.bw.xuliming20200224.model;

import com.bw.xuliming20200224.api.Api;
import com.bw.xuliming20200224.api.ShopApiService;
import com.bw.xuliming20200224.contracl.IContracl;
import com.bw.xuliming20200224.entity.ShopEntity;
import com.bw.xuliming20200224.utils.RetrofitUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * 时间：2020/2/24
 * 作者：徐黎明
 * 类的作用：
 */
public class ShopModel implements IContracl.IModel {
    @Override
    public void getshop(String userId, String sessionId, int type, int page, int size, ModelCallBack modelCallBack) {
        RetrofitUtil.getInstance().createservice(ShopApiService.class)
                .getshop(userId, sessionId, type, page, size)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ShopEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ShopEntity shopEntity) {
                        if ("0000".equals(shopEntity.getStatus())){
                            modelCallBack.sucess(shopEntity);
                        }else {
                            modelCallBack.shibai(new Exception(shopEntity.getMessage()));
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                     modelCallBack.shibai(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
