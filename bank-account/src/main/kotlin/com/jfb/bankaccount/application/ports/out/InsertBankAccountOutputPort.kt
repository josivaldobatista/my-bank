package com.jfb.bankaccount.application.ports.out

import com.jfb.bankaccount.application.core.domain.BankAccount

interface InsertBankAccountOutputPort {

    fun insert(bankAccount: BankAccount)
}