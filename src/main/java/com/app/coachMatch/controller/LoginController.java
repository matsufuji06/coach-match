package com.app.coachMatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.coachMatch.service.LoginService;
import com.app.coachMatch.util.JwtUtil;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class LoginController {
  private final LoginService service;
  private final JwtUtil jwtUtil;

  public LoginController(LoginService service, JwtUtil jwtUtil) {
    this.service = service;
    this.jwtUtil = jwtUtil;
  }

  @PostMapping("/login")
  public Map<String, Object> login(@RequestBody Map<String, String> request) {
    String username = request.get("username");
    String password = request.get("password");
    boolean success = service.login(username, password);
    if (success) {
      String token = jwtUtil.generateToken(username);
      return Map.of(
          "result", true,
          "token", token,
          "username", username
      // "roles", ["ROLE_USER"] ,
      );
    } else {
      return Map.of(
          "result", false,
          "username", username
      // "roles", ["ROLE_USER"] ,
      );
    }
  }

  @PostMapping("/logout")
  public Map<String, Object> logout() {
    return Map.of(
        "result", true,
        "message", "logged out");
  }
}
