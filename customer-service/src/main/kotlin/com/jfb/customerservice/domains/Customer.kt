package com.jfb.customerservice.domains

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty
import com.jfb.customerservice.domains.enums.CustomerStatus
import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  var id: Long? = null,

  @Column
  var firstName: String,

  @Column
  var lastName: String,

  var cpf: String,

  @Column
  var age: Int,

  @Column
  var email: String,

  @Column
  @Enumerated(EnumType.STRING)
  var status: CustomerStatus
)
