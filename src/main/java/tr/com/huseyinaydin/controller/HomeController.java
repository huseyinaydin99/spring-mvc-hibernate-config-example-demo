package tr.com.huseyinaydin.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tr.com.huseyinaydin.entity.User;
import tr.com.huseyinaydin.service.UserService;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Hibernate Configuration
 * 
 */

@Controller
public class HomeController {
	
	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		LOG.debug("Start login");
		
		User user = new User();
		user.setUsername("user-" + UUID.randomUUID());
		userService.create(user);
		
		userService.findAll();
		
		LOG.debug("End login");
		
		return "home";
	}
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String error() {
		LOG.error("Simple Error", new NumberFormatException());
		return "error";
	}
}
