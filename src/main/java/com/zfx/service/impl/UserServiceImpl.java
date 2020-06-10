package com.zfx.service.impl;

import com.zfx.dao.UserMapper;
import com.zfx.entity.User;
import com.zfx.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    UserMapper userMapper;

    /*
    * 通过用户名进行模糊查询
    * */
    public List<User> queryByUserName(String username){
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameLike("%"+username+"%");
        List<User> users = userMapper.selectByExample(example);
        return users;
    }


    //查询用户的全部数据
    public List<User> getAll(){
        List<User> users = userMapper.selectByExample(null);
        return users;
    }

    //员工插入保存
    public void insertUser(User user){
        userMapper.insertSelective(user);
    }

    /*检查用户名是否在数据库中存在
    * @param empName
    * @return 0=>true 可用
    * ==0说明数据库中没有查到姓名，不重复，可以用，
    * 如果不等于0，说明数据库中存在，用户名重复不可以用
    */
    public boolean checkUserName(String userName){
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(userName);
        long count = userMapper.countByExample(example);
        return count == 0;
    }

    /*
     * 校验手机号码是否在数据库中存在，如果存在返回不等于0，不存在返回0
     */
    public boolean checkUserTel(String userTel) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsertelEqualTo(userTel);
        long count = userMapper.countByExample(example);
        return count == 0;
    }
    public boolean checkUserPwd(String userPwd) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserpwdEqualTo(userPwd);
        long count = userMapper.countByExample(example);
        return count == 0;
    }
    public boolean checkUserID(Integer userID) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userID);
        long count = userMapper.countByExample(example);
        return count > 0;
    }

    /*
     * 用传入的UserId来查询数据库中的员工名字
     * @param userID
     */
    public User getUserByID(Integer userID) {
        User user = userMapper.selectByPrimaryKey(userID);
        return user;
    }

    /*
     * 用于更新员工数据
     * @param user
     */
    public void updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
    /*
    * yonghu更新单个密码
    *
    * */
    public int updateUserPwd(Integer userid,String userpwd){
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        User user = new User();
        user.setUserpwd(userpwd);
        int i = userMapper.updateByExampleSelective(user, example);
        return i;
    }

    /*
     * 用于批量删除员工数据
     */
    public void batchUser(List<Integer> delids) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridIn(delids);
        userMapper.deleteByExample(example);
    }

    //删除用户
    public boolean deleteUser(Integer userid){
        int i = userMapper.deleteByPrimaryKey(userid);
        if (i>0){
            return true;
        }else {
            return false;
        }
    }
}
