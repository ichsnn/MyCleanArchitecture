package com.ichsnn.mycleanarchitecture.domain

import com.ichsnn.mycleanarchitecture.domain.MessageEntity

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}