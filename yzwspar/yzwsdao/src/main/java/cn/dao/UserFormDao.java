package cn.dao;

import cn.pojo.UserForm;
import org.apache.ibatis.annotations.Param;

public interface UserFormDao {

    /**
     * 根据用户的openid查询数据库，判断用户是否存在
     * @param openid
     * @return
     */
    UserForm login(@Param("openid")String openid);

    /**
     * 如果用户不存在，将用户所有信息添加到数据库
     * @param user
     * @return
     */
    int addUser(UserForm user);
}
