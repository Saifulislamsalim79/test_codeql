package p425j.p444e.p469h0;

import j.e.c0.c;
import java.util.concurrent.atomic.AtomicReference;
import p425j.p444e.InterfaceC11278c;
import p425j.p444e.p451f0.p452a.EnumC11296c;
import p425j.p444e.p451f0.p467j.C11659f;
/* compiled from: DisposableCompletableObserver.java */
/* renamed from: j.e.h0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11673a implements InterfaceC11278c, c {

    /* renamed from: c */
    final AtomicReference<c> f26362c = new AtomicReference<>();

    /* renamed from: c */
    protected void m10617c() {
    }

    @Override // p425j.p444e.InterfaceC11278c
    /* renamed from: d */
    public final void mo10616d(c cVar) {
        if (C11659f.m10650c(this.f26362c, cVar, getClass())) {
            m10617c();
        }
    }

    /* renamed from: i */
    public final void m10615i() {
        EnumC11296c.m11156a(this.f26362c);
    }

    /* renamed from: j */
    public final boolean m10614j() {
        return this.f26362c.get() == EnumC11296c.DISPOSED;
    }
}
