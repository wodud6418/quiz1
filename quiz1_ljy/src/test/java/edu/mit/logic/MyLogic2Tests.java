package edu.mit.logic;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class MyLogic2Tests {
	 
	@Test
	public void test1() {
		MyLogic2 logic2 = new MyLogic2();	
		log.info(logic2.addUp(1, 10));
		log.info(logic2.evenAddUp(1, 10));
	}
	

}
