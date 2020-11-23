package com.example.mypetstore.springpetstore.repository

import com.example.mypetstore.springpetstore.model.Pet
import org.springframework.data.jpa.repository.JpaRepository

interface PetRepository : JpaRepository<Pet, Int> {
    fun findPetsByStatus(status: Pet.Status?) : List<Pet>
}