package com.hakim.belajaractivity.modul.profile;

import android.view.View;

import com.hakim.belajaractivity.base.BaseFragmentHolderActivity;


public class ProfileActivity extends BaseFragmentHolderActivity {
    ProfileFragment profileFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.VISIBLE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        profileFragment = new ProfileFragment();
        setCurrentFragment(profileFragment, false);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profileFragment.redirectToLogin();
            }
        });

    }



}
