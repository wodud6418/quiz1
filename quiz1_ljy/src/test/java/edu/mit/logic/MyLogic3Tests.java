package edu.mit.logic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MyLogic3Tests {
	
	@Autowired
	private MyLogic3 logic3;
	
	@Test
	public void logic3Test() {
		log.info("addup테스트 :"+logic3.addUp(1, 10));
		log.info("evenaddup테스트:"+logic3.evenAddUp(1, 10));
	}
	

}
