package com.example.fastfood;

import android.os.Build;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private RelativeLayout rlLogin;
    private EditText edtEmail,edtPass;
    private Button btnCallLogin,btnLogin;
    private LinearLayout llCallLogin,llReplyLogin;
    private TextView btnRegister1,btnRegister2,btnFace,btnGoogle;
    private Animation loginBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        rlLogin = findViewById(R.id.rl_login);
        edtEmail = findViewById(R.id.edt_email);
        edtPass = findViewById(R.id.edt_pass);
        btnCallLogin = findViewById(R.id.btn_call_login);
        btnLogin = findViewById(R.id.btn_login);
        btnFace = findViewById(R.id.btn_face);
        btnGoogle = findViewById(R.id.btn_google);
        btnRegister1 = findViewById(R.id.btn_register_1);
        btnRegister2 = findViewById(R.id.btn_register_2);
        llCallLogin = findViewById(R.id.ll_call_login);
        llReplyLogin = findViewById(R.id.ll_reply_login);

        btnCallLogin.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
        btnFace.setOnClickListener(this);
        btnGoogle.setOnClickListener(this);
        btnRegister1.setOnClickListener(this);
        btnRegister2.setOnClickListener(this);

        loginBtn = AnimationUtils.loadAnimation(this,R.anim.login_background);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_call_login:
                TransitionManager.beginDelayedTransition(rlLogin);
                ViewGroup.LayoutParams paramsRl = rlLogin.getLayoutParams();
                paramsRl.height = 2700;
                rlLogin.setLayoutParams(paramsRl);
                llReplyLogin.setVisibility(View.VISIBLE);
                llCallLogin.setVisibility(View.INVISIBLE);
                break;
            case R.id.btn_login:

                break;
            case R.id.btn_face:

                break;
            case R.id.btn_google:

                break;
            case R.id.btn_register_1:

                break;
            case R.id.btn_register_2:

                break;
        }
    }
}
