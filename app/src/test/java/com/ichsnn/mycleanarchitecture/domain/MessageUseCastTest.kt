package com.ichsnn.mycleanarchitecture.domain

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito

import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MessageUseCastTest {
    private lateinit var messageUseCase: MessageUseCase

    @Mock private lateinit var messageRepository: IMessageRepository

    @Before
    fun setUp() {
        messageUseCase = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $NAME! Welcome to Clean Architecture")
        Mockito.`when`(messageRepository.getWelcomeMessage(NAME)).thenReturn(dummyMessage)
    }

    @Test fun `should get data from repository`() {
        val message = messageUseCase.getMessage(NAME)

        Mockito.verify(messageRepository).getWelcomeMessage(NAME)
        Mockito.verifyNoMoreInteractions(messageRepository)
        Assert.assertEquals("Hello $NAME! Welcome to Clean Architecture", message.welcomeMessage)
    }

    companion object {
        const val NAME = "ichsnn"
    }
}