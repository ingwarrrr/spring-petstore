package com.example.mypetstore.springpetstore.repository

import com.example.mypetstore.springpetstore.model.Tag
import org.springframework.data.jpa.repository.JpaRepository

interface TagRepository : JpaRepository<Tag, Int> {
}