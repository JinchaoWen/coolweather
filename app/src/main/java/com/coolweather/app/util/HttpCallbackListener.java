package com.coolweather.app.util;

/**
 * Created by dell on 2016/9/14.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
