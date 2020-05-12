package com.gandiva.mvvmjava;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.gandiva.mvvmjava.callbacks.ILoginResultCallbacks;
import com.gandiva.mvvmjava.databinding.ActivityMainBinding;
import com.gandiva.mvvmjava.viewModel.LoginViewModel;
import com.gandiva.mvvmjava.viewModel.LoginViewModelFactory;

public class LoginAtivity extends AppCompatActivity implements ILoginResultCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(ViewModelProviders.of(this,
                new LoginViewModelFactory(this)).get(LoginViewModel.class));
        activityMainBinding.executePendingBindings();
    }

    @Override
    public void onSuccess(String succesMessage) {
        Toast.makeText(this, succesMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(String failureMessage) {
        Toast.makeText(this, failureMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String error) {

    }
}
