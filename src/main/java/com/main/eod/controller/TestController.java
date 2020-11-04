package com.main.eod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.main.eod.service.TestService;
import com.main.eod.vo.TestVO;

/**
 * Project Name  : EOD
 * Class Name  : TestController.java
 * Description : 
 * Modification Information  
 * 
 *    수정일　　　 　　                     수정자　　　               수정내용
 *    ---------------   -----------  ---------------------------
 *    2020. 11. 4       Jungho       최초생성
 * 
 * @author Jungho
 * @since 2020. 11. 4
 * @version 1.0
 * 
 * Copyright (C) 2020 All right reserved.
 */
@Controller
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping("/")
	public String main() throws Exception {
		return "main";
	}
	
	@RequestMapping("/dbTest")
	public ModelAndView dbTest(TestVO testVO) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		List<TestVO> resultList = testService.selectUserList(testVO);
		
		mav.addObject("resultList", resultList);
		return mav;
	}
	
}