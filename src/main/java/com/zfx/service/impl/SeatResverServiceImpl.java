package com.zfx.service.impl;

import com.zfx.dao.SeatResverMapper;
import com.zfx.entity.SeatExample;
import com.zfx.entity.SeatResver;
import com.zfx.entity.SeatResverExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SeatResverServiceImpl {
    @Autowired
    SeatResverMapper resverMapper;

    /*
    * 将预约信息插入到表中
    * 1为已预约
    * 2为以上座
    * */
    public void insertSeatResver(SeatResver seatResver,String status){
        if(status.equals("可预约")){
            seatResver.setState("1");
        }else {
            seatResver.setState("2");
        }
        resverMapper.insertSelective(seatResver);
    }

    /*
    * 查询用户是否已预约，如果预约表中有该用户id，返回给前端
    * */
    public boolean checkUserID(Integer userid){
        SeatResverExample example = new SeatResverExample();
        SeatResverExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        long l = resverMapper.countByExample(example);
        return l > 0 ;
    }

    /*
    * 点击取消预约按钮，删除相应的预约信息
    * */
    public boolean deleteSeatResver(Integer seatid){
        SeatResverExample example = new SeatResverExample();
        SeatResverExample.Criteria criteria = example.createCriteria();
        criteria.andSeatidEqualTo(seatid);
        int i = resverMapper.deleteByExample(example);
        return i > 0;
    }

    /*
    * 查看所有预约信息
    * */
    public List<SeatResver> getAll(){
        List<SeatResver> seatResvers = resverMapper.selectByExample(null);
        return seatResvers;
    }
    /*
    * 根据传入的Seatid，进行模糊查询
    * */
    public List<SeatResver> getSeatAll(Integer seatid){
        SeatResverExample example = new SeatResverExample();
        SeatResverExample.Criteria criteria = example.createCriteria();
        criteria.andSeatidEqualTo(seatid);
        List<SeatResver> seatResvers = resverMapper.selectByExample(example);
        return seatResvers;
    }

}
