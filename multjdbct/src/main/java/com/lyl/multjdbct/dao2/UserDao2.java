package com.lyl.multjdbct.dao2;

import com.lyl.multjdbct.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao2 extends JpaRepository<User,Integer> {
}
