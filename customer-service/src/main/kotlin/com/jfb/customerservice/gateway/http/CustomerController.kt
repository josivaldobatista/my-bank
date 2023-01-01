package com.jfb.customerservice.gateway.http

import com.jfb.customerservice.gateway.extensions.toDomain
import com.jfb.customerservice.gateway.extensions.toResponse
import com.jfb.customerservice.gateway.http.api.CustomerServiceApi
import com.jfb.customerservice.gateway.services.CustomerService
import com.jfb.customerservice.gateway.requests.CustomerRequest
import com.jfb.customerservice.gateway.requests.CustomerUpdateRequest
import com.jfb.customerservice.gateway.response.CustomerResponse
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class CustomerController(
  val customerService: CustomerService
): CustomerServiceApi {

  override fun create(customer: CustomerRequest) {
    customerService.create(customer.toDomain())
  }

  override fun findAll(): List<CustomerResponse> {
    return customerService.findAll().map { it.toResponse() }
  }

  override fun findById(id: Long): CustomerResponse {
    return customerService.findById(id).toResponse()
  }

  override fun update(id: Long, customer: CustomerUpdateRequest) {
    val customerSaved = customerService.findById(id)
    customerService.update(customer.toDomain(customerSaved))
  }

  override fun delete(id: Long) {
    customerService.delete(id)
  }

}