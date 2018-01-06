package com.antourong.itouzi.test;

import android.test.InstrumentationTestRunner;

import com.antourong.itouzi.test.testsuits.SuitLogin;
import com.antourong.itouzi.test.testsuits.SuiteInvest;
import com.zutubi.android.junitreport.JUnitReportTestRunner;

import junit.framework.TestSuite;

/**
 * Created by jh on 2017/12/24.
 */

public class Runner extends InstrumentationTestRunner{

    public TestSuite getAllTests(){
        TestSuite suite = new TestSuite();
//        suite.addTest(SuiteInvest.getInvestSuite());
        suite.addTest(SuitLogin.getLoginSuite());
        return suite;
    }
}
