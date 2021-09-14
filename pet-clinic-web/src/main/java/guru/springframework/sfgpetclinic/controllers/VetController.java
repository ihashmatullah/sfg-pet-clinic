package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HashmatN at 12:17 PM on Sep 14, 2021
 */
@Controller
public class VetController {
  @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
  public String listVets(){
    return "vets/index";
  }
}
