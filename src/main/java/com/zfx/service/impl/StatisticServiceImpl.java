package com.zfx.service.impl;

import com.zfx.dao.SeatuseMapper;
import com.zfx.dao.StatisticMapper;
import com.zfx.entity.Seatuse;
import com.zfx.entity.Statistic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class StatisticServiceImpl {
    @Autowired
    SeatuseMapper seatuseMapper;
    @Autowired
    StatisticMapper statisticMapper;
    StatisticServiceImpl(){
        System.out.println("构造构造***********************************************************");
    }
    /*
    * 获取数据，将信息展示再chart中
    * */
    public List<Statistic> getAll(){
        List<Statistic> statistics = statisticMapper.selectByExample(null);
        return statistics;
    }

    /*
    * 定时任务，每十秒刷新一次
    * */
    @Scheduled(cron = "9/10 * * * * ?")
    public String statisticInfo() throws ParseException {
        List<Seatuse> seatuses = seatuseMapper.selectByExample(null);
        Date currentTime = new Date();
        Date currentTime2 = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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
//                System.out.println(ctime+",,"+etime+",,,seatU:"+seatU);
            }
            if (etime.equals(ctime) && state.equals("1")){
                seatR++;
//                System.out.println(ctime+",,"+etime+",,,seatR:"+seatR);
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
//        System.out.println("最终flag:"+flag);
        Statistic statistic = new Statistic();
        statistic.setSeatr(seatR);
        statistic.setSeatu(seatU);
        System.out.println(dateFormat2.format(currentTime2));
        if (flag == 1){
            statistic.setStaid(staid);
            int i = statisticMapper.updateByPrimaryKeySelective(statistic);
            if (i>0){
//                System.out.println("更新成功");
            }else {
//                System.out.println("更新失败");
            }
        }
        if (flag == 0){
            Date parse = dateFormat.parse(ctime);
            statistic.setStaid(null);
            statistic.setStadate(parse);
            int i = statisticMapper.insertSelective(statistic);
            if (i>0){
//                System.out.println("插入成功");
            }else {
//                System.out.println("插入失败");
            }
        }
        return null;
    }
}
