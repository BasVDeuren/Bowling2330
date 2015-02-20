package be.bowling.basecontrollers.controllers;

import be.bowling.basedbpackage.db.DatabaseCreator;
import be.bowling.constants.bowlingRoutingConstants.BowlingConstants;
import be.bowling.model.support.builder.ModelAndViewBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

@Controller
public class DatabaseCreatorController {
  DatabaseCreator databaseCreator;

  @Autowired
  public DatabaseCreatorController(DatabaseCreator databaseCreator) {
    this.databaseCreator = databaseCreator;
  }

  @RequestMapping(value = "createDb")
  public ModelAndView createDatabase() throws SQLException {
    databaseCreator.create();
    return new ModelAndViewBuilder()
        .withViewName(BowlingConstants.Views.Home.INDEX)
        .build();
  }
}
