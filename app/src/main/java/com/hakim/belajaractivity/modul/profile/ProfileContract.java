package com.hakim.belajaractivity.modul.profile;

import com.hakim.belajaractivity.base.BasePresenter;
import com.hakim.belajaractivity.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void redirectToLogin();
        void showProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogout();
    }
}
