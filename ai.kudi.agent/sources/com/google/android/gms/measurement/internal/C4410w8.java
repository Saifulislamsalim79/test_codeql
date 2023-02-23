package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.C2838h;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.p101n.C2951a;
import com.google.android.gms.internal.measurement.InterfaceC3824i1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.w8 */
/* loaded from: classes2.dex */
public final class C4410w8 extends f4 {

    /* renamed from: c */
    private final ServiceConnectionC4399v8 f10771c;

    /* renamed from: d */
    private InterfaceC4219g3 f10772d;

    /* renamed from: e */
    private volatile Boolean f10773e;

    /* renamed from: f */
    private final AbstractC4296n f10774f;

    /* renamed from: g */
    private final C4306n9 f10775g;

    /* renamed from: h */
    private final List<Runnable> f10776h;

    /* renamed from: i */
    private final AbstractC4296n f10777i;

    protected C4410w8(b5 b5Var) {
        super(b5Var);
        this.f10776h = new ArrayList();
        this.f10775g = new C4306n9(b5Var.c());
        this.f10771c = new ServiceConnectionC4399v8(this);
        this.f10774f = new C4212f8(this, b5Var);
        this.f10777i = new C4246i8(this, b5Var);
    }

    /* renamed from: C */
    private final C4307na m27881C(boolean z) {
        Pair<String, Long> m28307a;
        ((v5) this).a.d();
        h3 B = ((v5) this).a.B();
        String str = null;
        if (z) {
            q3 b = ((v5) this).a.b();
            if (((v5) b).a.F().d != null && (m28307a = ((v5) b).a.F().d.m28307a()) != null && m28307a != g4.x) {
                String valueOf = String.valueOf(m28307a.second);
                String str2 = (String) m28307a.first;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str2);
                str = sb.toString();
            }
        }
        return B.q(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m27880D() {
        h();
        ((v5) this).a.b().v().m28013b("Processing queued up service tasks", Integer.valueOf(this.f10776h.size()));
        for (Runnable runnable : this.f10776h) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                ((v5) this).a.b().r().m28013b("Task exception while flushing queue", e);
            }
        }
        this.f10776h.clear();
        this.f10777i.m28027b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final void m27879E() {
        h();
        this.f10775g.m28022b();
        AbstractC4296n abstractC4296n = this.f10774f;
        ((v5) this).a.z();
        abstractC4296n.m28026d(C4173c3.f10098J.m28406a(null).longValue());
    }

