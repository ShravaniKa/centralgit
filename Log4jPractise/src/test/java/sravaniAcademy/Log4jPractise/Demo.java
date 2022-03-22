package sravaniAcademy.Log4jPractise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Demo {
	
//private static Logger log=LogManager.getLogger(Demo.class.getName());
 private static Logger	log=LogManager.getLogger(Demo.class.getName());
	
		@Test
		public void getData()
		{
		log.debug("im debugging");	
		log.info("object is present");
		log.error("not present");
		log.fatal("fatal");
		log.fatal("new msg");
		
	}
	}


