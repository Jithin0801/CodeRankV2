package com.code.rank.util;

import java.time.Instant;
import java.util.Collections;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
class ErrorResponseFactory {

	ErrorResponse create(int status, String error, String message, String path) {
		return new ErrorResponse(false, status, error, message, path, Collections.emptyMap(), Instant.now());
	}

	ErrorResponse create(int status, String error, String message, String path, Map<String, String> details) {
		return new ErrorResponse(
				false,
				status,
				error,
				message,
				path,
				details == null ? Collections.emptyMap() : details,
				Instant.now());
	}
}
