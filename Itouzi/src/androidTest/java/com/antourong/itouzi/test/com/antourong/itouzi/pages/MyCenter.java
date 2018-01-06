package com.antourong.itouzi.test.com.antourong.itouzi.pages;

import android.widget.Button;

import com.antourong.itouzi.test.SoloWrap;

/**
 * Created by jh on 2017/12/24.
 */

public class MyCenter {
    public SoloWrap solo;
    public Button loginBtn;
    public MyCenter(SoloWrap solo){
        this.solo=solo;
    }
    public void  initView(){
        loginBtn=solo.getButton("登录");
    }
    public  void clickLogin(){
        solo.clickOnButton("登录");
    }
}
