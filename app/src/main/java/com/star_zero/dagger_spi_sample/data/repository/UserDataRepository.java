package com.star_zero.dagger_spi_sample.data.repository;

import android.content.Context;

import com.star_zero.dagger_spi_sample.data.model.User;

public class UserDataRepository implements UserRepository {

    private Context context;

    public UserDataRepository(Context context) {
        this.context = context;
    }

    @Override
    public User getUser() {
        User user = new User();
        user.setName(context.getPackageName());
        return user;
    }
}
