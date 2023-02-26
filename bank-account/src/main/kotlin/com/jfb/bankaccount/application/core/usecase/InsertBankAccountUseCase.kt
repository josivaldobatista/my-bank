package com.jfb.bankaccount.application.core.usecase

import com.jfb.bankaccount.application.core.domain.BankAccount
import com.jfb.bankaccount.application.ports.out.FindAddressByZipCodeOutputPort
import com.jfb.bankaccount.application.ports.out.InsertBankAccountOutputPort

class InsertBankAccountUseCase(
    private val findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
    private val insertBankAccountOutputPort: InsertBankAccountOutputPort
) {

    fun insert(bankAccount: BankAccount, zipCode: String) {
        val address = findAddressByZipCodeOutputPort.find(zipCode);
        bankAccount.customer.address = address
        insertBankAccountOutputPort.insert(bankAccount)
    }
}