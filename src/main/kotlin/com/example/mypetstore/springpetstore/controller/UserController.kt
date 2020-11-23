package com.example.mypetstore.springpetstore.controller

import com.example.mypetstore.springpetstore.model.User
import com.example.mypetstore.springpetstore.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController {

    @Autowired
    lateinit var repository: UserRepository

    @PostMapping("/user")
    fun addUser(@RequestBody body: User): String {
        repository.save(body)
        return "User added..."
    }

    @PostMapping("/user/createWithList")
    fun addUserList(@RequestBody body: List<User>): String {
        for (user in body) {
            repository.save(user)
        }
        return "Users added..."
    }

    @PostMapping("/user/createWithArray")
    fun addUserList(@RequestBody body: Array<User>): String {
        for (user in body) {
            repository.save(user)
        }
        return "Users added..."
    }

    @GetMapping("/user/{username}")
    fun findUserByUsernicname(@PathVariable username: String): User {
        return repository.findUserByUsername(username)
    }

    @PutMapping("/user/{username}")
    fun updateUser(@PathVariable username: String, @RequestBody body: User): String {
        val user = findUserByUsernicname(username)
        body.firstName?.let { user.firstName = body.firstName }
        body.lastName?.let { user.lastName = body.lastName }
        body.email?.let { user.email = body.email }
        body.password?.let { user.password = body.password }
        body.phone?.let { user.phone = body.phone }
        body.userStatus?.let { user.userStatus = body.userStatus }
        repository.save(user)
        return "User updated..."
    }

    @DeleteMapping("/user/{username}")
    fun deleteUser(@PathVariable username: String): String {
        val user = findUserByUsernicname(username)
        repository.deleteById(user.id)
        return "User deleted.."
    }

    @GetMapping ("/user/allusers")
    fun getAllUsers(): List<User>
            = repository.findAll()
}