package com.example.sweater.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by User on 27.01.2019.
 */
public enum Role implements GrantedAuthority{
    USER {
        @Override
        public String getAuthority() {
            return name();
        }
    };
}
