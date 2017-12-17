package pl.oskarpolak.demorepo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class MainController {

   @GetMapping("/{age}")
    public String index(@PathVariable("age") int someAge,
                        Model model){
       model.addAttribute("age", someAge);
       return "index";
   }

   @PostMapping("/")
    public String indexPost(@RequestParam(name = "name", required = false) String name,
                            @RequestParam("message") String message,
                            @RequestParam("email") String email){

       System.out.println(name + " " + message + " " + email);
        return "redirect:/0";
   }
}
