package com.example.mypetstore.springpetstore.model

import javax.persistence.*

@Entity
@Table
data class Tag(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int? = null,
        val name: String? = null
)