package pe.edu.cibertec.DAAII_T1_Nicolas_Segovia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String home(){
        return "index";
    }
}
