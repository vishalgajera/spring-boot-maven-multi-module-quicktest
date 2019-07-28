package com.vishalgajera.main.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The Class MainController.
 */
@RestController
public class MainController {

	/** The a bean. */
	@Autowired
	com.vishalgajera.projectA.A aBean;

	/** The b bean. */
	@Autowired
	com.vishalgajera.projectB.B bBean;

	/**
	 * A.
	 *
	 * @return the string
	 */
	@GetMapping("/A")
	public String A() {
		return aBean.methodA();
	}

	/**
	 * B.
	 *
	 * @return the string
	 */
	@GetMapping("/B")
	public String B() {
		return bBean.methodB();
	}

}
