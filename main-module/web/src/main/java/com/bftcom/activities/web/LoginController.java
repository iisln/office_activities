package com.bftcom.activities.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

  @RequestMapping(value="/login", method=RequestMethod.GET)
  public String getLoginPage(ModelMap model) {
    Login login = new Login();
    model.addAttribute("login", login);
    return "login";
  }

  @RequestMapping(method=RequestMethod.POST)
  public String signUp(Login loginObj) {
    return "redirect:index";
  }

}