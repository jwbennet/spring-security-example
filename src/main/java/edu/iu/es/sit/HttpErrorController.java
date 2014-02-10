package edu.iu.es.sit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HttpErrorController {

	@RequestMapping("403")
	public String handle403() {
		return "403";
	}
}
