package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC3996t0;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.h4 */
/* loaded from: classes2.dex */
final class RunnableC4230h4 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ InterfaceC3996t0 f10328c;

    /* renamed from: d */
    final /* synthetic */ ServiceConnection f10329d;

    /* renamed from: e */
    final /* synthetic */ ServiceConnectionC4242i4 f10330e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4230h4(ServiceConnectionC4242i4 serviceConnectionC4242i4, InterfaceC3996t0 interfaceC3996t0, ServiceConnection serviceConnection) {
        this.f10330e = serviceConnectionC4242i4;
        this.f10328c = interfaceC3996t0;
        this.f10329d = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ServiceConnectionC4242i4 serviceConnectionC4242i4 = this.f10330e;
        C4253j4 c4253j4 = serviceConnectionC4242i4.f10364b;
        str = serviceConnectionC4242i4.f10363a;
        InterfaceC3996t0 interfaceC3996t0 = this.f10328c;
        c4253j4.f10394a.a().m27823h();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            if (interfaceC3996t0.mo28931l(bundle) == null) {
                c4253j4.f10394a.b().r().m28014a("Install Referrer Service returned a null response");
            }
        } catch (Exception e) {
            c4253j4.f10394a.b().r().m28013b("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        c4253j4.f10394a.a().m27823h();
        b5.t();
        throw null;
    }
}
