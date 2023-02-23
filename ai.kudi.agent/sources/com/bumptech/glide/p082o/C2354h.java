package com.bumptech.glide.p082o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C1947d;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.engine.C2064k;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.p074o.p076e.C2254a;
import com.bumptech.glide.p082o.p083j.InterfaceC2359c;
import com.bumptech.glide.p082o.p083j.InterfaceC2360d;
import com.bumptech.glide.p082o.p084k.InterfaceC2364c;
import com.bumptech.glide.p086q.C2376f;
import com.bumptech.glide.p086q.C2381k;
import com.bumptech.glide.p086q.p087l.AbstractC2392c;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: SingleRequest.java */
/* renamed from: com.bumptech.glide.o.h */
/* loaded from: classes2.dex */
public final class C2354h<R> implements InterfaceC2348c, InterfaceC2359c, InterfaceC2353g {

    /* renamed from: D */
    private static final boolean f6801D = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private int f6802A;

    /* renamed from: B */
    private boolean f6803B;

    /* renamed from: C */
    private RuntimeException f6804C;

    /* renamed from: a */
    private final String f6805a;

    /* renamed from: b */
    private final AbstractC2392c f6806b;

    /* renamed from: c */
    private final Object f6807c;

    /* renamed from: d */
    private final InterfaceC2351e<R> f6808d;

    /* renamed from: e */
    private final InterfaceC2349d f6809e;

    /* renamed from: f */
    private final Context f6810f;

    /* renamed from: g */
    private final C1947d f6811g;

    /* renamed from: h */
    private final Object f6812h;

    /* renamed from: i */
    private final Class<R> f6813i;

    /* renamed from: j */
    private final AbstractC2346a<?> f6814j;

    /* renamed from: k */
    private final int f6815k;

    /* renamed from: l */
    private final int f6816l;

    /* renamed from: m */
    private final EnumC1949f f6817m;

    /* renamed from: n */
    private final InterfaceC2360d<R> f6818n;

    /* renamed from: o */
    private final List<InterfaceC2351e<R>> f6819o;

    /* renamed from: p */
    private final InterfaceC2364c<? super R> f6820p;

    /* renamed from: q */
    private final Executor f6821q;

    /* renamed from: r */
    private InterfaceC2087u<R> f6822r;

    /* renamed from: s */
    private C2064k.C2070d f6823s;

    /* renamed from: t */
    private long f6824t;

    /* renamed from: u */
    private volatile C2064k f6825u;

    /* renamed from: v */
    private EnumC2355a f6826v;

    /* renamed from: w */
    private Drawable f6827w;

    /* renamed from: x */
    private Drawable f6828x;

    /* renamed from: y */
    private Drawable f6829y;

