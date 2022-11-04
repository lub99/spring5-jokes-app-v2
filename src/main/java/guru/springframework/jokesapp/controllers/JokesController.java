package guru.springframework.jokesapp.controllers;

import guru.springframework.jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }


    @RequestMapping({"/", ""})
    public String getQuote(Model model){
        model.addAttribute("joke", jokesService.getQuote());
        return "index";
    }
}
