package com.example.mypetstore.springpetstore.model

import javax.persistence.*

@Entity
@Table
data class Pet(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int = 0,
        val name: String = "",
        //val category: Category? = null,
        val photoUrls: Array<String>? = null,
        val tags: Array<String>? = null,
        val status: Status? = null
) {
    enum class Status(val value: String) {
        available("available"),
        pending("pending"),
        sold("sold");
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pet

        if (id != other.id) return false
        if (name != other.name) return false
        if (photoUrls != null) {
            if (other.photoUrls == null) return false
            if (!photoUrls.contentEquals(other.photoUrls)) return false
        } else if (other.photoUrls != null) return false
        if (tags != null) {
            if (other.tags == null) return false
            if (!tags.contentEquals(other.tags)) return false
        } else if (other.tags != null) return false
        if (status != other.status) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + (photoUrls?.contentHashCode() ?: 0)
        result = 31 * result + (tags?.contentHashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        return result
    }
}