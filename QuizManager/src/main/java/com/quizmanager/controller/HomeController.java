/**
 * 
 */
package com.quizmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author user95
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String homePage() {
		return "index";
	}
}
