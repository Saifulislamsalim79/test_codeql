package p565l.p566g0.p568f;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.connection.C14475c;
import okhttp3.internal.connection.C14479f;
import p565l.AbstractC14222p;
import p565l.C14116a0;
import p565l.C14131c0;
import p565l.InterfaceC14138e;
import p565l.InterfaceC14211i;
import p565l.InterfaceC14233u;
/* compiled from: RealInterceptorChain.java */
/* renamed from: l.g0.f.g */
/* loaded from: classes3.dex */
public final class C14174g implements InterfaceC14233u.InterfaceC14234a {

    /* renamed from: a */
    private final List<InterfaceC14233u> f30990a;

    /* renamed from: b */
    private final C14479f f30991b;

    /* renamed from: c */
    private final InterfaceC14169c f30992c;

    /* renamed from: d */
    private final C14475c f30993d;

    /* renamed from: e */
    private final int f30994e;

    /* renamed from: f */
    private final C14116a0 f30995f;

    /* renamed from: g */
    private final InterfaceC14138e f30996g;

    /* renamed from: h */
    private final AbstractC14222p f30997h;

    /* renamed from: i */
    private final int f30998i;

    /* renamed from: j */
    private final int f30999j;

    /* renamed from: k */
    private final int f31000k;

    /* renamed from: l */
    private int f31001l;

    public C14174g(List<InterfaceC14233u> list, C14479f c14479f, InterfaceC14169c interfaceC14169c, C14475c c14475c, int i, C14116a0 c14116a0, InterfaceC14138e interfaceC14138e, AbstractC14222p abstractC14222p, int i2, int i3, int i4) {
        this.f30990a = list;
        this.f30993d = c14475c;
        this.f30991b = c14479f;
        this.f30992c = interfaceC14169c;
        this.f30994e = i;
        this.f30995f = c14116a0;
        this.f30996g = interfaceC14138e;
        this.f30997h = abstractC14222p;
        this.f30998i = i2;
        this.f30999j = i3;
        this.f31000k = i4;
    }

    @Override // p565l.InterfaceC14233u.InterfaceC14234a
    /* renamed from: a */
    public C14131c0 mo2478a(C14116a0 c14116a0) throws IOException {
        return m2706e(c14116a0, this.f30991b, this.f30992c, this.f30993d);
    }

    /* renamed from: b */
    public InterfaceC14138e m2709b() {
        return this.f30996g;
    }

    /* renamed from: c */
    public AbstractC14222p m2708c() {
        return this.f30997h;
    }

    @Override // p565l.InterfaceC14233u.InterfaceC14234a
    public int connectTimeoutMillis() {
        return this.f30998i;
    }

    @Override // p565l.InterfaceC14233u.InterfaceC14234a
    public InterfaceC14211i connection() {
        return this.f30993d;
    }

    /* renamed from: d */
    public InterfaceC14169c m2707d() {
        return this.f30992c;
    }

    /* renamed from: e */
    public C14131c0 m2706e(C14116a0 c14116a0, C14479f c14479f, InterfaceC14169c interfaceC14169c, C14475c c14475c) throws IOException {
        if (this.f30994e < this.f30990a.size()) {
            this.f31001l++;
            if (this.f30992c != null && !this.f30993d.m1593s(c14116a0.m2913i())) {
                throw new IllegalStateException("network interceptor " + this.f30990a.get(this.f30994e - 1) + " must retain the same host and port");
            } else if (this.f30992c != null && this.f31001l > 1) {
                throw new IllegalStateException("network interceptor " + this.f30990a.get(this.f30994e - 1) + " must call proceed() exactly once");
            } else {
                C14174g c14174g = new C14174g(this.f30990a, c14479f, interfaceC14169c, c14475c, this.f30994e + 1, c14116a0, this.f30996g, this.f30997h, this.f30998i, this.f30999j, this.f31000k);
                InterfaceC14233u interfaceC14233u = this.f30990a.get(this.f30994e);
                C14131c0 intercept = interfaceC14233u.intercept(c14174g);
                if (interfaceC14169c != null && this.f30994e + 1 < this.f30990a.size() && c14174g.f31001l != 1) {
                    throw new IllegalStateException("network interceptor " + interfaceC14233u + " must call proceed() exactly once");
                } else if (intercept != null) {
                    if (intercept.m2878c() != null) {
                        return intercept;
                    }
                    throw new IllegalStateException("interceptor " + interfaceC14233u + " returned a response with no body");
                } else {
                    throw new NullPointerException("interceptor " + interfaceC14233u + " returned null");
                }
            }
        }
        throw new AssertionError();
    }

    /* renamed from: f */
    public C14479f m2705f() {
        return this.f30991b;
    }

    @Override // p565l.InterfaceC14233u.InterfaceC14234a
    public int readTimeoutMillis() {
        return this.f30999j;
    }

    @Override // p565l.InterfaceC14233u.InterfaceC14234a
    public C14116a0 request() {
        return this.f30995f;
    }

    @Override // p565l.InterfaceC14233u.InterfaceC14234a
    public int writeTimeoutMillis() {
        return this.f31000k;
    }
}
