package net.gudenau.lib.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to mark a field as needing/having a getter.
 *
 * Does not do anything by itself.
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Getter{
    /**
     * The visibility of the getter.
     * */
    Visibility value() default Visibility.PUBLIC;
}
