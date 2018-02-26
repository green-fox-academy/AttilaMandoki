package com.greenfoxacademy.practice_cognitive_apprenticeship.configurations;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.apache.tomcat.websocket.AuthenticationException;

public interface AuthenticationManager {

  Authentication authenticate(Authentication authentication)
          throws AuthenticationException;

}