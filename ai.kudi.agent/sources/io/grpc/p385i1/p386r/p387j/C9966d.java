package io.grpc.p385i1.p386r.p387j;

import io.intercom.okhttp3.internal.http2.Header;
import p576m.C14347f;
/* compiled from: Header.java */
/* renamed from: io.grpc.i1.r.j.d */
/* loaded from: classes2.dex */
public final class C9966d {

    /* renamed from: d */
    public static final C14347f f23628d = C14347f.m2035m(Header.RESPONSE_STATUS_UTF8);

    /* renamed from: e */
    public static final C14347f f23629e = C14347f.m2035m(Header.TARGET_METHOD_UTF8);

    /* renamed from: f */
    public static final C14347f f23630f = C14347f.m2035m(Header.TARGET_PATH_UTF8);

    /* renamed from: g */
    public static final C14347f f23631g = C14347f.m2035m(Header.TARGET_SCHEME_UTF8);

    /* renamed from: h */
    public static final C14347f f23632h = C14347f.m2035m(Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: a */
    public final C14347f f23633a;

    /* renamed from: b */
    public final C14347f f23634b;

    /* renamed from: c */
    final int f23635c;

    static {
        C14347f.m2035m(":host");
        C14347f.m2035m(":version");
    }

    public C9966d(String str, String str2) {
        this(C14347f.m2035m(str), C14347f.m2035m(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9966d) {
            C9966d c9966d = (C9966d) obj;
            return this.f23633a.equals(c9966d.f23633a) && this.f23634b.equals(c9966d.f23634b);
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f23633a.hashCode()) * 31) + this.f23634b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f23633a.mo1965M(), this.f23634b.mo1965M());
    }

    public C9966d(C14347f c14347f, String str) {
        this(c14347f, C14347f.m2035m(str));
    }

    public C9966d(C14347f c14347f, C14347f c14347f2) {
        this.f23633a = c14347f;
        this.f23634b = c14347f2;
        this.f23635c = c14347f.mo1969A() + 32 + c14347f2.mo1969A();
    }
}
