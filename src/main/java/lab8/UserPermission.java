package lab8;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

@Target({ElementType.METHOD, TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserPermission {
    int value() default 1;
}
