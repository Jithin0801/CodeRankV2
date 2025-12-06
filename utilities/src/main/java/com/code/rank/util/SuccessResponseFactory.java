package com.code.rank.util;

import java.time.Instant;
import org.springframework.stereotype.Component;
	
@Component
class SuccessResponseFactory {

	<T> SuccessResponse<T> create(String message, T data) {
		return new SuccessResponse<>(true, message, data, Instant.now());
	}

	SuccessResponse<Void> create(String message) {
		return new SuccessResponse<>(true, message, null, Instant.now());
	}
}
