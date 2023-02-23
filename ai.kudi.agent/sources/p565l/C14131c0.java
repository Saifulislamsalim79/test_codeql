package p565l;

import java.io.Closeable;
import p565l.C14229s;
/* compiled from: Response.java */
/* renamed from: l.c0 */
/* loaded from: classes3.dex */
public final class C14131c0 implements Closeable {

    /* renamed from: A */
    final C14131c0 f30830A;

    /* renamed from: B */
    final C14131c0 f30831B;

    /* renamed from: C */
    final long f30832C;

    /* renamed from: D */
    final long f30833D;

    /* renamed from: E */
    private volatile C14133d f30834E;

    /* renamed from: c */
    final C14116a0 f30835c;

    /* renamed from: d */
    final EnumC14242y f30836d;

    /* renamed from: e */
    final int f30837e;

    /* renamed from: f */
    final String f30838f;

    /* renamed from: w */
    final C14228r f30839w;

    /* renamed from: x */
    final C14229s f30840x;

    /* renamed from: y */
    final AbstractC14135d0 f30841y;

    /* renamed from: z */
    final C14131c0 f30842z;

    C14131c0(C14132a c14132a) {
        this.f30835c = c14132a.f30843a;
        this.f30836d = c14132a.f30844b;
        this.f30837e = c14132a.f30845c;
        this.f30838f = c14132a.f30846d;
        this.f30839w = c14132a.f30847e;
        this.f30840x = c14132a.f30848f.m2539d();
        this.f30841y = c14132a.f30849g;
        this.f30842z = c14132a.f30850h;
        this.f30830A = c14132a.f30851i;
        this.f30831B = c14132a.f30852j;
        this.f30832C = c14132a.f30853k;
        this.f30833D = c14132a.f30854l;
    }

    /* renamed from: F */
    public int m2887F() {
        return this.f30837e;
    }

    /* renamed from: I */
    public C14228r m2886I() {
        return this.f30839w;
    }

    /* renamed from: J */
    public String m2885J(String str) {
        return m2884O(str, null);
    }

    /* renamed from: O */
    public String m2884O(String str, String str2) {
        String m2550c = this.f30840x.m2550c(str);
        return m2550c != null ? m2550c : str2;
    }

    /* renamed from: P */
    public C14229s m2883P() {
        return this.f30840x;
    }

    /* renamed from: V */
    public boolean m2882V() {
        int i = this.f30837e;
        return i >= 200 && i < 300;
    }

    /* renamed from: X */
    public String m2881X() {
        return this.f30838f;
    }

    /* renamed from: Z */
    public C14131c0 m2880Z() {
        return this.f30842z;
    }

    /* renamed from: b0 */
    public C14132a m2879b0() {
        return new C14132a(this);
    }

