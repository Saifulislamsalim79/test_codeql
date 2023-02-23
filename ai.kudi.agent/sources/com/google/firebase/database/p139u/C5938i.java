package com.google.firebase.database.p139u;

import com.google.android.gms.common.internal.C2906q;
import com.google.firebase.database.p128q.C5657e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: IndexedNode.java */
/* renamed from: com.google.firebase.database.u.i */
/* loaded from: classes2.dex */
public class C5938i implements Iterable<C5944m> {

    /* renamed from: f */
    private static final C5657e<C5944m> f14572f = new C5657e<>(Collections.emptyList(), null);

    /* renamed from: c */
    private final InterfaceC5945n f14573c;

    /* renamed from: d */
    private C5657e<C5944m> f14574d;

    /* renamed from: e */
    private final AbstractC5937h f14575e;

    private C5938i(InterfaceC5945n interfaceC5945n, AbstractC5937h abstractC5937h) {
        this.f14575e = abstractC5937h;
        this.f14573c = interfaceC5945n;
        this.f14574d = null;
    }

    /* renamed from: d */
    private void m23241d() {
        if (this.f14574d == null) {
            if (this.f14575e.equals(C5939j.m23231j())) {
                this.f14574d = f14572f;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C5944m c5944m : this.f14573c) {
                z = z || this.f14575e.mo23188e(c5944m.m23221d());
                arrayList.add(new C5944m(c5944m.m23222c(), c5944m.m23221d()));
            }
            if (z) {
                this.f14574d = new C5657e<>(arrayList, this.f14575e);
            } else {
                this.f14574d = f14572f;
            }
        }
    }

    /* renamed from: e */
    public static C5938i m23240e(InterfaceC5945n interfaceC5945n) {
        return new C5938i(interfaceC5945n, C5950q.m23202j());
    }

    /* renamed from: f */
    public static C5938i m23239f(InterfaceC5945n interfaceC5945n, AbstractC5937h abstractC5937h) {
        return new C5938i(interfaceC5945n, abstractC5937h);
    }

    /* renamed from: E */
    public C5938i m23243E(InterfaceC5945n interfaceC5945n) {
        return new C5938i(this.f14573c.mo23195D(interfaceC5945n), this.f14575e, this.f14574d);
    }

    /* renamed from: a0 */
    public Iterator<C5944m> m23242a0() {
        m23241d();
        if (C2906q.m31701a(this.f14574d, f14572f)) {
            return this.f14573c.mo23214a0();
        }
        return this.f14574d.m24240a0();
    }

    /* renamed from: h */
    public C5944m m23238h() {
        if (this.f14573c instanceof C5924c) {
            m23241d();
            if (C2906q.m31701a(this.f14574d, f14572f)) {
                C5921b m23288I = ((C5924c) this.f14573c).m23288I();
                return new C5944m(m23288I, this.f14573c.mo23211L(m23288I));
            }
            return this.f14574d.m24238e();
        }
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<C5944m> iterator() {
        m23241d();
        if (C2906q.m31701a(this.f14574d, f14572f)) {
            return this.f14573c.iterator();
        }
        return this.f14574d.iterator();
    }

    /* renamed from: k */
    public C5944m m23237k() {
        if (this.f14573c instanceof C5924c) {
            m23241d();
            if (C2906q.m31701a(this.f14574d, f14572f)) {
                C5921b m23287J = ((C5924c) this.f14573c).m23287J();
                return new C5944m(m23287J, this.f14573c.mo23211L(m23287J));
            }
            return this.f14574d.m24239d();
        }
        return null;
    }

    /* renamed from: l */
    public InterfaceC5945n m23236l() {
        return this.f14573c;
    }

    /* renamed from: m */
    public C5921b m23235m(C5921b c5921b, InterfaceC5945n interfaceC5945n, AbstractC5937h abstractC5937h) {
        if (!this.f14575e.equals(C5939j.m23231j()) && !this.f14575e.equals(abstractC5937h)) {
            throw new IllegalArgumentException("Index not available in IndexedNode!");
        }
        m23241d();
        if (C2906q.m31701a(this.f14574d, f14572f)) {
            return this.f14573c.mo23219G(c5921b);
        }
        C5944m m24237f = this.f14574d.m24237f(new C5944m(c5921b, interfaceC5945n));
        if (m24237f != null) {
            return m24237f.m23222c();
        }
        return null;
    }

    /* renamed from: s */
    public boolean m23234s(AbstractC5937h abstractC5937h) {
        return this.f14575e == abstractC5937h;
    }

    /* renamed from: u */
    public C5938i m23233u(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
        InterfaceC5945n mo23216T = this.f14573c.mo23216T(c5921b, interfaceC5945n);
        if (C2906q.m31701a(this.f14574d, f14572f) && !this.f14575e.mo23188e(interfaceC5945n)) {
            return new C5938i(mo23216T, this.f14575e, f14572f);
        }
        C5657e<C5944m> c5657e = this.f14574d;
        if (c5657e != null && !C2906q.m31701a(c5657e, f14572f)) {
            C5657e<C5944m> m24235k = this.f14574d.m24235k(new C5944m(c5921b, this.f14573c.mo23211L(c5921b)));
            if (!interfaceC5945n.isEmpty()) {
                m24235k = m24235k.m24236h(new C5944m(c5921b, interfaceC5945n));
            }
            return new C5938i(mo23216T, this.f14575e, m24235k);
        }
        return new C5938i(mo23216T, this.f14575e, null);
    }

    private C5938i(InterfaceC5945n interfaceC5945n, AbstractC5937h abstractC5937h, C5657e<C5944m> c5657e) {
        this.f14575e = abstractC5937h;
        this.f14573c = interfaceC5945n;
        this.f14574d = c5657e;
    }
}
