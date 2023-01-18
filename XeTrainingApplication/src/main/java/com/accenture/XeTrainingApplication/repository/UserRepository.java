package com.accenture.XeTrainingApplication.repository;

import com.accenture.XeTrainingApplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String inputName);
}
