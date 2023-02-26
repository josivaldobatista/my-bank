package com.jfb.bankaccount.application.core.domain

import java.math.BigDecimal

data class BankAccount(
    var id: String,
    var currentBalance: BigDecimal,
    var accountType: String,
    var status: Status,
    var creationDate: String,
    var account: Account,
    var customer: Customer
)