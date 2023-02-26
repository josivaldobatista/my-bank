package com.jfb.bankaccount.application.ports.out

import com.jfb.bankaccount.application.core.domain.Address

interface FindAddressByZipCodeOutputPort {

    fun find(zipCode: String): Address
}