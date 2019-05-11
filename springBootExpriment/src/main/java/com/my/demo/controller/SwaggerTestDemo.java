/**
 * 
 */
package com.my.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nchandoba
 *
 */
@RestController
@RequestMapping("/demo")
public class SwaggerTestDemo {

	private static final Logger logger = LoggerFactory.getLogger(SwaggerTestDemo.class);

	@GetMapping
	public void testApiForSwagger() {
		logger.info("we are swagger test done...");
		logger.error( "nii","errr");
		logger.getClass();
		logger.getClass();
	}

}
