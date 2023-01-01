package com.jfb.customerservice.gateway.services

import com.jfb.customerservice.domains.Customer
import com.jfb.customerservice.domains.enums.CustomerStatus
import com.jfb.customerservice.domains.enums.Errors
import com.jfb.customerservice.exceptions.ResourceNotFoundException
import com.jfb.customerservice.gateway.repositories.CustomerRepository
import com.jfb.customerservice.gateway.response.CustomerResponse
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

@Service
class CustomerService(
  val customerRepository: CustomerRepository
) {
  fun create(customer: Customer) {
    customerRepository.save(customer)
  }

  fun findAll(): List<Customer> {
    return customerRepository.findAll()
  }

  fun findById(id: Long): Customer {
    return customerRepository.findById(id).orElseThrow{
      ResourceNotFoundException(Errors.PYTE202.message.format(id), Errors.PYTE202.code)
    }
  }

  fun update(customer: Customer) {
    if (!customerRepository.existsById(customer.id!!)) {
      throw Exception()
    }
    customerRepository.save(customer)
  }

  fun delete(id: Long) {
    val customer = findById(id)
    customer.status = CustomerStatus.INATIVO
    customerRepository.save(customer)
  }

}
