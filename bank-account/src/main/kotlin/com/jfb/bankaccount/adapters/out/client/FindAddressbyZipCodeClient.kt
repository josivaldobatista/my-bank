package com.jfb.bankaccount.adapters.out.client

import com.jfb.bankaccount.adapters.out.client.response.AddressResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(
    name = "FindAddressbyZipCodeClient",
    url = "\${jfb.client.address.url}"
)
interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    fun find(@PathVariable("zipCode") zipCode: String): AddressResponse
}