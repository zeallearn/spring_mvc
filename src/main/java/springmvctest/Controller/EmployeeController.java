package springmvctest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvctest.Controller.dto.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/Employee")
	public ModelAndView showDetails() {
		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.setViewName("display");
		return modelAndView;
	}
	
	@RequestMapping(value="employeeData" ,method=RequestMethod.POST)
	public ModelAndView registerDetails( @ModelAttribute("emp")Employee emp   ) {
		ModelAndView modelAndView =  new ModelAndView();
		modelAndView.addObject("emp", emp);
		modelAndView.setViewName("registration");
		return modelAndView;
	}
	
}
