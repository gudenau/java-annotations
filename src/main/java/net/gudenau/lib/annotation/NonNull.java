package net.gudenau.lib.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to mark a variable as non-null. Does not do anything
 * by itself, but it is indented to be used as a marker.
 *
 * This is the opposite of {@link net.gudenau.lib.annotation.Nullable Nullable}.
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER, ElementType.METHOD})
public @interface NonNull{}
