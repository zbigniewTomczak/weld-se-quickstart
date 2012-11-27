package tomczak;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import org.jboss.weld.environment.se.events.ContainerInitialized;

import tomczak.beans.*;
import tomczak.beans.producer.*;

public class Main {
  @Inject private HelloBean helloBean; //1

  @Inject private Cassandra cassandra; //2

  @Inject @Boy Child child; //3

  @Inject @Random int random; //4
  @Inject @Random double fpRand; //5

  @Inject @InjectionPoints Demonstration demo; //6

  @Inject @RandomField double d; //7

  public void main(@Observes ContainerInitialized event) {
    System.out.println(helloBean.getHelloWorld());
    System.out.println(cassandra.getProphecy());
    System.out.println(child.getName());
    System.out.println("Random number(int): " + random);
    System.out.println("Random number(double): " + fpRand);

  }
}
