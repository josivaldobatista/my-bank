package com.jfb.bankaccount.application.core.domain

data class Account(
    var id: String,
    var branch: String,
    var bank: String,
    var accountNumber: String,
    var checkDigit: String
)