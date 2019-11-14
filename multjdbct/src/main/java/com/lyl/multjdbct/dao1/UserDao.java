package com.lyl.multjdbct.dao1;

import com.lyl.multjdbct.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
