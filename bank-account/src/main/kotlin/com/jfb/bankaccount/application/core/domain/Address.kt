package com.jfb.bankaccount.application.core.domain

data class Address(
    var street: String,
    var number: String,
    var city: String,
    var state: String,
    var zipCode: String
)