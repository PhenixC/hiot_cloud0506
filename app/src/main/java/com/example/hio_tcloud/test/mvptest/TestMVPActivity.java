package com.example.hio_tcloud.test.mvptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hio_tcloud.R;
import com.example.hio_tcloud.test.mvptest.model.TestView;
import com.example.hio_tcloud.test.mvptest.model.User;

public class TestMVPActivity extends AppCompatActivity implements TestView {        //2.1   48  add implements TestView, ATL+ENTER, implemnt method

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mvp);


        final EditText etUserName = findViewById(R.id.et_user_name);      //2.1  08
        final EditText etPassword = findViewById(R.id.et_user_password);  //2.1  09
        Button btnLogin = findViewById(R.id.btn_login);     //2.1  10
        final User user = new User();         //2.1  22  写时没有final, 下面user要求才final
        final TestPresenter presenter= new TestPresenter(this);       //2,1  51


        btnLogin.setOnClickListener(new View.OnClickListener() {    //2.1  11
            @Override
            public void onClick(View view) {        //2.1  12
                //mvc做法， 在这里做身份校验       //2.1  13
                user.setUserName(etUserName.getText().toString());       //2.1  23
                user.setPassword(etPassword.getText().toString());      //2.1  24  ATL+ENTER, make user "final"
                presenter.login(user);      //2.1  52
//                login(user);                       //2.1  14            //2.1  25 ALT+ENTER, create method "login", choose MainActivity
                //2.1  15 add modl under mvptest as User
                //2.1  16 go User to write

            }
        });


    }

    @Override
    public void showMessage(String msg) {   //2.1  49
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();     //2.1  50
    }

//    private void login(User user) {     //2.1  26
//        if("lisi".equals(user.getUserName()) && "123".equals(user.getPassword())) {     //2.1 27
//            Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();  //2.1 28
//        }else {             //2.1 28
//            Toast.makeText(this,"登录失败",Toast.LENGTH_SHORT).show();  //2.1  30
//        }       //2.1  31 MVP mode, add class-Interface as TestView
//    }           //2.1  32 go TestView

}     // end

