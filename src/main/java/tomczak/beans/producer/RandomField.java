package tomczak.beans.producer;

import java.lang.annotation.*;
import javax.inject.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Qualifier
@Target({TYPE, METHOD,PARAMETER, FIELD})
@Retention(RUNTIME)
public @interface RandomField
{
}
