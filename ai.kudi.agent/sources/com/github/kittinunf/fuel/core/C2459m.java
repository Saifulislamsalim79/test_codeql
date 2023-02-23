package com.github.kittinunf.fuel.core;

import kotlin.TypeCastException;
/* compiled from: Headers.kt */
/* renamed from: com.github.kittinunf.fuel.core.m */
/* loaded from: classes2.dex */
public final class C2459m {

    /* renamed from: a */
    private final String f7031a;

    /* renamed from: b */
    private final String f7032b;

    public C2459m(String str) {
        kotlin.e0.d.l.g(str, "name");
        this.f7032b = str;
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        String upperCase = str.toUpperCase();
        kotlin.e0.d.l.c(upperCase, "(this as java.lang.String).toUpperCase()");
        this.f7031a = upperCase;
    }

    /* renamed from: a */
    public final String m32848a() {
        return this.f7032b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2459m) {
            return kotlin.e0.d.l.b(((C2459m) obj).f7031a, this.f7031a);
        }
        if (obj instanceof String) {
            return kotlin.e0.d.l.b(new C2459m((String) obj).f7031a, this.f7031a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7031a.hashCode();
    }

    public String toString() {
        return this.f7032b;
    }
}
