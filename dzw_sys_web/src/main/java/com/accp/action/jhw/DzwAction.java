package com.accp.action.jhw;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.jhw.DzwBiz;
import com.accp.pojo.jhw.User;

@RestController
@RequestMapping("/api/jhw/dzws")
public class DzwAction {

	@Resource
	private DzwBiz biz;
	
	@GetMapping
	public User cha(Integer id) {
		return biz.cha(001);
	}
}
