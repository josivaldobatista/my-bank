package com.jfb.customerservice.exceptions

class ResourceNotFoundException(
  override val message: String,
  val errorCode: String
): Exception()
