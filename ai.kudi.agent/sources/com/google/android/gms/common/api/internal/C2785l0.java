package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.l0 */
/* loaded from: classes2.dex */
public final class C2785l0 extends BroadcastReceiver {

    /* renamed from: a */
    Context f7821a;

    /* renamed from: b */
    private final AbstractC2783k0 f7822b;

    public C2785l0(AbstractC2783k0 abstractC2783k0) {
        this.f7822b = abstractC2783k0;
    }

    /* renamed from: a */
    public final void m31954a(Context context) {
        this.f7821a = context;
    }

    /* renamed from: b */
    public final synchronized void m31953b() {
        Context context = this.f7821a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f7821a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f7822b.mo31955a();
            m31953b();
        }
    }
}
