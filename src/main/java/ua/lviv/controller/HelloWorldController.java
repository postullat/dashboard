package ua.lviv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Volodymyr on 27.01.2016.
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView hello(){
        ModelAndView model = new ModelAndView("hello");
        model.addObject("msg", "hello world");

        return model;
    }
}
