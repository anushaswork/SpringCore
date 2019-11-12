package mycafe.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {
	
	@RequestMapping("/welcome")
	public String showWelcomePage(Model model)
	{
		//sending a value to view JSP
		return "Welcome";
	}
	
	@RequestMapping("processOrder")
	public String processOrder(HttpServletRequest request, Model model)
	{
		//send the user entered data
		
		String foodType =  request.getParameter("foodType");
		
		model.addAttribute("foodTypeValue", foodType);
		
		return "OrderProcessed";
	}

}
