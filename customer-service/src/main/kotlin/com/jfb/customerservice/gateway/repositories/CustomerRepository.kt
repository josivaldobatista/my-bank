package com.jfb.customerservice.gateway.repositories

import com.jfb.customerservice.domains.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long> {
  fun existsByEmail(email: String): Boolean
}
