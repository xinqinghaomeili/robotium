package com.antourong.itouzi.test.com.antourong.itouzi.testcases;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.antourong.itouzi.test.BasicTestCase;
import com.antourong.itouzi.test.SoloWrap;
import com.antourong.itouzi.test.Utils1;
import com.antourong.itouzi.test.com.antourong.itouzi.PageHelper;

/**
 * Created by jh on 2018/1/13.
 */

public class Share1 extends BasicTestCase{
    protected SoloWrap solo;
    protected ImageView shareview;
//    protected ImageButton weibo;

    public void testShare(){
        solo = new SoloWrap(solo1);
        PageHelper pageHelper = new PageHelper(solo);
        pageHelper.getShare();
//        pageHelper.getShare().initview();
//        pageHelper.getShare().enterXinxi();
        solo1.clickOnText("信息披露");
        shareview = (ImageView)solo1.getView("com.antourong.itouzi:id/iv_share");
        solo1.clickOnView(shareview);
//        solo1.clickOnButton("QQ");
//        solo1.clickOnText("QQ");
        solo1.clickOnButton(0);
//        Utils1.sendHttpRequest("Cross","testC");    //这步开始跨应用，调用发送http的方法
    }


}
