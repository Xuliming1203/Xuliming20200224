package com.bw.xuliming20200224.presenter;

import com.bw.xuliming20200224.base.IBasePresenter;
import com.bw.xuliming20200224.contracl.IContracl;
import com.bw.xuliming20200224.contracl.IUserContracl;
import com.bw.xuliming20200224.entity.UserEntity;
import com.bw.xuliming20200224.model.ShopModel;
import com.bw.xuliming20200224.model.UserModel;

/**
 * 时间：2020/2/26
 * 作者：徐黎明
 * 类的作用：
 */
public class UserPresenter extends IBasePresenter<UserModel, IUserContracl.IView> implements IUserContracl.IPresenter {
    @Override
    protected UserModel initModel() {
        return new UserModel();
    }

    @Override
    public void getzhuche(String phone, String pwd) {
        initModel().getzhuche(phone, pwd, new IUserContracl.Imodel.ModelCallBack() {
            @Override
            public void success(UserEntity userEntity) {
                getView().success(userEntity);
            }

            @Override
            public void fshibai(Throwable throwable) {
            getView().fshibai(throwable);
            }
        });
    }

    @Override
    public void getlogin(String phone, String pwd) {
        initModel().getlogin(phone, pwd, new IUserContracl.Imodel.ModelCallBack() {
            @Override
            public void success(UserEntity userEntity) {
                getView().success(userEntity);
            }

            @Override
            public void fshibai(Throwable throwable) {
                getView().fshibai(throwable);
            }
        });
    }
}
