package com.bw.xuliming20200224.presenter;

import com.bw.xuliming20200224.base.IBasePresenter;
import com.bw.xuliming20200224.contracl.IContracl;
import com.bw.xuliming20200224.entity.ShopEntity;
import com.bw.xuliming20200224.model.ShopModel;

/**
 * 时间：2020/2/24
 * 作者：徐黎明
 * 类的作用：
 */
public class ShopPresenter extends IBasePresenter<ShopModel, IContracl.IView> implements IContracl.IPresenter {
    @Override
    protected ShopModel initModel() {
        return new ShopModel();
    }

    @Override
    public void getshop(String userId, String sessionId, int type, int page, int size) {
        initModel().getshop(userId, sessionId, type, page, size, new IContracl.IModel.ModelCallBack() {
            @Override
            public void sucess(ShopEntity shopEntity) {
                getView().sucess(shopEntity);
            }

            @Override
            public void shibai(Throwable throwable) {
                getView().shibai(throwable);
            }
        });
    }
}
