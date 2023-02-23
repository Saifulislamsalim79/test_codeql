package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.C4469m;
import com.google.firebase.C5988g;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.p159o.InterfaceC6440a;
import com.google.firebase.installations.p160p.AbstractC6447d;
import com.google.firebase.installations.p160p.C6444b;
import com.google.firebase.installations.p160p.C6445c;
import com.google.firebase.installations.p161q.AbstractC6456d;
import com.google.firebase.installations.p161q.AbstractC6460f;
import com.google.firebase.installations.p161q.C6455c;
import com.google.firebase.p169n.InterfaceC6555f;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.p181q.InterfaceC6732i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: FirebaseInstallations.java */
/* renamed from: com.google.firebase.installations.g */
/* loaded from: classes2.dex */
public class C6429g implements InterfaceC6432h {

    /* renamed from: m */
    private static final Object f15523m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f15524n = new ThreadFactoryC6430a();

    /* renamed from: a */
    private final C5988g f15525a;

    /* renamed from: b */
    private final C6455c f15526b;

    /* renamed from: c */
    private final C6445c f15527c;

    /* renamed from: d */
    private final C6439n f15528d;

    /* renamed from: e */
    private final C6444b f15529e;

    /* renamed from: f */
    private final C6437l f15530f;

    /* renamed from: g */
    private final Object f15531g;

    /* renamed from: h */
    private final ExecutorService f15532h;

    /* renamed from: i */
    private final ExecutorService f15533i;

    /* renamed from: j */
    private String f15534j;

    /* renamed from: k */
    private Set<InterfaceC6440a> f15535k;

    /* renamed from: l */
    private final List<InterfaceC6438m> f15536l;

    /* compiled from: FirebaseInstallations.java */
    /* renamed from: com.google.firebase.installations.g$a */
    /* loaded from: classes2.dex */
    class ThreadFactoryC6430a implements ThreadFactory {

        /* renamed from: c */
        private final AtomicInteger f15537c = new AtomicInteger(1);

        ThreadFactoryC6430a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f15537c.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseInstallations.java */
    /* renamed from: com.google.firebase.installations.g$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C6431b {

        /* renamed from: a */
        static final /* synthetic */ int[] f15538a;

        /* renamed from: b */
        static final /* synthetic */ int[] f15539b;

