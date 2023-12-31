package com.example.goormthon.authentication.security;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginMember {

    boolean required() default true;

}
