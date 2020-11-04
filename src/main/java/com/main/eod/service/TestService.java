package com.main.eod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.eod.mapper.TestMapper;
import com.main.eod.vo.TestVO;

/**
 * Project Name  : EOD
 * Class Name  : TestService.java
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
@Service
public class TestService {

	@Autowired
	TestMapper testMapper;
	
	public List<TestVO> selectUserList(TestVO testVO) throws Exception {
	
		return testMapper.selectUserList(testVO);
	}
	
}