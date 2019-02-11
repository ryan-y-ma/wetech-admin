package tech.wetech.admin.modules.system.service;

import tech.wetech.admin.core.exception.BizException;
import tech.wetech.admin.modules.system.po.User;
import tech.wetech.admin.modules.system.vo.UserVO;
import tech.wetech.admin.modules.system.query.UserQuery;

import java.util.List;
import java.util.Set;

public interface UserService extends IService<User> {

    /**
     * 创建用户
     * @param user
     */
    void createUser(User user) throws BizException;

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
    void changePassword(Long userId, String newPassword);

    /**
     * 根据用户名查找其角色
     * @param username
     * @return
     */
    Set<String> queryRoles(String username);

    /**
     * 根据用户名查找其权限
     * @param username
     * @return
     */
    Set<String> queryPermissions(String username);

}