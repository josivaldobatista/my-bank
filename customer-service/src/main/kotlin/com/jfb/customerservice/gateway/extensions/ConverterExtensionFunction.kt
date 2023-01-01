package com.jfb.customerservice.gateway.extensions

import com.jfb.customerservice.domains.Customer
import com.jfb.customerservice.domains.enums.CustomerStatus
import com.jfb.customerservice.gateway.requests.CustomerRequest
import com.jfb.customerservice.gateway.requests.CustomerUpdateRequest
import com.jfb.customerservice.gateway.response.CustomerResponse

fun CustomerRequest.toDomain() = Customer(
  firstName = this.firstName,
  lastName = this.lastName,
  age = this.age,
  cpf = this.cpf,
  email = this.email,
  status = CustomerStatus.ATIVO
)

fun Customer.toResponse() = CustomerResponse (
  id = this.id,
  firstName = this.firstName,
  lastName = this.lastName,
  cpf = this.cpf,
  email = this.email,
  age = this.age,
  status = this.status
)

fun CustomerUpdateRequest.toDomain(previousValue: Customer):  Customer {
  return Customer(
    id = previousValue.id,
    firstName = this.firstName,
    lastName = this.lastName,
    cpf = this.cpf,
    email = this.email,
    age = this.age,
    status = previousValue.status
  )
}
