package be.bowling.basecontrollers.controllers;

import be.bowling.constants.bowlingRoutingConstants.BowlingConstants;
import be.bowling.model.support.builder.ModelAndViewBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = BowlingConstants.Routing.Ranking.RANKING)
public class RankingController {
    @RequestMapping(value = BowlingConstants.Routing.Ranking.Overview.OVERVIEW)
    public ModelAndView overview() {
      return new ModelAndViewBuilder()
          .withViewName(BowlingConstants.Views.Ranking.Overview.OVERVIEW)
          .build();
    }
}
