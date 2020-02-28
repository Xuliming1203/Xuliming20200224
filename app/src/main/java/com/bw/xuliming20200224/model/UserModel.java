package com.bw.xuliming20200224.model;

import com.bw.xuliming20200224.api.UserApiService;
import com.bw.xuliming20200224.contracl.IUserContracl;
import com.bw.xuliming20200224.entity.UserEntity;
import com.bw.xuliming20200224.utils.RetrofitUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * 时间：2020/2/26
 * 作者：徐黎明
 * 类的作用：
 */
public class UserModel implements IUserContracl.Imodel {
    @Override
    public void getzhuche(String phone, String pwd, ModelCallBack modelCallBack) {
        RetrofitUtil.getInstance().createservice(UserApiService.class)
                .zhuche(phone, pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<UserEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(UserEntity userEntity) {
                        if ("0000".equals(userEntity.getStatus())){
                            modelCallBack.success(userEntity);
                        }else {
                            modelCallBack.fshibai(new Exception(userEntity.getMessage()));
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        modelCallBack.fshibai(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void getlogin(String phone, String pwd, ModelCallBack modelCallBack) {
        RetrofitUtil.getInstance().createservice(UserApiService.class)
                .user(phone, pwd)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<UserEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(UserEntity userEntity) {
                        if ("0000".equals(userEntity.getStatus())){
                            modelCallBack.success(userEntity);
                        }else {
                            modelCallBack.fshibai(new Exception(userEntity.getMessage()));
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        modelCallBack.fshibai(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
