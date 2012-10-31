package tomczak;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import org.jboss.weld.environment.se.events.ContainerInitialized;

public class Main {
  @Inject private InjectedClass injected;

  public void main(@Observes ContainerInitialized event) {
    System.out.println(injected.value);
  }
}
