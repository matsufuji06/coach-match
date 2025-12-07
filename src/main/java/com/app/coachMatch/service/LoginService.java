package com.app.coachMatch.service;

import com.app.coachMatch.repository.LoginRepository;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
  private final LoginRepository repository;

  public LoginService(LoginRepository repository) {
    this.repository = repository;
  }

  public boolean login(String username, String password) {
    return repository.findByUsername(username)
        .map(user -> user.getPassword().equals(password))
        .orElse(false);
  }
}
