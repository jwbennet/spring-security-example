package edu.iu.es.sit;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
@Secured("ROLE_USER")
public class HelloWorldController {

	@RequestMapping("")
	public ModelAndView sayHello() {
		ModelAndView modelAndView = new ModelAndView();
		String message = "Hello world!";
		modelAndView.addObject("message", message);
		modelAndView.setViewName("hello");
		return modelAndView;
	}
	
	@RequestMapping("/admin")
	@Secured("ROLE_ADMIN")
	public ModelAndView sayHelloAdmin() {
		ModelAndView modelAndView = new ModelAndView();
		String message = "Hello admin!";
		modelAndView.addObject("message", message);
		modelAndView.setViewName("hello");
		return modelAndView;
	}
}
