package com.ars;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculationController {

	@GetMapping("/info")
	public String sum() {
		return "This is a simple get mapping from Calculation controller";
	}
	
	@PostMapping("/multiply")
	public String sum(@RequestBody Numbers num) {
		int result = num.getNum1() * num.getNum2();
		return "the result = " + result;
	}	
}