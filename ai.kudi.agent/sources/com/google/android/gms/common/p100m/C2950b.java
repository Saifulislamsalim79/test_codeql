package com.google.android.gms.common.p100m;

import com.google.android.gms.common.p100m.C2948a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p272h.p286c.p287a.p300b.p307d.p312e.C8430h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.m.b */
/* loaded from: classes2.dex */
public final class C2950b implements C2948a.InterfaceC2949a {
    @Override // com.google.android.gms.common.p100m.C2948a.InterfaceC2949a
    /* renamed from: a */
    public final ScheduledExecutorService mo31569a() {
        C8430h.m16105a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
