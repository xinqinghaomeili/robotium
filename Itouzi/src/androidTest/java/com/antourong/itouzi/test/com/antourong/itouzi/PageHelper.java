package com.antourong.itouzi.test.com.antourong.itouzi;

import com.antourong.itouzi.test.SoloWrap;
import com.antourong.itouzi.test.com.antourong.itouzi.pages.MyCenter;
import com.antourong.itouzi.test.com.antourong.itouzi.pages.PageLogin;
import com.antourong.itouzi.test.com.antourong.itouzi.pages.Start;

/**
 * Created by jh on 2017/12/17.
 */

public class PageHelper {
    private SoloWrap solo;
    private PageLogin pagelogin;
    private Start start;
    private MyCenter mycenter;

    public PageHelper(SoloWrap solo){
        this.solo = solo;
    }

    public PageLogin getPagelogin() {
        if(pagelogin==null){
            pagelogin = new PageLogin( solo);
        }
//        pagelogin.initview();
        return pagelogin;
    }

    public Start getStart(){
        if(start==null){
            start = new Start(solo);
        }
        return start;
    }
    public MyCenter getMycenter(){
        if(mycenter==null){
            mycenter = new MyCenter(solo);
        }
//        mycenter.initView();
        return mycenter;
    }



}

