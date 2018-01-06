package com.antourong.itouzi.test.com.antourong.itouzi.testcases.bbs;

import android.view.View;

import com.antourong.itouzi.test.BasicTestCase;
import com.antourong.itouzi.test.SoloWrap;
import com.robotium.solo.Solo;

/**
 * Created by jh on 2018/1/1.
 */

public class TryWebview extends BasicTestCase{
    protected SoloWrap solo;

    public void testGetView(){
//        solo1.clickOnText("首页");
        solo = new SoloWrap(solo1);
        View bbs = solo1.getView("com.antourong.itouzi:id/layer_forum");
        solo1.clickOnView(bbs);
        solo1.sleep(5000);
        solo.getWebElement("//*[@id=\"wap-wrapper\"]/div[3]/table/tbody/tr/td[1]/a/img");

    }

}
