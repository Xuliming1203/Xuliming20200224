package com.bw.xuliming20200224.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bw.xuliming20200224.R;
import com.bw.xuliming20200224.base.BaseActivity;
import com.bw.xuliming20200224.contracl.IUserContracl;
import com.bw.xuliming20200224.entity.UserEntity;
import com.bw.xuliming20200224.presenter.UserPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity<UserPresenter> implements IUserContracl.IView {

    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_pwd)
    EditText etPwd;
    @BindView(R.id.bt_zhuc)
    Button btZhuc;
    @BindView(R.id.bt_denglu)
    Button btDenglu;
    @BindView(R.id.iv8)
    ImageView iv8;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected UserPresenter initPresenter() {
        return new UserPresenter();
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void success(UserEntity userEntity) {
        btDenglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone1 = etPhone.getText().toString().trim();
                String pwd1 = etPwd.getText().toString().trim();

                if (TextUtils.isEmpty(phone1)) {
                    Toast.makeText(LoginActivity.this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(pwd1)) {
                    Toast.makeText(LoginActivity.this, "密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                iv8.setVisibility(View.VISIBLE);
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });
        btZhuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = etPhone.getText().toString().trim();
                String pwd = etPwd.getText().toString().trim();
                if (TextUtils.isEmpty(phone)) {
                    Toast.makeText(LoginActivity.this, "手机号不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(pwd)) {
                    Toast.makeText(LoginActivity.this, "密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
        if ("0000".equals(userEntity.getStatus())) {
            Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "" + userEntity.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void fshibai(Throwable throwable) {

    }



}
