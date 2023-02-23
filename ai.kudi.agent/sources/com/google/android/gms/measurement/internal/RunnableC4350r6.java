package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.r6 */
/* loaded from: classes2.dex */
public final class RunnableC4350r6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ Bundle f10638c;

    /* renamed from: d */
    final /* synthetic */ C4245i7 f10639d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4350r6(C4245i7 c4245i7, Bundle bundle) {
        this.f10639d = c4245i7;
        this.f10638c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4245i7 c4245i7 = this.f10639d;
        Bundle bundle = this.f10638c;
        c4245i7.h();
        c4245i7.i();
        com.google.android.gms.common.internal.s.j(bundle);
        String string = bundle.getString("name");
        com.google.android.gms.common.internal.s.f(string);
        if (!((v5) c4245i7).a.o()) {
            ((v5) c4245i7).a.b().v().m28014a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            ((v5) c4245i7).a.L().m27855s(new C4169c(bundle.getString("app_id"), "", new C4203ea(string, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), ((v5) c4245i7).a.N().w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
