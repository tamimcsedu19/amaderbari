package org.ratajo.amaderbari;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.ratajo.amaderbari.config.MvcConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		MvcConfiguration mv = new MvcConfiguration();
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(mv.getDataSource());
		String sql="CREATE TABLE contact (contact_id int(11) NOT NULL AUTO_INCREMENT,) ENGINE=InnoDB AUTO_INCREMENT=25;";
		jdbcTemplate.execute(sql);
		
			
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
