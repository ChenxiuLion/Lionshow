package com.chenxiu.lionshow.presenter;

import com.chenxiu.lionshow.api.ILionApi;
import com.chenxiu.lionshow.api.LionApiHelper;
import com.chenxiu.lionshow.view.ILionView;

/**
 * Created by chenxiu on 2017/8/29.
 * Success is getting what you want
 * 爱生活，爱撸码，我为自己代言。
 */

public abstract class LionPresenter<T extends ILionView> {
    protected ILionApi mApi;

    protected T mView;

    public void onBindView(T v){
        this.mView = v;
        this.mApi = LionApiHelper.getLionApi();
    }

    public void unBindView(){

    }
}
