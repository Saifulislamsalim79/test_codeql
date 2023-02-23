package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.c1 */
/* loaded from: classes2.dex */
public final class C3731c1 {

    /* renamed from: a */
    final C3951q3 f9215a;

    /* renamed from: b */
    C3968r4 f9216b;

    /* renamed from: c */
    final C3729c f9217c;

    /* renamed from: d */
    private final C3712af f9218d;

    public C3731c1() {
        C3951q3 c3951q3 = new C3951q3();
        this.f9215a = c3951q3;
        this.f9216b = c3951q3.f9626b.m29052a();
        this.f9217c = new C3729c();
        this.f9218d = new C3712af();
        C3951q3 c3951q32 = this.f9215a;
        c3951q32.f9628d.m29083a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C3731c1.this.m29729b();
            }
        });
        C3951q3 c3951q33 = this.f9215a;
        c3951q33.f9628d.m29083a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C3926o8(C3731c1.this.f9217c);
            }
        });
    }

    /* renamed from: a */
    public final C3729c m29730a() {
        return this.f9217c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ AbstractC3838j m29729b() throws Exception {
        return new C4058we(this.f9218d);
    }

    /* renamed from: c */
    public final void m29728c(C3796g5 c3796g5) throws zzd {
        AbstractC3838j abstractC3838j;
        try {
            this.f9216b = this.f9215a.f9626b.m29052a();
            if (!(this.f9215a.m29084a(this.f9216b, (C3860k5[]) c3796g5.m29587y().toArray(new C3860k5[0])) instanceof C3806h)) {
                for (C3766e5 c3766e5 : c3796g5.m29589w().m29717z()) {
                    List<C3860k5> m29654y = c3766e5.m29654y();
                    String m29655x = c3766e5.m29655x();
                    Iterator<C3860k5> it = m29654y.iterator();
                    while (it.hasNext()) {
                        q m29084a = this.f9215a.m29084a(this.f9216b, it.next());
                        if (m29084a instanceof C3901n) {
                            C3968r4 c3968r4 = this.f9216b;
                            if (c3968r4.m29045h(m29655x)) {
                                q m29049d = c3968r4.m29049d(m29655x);
                                if (!(m29049d instanceof AbstractC3838j)) {
                                    String valueOf = String.valueOf(m29655x);
                                    throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                                }
                                abstractC3838j = (AbstractC3838j) m29049d;
                            } else {
                                abstractC3838j = null;
                            }
                            if (abstractC3838j == null) {
                                String valueOf2 = String.valueOf(m29655x);
                                throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                            }
                            abstractC3838j.mo28520a(this.f9216b, Collections.singletonList(m29084a));
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: d */
    public final void m29727d(String str, Callable<? extends AbstractC3838j> callable) {
        this.f9215a.f9628d.m29083a(str, callable);
    }

    /* renamed from: e */
    public final boolean m29726e(C3713b c3713b) throws zzd {
        try {
            this.f9217c.m29733d(c3713b);
            this.f9215a.f9627c.m29046g("runtime.counter", new C3822i(Double.valueOf(0.0d)));
            this.f9218d.m29840b(this.f9216b.m29052a(), this.f9217c);
            if (m29724g()) {
                return true;
            }
            return m29725f();
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: f */
    public final boolean m29725f() {
        return !this.f9217c.m29734c().isEmpty();
    }

    /* renamed from: g */
    public final boolean m29724g() {
        return !this.f9217c.m29735b().equals(this.f9217c.m29736a());
    }
}
