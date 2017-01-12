package com.codeup;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by joshua on 1/12/17.
 */
    public interface Users extends CrudRepository<User, Long> {
        public User findByUsername(String username);
    }

