package com.example.mypetstore.springpetstore.model

import javax.persistence.*

@Entity
@Table(name = "pet_order")
data class Order (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int = 0,
        val petId: Int = 0,
        val quantity: Int? = null,
        val shipDate: String? = null,
        val status: Status? = null,
        val complete: Boolean? = null
) {
    enum class Status(val value: String) {
        placed("placed"),
        approved("approved"),
        delivered("delivered");
    }
}
