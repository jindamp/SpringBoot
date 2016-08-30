package com.pavan.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	

	@RequestMapping("/")
	@ResponseBody
	public String index(Model model) throws IOException {

		return "Welcome!... Your Api is working";
	}
}
