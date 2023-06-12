package com.evgeniykudashov.adservice.controller.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "not found such feedback", code = HttpStatus.NOT_FOUND)
public class NotFoundFeedbackException extends NotFoundEntityException {
}
