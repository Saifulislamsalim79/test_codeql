package com.google.firebase.database.p131s.p134i0;
/* compiled from: OffsetClock.java */
/* renamed from: com.google.firebase.database.s.i0.f */
/* loaded from: classes2.dex */
public class C5784f implements InterfaceC5773a {

    /* renamed from: a */
    private final InterfaceC5773a f14213a;

    /* renamed from: b */
    private long f14214b;

    public C5784f(InterfaceC5773a interfaceC5773a, long j) {
        this.f14214b = 0L;
        this.f14213a = interfaceC5773a;
        this.f14214b = j;
    }

    @Override // com.google.firebase.database.p131s.p134i0.InterfaceC5773a
    /* renamed from: a */
    public long mo23772a() {
        return this.f14213a.mo23772a() + this.f14214b;
    }

    /* renamed from: b */
    public void m23771b(long j) {
        this.f14214b = j;
    }
}
