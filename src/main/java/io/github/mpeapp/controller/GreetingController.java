package io.github.mpeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(
                    name="name",
                    required=false,
                    defaultValue="World"
            ) String name,
            Model model
    ) {
//        System.out.println("TESTE");
        model.addAttribute("name", name);
        return "greeting";
    }

}
