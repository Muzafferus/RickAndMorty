package com.muzafferus.rickandmorty.repository

import com.apollographql.apollo.api.Response
import com.muzafferus.rickandmorty.CharacterQuery
import com.muzafferus.rickandmorty.CharactersListQuery

interface CharacterRepository {
    suspend fun queryCharactersList(): Response<CharactersListQuery.Data>
    suspend fun queryCharacter(id:String):Response<CharacterQuery.Data>
}