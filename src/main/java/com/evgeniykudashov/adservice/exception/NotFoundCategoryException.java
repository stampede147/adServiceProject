package com.evgeniykudashov.adservice.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "not found such category", code = HttpStatus.NOT_FOUND)
public class NotFoundCategoryException extends NotFoundUserException {
}
