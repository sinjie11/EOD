package com.main.eod.mapper;

import java.util.List;

import com.main.eod.vo.TestVO;

/**
 * Project Name  : EOD
 * Class Name  : TestMapper.java
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
public interface TestMapper {

	public List<TestVO> selectUserList(TestVO testVO) throws Exception;
	
}