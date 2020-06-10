package com.zfx;

import com.zfx.dao.SeatuseMapper;
import com.zfx.dao.StatisticMapper;
import com.zfx.dao.UserMapper;
import com.zfx.entity.Seatuse;
import com.zfx.entity.Statistic;
import com.zfx.entity.StatisticExample;
import com.zfx.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.SimpleFormatter;

@SpringBootTest
class MyprojectApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    User user;
    @Autowired
    SeatuseMapper seatuseMapper;
    @Autowired
    StatisticMapper statisticMapper;
    @Test
    void contextLoads() throws ParseException {
        List<Seatuse> seatuses = seatuseMapper.selectByExample(null);
        Date currentTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String ctime = dateFormat.format(currentTime);
        Date endtime = null;
        int seatU = 0;
        int seatR = 0;
        for (Seatuse seatuse:seatuses) {
            endtime = seatuse.getEndtime();
            String etime = dateFormat.format(endtime);
            String state = seatuse.getState();
            if (etime.equals(ctime) && state.equals("2")){
                seatU++;
                System.out.println(ctime+",,"+etime+",,,seatU:"+seatU);
            }
            if (etime.equals(ctime) && state.equals("1")){
                seatR++;
                System.out.println(ctime+",,"+etime+",,,seatR:"+seatR);
            }
        }
        List<Statistic> statistics = statisticMapper.selectByExample(null);
        int flag = -1;
        Integer staid = null;
        for (Statistic sta:statistics) {
            Date stadate = sta.getStadate();
            String statisdate = dateFormat.format(stadate);
            if(statisdate.equals(ctime)){
                flag = 1 ;
                staid = sta.getStaid();
                break;
            }else {
                flag = 0;
            }
        }
        System.out.println("最终flag:"+flag);
        Statistic statistic = new Statistic();
        statistic.setSeatr(seatR);
        statistic.setSeatu(seatU);
        if (flag == 1){
//            StatisticExample example = new StatisticExample();
//            StatisticExample.Criteria criteria = example.createCriteria();
//            criteria.andStaidEqualTo(staid);
            statistic.setStaid(staid);
            int i = statisticMapper.updateByPrimaryKeySelective(statistic);
            if (i>0){
                System.out.println("更新成功");
            }else {
                System.out.println("更新失败");
            }
        }
        if (flag == 0){
            Date parse = dateFormat.parse(ctime);
            statistic.setStaid(null);
            statistic.setStadate(parse);
            int i = statisticMapper.insertSelective(statistic);
            if (i>0){
                System.out.println("插入成功");
            }else {
                System.out.println("插入失败");
            }
        }
    }


//    static int k = 101;
    /*@Test
    void insertdates(){

        for (int j = 0; j < 100; j++) {
            k++;
            String i = "15952086"+k;
            String s = i.toString();
            String uid = UUID.randomUUID().toString().substring(0, 6);
            user.setUserid(null);
            user.setUsername(uid);
            user.setUserage(23);
            user.setUsergender("M");
            user.setUsertel(s);
            user.setUserpwd("123123");
            userMapper.insertSelective(user);
        }

    }*/

}
