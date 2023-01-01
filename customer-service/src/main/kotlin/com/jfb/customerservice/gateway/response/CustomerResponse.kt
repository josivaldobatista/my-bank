package com.jfb.customerservice.gateway.response

import com.jfb.customerservice.domains.enums.CustomerStatus

data class CustomerResponse(
  var id: Long?,
  var firstName: String,
  var lastName: String,
  var cpf: String,
  var email: String,
  var age: Int,
  var status: CustomerStatus
)
