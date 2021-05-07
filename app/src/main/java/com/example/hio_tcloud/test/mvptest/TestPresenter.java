package com.example.hio_tcloud.test.mvptest;

import com.example.hio_tcloud.test.mvptest.model.TestView;
import com.example.hio_tcloud.test.mvptest.model.User;


/**
 * 做逻辑
 */

public class TestPresenter {        //2.1  37  要有一个构造方法，把view层的东西传进来
    //2.1   38 ATL+INSERT , constructor

    private TestView view;          //2.1  40

    public TestPresenter(TestView view) {       //2.1  39
        this.view = view;           //2.1  40
    }

    public void login(User user) {     //2.1  41 加一个方法来校验
        //2.1  42  把User.class 的 login方法写在这
        if("lisi".equals(user.getUserName()) && "123".equals(user.getPassword())) {     //2.1 43
            view.showMessage("登录成功");  //2.1 44
        }else {             //2.1 45
            view.showMessage("登录失败");  //2.1  46
        }   //2.1  47 go TestMVPActivity to write
    }


}  //end


