package com.app.coachMatch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.coachMatch.service.LoginService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class LoginController {
  private final LoginService service;

  public LoginController(LoginService service) {
    this.service = service;
  }

  @PostMapping("/login")
  public Map<String, Object> login(@RequestBody Map<String, String> request) {
    String username = request.get("username");
    String password = request.get("password");
    boolean success = service.login(username, password);
    return Map.of("success", success);
  }

}
