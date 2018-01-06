package com.antourong.itouzi.test.testsuits;

import com.antourong.itouzi.test.com.antourong.itouzi.testcases.login.Login2;

import junit.framework.TestSuite;

/**
 * Created by jh on 2017/12/24.
 */

public class SuitLogin {

    public static TestSuite getLoginSuite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(Login2.class);
//        suite.addTestSuite(Login1.class);
        return suite;
    }
}
