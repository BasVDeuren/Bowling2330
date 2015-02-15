package test.java.java.be.bowling.controllers;

import main.java.be.bowling.constants.bowlingRoutingConstants.BowlingConstants;
import main.java.be.bowling.controllers.HomeController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class HomeControllerTest {
  HomeController homeController;

  @Before
  public void setUp() throws Exception {
    homeController = new HomeController();
  }

  @Test
  public void testHome() {
    String homeResult = homeController.home();

    Assert.assertThat(homeResult, is(BowlingConstants.Views.Home.INDEX));
  }
}
