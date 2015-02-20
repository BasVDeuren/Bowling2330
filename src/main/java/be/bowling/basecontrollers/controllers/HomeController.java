package be.bowling.basecontrollers.controllers;

import be.bowling.constants.bowlingRoutingConstants.BowlingConstants;
import be.bowling.model.support.builder.ModelAndViewBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
  @RequestMapping(value = {BowlingConstants.Routing.Home.HOME, BowlingConstants.Routing.Home.INDEX})
  public ModelAndView home() {
    return new ModelAndViewBuilder()
        .withViewName(BowlingConstants.Views.Home.INDEX)
        .build();
  }
}
