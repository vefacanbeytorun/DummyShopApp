package com.example.vefa_can_beytorun_odev6.models

data class DummyProducts (
    val products: List<Product>,
    val total: Long,
    val skip: Long,
    val limit: Long
)

data class Product (
    val id: Long,
    val title: String,
    val description: String,
    val price: Long,
    val discountPercentage: Double,
    val rating: Double,
    val stock: Long,
    val brand: String,
    val category: Category,
    val thumbnail: String,
    val images: List<String>
)

enum class Category {
    Laptops,
    Smartphones
}
