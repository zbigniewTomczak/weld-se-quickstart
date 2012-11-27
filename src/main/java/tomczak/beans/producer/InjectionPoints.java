package tomczak.beans.producer;

import java.lang.annotation.*;
import javax.inject.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Qualifier
@Retention(RUNTIME)
@Target({FIELD, METHOD, TYPE, PARAMETER})
public @interface InjectionPoints {}
