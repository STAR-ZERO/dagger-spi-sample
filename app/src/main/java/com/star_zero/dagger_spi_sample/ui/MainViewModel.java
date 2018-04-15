package com.star_zero.dagger_spi_sample.ui;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.star_zero.dagger_spi_sample.data.model.User;
import com.star_zero.dagger_spi_sample.data.repository.UserRepository;

import javax.inject.Inject;

public class MainViewModel extends ViewModel {

    public final MutableLiveData<User> user = new MutableLiveData<>();

    private UserRepository userRepository;

    @Inject
    MainViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void getUser() {
        user.setValue(userRepository.getUser());
    }
}
