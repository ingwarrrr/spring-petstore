package com.example.mypetstore.springpetstore.controller

import com.example.mypetstore.springpetstore.model.Pet
import com.example.mypetstore.springpetstore.repository.PetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class PetController {

    @Autowired
    lateinit var repository: PetRepository

    @PostMapping("/pet")
    fun addPet(@RequestBody body: Pet): String {
        repository.save(body)
        return "Pet added..."
    }

    @PutMapping("/pet")
    fun updatePet(@RequestBody body: Pet): String {
        repository.save(body)
        return "Pet updated..."
    }

    @GetMapping ("/pet/{id}")
    fun findPetById(@PathVariable id: Int)
            = repository.findById(id)

    @GetMapping ("/pet/allPets")
    fun getAllPets(): List<Pet>
            = repository.findAll()

    @GetMapping ("/pet/findByStatus")
    fun findPetByStatus(@RequestBody body: Pet): List<Pet>{
        return repository.findPetsByStatus(body.status)
    }

    @DeleteMapping("/pet/{id}")
    fun deletePet(@PathVariable id: Int): String {
        repository.deleteById(id)
        return "Pet deleted.."
    }
}