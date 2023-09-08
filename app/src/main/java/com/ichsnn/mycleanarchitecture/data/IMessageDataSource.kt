package com.ichsnn.mycleanarchitecture.data

import com.ichsnn.mycleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}