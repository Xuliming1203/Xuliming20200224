package com.bw.xuliming20200224.api;

import com.bw.xuliming20200224.entity.UserEntity;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 时间：2020/2/26
 * 作者：徐黎明
 * 类的作用：
 */
public interface UserApiService {
    @POST("user/v1/register")
    @FormUrlEncoded
    Observable<UserEntity> zhuche(@Field("phone")String phone,@Field("pwd") String pwd);
    @POST("user/v1/login")
    @FormUrlEncoded
    Observable<UserEntity> user(@Field("phone")String phone,@Field("pwd") String pwd);
}
