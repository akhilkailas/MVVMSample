package com.gandiva.mvvmjava.model;

import android.databinding.BaseObservable;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.TextView;

import java.util.regex.Pattern;

public class LoginModel extends BaseObservable {
    private String mUserName, mPassword;

    public LoginModel() {
    }

    public LoginModel(String mUserName, String mPassword) {
        this.mUserName = mUserName;
        this.mPassword = mPassword;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public boolean isValidData(){
        return !TextUtils.isEmpty(getmUserName())
                        && Patterns.EMAIL_ADDRESS.matcher(getmUserName()).matches() &&
                getmPassword().length() > 6;
    }
}
