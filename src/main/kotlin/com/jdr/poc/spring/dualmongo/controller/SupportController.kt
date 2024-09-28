package com.jdr.poc.spring.dualmongo.controller

import com.jdr.poc.spring.dualmongo.dbo.SupportEntity
import com.jdr.poc.spring.dualmongo.service.SupportService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/support")
class SupportController(private val supportService: SupportService) {

    @PostMapping("/save")
    fun save(@RequestBody entity: SupportEntity): SupportEntity {
        return supportService.save(entity)
    }

    @GetMapping("/all")
    fun findAll(): List<SupportEntity> {
        return supportService.findAll()
    }
}