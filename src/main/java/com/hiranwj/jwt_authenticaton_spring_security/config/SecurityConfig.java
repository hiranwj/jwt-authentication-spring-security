package com.hiranwj.jwt_authenticaton_spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

     @Bean
     public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
         return httpSecurity
                 .csrf(c->c.disable())
                 .sessionManagement(s->s.
                         sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                 .authorizeHttpRequests(r->r.
                         regexMatchers("/login").permitAll().anyRequest().authenticated())
                 .httpBasic(Customizer.withDefaults()).build();
     }
}
