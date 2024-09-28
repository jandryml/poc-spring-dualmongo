package com.jdr.poc.spring.dualmongo.controller

import com.jdr.poc.spring.dualmongo.dbo.CoreEntity
import com.jdr.poc.spring.dualmongo.service.CoreService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/core")
class CoreController(private val coreService: CoreService) {

    @PostMapping("/save")
    fun save(@RequestBody entity: CoreEntity): CoreEntity {
        return coreService.save(entity)
    }

    @GetMapping("/all")
    fun findAll(): List<CoreEntity> {
        return coreService.findAll()
    }
}