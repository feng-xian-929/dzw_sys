package com.accp.test.biz;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.biz.jhw.DzwBiz;
import com.accp.biz.sf.StationBiz;
import com.accp.pojo.sf.Station;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-ctx.xml")
public class DzwTestBiz {

	@Resource
	private StationBiz biz;
	
	@Test
	public void cha() {
		biz.removestation(1011);
	}
}
