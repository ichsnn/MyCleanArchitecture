package com.ichsnn.mycleanarchitecture.domain

import com.ichsnn.mycleanarchitecture.domain.MessageEntity

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}