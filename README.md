Clone if you would like to start using CDI with Java SE only. 
No bean container is required.

To run this project:
mvn package
mvn exec:java -Dexec.mainClass="org.jboss.weld.environment.se.StartMain"

CDI - Java Contexts and Dependency Injection - JSR-299
Weld - CDI reference implementation - http://seamframework.org/Weld

CDI motto: Loose coupling with strong typing
CDI common concepts include:
- Beans
- Injection
- Producers
- Qualifiers
- Interceptors
- Decorators
- Events
- Stereotypes

CDI is enabled by existence of file META-INF/beans.xml.
Bean is a POJO managed by container. It has to have constructor with no parameters or parameters annotated with @Inject.
Beans can be injected. Fields or parameters annotated @Inject are injected on object creation. 
Simplest example usage is in tomczak.Main class where tomczak.beans.HelloBean bean is injected as a field (1).
Bean is defined by following attributes:
- set of types
- set of qualifiers
- scope (optional)
- EL name (optional)
- set of interceptors bindings (optional)
- bean implementation (optional)

Bean contract contains:
- bean type
- set of qualifiers

Bean types can be defined by annotation java.inject.@Typed. tomczak.beans.EndOfTheWorld class cannot be injected as tomczak.beans.Casandra interface even though it imlements it.
This way injection (2) is not ambigous.

Bean qualifiers can be set by defining qualifier (i.e. tomczak.beans.Boy) and annotate injection point with it (3). implicit default qualifier is javax.enterprise.inject.@Default.
By default injected bean lifecycle is bound to the bean where is is used. This scope is called dependent pseudo-scope.

Beans can be created by producers methods (4) and fields (5).

Bean creation proceed as follows: constructor injection, field injection, initializer method injection. This is demonstrated by tomczak.beans.producer.InjectionPointsDemonstration (6)

The CDI specification defines a procedure, called typesafe resolution, that the container follows when identifying the
bean to inject to an injection point. Typesafe resolution is performed at system initialization time, which means that the container will inform
the developer immediately if a bean's dependencies cannot be satisfied.

The purpose of this algorithm is to allow multiple beans to implement the same bean type and either:
- allow the client to select which implementation it requires using a qualifier or
- allow the application deployer to select which implementation is appropriate for a particular deployment, without
changes to the client, by enabling or disabling an alternative, or
- allow the beans to be isolated into separate modules.




