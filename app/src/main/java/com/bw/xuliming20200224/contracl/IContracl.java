package com.bw.xuliming20200224.contracl;

import com.bw.xuliming20200224.base.IBaseModel;
import com.bw.xuliming20200224.base.IBaseView;
import com.bw.xuliming20200224.entity.ShopEntity;

/**
 * 时间：2020/2/24
 * 作者：徐黎明
 * 类的作用：
 */
public interface  IContracl {
    interface IModel extends IBaseModel{
        void getshop(String userId,String sessionId,int type, int page,int size,ModelCallBack modelCallBack);
        interface ModelCallBack{
            void sucess(ShopEntity shopEntity);
            void shibai(Throwable throwable);
        }
    }
    interface IView extends IBaseView {
        void sucess(ShopEntity shopEntity);
        void shibai(Throwable throwable);
    }
    interface IPresenter{
        void getshop(String userId,String sessionId,int type, int page,int size);
    }
}
