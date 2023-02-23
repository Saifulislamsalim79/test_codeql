package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C3919o1;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.l4 */
/* loaded from: classes2.dex */
public final class C4277l4 {

    /* renamed from: a */
    private final InterfaceC4265k4 f10446a;

    public C4277l4(InterfaceC4265k4 interfaceC4265k4) {
        com.google.android.gms.common.internal.s.j(interfaceC4265k4);
        this.f10446a = interfaceC4265k4;
    }

    /* renamed from: a */
    public final void m28042a(Context context, Intent intent) {
        b5 H = b5.H(context, (C3919o1) null, (Long) null);
        q3 b = H.b();
        if (intent == null) {
            b.w().m28014a("Receiver called with null intent");
            return;
        }
        H.d();
        String action = intent.getAction();
        b.v().m28013b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            b.v().m28014a("Starting wakeful intent.");
            this.f10446a.mo28056a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            b.w().m28014a("Install Referrer Broadcasts are deprecated");
        }
    }
}
