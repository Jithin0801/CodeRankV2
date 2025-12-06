package com.code.rank.util;

import java.time.Instant;

public record SuccessResponse<T>(boolean success, String message, T data, Instant timestamp) {
}
