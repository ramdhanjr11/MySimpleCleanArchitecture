package com.muramsyah.mysimplecleanarchitecture.di

import com.muramsyah.mysimplecleanarchitecture.data.IMessageDataSource
import com.muramsyah.mysimplecleanarchitecture.data.MessageDataSource
import com.muramsyah.mysimplecleanarchitecture.data.MessageRepository
import com.muramsyah.mysimplecleanarchitecture.domain.IMessageRepository
import com.muramsyah.mysimplecleanarchitecture.domain.MessageInteractor
import com.muramsyah.mysimplecleanarchitecture.domain.MessageUseCase

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