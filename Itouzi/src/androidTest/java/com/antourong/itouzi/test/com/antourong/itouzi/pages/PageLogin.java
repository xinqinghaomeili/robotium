package com.antourong.itouzi.test.com.antourong.itouzi.pages;

import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.antourong.itouzi.test.SoloWrap;

/**
 * Created by jh on 2017/12/24.
 */

public class PageLogin {
    public SoloWrap solo;
    public  EditText nameET,pwdET;
    public View loginBtn;

    public  PageLogin(SoloWrap solo){
        this.solo=solo;
    }

    /*
    * 用来加载出这个页面要使用到的控件*/
    public void initview(){
        nameET = solo.getEditText("手机号/用户名/邮箱");
        pwdET = solo.getEditText("请输入密码");
        loginBtn = solo.getView("com.antourong.itouzi:id/btn_login");
    }

    /*对该页面的方法进行封装*/
    public void enterName(String name){
        solo.enterText(nameET,name);
    }

    public  void enterPwd(String pwd){
        solo.enterText(pwdET,pwd);
    }
    public void clickOnView(){
        solo.clickOnView(loginBtn);
    }

    public void clearName(){
        solo.clearEditText(nameET);
    }

    public void clearPwd(){
        solo.clearEditText(pwdET);
    }
    public  void clickOnText(){
        solo.clickOnText("登录");
    }


}
