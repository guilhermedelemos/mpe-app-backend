package io.github.mpeapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    Logger log = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(
                    name="name",
                    required=false,
                    defaultValue="World"
            ) String name,
            Model model
    ) {
        System.out.println("Não faça isso");
        log.info("Faça isso");

        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/error-test")
    public String errorTest() {
        throw new IllegalArgumentException("Error test");
    }

    @GetMapping("/log")
    public String log() {
        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");
        return "index";
    }

}
