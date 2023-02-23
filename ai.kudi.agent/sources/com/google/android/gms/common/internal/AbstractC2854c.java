package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.C2834f;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.c */
/* loaded from: classes2.dex */
public abstract class AbstractC2854c<T extends IInterface> {

    /* renamed from: x */
    private static final C2830d[] f7939x = new C2830d[0];

    /* renamed from: a */
    private volatile String f7940a;

    /* renamed from: b */
    C2941z1 f7941b;

    /* renamed from: c */
    private final Context f7942c;

    /* renamed from: d */
    private final AbstractC2883j f7943d;

    /* renamed from: e */
    private final C2834f f7944e;

    /* renamed from: f */
    final Handler f7945f;

    /* renamed from: g */
    private final Object f7946g;

    /* renamed from: h */
    private final Object f7947h;

    /* renamed from: i */
    private InterfaceC2896n f7948i;

    /* renamed from: j */
    protected InterfaceC2857c f7949j;

    /* renamed from: k */
    private T f7950k;

    /* renamed from: l */
    private final ArrayList<AbstractC2885j1<?>> f7951l;

    /* renamed from: m */
    private ServiceConnectionC2892l1 f7952m;

    /* renamed from: n */
    private int f7953n;

    /* renamed from: o */
    private final InterfaceC2855a f7954o;

    /* renamed from: p */
    private final InterfaceC2856b f7955p;

    /* renamed from: q */
    private final int f7956q;

    /* renamed from: r */
    private final String f7957r;

    /* renamed from: s */
    private volatile String f7958s;

    /* renamed from: t */
    private C2826b f7959t;

    /* renamed from: u */
    private boolean f7960u;

    /* renamed from: v */
    private volatile C2902o1 f7961v;

