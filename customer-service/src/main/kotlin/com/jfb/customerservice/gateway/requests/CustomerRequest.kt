package com.jfb.customerservice.gateway.requests

import com.fasterxml.jackson.annotation.JsonAlias
import com.jfb.customerservice.validations.EmailAvailable
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class CustomerRequest(
  @field:NotEmpty
  @JsonAlias("first_name")
  var firstName: String,

  @field:NotEmpty
  @JsonAlias("last_name")
  var lastName: String,

  @field:NotEmpty
  var cpf: String,

  @EmailAvailable
  @field:NotEmpty
  var email: String,

  @field:NotNull
  var age: Int,
)
