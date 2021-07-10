package com.muramsyah.mysimplecleanarchitecture.data

import com.muramsyah.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity = MessageEntity("Hello $name! Welcome to Clean Architecture")
}