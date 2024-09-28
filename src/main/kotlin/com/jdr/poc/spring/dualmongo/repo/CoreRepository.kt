package com.jdr.poc.spring.dualmongo.repo

import com.jdr.poc.spring.dualmongo.dbo.CoreEntity
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Repository

@Repository
class CoreRepository(
    @Qualifier("coreMongoTemplate") private val coreMongoTemplate: MongoTemplate
) {

    fun save(entity: CoreEntity): CoreEntity {
        coreMongoTemplate.save(entity)
        return entity
    }

    fun findAll(): List<CoreEntity> {
        return coreMongoTemplate.findAll(CoreEntity::class.java)
    }
}