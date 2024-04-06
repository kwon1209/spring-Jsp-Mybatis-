package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloControler {
	
	@GetMapping("hello")
	public String hello(Model model) { //Model은 Spring ui에 있는 기능으로 model에 값을 넣어서 
		//View로 보내게 할 수 있다.
		model.addAttribute("data","hello!!"); //model.addAttribute(key, value)이다. 
		return "hello";
	}

}
