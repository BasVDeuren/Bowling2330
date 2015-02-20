package be.bowling.basecontrollers.controllers;

import be.bowling.constants.bowlingRoutingConstants.BowlingConstants;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.hamcrest.core.Is.is;

public class RankingControllerTest {
  RankingController rankingController;

  @Before
  public void setUp() throws Exception {
    rankingController = new RankingController();
  }

  @Test
  public void testOverview() {
    ModelAndView overview = rankingController.overview();

    Assert.assertThat(overview.getViewName(), is(BowlingConstants.Views.Ranking.Overview.OVERVIEW));
  }
}