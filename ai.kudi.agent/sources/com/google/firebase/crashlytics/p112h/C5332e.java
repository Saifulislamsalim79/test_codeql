package com.google.firebase.crashlytics.p112h;

import com.google.firebase.crashlytics.p112h.p117l.AbstractC5496c0;
import com.google.firebase.p170o.InterfaceC6558a;
import com.google.firebase.p170o.InterfaceC6560b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* renamed from: com.google.firebase.crashlytics.h.e */
/* loaded from: classes2.dex */
public final class C5332e implements InterfaceC5331d {

    /* renamed from: c */
    private static final InterfaceC5336g f13183c = new C5334b();

    /* renamed from: a */
    private final InterfaceC6558a<InterfaceC5331d> f13184a;

    /* renamed from: b */
    private final AtomicReference<InterfaceC5331d> f13185b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    /* renamed from: com.google.firebase.crashlytics.h.e$b */
    /* loaded from: classes2.dex */
    private static final class C5334b implements InterfaceC5336g {
        private C5334b() {
        }

        @Override // com.google.firebase.crashlytics.p112h.InterfaceC5336g
        /* renamed from: a */
        public File mo25095a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.p112h.InterfaceC5336g
        /* renamed from: b */
        public File mo25094b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.p112h.InterfaceC5336g
        /* renamed from: c */
        public File mo25093c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.p112h.InterfaceC5336g
        /* renamed from: d */
        public File mo25092d() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.p112h.InterfaceC5336g
        /* renamed from: e */
        public File mo25091e() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.p112h.InterfaceC5336g
        /* renamed from: f */
        public File mo25090f() {
            return null;
        }
    }

    public C5332e(InterfaceC6558a<InterfaceC5331d> interfaceC6558a) {
        this.f13184a = interfaceC6558a;
        interfaceC6558a.mo21639a(new InterfaceC6558a.InterfaceC6559a() { // from class: com.google.firebase.crashlytics.h.a
            @Override // com.google.firebase.p170o.InterfaceC6558a.InterfaceC6559a
            /* renamed from: a */
            public final void mo21638a(InterfaceC6560b interfaceC6560b) {
                C5332e.this.m25109g(interfaceC6560b);
            }
        });
    }

    @Override // com.google.firebase.crashlytics.p112h.InterfaceC5331d
    /* renamed from: a */
    public void mo25115a(final String str) {
        this.f13184a.mo21639a(new InterfaceC6558a.InterfaceC6559a() { // from class: com.google.firebase.crashlytics.h.b
            @Override // com.google.firebase.p170o.InterfaceC6558a.InterfaceC6559a
            /* renamed from: a */
            public final void mo21638a(InterfaceC6560b interfaceC6560b) {
                ((InterfaceC5331d) interfaceC6560b.get()).mo25115a(str);
            }
        });
    }

    @Override // com.google.firebase.crashlytics.p112h.InterfaceC5331d
    /* renamed from: b */
    public InterfaceC5336g mo25114b(String str) {
        InterfaceC5331d interfaceC5331d = this.f13185b.get();
        if (interfaceC5331d == null) {
            return f13183c;
        }
        return interfaceC5331d.mo25114b(str);
    }

    @Override // com.google.firebase.crashlytics.p112h.InterfaceC5331d
    /* renamed from: c */
    public boolean mo25113c() {
        InterfaceC5331d interfaceC5331d = this.f13185b.get();
        return interfaceC5331d != null && interfaceC5331d.mo25113c();
    }

    @Override // com.google.firebase.crashlytics.p112h.InterfaceC5331d
    /* renamed from: d */
    public void mo25112d(final String str, final String str2, final long j, final AbstractC5496c0 abstractC5496c0) {
        C5335f m25102f = C5335f.m25102f();
        m25102f.m25099i("Deferring native open session: " + str);
        this.f13184a.mo21639a(new InterfaceC6558a.InterfaceC6559a() { // from class: com.google.firebase.crashlytics.h.c
            @Override // com.google.firebase.p170o.InterfaceC6558a.InterfaceC6559a
            /* renamed from: a */
            public final void mo21638a(InterfaceC6560b interfaceC6560b) {
                ((InterfaceC5331d) interfaceC6560b.get()).mo25112d(str, str2, j, abstractC5496c0);
            }
        });
    }

    @Override // com.google.firebase.crashlytics.p112h.InterfaceC5331d
    /* renamed from: e */
    public boolean mo25111e(String str) {
        InterfaceC5331d interfaceC5331d = this.f13185b.get();
        return interfaceC5331d != null && interfaceC5331d.mo25111e(str);
    }

    /* renamed from: g */
    public /* synthetic */ void m25109g(InterfaceC6560b interfaceC6560b) {
        C5335f.m25102f().m25106b("Crashlytics native component now available.");
        this.f13185b.set((InterfaceC5331d) interfaceC6560b.get());
    }
}
