package com.ichsnn.mycleanarchitecture.di

import com.ichsnn.mycleanarchitecture.data.IMessageDataSource
import com.ichsnn.mycleanarchitecture.data.MessageDataSource
import com.ichsnn.mycleanarchitecture.data.MessageRepository
import com.ichsnn.mycleanarchitecture.domain.IMessageRepository
import com.ichsnn.mycleanarchitecture.domain.MessageInteractor
import com.ichsnn.mycleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}