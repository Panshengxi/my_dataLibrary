
package com.myProject.Dao;
import com.myProject.bean.user;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userDao {
    List<user> getAll();
    user getLogin(@Param("name") String name, @Param("password") String password);
}