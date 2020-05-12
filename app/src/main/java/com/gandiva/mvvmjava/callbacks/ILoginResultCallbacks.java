package com.gandiva.mvvmjava.callbacks;

public interface ILoginResultCallbacks {
    void onSuccess(String succesMessage);
    void onFailure(String failureMessage);
    void onError(String error);
}
