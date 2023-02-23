package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C4277l4;
import com.google.android.gms.measurement.internal.InterfaceC4265k4;
import p201g.p252n.p253a.AbstractC7808a;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends AbstractC7808a implements InterfaceC4265k4 {

    /* renamed from: c */
    private C4277l4 f9932c;

    @Override // com.google.android.gms.measurement.internal.InterfaceC4265k4
    /* renamed from: a */
    public void mo28056a(Context context, Intent intent) {
        AbstractC7808a.m17255c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f9932c == null) {
            this.f9932c = new C4277l4(this);
        }
        this.f9932c.m28042a(context, intent);
    }
}
