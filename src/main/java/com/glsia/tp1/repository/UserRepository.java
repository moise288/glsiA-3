package com.glsia.tp1.repository;

import com.glsia.tp1.models.User;
import com.glsia.tp1.models.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserName(String userName);

}
