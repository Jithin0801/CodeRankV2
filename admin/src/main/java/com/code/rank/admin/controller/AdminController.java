package com.code.rank.admin.controller;

import com.code.rank.util.ApiRequest;
import com.code.rank.util.SuccessResponse;
import java.time.Instant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@PostMapping("/echo")
	public ResponseEntity<SuccessResponse<ApiRequest<String>>> echo(@RequestBody ApiRequest<String> request) {
		return ResponseEntity.ok(new SuccessResponse<>(true, "Request received", request, Instant.now()));
	}
}
