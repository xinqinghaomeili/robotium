package com.antourong.itouzi.test;

import android.test.InstrumentationTestRunner;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.antourong.itouzi.test.testsuits.SuitLogin;
import com.antourong.itouzi.test.testsuits.SuiteInvest;
import com.robotium.solo.By;
import com.robotium.solo.Solo;
import com.robotium.solo.WebElement;

import junit.framework.TestSuite;

/**
 * Created by jh on 2017/12/24.
 */

public class SoloWrap {
    private Solo solo;
    public SoloWrap(Solo solo){
        this.solo=solo;
    }



    public  void enterText(EditText editText,String str){
        solo.enterText(editText,str);
    }

    public  void clickOnText(String text){
        solo.clickOnText(text);
    }

    public  View getView(String str){
       return solo.getView(str);
    }

    public  EditText getEditText(String str){
        return solo.getEditText(str);
    }



    public void clearEditText(EditText text){
        solo.clearEditText(text);
    }
    public void clickOnView(View view){
        solo.clickOnView(view);
    }
    public Button getButton(String str){
        return solo.getButton(str);
    }
    public void clickOnButton(String str){
        solo.clickOnButton(str);
    }
    public void takeScreenshot(String name){
        solo.takeScreenshot(name);
    }

    public WebElement getWebElement(String xpath){
        WebElement we = solo.getWebElement(By.xpath(xpath),0);
        we.getTagName();
        return  we;
    }




}
