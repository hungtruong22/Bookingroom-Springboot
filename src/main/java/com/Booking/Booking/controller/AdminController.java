package com.Booking.Booking.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminController {

	@PreAuthorize("hasAuthority('ADMIN')")
//	@RolesAllowed("ADMIN")
//	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping("/admin")
	public ResponseEntity<String> helloAdmin() {
		return ResponseEntity.ok("Hello Admin");
	}

	@PreAuthorize("hasAuthority('TEACHER')")
//	@RolesAllowed("USER")
//	@PreAuthorize("hasAuthority('USER')")
	@GetMapping("/teacher")
	public ResponseEntity<String> helloUser() {
		return ResponseEntity.ok("Hello User");
	}
}