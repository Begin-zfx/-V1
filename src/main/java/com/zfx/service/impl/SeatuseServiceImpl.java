package com.zfx.service.impl;

import com.zfx.dao.SeatuseMapper;
import com.zfx.entity.Seatuse;
import com.zfx.entity.SeatuseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatuseServiceImpl {
    @Autowired
    SeatuseMapper seatuseMapper;

    /*
     * 通过用户ID进行查询
     * */
    public List<Seatuse> queryByUserID(Integer userid){
        SeatuseExample example = new SeatuseExample();
        SeatuseExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<Seatuse> Seatuses = seatuseMapper.selectByExample(example);
        return Seatuses;
    }
    /*
    * 获取全部信息
    * */
    public List<Seatuse> getAll(){
        List<Seatuse> seatuses = seatuseMapper.selectByExample(null);
        return seatuses;
    }

    /*
    * 根据传入的数据选择插入字段
    * */
    public boolean insertSeatUseInfo(Seatuse seatuse,String status){
        if(status.equals("可预约")){
            seatuse.setState("1");
        }
        if(status.equals("立即上座")){
            seatuse.setState("2");
        }
        seatuse.setSeatuseid(null);
        int i = seatuseMapper.insertSelective(seatuse);
        return i > 0;
    }

    /*
    * 点击删除按钮，根据主键删除该条信息
    * */
    public boolean deleteSeatUserInfo(Integer seatuseid){
        int i = seatuseMapper.deleteByPrimaryKey(seatuseid);
        return i>0;
    }

    /*
    * 获取state为1的条数
    * */
    public long queryStateCount(String state){
        SeatuseExample example = new SeatuseExample();
        SeatuseExample.Criteria criteria = example.createCriteria();
        if (state.equals("1")){
            criteria.andStateEqualTo(state);
        }
        if (state.equals("2")){
            criteria.andStateEqualTo(state);
        }
        long l = seatuseMapper.countByExample(example);
        return l;
    }
}
