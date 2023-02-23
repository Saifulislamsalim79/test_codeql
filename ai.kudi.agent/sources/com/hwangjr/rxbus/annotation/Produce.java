package com.hwangjr.rxbus.annotation;

import com.hwangjr.rxbus.p189annotation.Excludes;
import com.hwangjr.rxbus.thread.EventThread;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface Produce {
    Excludes[] tags();

    EventThread thread();
}
