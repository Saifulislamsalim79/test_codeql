package com.bumptech.glide.load;

import com.bumptech.glide.p086q.C2380j;
import java.security.MessageDigest;
/* compiled from: Option.java */
/* renamed from: com.bumptech.glide.load.g */
/* loaded from: classes2.dex */
public final class C2119g<T> {

    /* renamed from: e */
    private static final InterfaceC2121b<Object> f6414e = new C2120a();

    /* renamed from: a */
    private final T f6415a;

    /* renamed from: b */
    private final InterfaceC2121b<T> f6416b;

    /* renamed from: c */
    private final String f6417c;

    /* renamed from: d */
    private volatile byte[] f6418d;

    /* compiled from: Option.java */
    /* renamed from: com.bumptech.glide.load.g$a */
    /* loaded from: classes2.dex */
    class C2120a implements InterfaceC2121b<Object> {
        C2120a() {
        }

        @Override // com.bumptech.glide.load.C2119g.InterfaceC2121b
        /* renamed from: a */
        public void mo33292a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option.java */
    /* renamed from: com.bumptech.glide.load.g$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC2121b<T> {
        /* renamed from: a */
        void mo33292a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private C2119g(String str, T t, InterfaceC2121b<T> interfaceC2121b) {
        C2380j.m33131b(str);
        this.f6417c = str;
        this.f6415a = t;
        C2380j.m33129d(interfaceC2121b);
        this.f6416b = interfaceC2121b;
    }

    /* renamed from: a */
    public static <T> C2119g<T> m33668a(String str, T t, InterfaceC2121b<T> interfaceC2121b) {
        return new C2119g<>(str, t, interfaceC2121b);
    }

    /* renamed from: b */
    private static <T> InterfaceC2121b<T> m33667b() {
        return (InterfaceC2121b<T>) f6414e;
    }

    /* renamed from: d */
    private byte[] m33665d() {
        if (this.f6418d == null) {
            this.f6418d = this.f6417c.getBytes(InterfaceC2118f.f6413a);
        }
        return this.f6418d;
    }

    /* renamed from: e */
    public static <T> C2119g<T> m33664e(String str) {
        return new C2119g<>(str, null, m33667b());
    }

    /* renamed from: f */
    public static <T> C2119g<T> m33663f(String str, T t) {
        return new C2119g<>(str, t, m33667b());
    }

    /* renamed from: c */
    public T m33666c() {
        return this.f6415a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2119g) {
            return this.f6417c.equals(((C2119g) obj).f6417c);
        }
        return false;
    }

    /* renamed from: g */
    public void m33662g(T t, MessageDigest messageDigest) {
        this.f6416b.mo33292a(m33665d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f6417c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f6417c + "'}";
    }
}
