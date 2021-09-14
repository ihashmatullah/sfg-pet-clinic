package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HashmatN at 1:12 PM on Sep 14, 2021
 */

@RequestMapping("/owners")
@Controller
public class OwnerController {

  @RequestMapping({"","/", "/index", "/index.html"})
  public String listOwners() {
    return "owners/index";
  }
}