    /* renamed from: F */
    private final void m27878F(Runnable runnable) throws IllegalStateException {
        h();
        if (m27848z()) {
            runnable.run();
            return;
        }
        int size = this.f10776h.size();
        ((v5) this).a.z();
        if (size >= 1000) {
            ((v5) this).a.b().r().m28014a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f10776h.add(runnable);
        this.f10777i.m28026d(60000L);
        m27868P();
    }

    /* renamed from: G */
    private final boolean m27877G() {
        ((v5) this).a.d();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static /* bridge */ /* synthetic */ void m27871M(C4410w8 c4410w8, ComponentName componentName) {
        c4410w8.h();
        if (c4410w8.f10772d != null) {
            c4410w8.f10772d = null;
            ((v5) c4410w8).a.b().v().m28013b("Disconnected from device MeasurementService", componentName);
            c4410w8.h();
            c4410w8.m27868P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean m27883A() {
        h();
        i();
        return !m27882B() || ((v5) this).a.N().o0() >= C4173c3.f10142n0.m28406a(null).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012b  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m27882B() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4410w8.m27882B():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final Boolean m27874J() {
        return this.f10773e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public final void m27869O() {
        h();
        i();
        C4307na m27881C = m27881C(true);
        ((v5) this).a.C().m28114r();
        m27878F(new RunnableC4178c8(this, m27881C));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final void m27868P() {
        h();
        i();
        if (m27848z()) {
            return;
        }
        if (!m27882B()) {
            if (((v5) this).a.z().G()) {
                return;
            }
            ((v5) this).a.d();
            List<ResolveInfo> queryIntentServices = ((v5) this).a.f().getPackageManager().queryIntentServices(new Intent().setClassName(((v5) this).a.f(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context f = ((v5) this).a.f();
                ((v5) this).a.d();
                intent.setComponent(new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f10771c.m27919b(intent);
                return;
            }
            ((v5) this).a.b().r().m28014a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        this.f10771c.m27918c();
    }

    /* renamed from: Q */
    public final void m27867Q() {
        h();
        i();
        this.f10771c.m27917d();
        try {
            C2951a.m31567b().m31566c(((v5) this).a.f(), this.f10771c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f10772d = null;
    }

    /* renamed from: R */
    public final void m27866R(InterfaceC3824i1 interfaceC3824i1) {
        h();
        i();
        m27878F(new RunnableC4166b8(this, m27881C(false), interfaceC3824i1));
    }

    /* renamed from: S */
    public final void m27865S(AtomicReference<String> atomicReference) {
        h();
        i();
        m27878F(new RunnableC4155a8(this, atomicReference, m27881C(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: T */
    public final void m27864T(InterfaceC3824i1 interfaceC3824i1, String str, String str2) {
        h();
        i();
        m27878F(new RunnableC4317o8(this, str, str2, m27881C(false), interfaceC3824i1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public final void m27863U(AtomicReference<List<C4169c>> atomicReference, String str, String str2, String str3) {
        h();
        i();
        m27878F(new RunnableC4305n8(this, atomicReference, null, str2, str3, m27881C(false)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public final void m27862V(InterfaceC3824i1 interfaceC3824i1, String str, String str2, boolean z) {
        h();
        i();
        m27878F(new RunnableC4420x7(this, str, str2, m27881C(false), z, interfaceC3824i1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W */
    public final void m27861W(AtomicReference<List<C4203ea>> atomicReference, String str, String str2, String str3, boolean z) {
        h();
        i();
        m27878F(new RunnableC4329p8(this, atomicReference, null, str2, str3, m27881C(false), z));
    }

    /* renamed from: n */
    protected final boolean m27860n() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final void m27859o(C4379u c4379u, String str) {
        com.google.android.gms.common.internal.s.j(c4379u);
        h();
        i();
        m27877G();
        m27878F(new RunnableC4281l8(this, true, m27881C(true), ((v5) this).a.C().m28110v(c4379u), c4379u, str));
    }

    /* renamed from: p */
    public final void m27858p(InterfaceC3824i1 interfaceC3824i1, C4379u c4379u, String str) {
        h();
        i();
        if (((v5) this).a.N().p0((int) C2838h.f7921a) != 0) {
            ((v5) this).a.b().w().m28014a("Not bundling data. Service unavailable or out of date");
            ((v5) this).a.N().F(interfaceC3824i1, new byte[0]);
            return;
        }
        m27878F(new RunnableC4223g8(this, c4379u, str, interfaceC3824i1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public final void m27857q() {
        h();
        i();
        C4307na m27881C = m27881C(false);
        m27877G();
        ((v5) this).a.C().m28115q();
        m27878F(new RunnableC4443z7(this, m27881C));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m27856r(InterfaceC4219g3 interfaceC4219g3, AbstractC2916a abstractC2916a, C4307na c4307na) {
        int i;
        h();
        i();
        m27877G();
        ((v5) this).a.z();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List<AbstractC2916a> m28116p = ((v5) this).a.C().m28116p(100);
            if (m28116p != null) {
                arrayList.addAll(m28116p);
                i = m28116p.size();
            } else {
                i = 0;
            }
            if (abstractC2916a != null && i < 100) {
                arrayList.add(abstractC2916a);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC2916a abstractC2916a2 = (AbstractC2916a) arrayList.get(i4);
                if (abstractC2916a2 instanceof C4379u) {
                    try {
                        interfaceC4219g3.mo27931t0((C4379u) abstractC2916a2, c4307na);
                    } catch (RemoteException e) {
                        ((v5) this).a.b().r().m28013b("Failed to send event to the service", e);
                    }
                } else if (abstractC2916a2 instanceof C4203ea) {
                    try {
                        interfaceC4219g3.mo27942c1((C4203ea) abstractC2916a2, c4307na);
                    } catch (RemoteException e2) {
                        ((v5) this).a.b().r().m28013b("Failed to send user property to the service", e2);
                    }
                } else if (abstractC2916a2 instanceof C4169c) {
                    try {
                        interfaceC4219g3.mo27928v((C4169c) abstractC2916a2, c4307na);
                    } catch (RemoteException e3) {
                        ((v5) this).a.b().r().m28013b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    ((v5) this).a.b().r().m28014a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final void m27855s(C4169c c4169c) {
        com.google.android.gms.common.internal.s.j(c4169c);
        h();
        i();
        ((v5) this).a.d();
        m27878F(new RunnableC4293m8(this, true, m27881C(true), ((v5) this).a.C().m28111u(c4169c), new C4169c(c4169c), c4169c));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final void m27854t(boolean z) {
        h();
        i();
        if (z) {
            m27877G();
            ((v5) this).a.C().m28115q();
        }
        if (m27883A()) {
            m27878F(new RunnableC4269k8(this, m27881C(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final void m27853u(C4328p7 c4328p7) {
        h();
        i();
        m27878F(new RunnableC4190d8(this, c4328p7));
    }

    /* renamed from: v */
    public final void m27852v(Bundle bundle) {
        h();
        i();
        m27878F(new RunnableC4201e8(this, m27881C(false), bundle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final void m27851w() {
        h();
        i();
        m27878F(new RunnableC4257j8(this, m27881C(true)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final void m27850x(InterfaceC4219g3 interfaceC4219g3) {
        h();
        com.google.android.gms.common.internal.s.j(interfaceC4219g3);
        this.f10772d = interfaceC4219g3;
        m27879E();
        m27880D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final void m27849y(C4203ea c4203ea) {
        h();
        i();
        m27877G();
        m27878F(new RunnableC4432y7(this, m27881C(true), ((v5) this).a.C().m28109w(c4203ea), c4203ea));
    }

    /* renamed from: z */
    public final boolean m27848z() {
        h();
        i();
        return this.f10772d != null;
    }
}
