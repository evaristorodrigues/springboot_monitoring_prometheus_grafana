/**
 * 
 */
package com.evaristo.springbootmicrometer.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author evaristosrodrigues
 *
 */

@RestController
@RequestMapping(value = "/message")
public class MessageController {
	
	@GetMapping
	public String getMessage() {
		return "working";
	}

}
