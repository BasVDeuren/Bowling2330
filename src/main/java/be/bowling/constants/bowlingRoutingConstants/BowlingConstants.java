package be.bowling.constants.bowlingRoutingConstants;

public final class BowlingConstants {
  public static final class Routing {
    public static final class Home {
      public static final String HOME = "home";
      public static final String INDEX = "";
    }

    public class Ranking {
      public static final String RANKING = "ranking";
      public class Overview {
        public static final String OVERVIEW = RANKING + "/overview";
      }
    }
  }

  public final static class Views {
    public final static class Home {
      public static final String INDEX = "index";
    }

    public class Ranking {
      private static final String RANKING = "ranking";

      public class Overview {
        public static final String OVERVIEW = RANKING + "/overview";
      }
    }
  }
}
