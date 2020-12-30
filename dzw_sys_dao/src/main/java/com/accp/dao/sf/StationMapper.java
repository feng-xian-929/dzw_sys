package com.accp.dao.sf;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.sf.Station;

public interface StationMapper {
    int deleteByPrimaryKey(@Param("stationid") Integer stationid);

    int insert(@Param("station") Station station);

    int insertSelective(Station record);

    Station selectByPrimaryKey(Integer stationid);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);
    
    List<Station> querystation();
}