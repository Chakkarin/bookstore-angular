package com.bookstore.service;

import com.bookstore.domain.User;
import com.bookstore.domain.security.UserRole;

import java.util.Set;

/**
 * Created by NUT_PC on 05/04/2560.
 */
public interface UserService  {

    User createUser(User user, Set<UserRole> userRoles);
}
