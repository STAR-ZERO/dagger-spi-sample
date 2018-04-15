package com.star_zero.dagger_spi_sample.di;

import android.arch.lifecycle.ViewModel;

import com.star_zero.dagger_spi_sample.ui.MainViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    abstract ViewModel bindMainViewModel(MainViewModel viewModel);
}

