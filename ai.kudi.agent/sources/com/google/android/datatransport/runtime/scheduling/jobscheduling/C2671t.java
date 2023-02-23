package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.AbstractC2635f;
import com.google.android.datatransport.runtime.backends.AbstractC2637g;
import com.google.android.datatransport.runtime.backends.InterfaceC2634e;
import com.google.android.datatransport.runtime.backends.InterfaceC2645m;
import com.google.android.datatransport.runtime.synchronization.InterfaceC2676a;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p272h.p286c.p287a.p288a.C8236b;
import p272h.p286c.p287a.p288a.p289i.AbstractC8342j;
import p272h.p286c.p287a.p288a.p289i.AbstractC8352p;
import p272h.p286c.p287a.p288a.p289i.C8341i;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.AbstractC8290p0;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8270h0;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8366a;
import p272h.p286c.p287a.p288a.p289i.p296x.p297a.C8370c;
import p272h.p286c.p287a.p288a.p289i.p298y.C8379a;
/* compiled from: Uploader.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.t */
/* loaded from: classes2.dex */
public class C2671t {

    /* renamed from: a */
    private final Context f7472a;

    /* renamed from: b */
    private final InterfaceC2634e f7473b;

    /* renamed from: c */
    private final InterfaceC8272i0 f7474c;

    /* renamed from: d */
    private final InterfaceC2675x f7475d;

    /* renamed from: e */
    private final Executor f7476e;

    /* renamed from: f */
    private final InterfaceC2676a f7477f;

    /* renamed from: g */
    private final InterfaceC8318a f7478g;

    /* renamed from: h */
    private final InterfaceC8318a f7479h;

    /* renamed from: i */
    private final InterfaceC8270h0 f7480i;

    public C2671t(Context context, InterfaceC2634e interfaceC2634e, InterfaceC8272i0 interfaceC8272i0, InterfaceC2675x interfaceC2675x, Executor executor, InterfaceC2676a interfaceC2676a, InterfaceC8318a interfaceC8318a, InterfaceC8318a interfaceC8318a2, InterfaceC8270h0 interfaceC8270h0) {
        this.f7472a = context;
        this.f7473b = interfaceC2634e;
        this.f7474c = interfaceC8272i0;
        this.f7475d = interfaceC2675x;
        this.f7476e = executor;
        this.f7477f = interfaceC2676a;
        this.f7478g = interfaceC8318a;
        this.f7479h = interfaceC8318a2;
        this.f7480i = interfaceC8270h0;
    }

    /* renamed from: a */
    boolean m32419a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f7472a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: b */
    public /* synthetic */ Boolean m32418b(AbstractC8352p abstractC8352p) {
        return Boolean.valueOf(this.f7474c.mo16365T0(abstractC8352p));
    }

    /* renamed from: c */
    public /* synthetic */ Iterable m32417c(AbstractC8352p abstractC8352p) {
        return this.f7474c.mo16371N(abstractC8352p);
    }

    /* renamed from: d */
    public /* synthetic */ Object m32416d(Iterable iterable, AbstractC8352p abstractC8352p, long j) {
        this.f7474c.mo16361V0(iterable);
        this.f7474c.mo16367Q(abstractC8352p, this.f7478g.mo16295a() + j);
        return null;
    }

    /* renamed from: e */
    public /* synthetic */ Object m32415e(Iterable iterable) {
        this.f7474c.mo16379H(iterable);
        return null;
    }

