package com.google.firebase.database.p131s;

import com.google.firebase.database.C5611c;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.C5803c;
import com.google.firebase.database.p131s.p136j0.C5804d;
import com.google.firebase.database.p131s.p136j0.C5814i;
import com.google.firebase.database.p131s.p136j0.InterfaceC5805e;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: EventRegistration.java */
/* renamed from: com.google.firebase.database.s.i */
/* loaded from: classes2.dex */
public abstract class AbstractC5772i {

    /* renamed from: b */
    private InterfaceC5800j f14201b;

    /* renamed from: a */
    private AtomicBoolean f14200a = new AtomicBoolean(false);

    /* renamed from: c */
    private boolean f14202c = false;

    /* renamed from: a */
    public abstract AbstractC5772i mo23812a(C5814i c5814i);

    /* renamed from: b */
    public abstract C5804d mo23811b(C5803c c5803c, C5814i c5814i);

    /* renamed from: c */
    public abstract void mo23810c(C5611c c5611c);

    /* renamed from: d */
    public abstract void mo23809d(C5804d c5804d);

    /* renamed from: e */
    public abstract C5814i mo23808e();

    /* renamed from: f */
    public abstract boolean mo23807f(AbstractC5772i abstractC5772i);

    /* renamed from: g */
    public boolean m23806g() {
        return this.f14202c;
    }

    /* renamed from: h */
    public boolean m23805h() {
        return this.f14200a.get();
    }

    /* renamed from: i */
    public abstract boolean mo23804i(InterfaceC5805e.EnumC5806a enumC5806a);

    /* renamed from: j */
    public void m23803j(boolean z) {
        this.f14202c = z;
    }

    /* renamed from: k */
    public void m23802k(InterfaceC5800j interfaceC5800j) {
        C5795m.m23745f(!m23805h());
        C5795m.m23745f(this.f14201b == null);
        this.f14201b = interfaceC5800j;
    }

    /* renamed from: l */
    public void m23801l() {
        InterfaceC5800j interfaceC5800j;
        if (!this.f14200a.compareAndSet(false, true) || (interfaceC5800j = this.f14201b) == null) {
            return;
        }
        interfaceC5800j.mo23696a(this);
        this.f14201b = null;
    }
}