        static {
            int[] iArr = new int[AbstractC6460f.EnumC6462b.values().length];
            f15539b = iArr;
            try {
                iArr[AbstractC6460f.EnumC6462b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15539b[AbstractC6460f.EnumC6462b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15539b[AbstractC6460f.EnumC6462b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC6456d.EnumC6458b.values().length];
            f15538a = iArr2;
            try {
                iArr2[AbstractC6456d.EnumC6458b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15538a[AbstractC6456d.EnumC6458b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6429g(C5988g c5988g, InterfaceC6560b<InterfaceC6732i> interfaceC6560b, InterfaceC6560b<InterfaceC6555f> interfaceC6560b2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f15524n), c5988g, new C6455c(c5988g.m23093i(), interfaceC6560b, interfaceC6560b2), new C6445c(c5988g), C6439n.m22033c(), new C6444b(c5988g), new C6437l());
    }

    /* renamed from: A */
    private synchronized void m22075A(AbstractC6447d abstractC6447d, AbstractC6447d abstractC6447d2) {
        if (this.f15535k.size() != 0 && !abstractC6447d.mo22011d().equals(abstractC6447d2.mo22011d())) {
            for (InterfaceC6440a interfaceC6440a : this.f15535k) {
                interfaceC6440a.m22027a(abstractC6447d2.mo22011d());
            }
        }
    }

    /* renamed from: b */
    private com.google.android.gms.tasks.j<AbstractC6435k> m22074b() {
        C4465k c4465k = new C4465k();
        m22072d(new C6433i(this.f15528d, c4465k));
        return c4465k.m27777a();
    }

    /* renamed from: c */
    private com.google.android.gms.tasks.j<String> m22073c() {
        C4465k c4465k = new C4465k();
        m22072d(new C6434j(c4465k));
        return c4465k.m27777a();
    }

    /* renamed from: d */
    private void m22072d(InterfaceC6438m interfaceC6438m) {
        synchronized (this.f15531g) {
            this.f15536l.add(interfaceC6438m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m22059r(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.p.d r0 = r2.m22063n()
            boolean r1 = r0.m22006i()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 != 0) goto L22
            boolean r1 = r0.m22003l()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.n r3 = r2.f15528d     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            boolean r3 = r3.m22030f(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            com.google.firebase.installations.p.d r3 = r2.m22069g(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            goto L26
        L22:
            com.google.firebase.installations.p.d r3 = r2.m22054w(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
        L26:
            r2.m22060q(r3)
            r2.m22075A(r0, r3)
            boolean r0 = r3.m22004k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.mo22011d()
            r2.m22051z(r0)
        L39:
            boolean r0 = r3.m22006i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r0 = com.google.firebase.installations.FirebaseInstallationsException.EnumC6420a.BAD_CONFIG
            r3.<init>(r0)
            r2.m22053x(r3)
            goto L5e
        L4a:
            boolean r0 = r3.m22005j()
            if (r0 == 0) goto L5b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m22053x(r3)
            goto L5e
        L5b:
            r2.m22052y(r3)
        L5e:
            return
        L5f:
            r3 = move-exception
            r2.m22053x(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C6429g.m22059r(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m22057t(final boolean z) {
        AbstractC6447d m22062o = m22062o();
        if (z) {
            m22062o = m22062o.m21999p();
        }
        m22052y(m22062o);
        this.f15533i.execute(new Runnable() { // from class: com.google.firebase.installations.a
            @Override // java.lang.Runnable
            public final void run() {
                C6429g.this.m22059r(z);
            }
        });
    }

    /* renamed from: g */
    private AbstractC6447d m22069g(AbstractC6447d abstractC6447d) throws FirebaseInstallationsException {
        AbstractC6460f m21982e = this.f15526b.m21982e(m22068i(), abstractC6447d.mo22011d(), m22061p(), abstractC6447d.mo22009f());
        int i = C6431b.f15539b[m21982e.mo21948b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m22051z(null);
                    return abstractC6447d.m21997r();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6420a.UNAVAILABLE);
            }
            return abstractC6447d.m21998q("BAD CONFIG");
        }
        return abstractC6447d.m22000o(m21982e.mo21947c(), m21982e.mo21946d(), this.f15528d.m22034b());
    }

    /* renamed from: k */
    private synchronized String m22066k() {
        return this.f15534j;
    }

    /* renamed from: l */
    public static C6429g m22065l() {
        return m22064m(C5988g.m23092j());
    }

    /* renamed from: m */
    public static C6429g m22064m(C5988g c5988g) {
        s.b(c5988g != null, "Null is not a valid value of FirebaseApp.");
        return (C6429g) c5988g.m23095g(InterfaceC6432h.class);
    }

    /* renamed from: n */
    private AbstractC6447d m22063n() {
        AbstractC6447d m22015c;
        synchronized (f15523m) {
            C6428f m22077a = C6428f.m22077a(this.f15525a.m23093i(), "generatefid.lock");
            m22015c = this.f15527c.m22015c();
            if (m22077a != null) {
                m22077a.m22076b();
            }
        }
        return m22015c;
    }

    /* renamed from: o */
    private AbstractC6447d m22062o() {
        AbstractC6447d m22015c;
        synchronized (f15523m) {
            C6428f m22077a = C6428f.m22077a(this.f15525a.m23093i(), "generatefid.lock");
            m22015c = this.f15527c.m22015c();
            if (m22015c.m22005j()) {
                String m22055v = m22055v(m22015c);
                C6445c c6445c = this.f15527c;
                m22015c = m22015c.m21995t(m22055v);
                c6445c.m22017a(m22015c);
            }
            if (m22077a != null) {
                m22077a.m22076b();
            }
        }
        return m22015c;
    }

    /* renamed from: q */
    private void m22060q(AbstractC6447d abstractC6447d) {
        synchronized (f15523m) {
            C6428f m22077a = C6428f.m22077a(this.f15525a.m23093i(), "generatefid.lock");
            this.f15527c.m22017a(abstractC6447d);
            if (m22077a != null) {
                m22077a.m22076b();
            }
        }
    }

    /* renamed from: u */
    private void m22056u() {
        s.g(m22067j(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.g(m22061p(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.g(m22068i(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.b(C6439n.m22028h(m22067j()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        s.b(C6439n.m22029g(m22068i()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: v */
    private String m22055v(AbstractC6447d abstractC6447d) {
        if ((!this.f15525a.m23090l().equals("CHIME_ANDROID_SDK") && !this.f15525a.m23082t()) || !abstractC6447d.m22002m()) {
            return this.f15530f.m22040a();
        }
        String m22021f = this.f15529e.m22021f();
        return TextUtils.isEmpty(m22021f) ? this.f15530f.m22040a() : m22021f;
    }

    /* renamed from: w */
    private AbstractC6447d m22054w(AbstractC6447d abstractC6447d) throws FirebaseInstallationsException {
        AbstractC6456d m21983d = this.f15526b.m21983d(m22068i(), abstractC6447d.mo22011d(), m22061p(), m22067j(), (abstractC6447d.mo22011d() == null || abstractC6447d.mo22011d().length() != 11) ? null : this.f15529e.m22018i());
        int i = C6431b.f15538a[m21983d.mo21963e().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return abstractC6447d.m21998q("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.EnumC6420a.UNAVAILABLE);
        }
        return abstractC6447d.m21996s(m21983d.mo21965c(), m21983d.mo21964d(), this.f15528d.m22034b(), m21983d.mo21966b().mo21947c(), m21983d.mo21966b().mo21946d());
    }

    /* renamed from: x */
    private void m22053x(Exception exc) {
        synchronized (this.f15531g) {
            Iterator<InterfaceC6438m> it = this.f15536l.iterator();
            while (it.hasNext()) {
                if (it.next().mo22037a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: y */
    private void m22052y(AbstractC6447d abstractC6447d) {
        synchronized (this.f15531g) {
            Iterator<InterfaceC6438m> it = this.f15536l.iterator();
            while (it.hasNext()) {
                if (it.next().mo22036b(abstractC6447d)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: z */
    private synchronized void m22051z(String str) {
        this.f15534j = str;
    }

    @Override // com.google.firebase.installations.InterfaceC6432h
    /* renamed from: a */
    public com.google.android.gms.tasks.j<AbstractC6435k> mo22050a(final boolean z) {
        m22056u();
        com.google.android.gms.tasks.j<AbstractC6435k> m22074b = m22074b();
        this.f15532h.execute(new Runnable() { // from class: com.google.firebase.installations.b
            @Override // java.lang.Runnable
            public final void run() {
                C6429g.this.m22057t(z);
            }
        });
        return m22074b;
    }

    @Override // com.google.firebase.installations.InterfaceC6432h
    /* renamed from: h */
    public com.google.android.gms.tasks.j<String> mo22049h() {
        m22056u();
        String m22066k = m22066k();
        if (m22066k != null) {
            return C4469m.m27765f(m22066k);
        }
        com.google.android.gms.tasks.j<String> m22073c = m22073c();
        this.f15532h.execute(new Runnable() { // from class: com.google.firebase.installations.c
            @Override // java.lang.Runnable
            public final void run() {
                C6429g.this.m22058s();
            }
        });
        return m22073c;
    }

    /* renamed from: i */
    String m22068i() {
        return this.f15525a.m23089m().m23069b();
    }

    /* renamed from: j */
    String m22067j() {
        return this.f15525a.m23089m().m23068c();
    }

    /* renamed from: p */
    String m22061p() {
        return this.f15525a.m23089m().m23065f();
    }

    /* renamed from: s */
    public /* synthetic */ void m22058s() {
        m22057t(false);
    }

    C6429g(ExecutorService executorService, C5988g c5988g, C6455c c6455c, C6445c c6445c, C6439n c6439n, C6444b c6444b, C6437l c6437l) {
        this.f15531g = new Object();
        this.f15535k = new HashSet();
        this.f15536l = new ArrayList();
        this.f15525a = c5988g;
        this.f15526b = c6455c;
        this.f15527c = c6445c;
        this.f15528d = c6439n;
        this.f15529e = c6444b;
        this.f15530f = c6437l;
        this.f15532h = executorService;
        this.f15533i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f15524n);
    }
}
