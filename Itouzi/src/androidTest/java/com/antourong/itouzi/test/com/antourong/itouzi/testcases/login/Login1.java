package com.antourong.itouzi.test.com.antourong.itouzi.testcases.login;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.antourong.itouzi.test.BasicTestCase;
import com.antourong.itouzi.test.SoloWrap;
import com.antourong.itouzi.test.com.antourong.itouzi.PageHelper;
import com.antourong.itouzi.test.com.antourong.itouzi.pages.Start;
import com.robotium.solo.Solo;

/**
 * Created by jh on 2017/12/17.
 */

public class Login1 extends BasicTestCase {
    protected SoloWrap solo;

    public void testLogin1() {
        //Wait for activity: 'com.antourong.itouzi.activity.EmptySplashActivity'
        try {
            solo = new SoloWrap(solo1);
//            int a=0;
//            int b=3/a;
            PageHelper pageHelper = new PageHelper(solo);
//        pageHelper.getStart().clickMyButton();
            solo1.clickOnText("我的");
            View view = solo1.getView("com.antourong.itouzi:id/btn_user_home_login");
            solo1.clickOnView(view);
            pageHelper.getPagelogin().initview();
            pageHelper.getPagelogin().enterName("18210149904");
//        solo1.sleep(3000);
            pageHelper.getPagelogin().enterPwd("123456");
            pageHelper.getPagelogin().clickOnView();
        }
        catch (Exception ex){
            Log.i("AUTO","excepition happened testlogin1,error msg is:"+ex.getMessage());
            solo.takeScreenshot(this.getClass().getSimpleName());
            throw ex;
        }





    }
}
