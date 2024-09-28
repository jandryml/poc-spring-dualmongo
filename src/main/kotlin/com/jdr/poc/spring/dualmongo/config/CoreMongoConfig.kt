package com.jdr.poc.spring.dualmongo.config

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.data.mongodb.core.MongoTemplate

@Configuration
class CoreMongoConfig {

    @Value("\${spring.data.mongodb.core.uri}")
    lateinit var uri: String

    @Value("\${spring.data.mongodb.core.database}")
    lateinit var database: String

    @Primary
    @Bean(name = ["coreMongoTemplate"])
    fun coreMongoTemplate(): MongoTemplate {
        val client: MongoClient = MongoClients.create(uri)
        return MongoTemplate(client, database)
    }
}