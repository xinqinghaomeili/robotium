package com.antourong.itouzi.test.com.antourong.itouzi.pages;

import android.widget.ImageView;

import com.antourong.itouzi.test.SoloWrap;

/**
 * Created by jh on 2018/1/13.
 */

public class Share {
    public SoloWrap solo;
    public ImageView xinxipilou;
    public Share(SoloWrap solo){
        this.solo=solo;
    }

    public void initview(){
        xinxipilou =(ImageView) solo.getView("com.antourong.itouzi:id/image_discovery_common");
    }

    public void enterXinxi(){
        solo.clickOnView(xinxipilou);

    }

}
