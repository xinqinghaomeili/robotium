package com.antourong.itouzi.test.com.antourong.itouzi.testcases.invest;

import android.widget.TextView;

import com.antourong.itouzi.test.BasicTestCase;

/**
 * Created by jh on 2017/12/24.
 */

public class Invest1 extends BasicTestCase{
    public TextView invest,now;

    public void testInvest01(){
        solo1.clickOnText("项目");
        invest = (TextView)solo1.getView("com.antourong.itouzi:id/txt_invest_status");
        solo1.clickOnView(invest);
        now = (TextView)solo1.getView("com.antourong.itouzi:id/btn_invest");
        solo1.clickOnView(now);
    }
}
