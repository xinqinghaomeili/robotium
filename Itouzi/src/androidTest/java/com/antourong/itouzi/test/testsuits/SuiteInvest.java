package com.antourong.itouzi.test.testsuits;

import com.antourong.itouzi.test.com.antourong.itouzi.testcases.invest.Invest1;

import junit.framework.TestSuite;

/**
 * Created by jh on 2017/12/24.
 */

public class SuiteInvest {

    public static TestSuite getInvestSuite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(Invest1.class);
        return suite;
    }

}
