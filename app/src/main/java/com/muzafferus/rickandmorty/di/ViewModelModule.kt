package com.muzafferus.rickandmorty.di

import com.muzafferus.rickandmorty.repository.CharacterRepository
import com.muzafferus.rickandmorty.repository.CharacterRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped


@Module
@InstallIn(ViewModelComponent::class)
abstract class ViewModelModule {

    @Binds
    @ViewModelScoped
    abstract fun bindRepository(repo: CharacterRepositoryImpl): CharacterRepository

}