package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.q6 */
/* loaded from: classes2.dex */
public final class RunnableC4338q6 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ Bundle f10616c;

    /* renamed from: d */
    final /* synthetic */ C4245i7 f10617d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4338q6(C4245i7 c4245i7, Bundle bundle) {
        this.f10617d = c4245i7;
        this.f10616c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4245i7 c4245i7 = this.f10617d;
        Bundle bundle = this.f10616c;
        c4245i7.h();
        c4245i7.i();
        com.google.android.gms.common.internal.s.j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        com.google.android.gms.common.internal.s.f(string);
        com.google.android.gms.common.internal.s.f(string2);
        com.google.android.gms.common.internal.s.j(bundle.get("value"));
        if (!((v5) c4245i7).a.o()) {
            ((v5) c4245i7).a.b().v().m28014a("Conditional property not set since app measurement is disabled");
            return;
        }
        C4203ea c4203ea = new C4203ea(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C4379u w0 = ((v5) c4245i7).a.N().w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            ((v5) c4245i7).a.L().m27855s(new C4169c(bundle.getString("app_id"), string2, c4203ea, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), ((v5) c4245i7).a.N().w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), w0, bundle.getLong("time_to_live"), ((v5) c4245i7).a.N().w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
