package com.mycompany.webapp.dao;

import org.springframework.stereotype.Repository;

import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class Ch13DaoImple2 implements Ch13DaoI{
	public Ch13DaoImple2() {
		log.info("실행");
	}
}
