package com.hwangjr.rxbus.p189annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: Tag.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.hwangjr.rxbus.'annotation'.Excludes */
/* loaded from: classes.dex */
public @interface Excludes {
    public static final String DEFAULT = "rxbus_default_tag";

    String value();
}
