package com.jdr.poc.spring.dualmongo.dbo

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "support_collection")
data class SupportEntity(
    @Id val id: String? = null,
    val info: String
)