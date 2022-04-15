package com.muzafferus.rickandmorty.repository

import com.apollographql.apollo.api.Response
import com.muzafferus.rickandmorty.CharactersListQuery

interface CharacterRepository {
    suspend fun queryCharactersList(): Response<CharactersListQuery.Data>
}