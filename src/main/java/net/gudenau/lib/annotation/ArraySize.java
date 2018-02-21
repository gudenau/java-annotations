package net.gudenau.lib.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to mark an array as needing a specific size.
 *
 * Does not do anything by itself.
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.METHOD})
public @interface ArraySize{
    int value();
}
