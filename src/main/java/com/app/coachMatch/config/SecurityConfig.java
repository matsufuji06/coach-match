package com.app.coachMatch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    // TODO: セキュリティのチェックを検討（いったんアクセス許可）
    http
        .csrf(csrf -> csrf.disable()) // POSTリクエストでもCSRFチェック無効
        .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()); // 全て許可
    return http.build();
  }
}
