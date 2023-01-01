package com.jfb.customerservice.gateway.requests

import com.fasterxml.jackson.annotation.JsonAlias
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class CustomerUpdateRequest(
  @JsonAlias("first_name")
  @field:NotEmpty(message = "Nome deve ser informado")
  val firstName: String,

  @JsonAlias("last_name")
  @field:NotEmpty(message = "Nome deve ser informado")
  val lastName: String,

  @field:NotEmpty(message = "Cpf deve ser informado")
  val cpf: String,

  @field:NotNull(message = "Idade deve ser informado")
  val age: Int,

  @field:Email(message = "Email deve em um formato válido")
  val email: String
)