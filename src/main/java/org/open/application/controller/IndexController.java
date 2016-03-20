/**
 * 
 */
package org.open.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SandeepRaju
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping
	public String getIndexPage() {
		return "index";
	}
}
