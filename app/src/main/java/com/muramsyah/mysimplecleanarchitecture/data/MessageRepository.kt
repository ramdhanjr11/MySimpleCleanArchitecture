package com.muramsyah.mysimplecleanarchitecture.data

import com.muramsyah.mysimplecleanarchitecture.domain.IMessageRepository
import com.muramsyah.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository  {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}