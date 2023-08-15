package net.toheeb.thymeleaf.controller;

import net.toheeb.thymeleaf.model.FbForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {
    // handler method to handle facebook registration page request
    @GetMapping("register")
    public String facebookRegistrationPage(Model model) {
        // Empty FbForm model object to store form data
        FbForm fbForm = new FbForm();
        model.addAttribute("fbForm", fbForm);

        List<String> listProfession = Arrays.asList("Developer","Tester","Architect");
        model.addAttribute("listProfession",listProfession);
        return "register-form";

    }
}