    /* renamed from: w */
    protected AtomicInteger f7962w;

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.c$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2855a {
        /* renamed from: m */
        void mo27916m(int i);

        /* renamed from: o */
        void mo27914o(Bundle bundle);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.c$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC2856b {
        /* renamed from: n */
        void mo27915n(C2826b c2826b);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.c$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC2857c {
        /* renamed from: a */
        void mo31771a(C2826b c2826b);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.c$d */
    /* loaded from: classes2.dex */
    protected class C2858d implements InterfaceC2857c {
        public C2858d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC2854c.InterfaceC2857c
        /* renamed from: a */
        public final void mo31771a(C2826b c2826b) {
            if (c2826b.m31879s()) {
                AbstractC2854c abstractC2854c = AbstractC2854c.this;
                abstractC2854c.m31792b(null, abstractC2854c.mo31733B());
            } else if (AbstractC2854c.this.f7955p != null) {
                AbstractC2854c.this.f7955p.mo27915n(c2826b);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.internal.c$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC2859e {
        /* renamed from: a */
        void mo31770a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC2854c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.AbstractC2854c.InterfaceC2855a r13, com.google.android.gms.common.internal.AbstractC2854c.InterfaceC2856b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.AbstractC2883j.m31724b(r10)
            com.google.android.gms.common.f r4 = com.google.android.gms.common.C2834f.m31847f()
            com.google.android.gms.common.internal.s.j(r13)
            com.google.android.gms.common.internal.s.j(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC2854c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public static /* bridge */ /* synthetic */ void m31791b0(AbstractC2854c abstractC2854c, C2902o1 c2902o1) {
        abstractC2854c.f7961v = c2902o1;
        if (abstractC2854c.m31802R()) {
            C2871f c2871f = c2902o1.f8041f;
            C2920t.m31637b().m31636c(c2871f == null ? null : c2871f.m31744u());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public static /* bridge */ /* synthetic */ void m31789c0(AbstractC2854c abstractC2854c, int i) {
        int i2;
        int i3;
        synchronized (abstractC2854c.f7946g) {
            i2 = abstractC2854c.f7953n;
        }
        if (i2 == 3) {
            abstractC2854c.f7960u = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = abstractC2854c.f7945f;
        handler.sendMessage(handler.obtainMessage(i3, abstractC2854c.f7962w.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public static /* bridge */ /* synthetic */ boolean m31784f0(AbstractC2854c abstractC2854c, int i, int i2, IInterface iInterface) {
        synchronized (abstractC2854c.f7946g) {
            if (abstractC2854c.f7953n != i) {
                return false;
            }
            abstractC2854c.m31780h0(i2, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.util.BitSet.or(BitSet.java:940)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: g0 */
    static /* bridge */ /* synthetic */ boolean m31782g0(com.google.android.gms.common.internal.AbstractC2854c r2) {
        /*
            boolean r0 = r2.f7960u
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.mo15471D()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.m31815A()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.mo15471D()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC2854c.m31782g0(com.google.android.gms.common.internal.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m31780h0(int i, T t) {
        C2941z1 c2941z1;
        C2941z1 c2941z12;
        s.a((i == 4) == (t != null));
        synchronized (this.f7946g) {
            this.f7953n = i;
            this.f7950k = t;
            if (i == 1) {
                ServiceConnectionC2892l1 serviceConnectionC2892l1 = this.f7952m;
                if (serviceConnectionC2892l1 != null) {
                    AbstractC2883j abstractC2883j = this.f7943d;
                    String m31588c = this.f7941b.m31588c();
                    s.j(m31588c);
                    abstractC2883j.m31722e(m31588c, this.f7941b.m31589b(), this.f7941b.m31590a(), serviceConnectionC2892l1, m31797W(), this.f7941b.m31587d());
                    this.f7952m = null;
                }
            } else if (i == 2 || i == 3) {
                ServiceConnectionC2892l1 serviceConnectionC2892l12 = this.f7952m;
                if (serviceConnectionC2892l12 != null && (c2941z12 = this.f7941b) != null) {
                    String m31588c2 = c2941z12.m31588c();
                    String m31589b = c2941z12.m31589b();
                    StringBuilder sb = new StringBuilder(String.valueOf(m31588c2).length() + 70 + String.valueOf(m31589b).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(m31588c2);
                    sb.append(" on ");
                    sb.append(m31589b);
                    Log.e("GmsClient", sb.toString());
                    AbstractC2883j abstractC2883j2 = this.f7943d;
                    String m31588c3 = this.f7941b.m31588c();
                    s.j(m31588c3);
                    abstractC2883j2.m31722e(m31588c3, this.f7941b.m31589b(), this.f7941b.m31590a(), serviceConnectionC2892l12, m31797W(), this.f7941b.m31587d());
                    this.f7962w.incrementAndGet();
                }
                ServiceConnectionC2892l1 serviceConnectionC2892l13 = new ServiceConnectionC2892l1(this, this.f7962w.get());
                this.f7952m = serviceConnectionC2892l13;
                if (this.f7953n == 3 && m31815A() != null) {
                    c2941z1 = new C2941z1(m31773x().getPackageName(), m31815A(), true, AbstractC2883j.m31725a(), false);
                } else {
                    c2941z1 = new C2941z1(mo31240F(), mo15470E(), false, AbstractC2883j.m31725a(), mo31812H());
                }
                this.f7941b = c2941z1;
                if (c2941z1.m31587d() && mo15469k() < 17895000) {
                    String valueOf = String.valueOf(this.f7941b.m31588c());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                AbstractC2883j abstractC2883j3 = this.f7943d;
                String m31588c4 = this.f7941b.m31588c();
                s.j(m31588c4);
                if (!abstractC2883j3.mo31609f(new C2915s1(m31588c4, this.f7941b.m31589b(), this.f7941b.m31590a(), this.f7941b.m31587d()), serviceConnectionC2892l13, m31797W(), mo31728v())) {
                    String m31588c5 = this.f7941b.m31588c();
                    String m31589b2 = this.f7941b.m31589b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(m31588c5).length() + 34 + String.valueOf(m31589b2).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(m31588c5);
                    sb2.append(" on ");
                    sb2.append(m31589b2);
                    Log.w("GmsClient", sb2.toString());
                    m31787d0(16, null, this.f7962w.get());
                }
            } else if (i == 4) {
                s.j(t);
                m31810J(t);
            }
        }
    }

    /* renamed from: A */
    protected String m31815A() {
        return null;
    }

    /* renamed from: B */
    protected Set<Scope> mo31733B() {
        return Collections.emptySet();
    }

    /* renamed from: C */
    public final T m31814C() throws DeadObjectException {
        T t;
        synchronized (this.f7946g) {
            if (this.f7953n != 5) {
                m31776q();
                t = this.f7950k;
                s.k(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public abstract String mo15471D();

    /* renamed from: E */
    protected abstract String mo15470E();

    /* renamed from: F */
    protected String mo31240F() {
        return "com.google.android.gms";
    }

    /* renamed from: G */
    public C2871f m31813G() {
        C2902o1 c2902o1 = this.f7961v;
        if (c2902o1 == null) {
            return null;
        }
        return c2902o1.f8041f;
    }

    /* renamed from: H */
    protected boolean mo31812H() {
        return mo15469k() >= 211700000;
    }

    /* renamed from: I */
    public boolean m31811I() {
        return this.f7961v != null;
    }

    /* renamed from: J */
    protected void m31810J(T t) {
        System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public void m31809K(C2826b c2826b) {
        c2826b.m31883f();
        System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m31808L(int i) {
        System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M */
    public void m31807M(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f7945f;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C2895m1(this, i, iBinder, bundle)));
    }

    /* renamed from: N */
    public boolean m31806N() {
        return false;
    }

    /* renamed from: O */
    public void m31805O(String str) {
        this.f7958s = str;
    }

    /* renamed from: P */
    public void m31804P(int i) {
        Handler handler = this.f7945f;
        handler.sendMessage(handler.obtainMessage(6, this.f7962w.get(), i));
    }

    /* renamed from: Q */
    protected void m31803Q(InterfaceC2857c interfaceC2857c, int i, PendingIntent pendingIntent) {
        s.k(interfaceC2857c, "Connection progress callbacks cannot be null.");
        this.f7949j = interfaceC2857c;
        Handler handler = this.f7945f;
        handler.sendMessage(handler.obtainMessage(3, this.f7962w.get(), i, pendingIntent));
    }

    /* renamed from: R */
    public boolean m31802R() {
        return false;
    }

    /* renamed from: W */
    protected final String m31797W() {
        String str = this.f7957r;
        return str == null ? this.f7942c.getClass().getName() : str;
    }

    /* renamed from: b */
    public void m31792b(InterfaceC2889l interfaceC2889l, Set<Scope> set) {
        Bundle mo15465z = mo15465z();
        C2877h c2877h = new C2877h(this.f7956q, this.f7958s);
        c2877h.f8001f = this.f7942c.getPackageName();
        c2877h.f8004y = mo15465z;
        if (set != null) {
            c2877h.f8003x = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo15467n()) {
            Account mo31729t = mo31729t();
            if (mo31729t == null) {
                mo31729t = new Account("<<default account>>", "com.google");
            }
            c2877h.f8005z = mo31729t;
            if (interfaceC2889l != null) {
                c2877h.f8002w = interfaceC2889l.asBinder();
            }
        } else if (m31806N()) {
            c2877h.f8005z = mo31729t();
        }
        c2877h.f7992A = f7939x;
        c2877h.f7993B = mo16127u();
        if (m31802R()) {
            c2877h.f7996E = true;
        }
        try {
            synchronized (this.f7947h) {
                InterfaceC2896n interfaceC2896n = this.f7948i;
                if (interfaceC2896n != null) {
                    interfaceC2896n.mo25378I(new BinderC2888k1(this, this.f7962w.get()), c2877h);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m31804P(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m31807M(8, null, null, this.f7962w.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m31807M(8, null, null, this.f7962w.get());
        }
    }

    /* renamed from: c */
    public void m31790c(String str) {
        this.f7940a = str;
        disconnect();
    }

    /* renamed from: d */
    public boolean m31788d() {
        boolean z;
        synchronized (this.f7946g) {
            int i = this.f7953n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d0 */
    public final void m31787d0(int i, Bundle bundle, int i2) {
        Handler handler = this.f7945f;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C2899n1(this, i, null)));
    }

    public void disconnect() {
        this.f7962w.incrementAndGet();
        synchronized (this.f7951l) {
            int size = this.f7951l.size();
            for (int i = 0; i < size; i++) {
                this.f7951l.get(i).m31717d();
            }
            this.f7951l.clear();
        }
        synchronized (this.f7947h) {
            this.f7948i = null;
        }
        m31780h0(1, null);
    }

    /* renamed from: f */
    public String m31785f() {
        C2941z1 c2941z1;
        if (isConnected() && (c2941z1 = this.f7941b) != null) {
            return c2941z1.m31589b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: g */
    public void m31783g(InterfaceC2857c interfaceC2857c) {
        s.k(interfaceC2857c, "Connection progress callbacks cannot be null.");
        this.f7949j = interfaceC2857c;
        m31780h0(2, null);
    }

    /* renamed from: h */
    public void m31781h(InterfaceC2859e interfaceC2859e) {
        interfaceC2859e.mo31770a();
    }

    /* renamed from: i */
    public boolean mo31238i() {
        return true;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.f7946g) {
            z = this.f7953n == 4;
        }
        return z;
    }

    /* renamed from: k */
    public int mo15469k() {
        return C2834f.f7916a;
    }

    /* renamed from: l */
    public final C2830d[] m31779l() {
        C2902o1 c2902o1 = this.f7961v;
        if (c2902o1 == null) {
            return null;
        }
        return c2902o1.f8039d;
    }

    /* renamed from: m */
    public String m31778m() {
        return this.f7940a;
    }

    /* renamed from: n */
    public boolean mo15467n() {
        return false;
    }

    /* renamed from: p */
    public void m31777p() {
        int mo31845h = this.f7944e.mo31845h(this.f7942c, mo15469k());
        if (mo31845h != 0) {
            m31780h0(1, null);
            m31803Q(new C2858d(), mo31845h, null);
            return;
        }
        m31783g(new C2858d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final void m31776q() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public abstract T mo15466r(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public boolean m31775s() {
        return false;
    }

    /* renamed from: t */
    public Account mo31729t() {
        return null;
    }

    /* renamed from: u */
    public C2830d[] mo16127u() {
        return f7939x;
    }

    /* renamed from: v */
    protected Executor mo31728v() {
        return null;
    }

    /* renamed from: w */
    public Bundle m31774w() {
        return null;
    }

    /* renamed from: x */
    public final Context m31773x() {
        return this.f7942c;
    }

    /* renamed from: y */
    public int m31772y() {
        return this.f7956q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public Bundle mo15465z() {
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2854c(Context context, Looper looper, AbstractC2883j abstractC2883j, C2834f c2834f, int i, InterfaceC2855a interfaceC2855a, InterfaceC2856b interfaceC2856b, String str) {
        this.f7940a = null;
        this.f7946g = new Object();
        this.f7947h = new Object();
        this.f7951l = new ArrayList<>();
        this.f7953n = 1;
        this.f7959t = null;
        this.f7960u = false;
        this.f7961v = null;
        this.f7962w = new AtomicInteger(0);
        s.k(context, "Context must not be null");
        this.f7942c = context;
        s.k(looper, "Looper must not be null");
        s.k(abstractC2883j, "Supervisor must not be null");
        this.f7943d = abstractC2883j;
        s.k(c2834f, "API availability must not be null");
        this.f7944e = c2834f;
        this.f7945f = new HandlerC2882i1(this, looper);
        this.f7956q = i;
        this.f7954o = interfaceC2855a;
        this.f7955p = interfaceC2856b;
        this.f7957r = str;
    }
}
