package com.crm.autodesk.contact;

import org.testng.annotations.Test;

public class ConatctTest {
	
	@Test
	public void createContactTest() {
		String browserNAme = System.getProperty("browser");
		String url = System.getProperty("url");
		  if(browserNAme.equals("firefox")) {
			  System.out.println("launch firefox......");
		  }else if(browserNAme.equals("chrome")) {
			  System.out.println("launch chrome......");
		  }
		  else if(browserNAme.equals("ie")) {
			  System.out.println("launch ie......");
		  }
		  
		  System.out.println("URL====>"+url);

	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("exeucte modifyContactTest");
	}

}

