package com.antourong.itouzi.test;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by jh on 2018/1/13.
 */

public class Utils1 {

    public static void sendHttpRequest(String className,String methodName){
        OkHttpClient client = new OkHttpClient();
        HttpUrl.Builder urlBuilder = HttpUrl.parse("http://192.168.10.103：8080/Ser/Server").newBuilder();
        urlBuilder.addQueryParameter("className",className);
        urlBuilder.addQueryParameter("methodName",methodName);
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            Response response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
