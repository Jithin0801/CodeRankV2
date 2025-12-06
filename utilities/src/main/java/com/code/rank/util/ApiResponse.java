package com.code.rank.util;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ApiResponse {

	private final SuccessResponseFactory successResponseFactory;
	private final ErrorResponseFactory errorResponseFactory;

	public ApiResponse(SuccessResponseFactory successResponseFactory, ErrorResponseFactory errorResponseFactory) {
		this.successResponseFactory = successResponseFactory;
		this.errorResponseFactory = errorResponseFactory;
	}

	public <T> ResponseEntity<SuccessResponse<T>> success(String message, T data) {
		return ResponseEntity.ok(successResponseFactory.create(message, data));
	}

	public ResponseEntity<SuccessResponse<Void>> success(String message) {
		return ResponseEntity.ok(successResponseFactory.create(message));
	}

	public <T> ResponseEntity<SuccessResponse<T>> created(String message, T data) {
		return ResponseEntity.status(HttpStatus.CREATED).body(successResponseFactory.create(message, data));
	}

	public ResponseEntity<ErrorResponse> error(HttpStatus status, String message, String path) {
		if (status != null) {
			return ResponseEntity.status(status)
				.body(errorResponseFactory.create(status.value(), status.getReasonPhrase(), message, path));
		}
		return null;
	}

	public ResponseEntity<ErrorResponse> error(
			HttpStatus status, String message, String path, Map<String, String> details) {
				if (status != null) {
		return ResponseEntity.status(status)
				.body(errorResponseFactory.create(status.value(), status.getReasonPhrase(), message, path, details));
		}
		return null;
	}
}
