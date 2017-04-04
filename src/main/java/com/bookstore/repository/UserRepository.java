package com.bookstore.repository;

import com.bookstore.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by NUT_PC on 05/04/2560.
 */
public interface UserRepository extends CrudRepository<User, Long>{
    User findByUsername(String username);
    User findByEmail(String Email);
    List<User> findAll();
}
