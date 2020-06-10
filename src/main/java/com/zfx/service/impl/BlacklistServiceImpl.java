package com.zfx.service.impl;

import com.zfx.dao.BlacklistMapper;
import com.zfx.entity.Blacklist;
import com.zfx.entity.BlacklistExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlacklistServiceImpl {

    @Autowired
    BlacklistMapper blacklistMapper;
    //获取数据库的信息，黑名单
    public List<Blacklist> getAll(){
        List<Blacklist> blacklists = blacklistMapper.selectByExample(null);
        return blacklists;
    }

    /*
     * 前端解除按钮发起ajax请求，后台更新数据,更新状态为已解除
     * */
    public boolean updateStatusJC(Integer blackid){
        BlacklistExample example = new BlacklistExample();
        BlacklistExample.Criteria criteria = example.createCriteria();
        criteria.andBlackidEqualTo(blackid);
        Blacklist blacklist = new Blacklist();
        blacklist.setStatus("已解除");
        int i = blacklistMapper.updateByExampleSelective(blacklist, example);
        return i>0;
    }
    /*
     * 前端解除按钮发起ajax请求，后台更新数据，更新状态为冻结
     * */
    public boolean updateStatusDJ(Integer blackid){
        BlacklistExample example = new BlacklistExample();
        BlacklistExample.Criteria criteria = example.createCriteria();
        criteria.andBlackidEqualTo(blackid);
        Blacklist blacklist = new Blacklist();
        blacklist.setStatus("冻结");
        int i = blacklistMapper.updateByExampleSelective(blacklist, example);
        return i>0;
    }
}
