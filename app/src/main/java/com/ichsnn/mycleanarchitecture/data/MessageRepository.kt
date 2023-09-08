package com.ichsnn.mycleanarchitecture.data

import com.ichsnn.mycleanarchitecture.domain.IMessageRepository
import com.ichsnn.mycleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity =
        messageDataSource.getMessageFromSource(name)
}