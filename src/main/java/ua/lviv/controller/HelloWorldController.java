package ua.lviv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.lviv.custom.model.Course;
import ua.lviv.dao.CourseDao;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@Autowired
	private CourseDao courseDao;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView hello(){
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        List<Course> courses = courseDao.getAll();
        model.addObject("courses", courses);
        return model;
    }
}
