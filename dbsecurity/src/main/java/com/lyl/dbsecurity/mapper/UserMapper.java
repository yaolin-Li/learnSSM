package com.lyl.dbsecurity.mapper;

import com.lyl.dbsecurity.entity.Role;
import com.lyl.dbsecurity.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    User loadUserByUsername(String username);
    List<Role> getUserRolesByUid(Integer id);
}
