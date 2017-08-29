package com.chenxiu.lionshow.api;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by chenxiu on 2017/8/29.
 * Success is getting what you want
 * 爱生活，爱撸码，我为自己代言。
 */

public interface ILionApi {
    @GET("data/{category}/{number}/{page}")
    Observable<String> getCategoryDate(@Path("category") String category, @Path("number") int number, @Path("page") int page);
}
