package io.intercom.com.bumptech.glide.load;

import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.security.MessageDigest;
/* compiled from: Option.java */
/* renamed from: io.intercom.com.bumptech.glide.load.h */
/* loaded from: classes3.dex */
public final class C10623h<T> {

    /* renamed from: e */
    private static final InterfaceC10625b<Object> f24419e = new C10624a();

    /* renamed from: a */
    private final T f24420a;

    /* renamed from: b */
    private final InterfaceC10625b<T> f24421b;

    /* renamed from: c */
    private final String f24422c;

    /* renamed from: d */
    private volatile byte[] f24423d;

    /* compiled from: Option.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.h$a */
    /* loaded from: classes3.dex */
    static class C10624a implements InterfaceC10625b<Object> {
        C10624a() {
        }

        @Override // io.intercom.com.bumptech.glide.load.C10623h.InterfaceC10625b
        /* renamed from: a */
        public void mo12361a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.h$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10625b<T> {
        /* renamed from: a */
        void mo12361a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private C10623h(String str, T t, InterfaceC10625b<T> interfaceC10625b) {
        C10892h.m12016b(str);
        this.f24422c = str;
        this.f24420a = t;
        C10892h.m12014d(interfaceC10625b);
        this.f24421b = interfaceC10625b;
    }

    /* renamed from: a */
    public static <T> C10623h<T> m12600a(String str, T t, InterfaceC10625b<T> interfaceC10625b) {
        return new C10623h<>(str, t, interfaceC10625b);
    }

    /* renamed from: b */
    private static <T> InterfaceC10625b<T> m12599b() {
        return (InterfaceC10625b<T>) f24419e;
    }

    /* renamed from: d */
    private byte[] m12597d() {
        if (this.f24423d == null) {
            this.f24423d = this.f24422c.getBytes(InterfaceC10622g.f24418a);
        }
        return this.f24423d;
    }

    /* renamed from: e */
    public static <T> C10623h<T> m12596e(String str) {
        return new C10623h<>(str, null, m12599b());
    }

    /* renamed from: f */
    public static <T> C10623h<T> m12595f(String str, T t) {
        return new C10623h<>(str, t, m12599b());
    }

    /* renamed from: c */
    public T m12598c() {
        return this.f24420a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10623h) {
            return this.f24422c.equals(((C10623h) obj).f24422c);
        }
        return false;
    }

    /* renamed from: g */
    public void m12594g(T t, MessageDigest messageDigest) {
        this.f24421b.mo12361a(m12597d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f24422c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f24422c + "'}";
    }
}