    /* renamed from: z */
    private int f6830z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleRequest.java */
    /* renamed from: com.bumptech.glide.o.h$a */
    /* loaded from: classes2.dex */
    public enum EnumC2355a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private C2354h(Context context, C1947d c1947d, Object obj, Object obj2, Class<R> cls, AbstractC2346a<?> abstractC2346a, int i, int i2, EnumC1949f enumC1949f, InterfaceC2360d<R> interfaceC2360d, InterfaceC2351e<R> interfaceC2351e, List<InterfaceC2351e<R>> list, InterfaceC2349d interfaceC2349d, C2064k c2064k, InterfaceC2364c<? super R> interfaceC2364c, Executor executor) {
        this.f6805a = f6801D ? String.valueOf(super.hashCode()) : null;
        this.f6806b = AbstractC2392c.m33094a();
        this.f6807c = obj;
        this.f6810f = context;
        this.f6811g = c1947d;
        this.f6812h = obj2;
        this.f6813i = cls;
        this.f6814j = abstractC2346a;
        this.f6815k = i;
        this.f6816l = i2;
        this.f6817m = enumC1949f;
        this.f6818n = interfaceC2360d;
        this.f6808d = interfaceC2351e;
        this.f6819o = list;
        this.f6809e = interfaceC2349d;
        this.f6825u = c2064k;
        this.f6820p = interfaceC2364c;
        this.f6821q = executor;
        this.f6826v = EnumC2355a.PENDING;
        if (this.f6804C == null && c1947d.m34142h()) {
            this.f6804C = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: A */
    private void m33202A() {
        if (m33196l()) {
            Drawable m33192p = this.f6812h == null ? m33192p() : null;
            if (m33192p == null) {
                m33192p = m33193o();
            }
            if (m33192p == null) {
                m33192p = m33191q();
            }
            this.f6818n.onLoadFailed(m33192p);
        }
    }

    /* renamed from: j */
    private void m33198j() {
        if (this.f6803B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: k */
    private boolean m33197k() {
        InterfaceC2349d interfaceC2349d = this.f6809e;
        return interfaceC2349d == null || interfaceC2349d.mo33172j(this);
    }

    /* renamed from: l */
    private boolean m33196l() {
        InterfaceC2349d interfaceC2349d = this.f6809e;
        return interfaceC2349d == null || interfaceC2349d.mo33179c(this);
    }

    /* renamed from: m */
    private boolean m33195m() {
        InterfaceC2349d interfaceC2349d = this.f6809e;
        return interfaceC2349d == null || interfaceC2349d.mo33178d(this);
    }

    /* renamed from: n */
    private void m33194n() {
        m33198j();
        this.f6806b.mo33092c();
        this.f6818n.mo33166a(this);
        C2064k.C2070d c2070d = this.f6823s;
        if (c2070d != null) {
            c2070d.m33798a();
            this.f6823s = null;
        }
    }

    /* renamed from: o */
    private Drawable m33193o() {
        if (this.f6827w == null) {
            Drawable m33228i = this.f6814j.m33228i();
            this.f6827w = m33228i;
            if (m33228i == null && this.f6814j.m33229h() > 0) {
                this.f6827w = m33189s(this.f6814j.m33229h());
            }
        }
        return this.f6827w;
    }

    /* renamed from: p */
    private Drawable m33192p() {
        if (this.f6829y == null) {
            Drawable m33227j = this.f6814j.m33227j();
            this.f6829y = m33227j;
            if (m33227j == null && this.f6814j.m33226k() > 0) {
                this.f6829y = m33189s(this.f6814j.m33226k());
            }
        }
        return this.f6829y;
    }

    /* renamed from: q */
    private Drawable m33191q() {
        if (this.f6828x == null) {
            Drawable m33221q = this.f6814j.m33221q();
            this.f6828x = m33221q;
            if (m33221q == null && this.f6814j.m33220r() > 0) {
                this.f6828x = m33189s(this.f6814j.m33220r());
            }
        }
        return this.f6828x;
    }

    /* renamed from: r */
    private boolean m33190r() {
        InterfaceC2349d interfaceC2349d = this.f6809e;
        return interfaceC2349d == null || !interfaceC2349d.getRoot().mo33181a();
    }

    /* renamed from: s */
    private Drawable m33189s(int i) {
        return C2254a.m33485a(this.f6811g, i, this.f6814j.m33215w() != null ? this.f6814j.m33215w() : this.f6810f.getTheme());
    }

    /* renamed from: t */
    private void m33188t(String str) {
        Log.v("Request", str + " this: " + this.f6805a);
    }

    /* renamed from: u */
    private static int m33187u(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    /* renamed from: v */
    private void m33186v() {
        InterfaceC2349d interfaceC2349d = this.f6809e;
        if (interfaceC2349d != null) {
            interfaceC2349d.mo33180b(this);
        }
    }

    /* renamed from: w */
    private void m33185w() {
        InterfaceC2349d interfaceC2349d = this.f6809e;
        if (interfaceC2349d != null) {
            interfaceC2349d.mo33173i(this);
        }
    }

    /* renamed from: x */
    public static <R> C2354h<R> m33184x(Context context, C1947d c1947d, Object obj, Object obj2, Class<R> cls, AbstractC2346a<?> abstractC2346a, int i, int i2, EnumC1949f enumC1949f, InterfaceC2360d<R> interfaceC2360d, InterfaceC2351e<R> interfaceC2351e, List<InterfaceC2351e<R>> list, InterfaceC2349d interfaceC2349d, C2064k c2064k, InterfaceC2364c<? super R> interfaceC2364c, Executor executor) {
        return new C2354h<>(context, c1947d, obj, obj2, cls, abstractC2346a, i, i2, enumC1949f, interfaceC2360d, interfaceC2351e, list, interfaceC2349d, c2064k, interfaceC2364c, executor);
    }

    /* renamed from: y */
    private void m33183y(GlideException glideException, int i) {
        boolean z;
        this.f6806b.mo33092c();
        synchronized (this.f6807c) {
            glideException.m33932k(this.f6804C);
            int m34144f = this.f6811g.m34144f();
            if (m34144f <= i) {
                Log.w("Glide", "Load failed for " + this.f6812h + " with size [" + this.f6830z + "x" + this.f6802A + "]", glideException);
                if (m34144f <= 4) {
                    glideException.m33936g("Glide");
                }
            }
            this.f6823s = null;
            this.f6826v = EnumC2355a.FAILED;
            boolean z2 = true;
            this.f6803B = true;
            if (this.f6819o != null) {
                z = false;
                for (InterfaceC2351e<R> interfaceC2351e : this.f6819o) {
                    z |= interfaceC2351e.mo22897a(glideException, this.f6812h, this.f6818n, m33190r());
                }
            } else {
                z = false;
            }
            if (this.f6808d == null || !this.f6808d.mo22897a(glideException, this.f6812h, this.f6818n, m33190r())) {
                z2 = false;
            }
            if (!(z | z2)) {
                m33202A();
            }
            this.f6803B = false;
            m33186v();
        }
    }

    /* renamed from: z */
    private void m33182z(InterfaceC2087u<R> interfaceC2087u, R r, EnumC1993a enumC1993a) {
        boolean z;
        boolean m33190r = m33190r();
        this.f6826v = EnumC2355a.COMPLETE;
        this.f6822r = interfaceC2087u;
        if (this.f6811g.m34144f() <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + enumC1993a + " for " + this.f6812h + " with size [" + this.f6830z + "x" + this.f6802A + "] in " + C2376f.m33146a(this.f6824t) + " ms");
        }
        boolean z2 = true;
        this.f6803B = true;
        try {
            if (this.f6819o != null) {
                z = false;
                for (InterfaceC2351e<R> interfaceC2351e : this.f6819o) {
                    z |= interfaceC2351e.mo22896b(r, this.f6812h, this.f6818n, enumC1993a, m33190r);
                }
            } else {
                z = false;
            }
            if (this.f6808d == null || !this.f6808d.mo22896b(r, this.f6812h, this.f6818n, enumC1993a, m33190r)) {
                z2 = false;
            }
            if (!(z2 | z)) {
                this.f6818n.mo22923b(r, this.f6820p.mo33162a(enumC1993a, m33190r));
            }
            this.f6803B = false;
            m33185w();
        } catch (Throwable th) {
            this.f6803B = false;
            throw th;
        }
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: a */
    public boolean mo33181a() {
        boolean z;
        synchronized (this.f6807c) {
            z = this.f6826v == EnumC2355a.COMPLETE;
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2353g
    /* renamed from: b */
    public void mo33201b(GlideException glideException) {
        m33183y(glideException, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        r5.f6825u.m33805k(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r6 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
        r5.f6825u.m33805k(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.p082o.InterfaceC2353g
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo33200c(com.bumptech.glide.load.engine.InterfaceC2087u<?> r6, com.bumptech.glide.load.EnumC1993a r7) {
        /*
            r5 = this;
            com.bumptech.glide.q.l.c r0 = r5.f6806b
            r0.mo33092c()
            r0 = 0
            java.lang.Object r1 = r5.f6807c     // Catch: java.lang.Throwable -> Lb9
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb9
            r5.f6823s = r0     // Catch: java.lang.Throwable -> Lb6
            if (r6 != 0) goto L2f
            com.bumptech.glide.load.engine.GlideException r6 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lb6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb6
            r7.<init>()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r7.append(r2)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class<R> r2 = r5.f6813i     // Catch: java.lang.Throwable -> Lb6
            r7.append(r2)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r2 = " inside, but instead got null."
            r7.append(r2)     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lb6
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb6
            r5.mo33201b(r6)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb6
            return
        L2f:
            java.lang.Object r2 = r6.get()     // Catch: java.lang.Throwable -> Lb6
            if (r2 == 0) goto L5c
            java.lang.Class<R> r3 = r5.f6813i     // Catch: java.lang.Throwable -> Lb6
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> Lb6
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> Lb6
            if (r3 != 0) goto L42
            goto L5c
        L42:
            boolean r3 = r5.m33195m()     // Catch: java.lang.Throwable -> Lb6
            if (r3 != 0) goto L57
            r5.f6822r = r0     // Catch: java.lang.Throwable -> Lb2
            com.bumptech.glide.o.h$a r7 = com.bumptech.glide.p082o.C2354h.EnumC2355a.COMPLETE     // Catch: java.lang.Throwable -> Lb2
            r5.f6826v = r7     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto L56
            com.bumptech.glide.load.engine.k r7 = r5.f6825u
            r7.m33805k(r6)
        L56:
            return
        L57:
            r5.m33182z(r6, r2, r7)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb6
            return
        L5c:
            r5.f6822r = r0     // Catch: java.lang.Throwable -> Lb2
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r0.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "Expected to receive an object of "
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Class<R> r3 = r5.f6813i     // Catch: java.lang.Throwable -> Lb2
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = " but instead got "
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto L7b
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Throwable -> Lb2
            goto L7d
        L7b:
            java.lang.String r3 = ""
        L7d:
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "{"
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb2
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "} inside Resource{"
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb2
            r0.append(r6)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = "}."
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb2
            if (r2 == 0) goto L9a
            java.lang.String r2 = ""
            goto L9c
        L9a:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L9c:
            r0.append(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb2
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lb2
            r5.mo33201b(r7)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto Lb1
            com.bumptech.glide.load.engine.k r7 = r5.f6825u
            r7.m33805k(r6)
        Lb1:
            return
        Lb2:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto Lb7
        Lb6:
            r6 = move-exception
        Lb7:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb6
            throw r6     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r6 = move-exception
            if (r0 == 0) goto Lc1
            com.bumptech.glide.load.engine.k r7 = r5.f6825u
            r7.m33805k(r0)
        Lc1:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p082o.C2354h.mo33200c(com.bumptech.glide.load.engine.u, com.bumptech.glide.load.a):void");
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    public void clear() {
        synchronized (this.f6807c) {
            m33198j();
            this.f6806b.mo33092c();
            if (this.f6826v == EnumC2355a.CLEARED) {
                return;
            }
            m33194n();
            InterfaceC2087u<?> interfaceC2087u = null;
            if (this.f6822r != null) {
                InterfaceC2087u<R> interfaceC2087u2 = this.f6822r;
                this.f6822r = null;
                interfaceC2087u = interfaceC2087u2;
            }
            if (m33197k()) {
                this.f6818n.onLoadCleared(m33191q());
            }
            this.f6826v = EnumC2355a.CLEARED;
            if (interfaceC2087u != null) {
                this.f6825u.m33805k(interfaceC2087u);
            }
        }
    }

    @Override // com.bumptech.glide.p082o.p083j.InterfaceC2359c
    /* renamed from: d */
    public void mo33167d(int i, int i2) {
        Object obj;
        this.f6806b.mo33092c();
        Object obj2 = this.f6807c;
        synchronized (obj2) {
            try {
                try {
                    if (f6801D) {
                        m33188t("Got onSizeReady in " + C2376f.m33146a(this.f6824t));
                    }
                    if (this.f6826v == EnumC2355a.WAITING_FOR_SIZE) {
                        this.f6826v = EnumC2355a.RUNNING;
                        float m33216v = this.f6814j.m33216v();
                        this.f6830z = m33187u(i, m33216v);
                        this.f6802A = m33187u(i2, m33216v);
                        if (f6801D) {
                            m33188t("finished setup for calling load in " + C2376f.m33146a(this.f6824t));
                        }
                        obj = obj2;
                        try {
                            this.f6823s = this.f6825u.m33810f(this.f6811g, this.f6812h, this.f6814j.m33217u(), this.f6830z, this.f6802A, this.f6814j.m33218t(), this.f6813i, this.f6817m, this.f6814j.m33230g(), this.f6814j.m33214x(), this.f6814j.m33252F(), this.f6814j.m33255C(), this.f6814j.m33224n(), this.f6814j.m33257A(), this.f6814j.m33212z(), this.f6814j.m33213y(), this.f6814j.m33225l(), this, this.f6821q);
                            if (this.f6826v != EnumC2355a.RUNNING) {
                                this.f6823s = null;
                            }
                            if (f6801D) {
                                m33188t("finished onSizeReady in " + C2376f.m33146a(this.f6824t));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: e */
    public void mo33177e() {
        synchronized (this.f6807c) {
            m33198j();
            this.f6806b.mo33092c();
            this.f6824t = C2376f.m33145b();
            if (this.f6812h == null) {
                if (C2381k.m33110r(this.f6815k, this.f6816l)) {
                    this.f6830z = this.f6815k;
                    this.f6802A = this.f6816l;
                }
                m33183y(new GlideException("Received null model"), m33192p() == null ? 5 : 3);
            } else if (this.f6826v != EnumC2355a.RUNNING) {
                if (this.f6826v == EnumC2355a.COMPLETE) {
                    mo33200c(this.f6822r, EnumC1993a.MEMORY_CACHE);
                    return;
                }
                this.f6826v = EnumC2355a.WAITING_FOR_SIZE;
                if (C2381k.m33110r(this.f6815k, this.f6816l)) {
                    mo33167d(this.f6815k, this.f6816l);
                } else {
                    this.f6818n.mo33164d(this);
                }
                if ((this.f6826v == EnumC2355a.RUNNING || this.f6826v == EnumC2355a.WAITING_FOR_SIZE) && m33196l()) {
                    this.f6818n.onLoadStarted(m33191q());
                }
                if (f6801D) {
                    m33188t("finished run method in " + C2376f.m33146a(this.f6824t));
                }
            } else {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
        }
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: f */
    public boolean mo33176f() {
        boolean z;
        synchronized (this.f6807c) {
            z = this.f6826v == EnumC2355a.COMPLETE;
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: g */
    public boolean mo33175g(InterfaceC2348c interfaceC2348c) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        AbstractC2346a<?> abstractC2346a;
        EnumC1949f enumC1949f;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        AbstractC2346a<?> abstractC2346a2;
        EnumC1949f enumC1949f2;
        int size2;
        if (interfaceC2348c instanceof C2354h) {
            synchronized (this.f6807c) {
                i = this.f6815k;
                i2 = this.f6816l;
                obj = this.f6812h;
                cls = this.f6813i;
                abstractC2346a = this.f6814j;
                enumC1949f = this.f6817m;
                size = this.f6819o != null ? this.f6819o.size() : 0;
            }
            C2354h c2354h = (C2354h) interfaceC2348c;
            synchronized (c2354h.f6807c) {
                i3 = c2354h.f6815k;
                i4 = c2354h.f6816l;
                obj2 = c2354h.f6812h;
                cls2 = c2354h.f6813i;
                abstractC2346a2 = c2354h.f6814j;
                enumC1949f2 = c2354h.f6817m;
                size2 = c2354h.f6819o != null ? c2354h.f6819o.size() : 0;
            }
            return i == i3 && i2 == i4 && C2381k.m33126b(obj, obj2) && cls.equals(cls2) && abstractC2346a.equals(abstractC2346a2) && enumC1949f == enumC1949f2 && size == size2;
        }
        return false;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    /* renamed from: h */
    public boolean mo33174h() {
        boolean z;
        synchronized (this.f6807c) {
            z = this.f6826v == EnumC2355a.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2353g
    /* renamed from: i */
    public Object mo33199i() {
        this.f6806b.mo33092c();
        return this.f6807c;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f6807c) {
            z = this.f6826v == EnumC2355a.RUNNING || this.f6826v == EnumC2355a.WAITING_FOR_SIZE;
        }
        return z;
    }

    @Override // com.bumptech.glide.p082o.InterfaceC2348c
    public void pause() {
        synchronized (this.f6807c) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
