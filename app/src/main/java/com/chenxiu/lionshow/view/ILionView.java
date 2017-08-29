package com.chenxiu.lionshow.view;

/**
 * Created by chenxiu on 2017/8/29.
 * Success is getting what you want
 * 爱生活，爱撸码，我为自己代言。
 */

public interface ILionView<T> {
    void onResult(T data);
    void onErro(String code);
}
