package com.newyearletter.newyearletter.repository;

import com.newyearletter.newyearletter.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUserID(String userID);
    Optional<User> findByNickName(String nickName);

}