package com.godcoder.myhome.repository;

import com.godcoder.myhome.model.Role;
import com.godcoder.myhome.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);


}
