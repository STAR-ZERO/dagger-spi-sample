package com.star_zero.dagger_spi_sample.di;

import com.star_zero.dagger_spi_sample.App;
import com.star_zero.dagger_spi_sample.data.repository.UserDataRepository;
import com.star_zero.dagger_spi_sample.data.repository.UserRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    UserRepository provideUserRepository(App app) {
        return new UserDataRepository(app);
    }
}
