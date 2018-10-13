package com.freelancer;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {		
		return "imageBrowser";
	}
}
