package p576m;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: ForwardingTimeout.java */
/* renamed from: m.i */
/* loaded from: classes3.dex */
public class C14350i extends C14366t {

    /* renamed from: e */
    private C14366t f31629e;

    public C14350i(C14366t c14366t) {
        if (c14366t != null) {
            this.f31629e = c14366t;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // p576m.C14366t
    /* renamed from: a */
    public C14366t mo1953a() {
        return this.f31629e.mo1953a();
    }

    @Override // p576m.C14366t
    /* renamed from: b */
    public C14366t mo1952b() {
        return this.f31629e.mo1952b();
    }

    @Override // p576m.C14366t
    /* renamed from: c */
    public long mo1951c() {
        return this.f31629e.mo1951c();
    }

    @Override // p576m.C14366t
    /* renamed from: d */
    public C14366t mo1948d(long j) {
        return this.f31629e.mo1948d(j);
    }

    @Override // p576m.C14366t
    /* renamed from: e */
    public boolean mo1950e() {
        return this.f31629e.mo1950e();
    }

    @Override // p576m.C14366t
    /* renamed from: f */
    public void mo1947f() throws IOException {
        this.f31629e.mo1947f();
    }

    @Override // p576m.C14366t
    /* renamed from: g */
    public C14366t mo1946g(long j, TimeUnit timeUnit) {
        return this.f31629e.mo1946g(j, timeUnit);
    }

    @Override // p576m.C14366t
    /* renamed from: h */
    public long mo1949h() {
        return this.f31629e.mo1949h();
    }

    /* renamed from: i */
    public final C14366t m2032i() {
        return this.f31629e;
    }

    /* renamed from: j */
    public final C14350i m2031j(C14366t c14366t) {
        if (c14366t != null) {
            this.f31629e = c14366t;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
