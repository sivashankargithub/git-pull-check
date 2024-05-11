package rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/hello")
	public String printHello() {
		
		return "Hello Sivashankar World";
		
	}
}
