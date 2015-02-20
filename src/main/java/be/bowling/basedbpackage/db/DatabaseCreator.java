package be.bowling.basedbpackage.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class DatabaseCreator {
  @Autowired
  DataSource dataSource;

  private static final String CREATE_BOWLER = "CREATE TABLE BOWLER( " +
      "   ID             INT     PRIMARY KEY     NOT NULL, " +
      "   NAME           TEXT    NOT NULL, " +
      "   ROLE           TEXT    NOT NULL " +
      ")";

  private static final String CREATE_BOWLER_GAME = "CREATE TABLE BOWLER_GAME(" +
      "   ID             INT     PRIMARY KEY     NOT NULL, " +
      "   F_BOWLER       INT     REFERENCES BOWLER(ID)    NOT NULL, " +
      "   THROW1         INT, " +
      "   THROW2         INT, " +
      "   THROW3         INT, " +
      "   THROW4         INT, " +
      "   THROW5         INT, " +
      "   THROW6         INT, " +
      "   THROW7         INT, " +
      "   THROW8         INT, " +
      "   THROW9         INT, " +
      "   THROW10         INT, " +
      "   THROW11         INT, " +
      "   THROW12         INT, " +
      "   THROW13         INT, " +
      "   THROW14         INT, " +
      "   THROW15         INT, " +
      "   THROW16         INT, " +
      "   THROW17         INT, " +
      "   THROW18         INT, " +
      "   THROW1ç         INT, " +
      "   THROW19         INT, " +
      "   THROW20         INT, " +
      "   THROW21         INT, " +
      "   TOTAL           INT " +
      ");";

  public void create() throws SQLException {
    Connection connection = dataSource.getConnection();

    connection.prepareStatement(CREATE_BOWLER).execute();
    connection.prepareStatement(CREATE_BOWLER_GAME).execute();
  }
}
