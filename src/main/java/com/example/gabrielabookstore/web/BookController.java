package com.example.gabrielabookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class BookController {
	@RequestMapping("/index")
	public String listbooks() {
		return "placeholder";
	}
}
