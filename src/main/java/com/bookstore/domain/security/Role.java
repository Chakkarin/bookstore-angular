package com.bookstore.domain.security;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by NUT_PC on 04/04/2560.
 */
@Entity
public class Role implements Serializable {

    private static final long serialVersionUID = 890245234L;

    @Id
    private int roleId;

    private String name;

    private Set<UserRole> userRoles = new HashSet<>();

    public Role() {}

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}