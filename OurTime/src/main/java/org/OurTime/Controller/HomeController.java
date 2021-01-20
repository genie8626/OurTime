package org.OurTime.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.OurTime.DTO.GallCriteria;
import org.OurTime.Service.GalleryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
@Autowired
GalleryService gservice;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model,GallCriteria gcri) {
		logger.info("Welcome home! The client locale is OurTime {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		int total=gservice.getTotal();
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("list2",gservice.list2(gcri));
		return "home";
	}
	
}
