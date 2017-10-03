package com.coolweather.app.util;

/**
 * Created by maomao on 10/2/17.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
