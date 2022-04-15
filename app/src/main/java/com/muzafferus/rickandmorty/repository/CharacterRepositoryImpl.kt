package com.muzafferus.rickandmorty.repository

import com.apollographql.apollo.api.Response
import com.apollographql.apollo.coroutines.await
import com.muzafferus.rickandmorty.CharactersListQuery
import com.muzafferus.rickandmorty.networking.RickAndMortyApi
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val webService: RickAndMortyApi
) : CharacterRepository {

    override suspend fun queryCharactersList(): Response<CharactersListQuery.Data> {
        return webService.getApolloClient().query(CharactersListQuery()).await()
    }
}