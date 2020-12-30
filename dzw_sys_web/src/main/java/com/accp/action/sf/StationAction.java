package com.accp.action.sf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sf.StationBiz;
import com.accp.pojo.sf.Station;

@RestController
@RequestMapping("/api/sf/dzws")
public class StationAction {
	@Resource
	private StationBiz biz;
	
	@GetMapping("station")
	public List<Station> querystation(){
		return biz.querystation();
	}
	
	@PostMapping("addstation")
	@ResponseBody
	public Map<String, String> addstation(@RequestBody Station station,HttpServletRequest request) {
		Map<String, String> message = new HashMap<String, String>();
		biz.addstation(station);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@GetMapping("removestation")
	public String removestation(Integer stationid) {
		biz.removestation(stationid);
		return "findLiss";//返回的页面
	}
	
	
	
	
	
	
	
	
	
	
	
}
