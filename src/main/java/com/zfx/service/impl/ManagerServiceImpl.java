package com.zfx.service.impl;

import com.zfx.dao.ManagerMapper;
import com.zfx.entity.Manager;
import com.zfx.entity.ManagerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl {
    @Autowired
    ManagerMapper managerMapper;


    /*检查用户名是否在数据库中存在
     * @param empName
     * @return 0=>true 可用
     * ==0说明数据库中没有查到姓名，不重复，可以用，  不存在
     * 如果不等于0，说明数据库中存在，用户名重复不可以用  存在
     */
    public boolean checkManagerName(String managerName){
        ManagerExample example = new ManagerExample();
        ManagerExample.Criteria criteria = example.createCriteria();
        criteria.andManagernameEqualTo(managerName);
        long count = managerMapper.countByExample(example);
        if(count == 0){
            return true;
        }else {
            return false;
        }
    }
    public boolean checkManagerPwd(String userPwd) {
        ManagerExample example = new ManagerExample();
        ManagerExample.Criteria criteria = example.createCriteria();
        criteria.andManagerpwdEqualTo(userPwd);
        long count = managerMapper.countByExample(example);
        return count == 0;
    }
    public boolean checkManagerID(Integer managerID) {
        ManagerExample example = new ManagerExample();
        ManagerExample.Criteria criteria = example.createCriteria();
        criteria.andManageridEqualTo(managerID);
        long count = managerMapper.countByExample(example);
        return count == 0;
    }
    public boolean checkManagerTel(String managerTel) {
        ManagerExample example = new ManagerExample();
        ManagerExample.Criteria criteria = example.createCriteria();
        criteria.andManagertelEqualTo(managerTel);
        long count = managerMapper.countByExample(example);
        if(count == 0){
            return true;
        }else {
            return false;
        }
    }
    /*
     * 管理员更新单个密码
     *
     * */
    public int updateUserPwd(String managername,String managerpwd){
        ManagerExample example = new ManagerExample();
        ManagerExample.Criteria criteria = example.createCriteria();
        criteria.andManagernameEqualTo(managername);
        Manager manager = new Manager();
        manager.setManagerpwd(managerpwd);
        int i = managerMapper.updateByExampleSelective(manager, example);
        return i;
    }

    /*
    * 创建新的管理员用户
    * */
    public boolean createManager(Manager manager){
        int i = managerMapper.insertSelective(manager);
        if(i == 0){
            return false;
        }else {
            return true;
        }
    }
}
