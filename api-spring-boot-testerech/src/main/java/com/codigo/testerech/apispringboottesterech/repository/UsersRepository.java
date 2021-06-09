package com.codigo.testerech.apispringboottesterech.repository;

import com.codigo.testerech.apispringboottesterech.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {
    User findByName(String name);

}
