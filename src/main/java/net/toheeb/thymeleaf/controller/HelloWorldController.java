package net.toheeb.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // this annotation will allow class below to handle HTTP request
public class HelloWorldController {

    //Note: HandlerMapper to identify which controller is responsible to handle the HTTP request.
    //HandlerMapper selects the controller which is mapped to the incoming request URL and returns the(selected Handler) and Controller details to DispatcherServlet.

    //  handler method to handle /helloworld request sent by client
    // http:localhost:8080/hello-world
    @GetMapping("/hello-world")       //  GetMapping handle HTTP GetRequest  // "/hello-world" is URL
    public String helloWorld(Model model){ // model is a Controllers layer // store model data
        model.addAttribute("message","Hello World!");
        return "hello-world";  // return view // view is also a Controller layer
  //We have created the Handler method to handle HTTP GetRequest, within the handle method we have stored
  // helloWorld data in the model and we have returned the hello world view.

    }
}
