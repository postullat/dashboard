package ua.lviv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ua.lviv.custom.model.Department;
import ua.lviv.dao.DepartmentDao;

@Controller
public class HomePageController {
	
	@Autowired
	private DepartmentDao  departmentDao;

	@RequestMapping(path="/", method=RequestMethod.GET)
	public ModelAndView home(){
		
		ModelAndView model = new ModelAndView("home");
		List<Department> departments = departmentDao.getAll();
        model.addObject("departments", departments);
        
        return model;
	}
	
	@RequestMapping(path="/getFaculty/{departmentId}", method=RequestMethod.POST)
	public ModelAndView getFaculty(@PathVariable("departmentId") long departmentId){
		
		ModelAndView model = new ModelAndView("home");
        System.out.println("Department id:"+departmentId);
        return model;
	}
	
    @RequestMapping(path="/hello", method = RequestMethod.GET)
    public ModelAndView hello(){
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
}
