package com.example.testapi.base;

import androidx.annotation.StringRes;

/**
 * doannd
 * <p>_</p>
 *
 * Base contract
 */
public interface BaseContract {

    interface BaseView {

        void showProgress(boolean show);

        void showError(@StringRes int stringResId);
    }

    interface BasePresenter<T> {

        void attachView(T view);

        void detachView();
    }
}
