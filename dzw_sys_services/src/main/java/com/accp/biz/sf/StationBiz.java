package com.accp.biz.sf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.sf.StationMapper;
import com.accp.pojo.sf.Station;

@Service
public class StationBiz {
	@Autowired
	private StationMapper dao;
	
	public List<Station> querystation(){
		return dao.querystation();
	}
	
	public int addstation(Station record) {
		return dao.insert(record);
	}
	
	public int removestation(Integer stationid) {
		return dao.deleteByPrimaryKey(stationid);
	}
}
