package com.jdr.poc.spring.dualmongo.service

import com.jdr.poc.spring.dualmongo.dbo.SupportEntity
import com.jdr.poc.spring.dualmongo.repo.SupportRepository
import org.springframework.stereotype.Service

@Service
class SupportService(private val supportRepository: SupportRepository) {

    fun save(entity: SupportEntity): SupportEntity {
        return supportRepository.save(entity)
    }

    fun findAll(): List<SupportEntity> {
        return supportRepository.findAll()
    }
}