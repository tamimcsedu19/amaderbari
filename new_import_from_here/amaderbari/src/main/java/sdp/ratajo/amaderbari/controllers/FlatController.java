package sdp.ratajo.amaderbari.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import sdp.ratajo.amaderbari.config.MvcConfiguration;
import sdp.ratajo.amaderbari.dao.FlatDao;
import sdp.ratajo.amaderbari.dto.flatpack.Flat;
import sdp.ratajo.amaderbari.userpack.dto.User;
import sdp.ratajo.amaderbari.userpack.dto.UserForm;

@Controller
public class FlatController extends MvcConfiguration {
	@Autowired
	private FlatDao flatDao;
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/success").setViewName("success");
    }
	
	@RequestMapping(value = "addFlat", method = RequestMethod.GET)
	public ModelAndView showSignUpPage(ModelAndView modelAndView,HttpServletRequest req) {
		return new ModelAndView("addFlat","flat", new Flat());

	}
	
	@RequestMapping(value = "addFlat", method = RequestMethod.POST)
	public ModelAndView signemUp(@Valid Flat flat , BindingResult result, ModelAndView modelAndView) {
		
		if(result.hasErrors()){
			return new ModelAndView("signup");
		}
		else{
			flat.setFlatId("" + flat.id++);
			// add adress id
		}
		System.out.println(flat);
		flatDao.save(flat);
		modelAndView.setViewName("success");
		System.out.print("Post method of Addflat controller is executed");
		return modelAndView;
	}
}
