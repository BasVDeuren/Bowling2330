package be.bowling.controllers;

import be.bowling.constants.bowlingRoutingConstants.BowlingConstants;
import be.bowling.basecontrollers.controllers.HomeController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.hamcrest.core.Is.is;

public class HomeControllerTest {
  HomeController homeController;

  @Before
  public void setUp() throws Exception {
    homeController = new HomeController();
  }

  @Test
  public void testHome() {
    ModelAndView homeResult = homeController.home();

    Assert.assertThat(homeResult.getViewName(), is(BowlingConstants.Views.Home.INDEX));
  }
}
