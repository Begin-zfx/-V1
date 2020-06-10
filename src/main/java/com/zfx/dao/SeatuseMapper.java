package com.zfx.dao;

import com.zfx.entity.Seatuse;
import com.zfx.entity.SeatuseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SeatuseMapper {
    long countByExample(SeatuseExample example);

    int deleteByExample(SeatuseExample example);

    int deleteByPrimaryKey(Integer seatuseid);

    int insert(Seatuse record);

    int insertSelective(Seatuse record);

    List<Seatuse> selectByExample(SeatuseExample example);

    Seatuse selectByPrimaryKey(Integer seatuseid);

    int updateByExampleSelective(@Param("record") Seatuse record, @Param("example") SeatuseExample example);

    int updateByExample(@Param("record") Seatuse record, @Param("example") SeatuseExample example);

    int updateByPrimaryKeySelective(Seatuse record);

    int updateByPrimaryKey(Seatuse record);
}