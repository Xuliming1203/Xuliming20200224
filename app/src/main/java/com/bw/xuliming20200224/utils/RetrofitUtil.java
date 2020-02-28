package com.bw.xuliming20200224.utils;

import com.bw.xuliming20200224.api.Api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 时间：2020/2/24
 * 作者：徐黎明
 * 类的作用：
 */
public class RetrofitUtil {
    private static RetrofitUtil instance;
    private final OkHttpClient okHttpClient;
    private final Retrofit retrofit;

    public RetrofitUtil() {
        okHttpClient = new OkHttpClient.Builder()
                .writeTimeout(8, TimeUnit.SECONDS)
                .readTimeout(8,TimeUnit.SECONDS)
                .connectTimeout(8,TimeUnit.SECONDS)
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();
        retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static RetrofitUtil getInstance() {
        if (instance == null) {
            synchronized (RetrofitUtil.class){
                if (instance == null) {
                    instance=new RetrofitUtil();
                }
            }
        }
        return instance;
    }
    public <T>T createservice(Class<T>tClass){
        T t=retrofit.create(tClass);
        return t;
    }
}
