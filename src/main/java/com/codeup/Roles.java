package com.codeup;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by joshua on 1/12/17.
 */
public interface Roles extends CrudRepository<UserRole, Long> {
    @Query("select ur.role from UserRole ur, User u where u.username=?1 and ur.userId = u.id")
    public List<String> ofUserWith(String username);
}
