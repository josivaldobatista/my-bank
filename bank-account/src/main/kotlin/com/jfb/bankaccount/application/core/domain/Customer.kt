package com.jfb.bankaccount.application.core.domain

data class Customer(
    var id: String,
    var name: String,
    var documentNumber: String,
    var email: String,
    var phoneNumber: String,
    var address: Address
)