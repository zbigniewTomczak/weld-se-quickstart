package tomczak.beans;

import javax.enterprise.inject.Typed;

@Typed({EndOfTheWorld.class, Object.class})
public class EndOfTheWorld implements Cassandra {
  public String getProphecy() {
    return "The world will come to an end in 2012!";
  }
}
