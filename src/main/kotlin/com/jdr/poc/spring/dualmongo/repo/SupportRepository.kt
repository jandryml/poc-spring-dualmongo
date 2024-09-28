package com.jdr.poc.spring.dualmongo.repo

import com.jdr.poc.spring.dualmongo.dbo.SupportEntity
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Repository

@Repository
class SupportRepository(
    @Qualifier("supportMongoTemplate") private val supportMongoTemplate: MongoTemplate
) {

    fun save(entity: SupportEntity): SupportEntity {
        supportMongoTemplate.save(entity)
        return entity
    }

    fun findAll(): List<SupportEntity> {
        return supportMongoTemplate.findAll(SupportEntity::class.java)
    }
}