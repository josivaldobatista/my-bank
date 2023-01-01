package com.jfb.customerservice.gateway.http.api

import com.jfb.customerservice.gateway.requests.CustomerRequest
import com.jfb.customerservice.gateway.requests.CustomerUpdateRequest
import com.jfb.customerservice.gateway.response.CustomerResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RequestMapping("/customers")
interface CustomerServiceApi {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  fun create(@RequestBody @Valid customer: CustomerRequest)

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  fun findAll(): List<CustomerResponse>

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  fun findById(@PathVariable id: Long): CustomerResponse

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  fun update(
    @PathVariable id: Long,
    @RequestBody customer: CustomerUpdateRequest
  )

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  fun delete(@PathVariable id: Long)

}