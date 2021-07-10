package com.muramsyah.mysimplecleanarchitecture.data

import com.muramsyah.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}