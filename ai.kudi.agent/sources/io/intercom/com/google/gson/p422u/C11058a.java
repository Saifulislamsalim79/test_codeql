package io.intercom.com.google.gson.p422u;

import io.intercom.com.google.gson.p418t.C10943a;
import io.intercom.com.google.gson.p418t.C10944b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: TypeToken.java */
/* renamed from: io.intercom.com.google.gson.u.a */
/* loaded from: classes3.dex */
public class C11058a<T> {

    /* renamed from: a */
    final Class<? super T> f25134a;

    /* renamed from: b */
    final Type f25135b;

    /* renamed from: c */
    final int f25136c;

    protected C11058a() {
        Type m11658d = m11658d(C11058a.class);
        this.f25135b = m11658d;
        this.f25134a = (Class<? super T>) C10944b.m11857k(m11658d);
        this.f25136c = this.f25135b.hashCode();
    }

    /* renamed from: a */
    public static <T> C11058a<T> m11661a(Class<T> cls) {
        return new C11058a<>(cls);
    }

    /* renamed from: b */
    public static C11058a<?> m11660b(Type type) {
        return new C11058a<>(type);
    }

    /* renamed from: d */
    static Type m11658d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C10944b.m11866b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: c */
    public final Class<? super T> m11659c() {
        return this.f25134a;
    }

    /* renamed from: e */
    public final Type m11657e() {
        return this.f25135b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11058a) && C10944b.m11862f(this.f25135b, ((C11058a) obj).f25135b);
    }

    public final int hashCode() {
        return this.f25136c;
    }

    public final String toString() {
        return C10944b.m11847u(this.f25135b);
    }

    C11058a(Type type) {
        C10943a.m11868b(type);
        Type m11866b = C10944b.m11866b(type);
        this.f25135b = m11866b;
        this.f25134a = (Class<? super T>) C10944b.m11857k(m11866b);
        this.f25136c = this.f25135b.hashCode();
    }
}
