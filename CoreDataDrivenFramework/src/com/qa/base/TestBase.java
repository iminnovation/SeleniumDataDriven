package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.log4j.Logger;


////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Class: TestBase 
//Description: In this class we will initialize logs, properties file, Excel Files
////////////////////////////////////////////////////////////////////////////////////////////////////////////////


public class TestBase {
	public static Logger Apps_logger=null;
	public static Properties config=null;
	public static Properties OR=null;
	public static boolean isInitialize =false;
	
	// isInitialize ensure that init function should be initialize in execution once. In each TestSuiteBase we are calling init function.
	// But it should be initialize only once.
	
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Function: init
//Parameter: void
//Description: Initialize logs properties excel files etc
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void init()throws Exception{
		
		
		if(!isInitialize){
		FileInputStream file=null;
		
		//Logger initialization 
		Apps_logger =Logger.getRootLogger();
		Apps_logger.info("Logs has been intilized successfully");
		Apps_logger.info("Starting Properties Files");
		//Properties initialization for config file.
		Properties config=new Properties();
		file=new FileInputStream(System.getProperty("user.dir")+"//src//main//Config//config.properties");
		config.load(file);
		file=null;
		//Properties initialization for OR file.
		Properties ObjRepo=new Properties();
		file=new FileInputStream(System.getProperty("user.dir")+"//src//main//Config//ObjectRepo.properties");
		ObjRepo.load(file);
		file=null;
		//Excel initialization for all excel files.
		Apps_logger.info("Instantiate excel files");
		
		//It ensure init function initialize once
		isInitialize=true;
		
		}
		
		
	}
	
	
	
	
	

}
