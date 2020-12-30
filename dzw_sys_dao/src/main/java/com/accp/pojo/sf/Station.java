package com.accp.pojo.sf;

public class Station {
    private Integer stationid;

    private String stationname;

    public Integer getStationid() {
        return stationid;
    }

    public void setStationid(Integer stationid) {
        this.stationid = stationid;
    }

    public String getStationname() {
        return stationname;
    }

    public void setStationname(String stationname) {
        this.stationname = stationname == null ? null : stationname.trim();
    }

	public Station(Integer stationid, String stationname) {
		super();
		this.stationid = stationid;
		this.stationname = stationname;
	}

	public Station() {
		super();
	}
    
    
}