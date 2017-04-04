package com.bookstore.repository;

import com.bookstore.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by NUT_PC on 05/04/2560.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {
}
