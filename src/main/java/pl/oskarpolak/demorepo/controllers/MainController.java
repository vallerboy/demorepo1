package pl.oskarpolak.demorepo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

   @GetMapping("/{age}")
    public String index(@PathVariable("age") int someAge,
                        Model model){
       model.addAttribute("age", someAge);
       return "index";
   }
}
