package io.prudhvi.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)

public class InvalidPasswordException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
		public InvalidPasswordException(String message) {
			super(message);
		}
		public InvalidPasswordException(String message, Throwable cause) {
			super(message, cause);
		}
}
