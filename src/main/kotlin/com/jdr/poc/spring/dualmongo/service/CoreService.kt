package com.jdr.poc.spring.dualmongo.service

import com.jdr.poc.spring.dualmongo.dbo.CoreEntity
import com.jdr.poc.spring.dualmongo.repo.CoreRepository
import org.springframework.stereotype.Service

@Service
class CoreService(private val coreRepository: CoreRepository) {

    fun save(entity: CoreEntity): CoreEntity {
        return coreRepository.save(entity)
    }

    fun findAll(): List<CoreEntity> {
        return coreRepository.findAll()
    }
}