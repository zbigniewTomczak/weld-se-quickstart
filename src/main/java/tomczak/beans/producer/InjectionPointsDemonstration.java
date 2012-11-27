package tomczak.beans.producer;

import javax.inject.*;
import javax.enterprise.inject.*;

@InjectionPoints
public class InjectionPointsDemonstration implements Demonstration {

  @Inject 
  public InjectionPointsDemonstration(@Random int random) {
    System.out.println("\nBean constructor param injection: InjectionPointsDemonstration("+random+")");
  }

  @Inject 
  private void setUpClass(@Random int random) {
    System.out.println("Initializer method param injection: setUpClass("+random+")");
  }

  //@Inject is implicite here
  @Produces @RandomField double getRandomDouble(@Random int random) {return random;}

  private @Inject @RandomField int randomField;

  public void demonstrate(){}

}
