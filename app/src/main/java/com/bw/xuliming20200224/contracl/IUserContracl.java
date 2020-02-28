package com.bw.xuliming20200224.contracl;

import com.bw.xuliming20200224.base.IBaseModel;
import com.bw.xuliming20200224.base.IBaseView;
import com.bw.xuliming20200224.entity.UserEntity;

import retrofit2.http.Field;

/**
 * 时间：2020/2/26
 * 作者：徐黎明
 * 类的作用：
 */
public interface IUserContracl {
    interface Imodel extends IBaseModel{
        void getzhuche(String phone, String pwd,ModelCallBack modelCallBack);
        void getlogin(String phone, String pwd,ModelCallBack modelCallBack);
        interface ModelCallBack{
            void success(UserEntity userEntity);
            void fshibai(Throwable throwable);
        }
    }
    interface IView extends IBaseView{
        void success(UserEntity userEntity);
        void fshibai(Throwable throwable);
    }
    interface IPresenter{
        void getzhuche(String phone, String pwd);
        void getlogin(String phone, String pwd);
    }
}
