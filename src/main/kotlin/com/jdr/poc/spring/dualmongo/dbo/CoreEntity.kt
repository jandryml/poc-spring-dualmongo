package com.jdr.poc.spring.dualmongo.dbo

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "core_collection")
data class CoreEntity(
    @Id val id: String? = null,
    val data: String
)