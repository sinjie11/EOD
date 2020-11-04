package com.main.eod;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Project Name  : EOD
 * Class Name  : DBConfig.java
 * Description : 
 * Modification Information  
 * 
 *    수정일　　　 　　                     수정자　　　               수정내용
 *    ---------------   -----------  ---------------------------
 *    2020. 11. 4       JungPal       최초생성
 * 
 * @author JungPal
 * @since 2020. 11. 4
 * @version 1.0
 * 
 * Copyright (C) 2020 All right reserved.
 */
@Configuration
@MapperScan(basePackages = "com.main.eod.mapper")
@EnableTransactionManagement
public class DBConfig {

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sessionFactory.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/**/*.xml"));
		
		return sessionFactory.getObject();
	}
	
    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
    	
      final SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
      
      return sqlSessionTemplate;
    }
	
}