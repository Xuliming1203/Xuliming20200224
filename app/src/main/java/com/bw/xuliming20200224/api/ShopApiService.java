package com.bw.xuliming20200224.api;

import androidx.annotation.Size;

import com.bw.xuliming20200224.entity.ShopEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * 时间：2020/2/24
 * 作者：徐黎明
 * 类的作用：
 */
public interface ShopApiService {
    @GET("live-user/verify/findGiftRecordByUid")
    Observable<ShopEntity> getshop(@Header("userId")String userId, @Header("sessionId") String sessionId,
                                   @Query("type") int type,
                                   @Query("page") int page,
                                   @Query("size") int size);
}
