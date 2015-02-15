package main.java.be.bowling.controllers;

import main.java.be.bowling.constants.bowlingRoutingConstants.BowlingConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @RequestMapping(value = {BowlingConstants.Routing.Home.HOME, BowlingConstants.Routing.Home.INDEX})
  public String home(){
    return BowlingConstants.Views.Home.INDEX;
  }
}
