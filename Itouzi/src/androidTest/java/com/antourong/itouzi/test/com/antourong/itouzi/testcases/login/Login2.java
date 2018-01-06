package com.antourong.itouzi.test.com.antourong.itouzi.testcases.login;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.EditText;

import com.antourong.itouzi.test.BasicTestCase;
import com.robotium.solo.Solo;

/**
 * Created by jh on 2017/12/17.
 */

public class Login2 extends BasicTestCase {

    public void testLogin2() {
        //Wait for activity: 'com.antourong.itouzi.activity.EmptySplashActivity'
        solo1.clickOnText("我的");
        View view = solo1.getView("com.antourong.itouzi:id/btn_user_home_login");
        solo1.clickOnView(view);
        EditText name = solo1.getEditText("手机号/用户名/邮箱");
        EditText pwd = solo1.getEditText("请输入密码");
        solo1.enterText(name,"18210149904");
        solo1.enterText(pwd,"123456");
        View login = solo1.getView("com.antourong.itouzi:id/btn_login");
        solo1.clickOnView(login);
        assertTrue("用户名或者密码错误",true);


    }
}
