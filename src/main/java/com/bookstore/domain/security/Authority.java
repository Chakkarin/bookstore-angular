package com.bookstore.domain.security;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

/**
 * Created by NUT_PC on 04/04/2560.
 */
public class Authority implements GrantedAuthority, Serializable {

    private static final long serialVersionUID = 123123L;

    private final String authority;

    public Authority(String authority){
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
