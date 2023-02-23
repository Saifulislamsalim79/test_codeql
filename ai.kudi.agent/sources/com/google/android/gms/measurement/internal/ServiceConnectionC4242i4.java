package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractC3980s0;
import com.google.android.gms.internal.measurement.InterfaceC3996t0;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.i4 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC4242i4 implements ServiceConnection {

    /* renamed from: a */
    private final String f10363a;

    /* renamed from: b */
    final /* synthetic */ C4253j4 f10364b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC4242i4(C4253j4 c4253j4, String str) {
        this.f10364b = c4253j4;
        this.f10363a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                InterfaceC3996t0 m28986n = AbstractC3980s0.m28986n(iBinder);
                if (m28986n == null) {
                    this.f10364b.f10394a.b().w().m28014a("Install Referrer Service implementation was not found");
                    return;
                }
                this.f10364b.f10394a.b().v().m28014a("Install Referrer Service connected");
                this.f10364b.f10394a.a().m27810z(new RunnableC4230h4(this, m28986n, this));
                return;
            } catch (RuntimeException e) {
                this.f10364b.f10394a.b().w().m28013b("Exception occurred while calling Install Referrer API", e);
                return;
            }
        }
        this.f10364b.f10394a.b().w().m28014a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f10364b.f10394a.b().v().m28014a("Install Referrer Service disconnected");
    }
}
