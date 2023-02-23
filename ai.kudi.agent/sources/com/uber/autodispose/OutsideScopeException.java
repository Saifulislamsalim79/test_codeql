package com.uber.autodispose;
/* loaded from: classes2.dex */
public class OutsideScopeException extends RuntimeException {
    public OutsideScopeException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        if (C7407i.m18792a()) {
            return super.fillInStackTrace();
        }
        return this;
    }
}
