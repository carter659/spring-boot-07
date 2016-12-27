package com.github.carter659.spring07;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 博客出处：http://www.cnblogs.com/GoodHelper/
 * 
 * @author 刘冬
 *
 */
@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/save")
	public @ResponseBody Map<String, Object> save() {
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "ok");
		return map;
	}

	@PostMapping("/saveOrder")
	public @ResponseBody Map<String, Object> saveOrder(@RequestBody @Valid Order order) {
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "ok");
		map.put("order", order);
		return map;
	}
}