    /* renamed from: f */
    public /* synthetic */ Object m32414f(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f7480i.mo16338m(((Integer) entry.getValue()).intValue(), C8370c.EnumC8372b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* renamed from: g */
    public /* synthetic */ Object m32413g(AbstractC8352p abstractC8352p, long j) {
        this.f7474c.mo16367Q(abstractC8352p, this.f7478g.mo16295a() + j);
        return null;
    }

    /* renamed from: h */
    public /* synthetic */ Object m32412h(AbstractC8352p abstractC8352p, int i) {
        this.f7475d.mo32399a(abstractC8352p, i + 1);
        return null;
    }

    /* renamed from: i */
    public /* synthetic */ void m32411i(final AbstractC8352p abstractC8352p, final int i, Runnable runnable) {
        try {
            try {
                InterfaceC2676a interfaceC2676a = this.f7477f;
                final InterfaceC8272i0 interfaceC8272i0 = this.f7474c;
                Objects.requireNonNull(interfaceC8272i0);
                interfaceC2676a.mo16354c(new InterfaceC2676a.InterfaceC2677a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC2676a.InterfaceC2677a
                    public final Object execute() {
                        return Integer.valueOf(InterfaceC8272i0.this.mo16381G());
                    }
                });
                if (!m32419a()) {
                    this.f7477f.mo16354c(new InterfaceC2676a.InterfaceC2677a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.e
                        @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC2676a.InterfaceC2677a
                        public final Object execute() {
                            return C2671t.this.m32412h(abstractC8352p, i);
                        }
                    });
                } else {
                    m32410j(abstractC8352p, i);
                }
            } catch (SynchronizationException unused) {
                this.f7475d.mo32399a(abstractC8352p, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: j */
    void m32410j(final AbstractC8352p abstractC8352p, int i) {
        AbstractC2637g mo32447a;
        InterfaceC2645m mo32455b = this.f7473b.mo32455b(abstractC8352p.mo16241b());
        long j = 0;
        while (true) {
            final long j2 = j;
            while (((Boolean) this.f7477f.mo16354c(new InterfaceC2676a.InterfaceC2677a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
                @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC2676a.InterfaceC2677a
                public final Object execute() {
                    return C2671t.this.m32418b(abstractC8352p);
                }
            })).booleanValue()) {
                final Iterable<AbstractC8290p0> iterable = (Iterable) this.f7477f.mo16354c(new InterfaceC2676a.InterfaceC2677a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.k
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC2676a.InterfaceC2677a
                    public final Object execute() {
                        return C2671t.this.m32417c(abstractC8352p);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                if (mo32455b == null) {
                    C8379a.m16167a("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC8352p);
                    mo32447a = AbstractC2637g.m32470a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC8290p0 abstractC8290p0 : iterable) {
                        arrayList.add(abstractC8290p0.mo16390b());
                    }
                    if (abstractC8352p.m16238e()) {
                        InterfaceC2676a interfaceC2676a = this.f7477f;
                        final InterfaceC8270h0 interfaceC8270h0 = this.f7480i;
                        Objects.requireNonNull(interfaceC8270h0);
                        AbstractC8342j.AbstractC8343a m16285a = AbstractC8342j.m16285a();
                        m16285a.mo16265i(this.f7478g.mo16295a());
                        m16285a.mo16263k(this.f7479h.mo16295a());
                        m16285a.mo16264j("GDT_CLIENT_METRICS");
                        m16285a.mo16266h(new C8341i(C8236b.m16444b("proto"), ((C8366a) interfaceC2676a.mo16354c(new InterfaceC2676a.InterfaceC2677a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.a
                            @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC2676a.InterfaceC2677a
                            public final Object execute() {
                                return InterfaceC8270h0.this.mo16348g();
                            }
                        })).m16202f()));
                        arrayList.add(mo32455b.mo32446b(m16285a.mo16270d()));
                    }
                    AbstractC2635f.AbstractC2636a m32476a = AbstractC2635f.m32476a();
                    m32476a.mo32472b(arrayList);
                    m32476a.mo32471c(abstractC8352p.mo16240c());
                    mo32447a = mo32455b.mo32447a(m32476a.mo32473a());
                }
                if (mo32447a.mo32468c() == AbstractC2637g.EnumC2638a.TRANSIENT_ERROR) {
                    this.f7477f.mo16354c(new InterfaceC2676a.InterfaceC2677a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
                        @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC2676a.InterfaceC2677a
                        public final Object execute() {
                            return C2671t.this.m32416d(iterable, abstractC8352p, j2);
                        }
                    });
                    this.f7475d.mo32398b(abstractC8352p, i + 1, true);
                    return;
                }
                this.f7477f.mo16354c(new InterfaceC2676a.InterfaceC2677a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC2676a.InterfaceC2677a
                    public final Object execute() {
                        return C2671t.this.m32415e(iterable);
                    }
                });
                if (mo32447a.mo32468c() == AbstractC2637g.EnumC2638a.OK) {
                    break;
                } else if (mo32447a.mo32468c() == AbstractC2637g.EnumC2638a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (AbstractC8290p0 abstractC8290p02 : iterable) {
                        String mo16276j = abstractC8290p02.mo16390b().mo16276j();
                        if (!hashMap.containsKey(mo16276j)) {
                            hashMap.put(mo16276j, 1);
                        } else {
                            hashMap.put(mo16276j, Integer.valueOf(((Integer) hashMap.get(mo16276j)).intValue() + 1));
                        }
                    }
                    this.f7477f.mo16354c(new InterfaceC2676a.InterfaceC2677a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.j
                        @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC2676a.InterfaceC2677a
                        public final Object execute() {
                            return C2671t.this.m32414f(hashMap);
                        }
                    });
                }
            }
            this.f7477f.mo16354c(new InterfaceC2676a.InterfaceC2677a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.l
                @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC2676a.InterfaceC2677a
                public final Object execute() {
                    return C2671t.this.m32413g(abstractC8352p, j2);
                }
            });
            return;
            j = Math.max(j2, mo32447a.mo32469b());
        }
    }

    /* renamed from: k */
    public void m32409k(final AbstractC8352p abstractC8352p, final int i, final Runnable runnable) {
        this.f7476e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
            @Override // java.lang.Runnable
            public final void run() {
                C2671t.this.m32411i(abstractC8352p, i, runnable);
            }
        });
    }
}
