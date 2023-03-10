package com.hwangjr.rxbus.entity;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
abstract class Event {
    public void throwRuntimeException(String str, InvocationTargetException invocationTargetException) {
        throwRuntimeException(str, invocationTargetException.getCause());
    }

    public void throwRuntimeException(String str, Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            throw new RuntimeException(str + ": " + cause.getMessage(), cause);
        }
        throw new RuntimeException(str + ": " + th.getMessage(), th);
    }
}
