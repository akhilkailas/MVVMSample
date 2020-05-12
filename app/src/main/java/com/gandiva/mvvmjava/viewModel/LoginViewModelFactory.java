package com.gandiva.mvvmjava.viewModel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.gandiva.mvvmjava.callbacks.ILoginResultCallbacks;

public class LoginViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private ILoginResultCallbacks mIloginResultsCallbacks;

    public LoginViewModelFactory(ILoginResultCallbacks mIloginResultsCallbacks) {
        this.mIloginResultsCallbacks = mIloginResultsCallbacks;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T)new LoginViewModel(mIloginResultsCallbacks);
    }
}
