package com.jfb.customerservice.exceptions

import com.jfb.customerservice.gateway.response.ErrorResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest

@ControllerAdvice
class CustomerServiceExceptionHandler {

  @ExceptionHandler(ResourceNotFoundException::class)
  fun resourceNotFoundException(e: ResourceNotFoundException, request: WebRequest): ResponseEntity<ErrorResponse> {
    val error = ErrorResponse(
      HttpStatus.NOT_FOUND.value(),
      e.message,
      e.errorCode,
      null
    )
    return ResponseEntity(error, HttpStatus.NOT_FOUND)
  }
}