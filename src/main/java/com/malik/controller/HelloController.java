/**
 * 
 */
package com.malik.controller;

/**
 * @author malikmo
 *
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//	@GetMapping("/")
	@RequestMapping("/")
	public String index() {
		return "Greetings from Sping Boot";
	}
	

}
