package com.revature.view;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("viewController")
public class ViewControllerAlpha implements ViewController {

	
	private static Logger logger = Logger.getLogger(ViewControllerAlpha.class);
	
	@RequestMapping(value = {"/","/index"}, method=RequestMethod.GET)
	public String index() {
		logger.trace("Return index.html to the user.");
		return "index";
	}

}
