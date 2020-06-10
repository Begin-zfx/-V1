package com.zfx.dao;

import com.zfx.entity.SeatResver;
import com.zfx.entity.SeatResverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SeatResverMapper {
    long countByExample(SeatResverExample example);

    int deleteByExample(SeatResverExample example);

    int deleteByPrimaryKey(Integer resverid);

    int insert(SeatResver record);

    int insertSelective(SeatResver record);

    List<SeatResver> selectByExample(SeatResverExample example);

    SeatResver selectByPrimaryKey(Integer resverid);

    int updateByExampleSelective(@Param("record") SeatResver record, @Param("example") SeatResverExample example);

    int updateByExample(@Param("record") SeatResver record, @Param("example") SeatResverExample example);

    int updateByPrimaryKeySelective(SeatResver record);

    int updateByPrimaryKey(SeatResver record);
}