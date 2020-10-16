//package com.octo.HiGuys.controller;
//
//
//import com.octo.HiGuys.models.Person;
//
//import org.springframework.beans.BeanInfoFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//import javax.validation.Valid;
//
//
//public class ResultsController extends WebMvcConfigurerAdapter {
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/results").setViewName("results");
//    }
//    @RequestMapping(value="/", method=RequestMethod.GET)
//    public String showForm(Person person) {
//        return "form";
//    }
//
//    @RequestMapping(value = "/", method=RequestMethod.POST)
//    public String checkPersonInfo(@Valid Person person, BindingResult bindingResult){
//        if(bindingResult.hasErrors()){
//            return "form";
//        }
//        return "redirect:results";
//    }
//
//
//
//
//
//}
