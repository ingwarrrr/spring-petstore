package com.example.mypetstore.springpetstore.repository

import com.example.mypetstore.springpetstore.model.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<Order, Int> {
}