package ua.lviv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ua.lviv.model.Department;
import ua.lviv.model.Faculty;
import ua.lviv.repository.CourseRepository;
import ua.lviv.repository.DepartmentRepository;
import ua.lviv.repository.FacultyRepository;

@Controller
public class HomePageController {
    private DepartmentRepository departmentRepository;
    private CourseRepository courseRepository;
    private FacultyRepository facultyRepository;

    @Autowired
    public HomePageController(DepartmentRepository departmentRepository, CourseRepository courseRepository,
                              FacultyRepository facultyRepository) {
        this.departmentRepository = departmentRepository;
        this.courseRepository = courseRepository;
        this.facultyRepository = facultyRepository;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView model = new ModelAndView("home");
        model.addObject("departments", departmentRepository.findAll());
        model.addObject("courses", courseRepository.findAll());
        model.addObject("faculties", facultyRepository.findAll());

        return model;
    }

    @RequestMapping(path = "/getFaculty/{departmentId}", method = RequestMethod.POST)
    public ModelAndView getFaculty(@PathVariable("departmentId") long departmentId) {
        ModelAndView model = new ModelAndView("home");
        System.out.println("Department id:" + departmentId);
        return model;
    }

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
}
