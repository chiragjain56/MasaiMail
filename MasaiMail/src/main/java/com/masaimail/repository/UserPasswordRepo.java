package com.masaimail.repository;

import com.masaimail.model.UserPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPasswordRepo extends JpaRepository<UserPassword,String> {
}