    /* renamed from: c */
    public AbstractC14135d0 m2878c() {
        return this.f30841y;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC14135d0 abstractC14135d0 = this.f30841y;
        if (abstractC14135d0 != null) {
            abstractC14135d0.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: f0 */
    public C14131c0 m2877f0() {
        return this.f30831B;
    }

    /* renamed from: g */
    public C14133d m2876g() {
        C14133d c14133d = this.f30834E;
        if (c14133d != null) {
            return c14133d;
        }
        C14133d m2843k = C14133d.m2843k(this.f30840x);
        this.f30834E = m2843k;
        return m2843k;
    }

    /* renamed from: g0 */
    public EnumC14242y m2875g0() {
        return this.f30836d;
    }

    /* renamed from: i0 */
    public long m2874i0() {
        return this.f30833D;
    }

    /* renamed from: k0 */
    public C14116a0 m2873k0() {
        return this.f30835c;
    }

    /* renamed from: m */
    public C14131c0 m2872m() {
        return this.f30830A;
    }

    /* renamed from: o0 */
    public long m2871o0() {
        return this.f30832C;
    }

    public String toString() {
        return "Response{protocol=" + this.f30836d + ", code=" + this.f30837e + ", message=" + this.f30838f + ", url=" + this.f30835c.m2913i() + '}';
    }

    /* compiled from: Response.java */
    /* renamed from: l.c0$a */
    /* loaded from: classes3.dex */
    public static class C14132a {

        /* renamed from: a */
        C14116a0 f30843a;

        /* renamed from: b */
        EnumC14242y f30844b;

        /* renamed from: c */
        int f30845c;

        /* renamed from: d */
        String f30846d;

        /* renamed from: e */
        C14228r f30847e;

        /* renamed from: f */
        C14229s.C14230a f30848f;

        /* renamed from: g */
        AbstractC14135d0 f30849g;

        /* renamed from: h */
        C14131c0 f30850h;

        /* renamed from: i */
        C14131c0 f30851i;

        /* renamed from: j */
        C14131c0 f30852j;

        /* renamed from: k */
        long f30853k;

        /* renamed from: l */
        long f30854l;

        public C14132a() {
            this.f30845c = -1;
            this.f30848f = new C14229s.C14230a();
        }

        /* renamed from: e */
        private void m2866e(C14131c0 c14131c0) {
            if (c14131c0.f30841y != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: f */
        private void m2865f(String str, C14131c0 c14131c0) {
            if (c14131c0.f30841y == null) {
                if (c14131c0.f30842z == null) {
                    if (c14131c0.f30830A == null) {
                        if (c14131c0.f30831B == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str + ".priorResponse != null");
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        /* renamed from: a */
        public C14132a m2870a(String str, String str2) {
            this.f30848f.m2542a(str, str2);
            return this;
        }

        /* renamed from: b */
        public C14132a m2869b(AbstractC14135d0 abstractC14135d0) {
            this.f30849g = abstractC14135d0;
            return this;
        }

        /* renamed from: c */
        public C14131c0 m2868c() {
            if (this.f30843a != null) {
                if (this.f30844b != null) {
                    if (this.f30845c >= 0) {
                        if (this.f30846d != null) {
                            return new C14131c0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f30845c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }

        /* renamed from: d */
        public C14132a m2867d(C14131c0 c14131c0) {
            if (c14131c0 != null) {
                m2865f("cacheResponse", c14131c0);
            }
            this.f30851i = c14131c0;
            return this;
        }

        /* renamed from: g */
        public C14132a m2864g(int i) {
            this.f30845c = i;
            return this;
        }

        /* renamed from: h */
        public C14132a m2863h(C14228r c14228r) {
            this.f30847e = c14228r;
            return this;
        }

        /* renamed from: i */
        public C14132a m2862i(String str, String str2) {
            this.f30848f.m2536g(str, str2);
            return this;
        }

        /* renamed from: j */
        public C14132a m2861j(C14229s c14229s) {
            this.f30848f = c14229s.m2547f();
            return this;
        }

        /* renamed from: k */
        public C14132a m2860k(String str) {
            this.f30846d = str;
            return this;
        }

        /* renamed from: l */
        public C14132a m2859l(C14131c0 c14131c0) {
            if (c14131c0 != null) {
                m2865f("networkResponse", c14131c0);
            }
            this.f30850h = c14131c0;
            return this;
        }

        /* renamed from: m */
        public C14132a m2858m(C14131c0 c14131c0) {
            if (c14131c0 != null) {
                m2866e(c14131c0);
            }
            this.f30852j = c14131c0;
            return this;
        }

        /* renamed from: n */
        public C14132a m2857n(EnumC14242y enumC14242y) {
            this.f30844b = enumC14242y;
            return this;
        }

        /* renamed from: o */
        public C14132a m2856o(long j) {
            this.f30854l = j;
            return this;
        }

        /* renamed from: p */
        public C14132a m2855p(C14116a0 c14116a0) {
            this.f30843a = c14116a0;
            return this;
        }

        /* renamed from: q */
        public C14132a m2854q(long j) {
            this.f30853k = j;
            return this;
        }

        C14132a(C14131c0 c14131c0) {
            this.f30845c = -1;
            this.f30843a = c14131c0.f30835c;
            this.f30844b = c14131c0.f30836d;
            this.f30845c = c14131c0.f30837e;
            this.f30846d = c14131c0.f30838f;
            this.f30847e = c14131c0.f30839w;
            this.f30848f = c14131c0.f30840x.m2547f();
            this.f30849g = c14131c0.f30841y;
            this.f30850h = c14131c0.f30842z;
            this.f30851i = c14131c0.f30830A;
            this.f30852j = c14131c0.f30831B;
            this.f30853k = c14131c0.f30832C;
            this.f30854l = c14131c0.f30833D;
        }
    }
}
