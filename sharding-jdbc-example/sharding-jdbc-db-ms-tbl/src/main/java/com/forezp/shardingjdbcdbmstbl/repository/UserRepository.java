package com.forezp.shardingjdbcdbmstbl.repository;



import com.forezp.shardingjdbcdbmstbl.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserRepository {

    Integer addUser(User user);

    List<User> list();

    void deleteAll();

    Integer deleteByIds(@Param("ids") List<Integer> ids);

}

