package com.example.mypetstore.springpetstore.controller

import com.example.mypetstore.springpetstore.model.Order
import com.example.mypetstore.springpetstore.model.Pet
import com.example.mypetstore.springpetstore.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class OrderController {

    @Autowired
    lateinit var repository: OrderRepository

    @PostMapping("/store/order")
    fun placeOrder(@RequestBody body: Order): String {
        repository.save(body)
        return "Order added..."
    }

    @GetMapping("/store/order/{id}")
    fun findrderById(@PathVariable id: Int)
            = repository.findById(id)

    @DeleteMapping("/store/order/{id}")
    fun deleteOrder(@PathVariable id: Int): String {
        repository.deleteById(id)
        return "Order deleted.."
    }
}