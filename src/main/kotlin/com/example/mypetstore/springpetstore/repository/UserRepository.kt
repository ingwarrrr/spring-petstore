package com.example.mypetstore.springpetstore.repository

import com.example.mypetstore.springpetstore.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int> {
    fun findUserByUsername(username: String): User
}