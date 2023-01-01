package com.jfb.customerservice.validations

import com.jfb.customerservice.gateway.services.CustomerService
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class EmailAvailableValidator(
  private val customerService: CustomerService
): ConstraintValidator<EmailAvailable, String> {

  override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
    if (value.isNullOrEmpty()) {
      return false
    }
    return customerService.emailAvailable(value)
  }

}