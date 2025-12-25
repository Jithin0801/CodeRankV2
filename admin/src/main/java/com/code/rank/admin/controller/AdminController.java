package com.code.rank.admin.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.rank.util.ApiResponse;

@RestController
@RequestMapping("/admin")
public class AdminController {

	private ApiResponse apiResponse;

	public AdminController(ApiResponse apiResponse) {
		this.apiResponse = apiResponse;
	}

	@GetMapping("/ping")
	public ResponseEntity<?> ping() {
		return ResponseEntity.ok(apiResponse.success("Pong"));
	}
}
