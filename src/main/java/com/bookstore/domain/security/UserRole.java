package com.bookstore.domain.security;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by NUT_PC on 04/04/2560.
 */

@Entity
@Table(name = "user_role")
public class UserRole implements Serializable {
    private static final long serialVersionUID = 890345L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userRoleId;

    public UserRole() { }

    public  UserRole(User user,Role role){
        this.user = user;
        this.user = role;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    private Role role;
}
