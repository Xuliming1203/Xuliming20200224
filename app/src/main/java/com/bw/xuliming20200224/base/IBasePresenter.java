package com.bw.xuliming20200224.base;

import java.lang.ref.WeakReference;

/**
 * 时间：2020/2/24
 * 作者：徐黎明
 * 类的作用：
 */
public  abstract class IBasePresenter<M extends IBaseModel,V extends IBaseView> {
    public M model;
    public WeakReference<V> weakReference;

    public IBasePresenter() {
        model = initModel();
    }
    public void attatch(V v){
        weakReference=new WeakReference<>(v);
    }
    public void deatch(){
        if (weakReference != null) {
            weakReference.clear();
            weakReference=null;
        }
    }
    public V getView(){
        return weakReference.get();
    }
    protected abstract M initModel();
}
