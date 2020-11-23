package com.example.mypetstore.springpetstore.model

import javax.persistence.*

@Entity
@Table(name = "customer")
data class User (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int = 0,
        val username: String? = null,
        var firstName: String? = null,
        var lastName: String? = null,
        var email: String? = null,
        var password: String? = null,
        var phone: String? = null,
        var userStatus: Int? = null
)