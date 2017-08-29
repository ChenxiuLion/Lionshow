package com.chenxiu.lionshow.api;

import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;

/**
 *
 * Created by chenxiu on 2017/8/29.
 * Success is getting what you want
 * 爱生活，爱撸码，我为自己代言。
 */

public class LionApiHelper {
    private static ILionApi mApi;
    private static OkHttpClient okHttpClient = new OkHttpClient();
    private static Converter.Factory gsonConverterFactory = GsonConverterFactory.create();
    private static CallAdapter.Factory rxJavaCallAdapterFactory = RxJavaCallAdapterFactory.create();

    public static ILionApi getLionApi() {
        if (mApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl("http://zyfree1.acman.cn/")
                    .addConverterFactory(gsonConverterFactory)
                    .addCallAdapterFactory(rxJavaCallAdapterFactory)
                    .build();
            mApi = retrofit.create(ILionApi.class);
        }
        return mApi;
    }
}
