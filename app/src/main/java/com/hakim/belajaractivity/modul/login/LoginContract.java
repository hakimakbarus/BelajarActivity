package com.hakim.belajaractivity.modul.login;

import com.hakim.belajaractivity.base.BasePresenter;
import com.hakim.belajaractivity.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
