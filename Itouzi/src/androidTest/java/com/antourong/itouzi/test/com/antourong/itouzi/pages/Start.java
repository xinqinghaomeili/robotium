package com.antourong.itouzi.test.com.antourong.itouzi.pages;

import com.antourong.itouzi.test.SoloWrap;

/**
 * Created by jh on 2017/12/24.
 */

public class Start {
    public SoloWrap solo;

    public Start(SoloWrap solo){
        this.solo=solo;
    }

    public void clickMyButton(){
        solo.clickOnText("我的");

    }
}
