package com.google.firebase.perf.p178j;

import java.util.NoSuchElementException;
/* compiled from: Optional.java */
/* renamed from: com.google.firebase.perf.j.e */
/* loaded from: classes2.dex */
public final class C6628e<T> {

    /* renamed from: a */
    private final T f16001a;

    private C6628e() {
        this.f16001a = null;
    }

    /* renamed from: a */
    public static <T> C6628e<T> m21409a() {
        return new C6628e<>();
    }

    /* renamed from: b */
    public static <T> C6628e<T> m21408b(T t) {
        return t == null ? m21409a() : m21405e(t);
    }

    /* renamed from: e */
    public static <T> C6628e<T> m21405e(T t) {
        return new C6628e<>(t);
    }

    /* renamed from: c */
    public T m21407c() {
        T t = this.f16001a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: d */
    public boolean m21406d() {
        return this.f16001a != null;
    }

    private C6628e(T t) {
        if (t != null) {
            this.f16001a = t;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
