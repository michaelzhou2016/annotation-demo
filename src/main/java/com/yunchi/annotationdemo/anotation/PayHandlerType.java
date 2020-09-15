package com.yunchi.annotationdemo.anotation;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface PayHandlerType {
    String type();
}
