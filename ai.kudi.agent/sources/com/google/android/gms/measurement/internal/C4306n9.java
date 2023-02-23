package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.InterfaceC2967e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.n9 */
/* loaded from: classes2.dex */
public final class C4306n9 {

    /* renamed from: a */
    private final InterfaceC2967e f10513a;

    /* renamed from: b */
    private long f10514b;

    public C4306n9(InterfaceC2967e interfaceC2967e) {
        com.google.android.gms.common.internal.s.j(interfaceC2967e);
        this.f10513a = interfaceC2967e;
    }

    /* renamed from: a */
    public final void m28023a() {
        this.f10514b = 0L;
    }

    /* renamed from: b */
    public final void m28022b() {
        this.f10514b = this.f10513a.mo31535a();
    }

    /* renamed from: c */
    public final boolean m28021c(long j) {
        return this.f10514b == 0 || this.f10513a.mo31535a() - this.f10514b >= 3600000;
    }
}
