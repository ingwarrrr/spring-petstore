package com.example.mypetstore.springpetstore.repository

import com.example.mypetstore.springpetstore.model.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category, Int> {
}