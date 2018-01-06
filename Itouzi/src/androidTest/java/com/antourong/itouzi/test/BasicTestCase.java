package com.antourong.itouzi.test;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.EditText;

import com.antourong.itouzi.test.com.antourong.itouzi.PageHelper;
import com.robotium.solo.Solo;

/**
 * Created by jh on 2017/12/17.
 */

public class BasicTestCase extends ActivityInstrumentationTestCase2 {

    protected Solo solo1;
    protected PageHelper pagehelper;
    protected boolean isNeedLogin;
    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.antourong.itouzi.activity.EmptySplashActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public  BasicTestCase(){
        super(launcherActivityClass);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        solo1 = new Solo(getInstrumentation(),getActivity());

    }

    @Override
    public void tearDown() throws Exception {
        solo1.finishOpenedActivities();
        super.tearDown();
    }
}
