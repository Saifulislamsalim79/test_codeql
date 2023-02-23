package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.d8 */
/* loaded from: classes2.dex */
public final class RunnableC4190d8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4328p7 f10219c;

    /* renamed from: d */
    final /* synthetic */ C4410w8 f10220d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4190d8(C4410w8 c4410w8, C4328p7 c4328p7) {
        this.f10220d = c4410w8;
        this.f10219c = c4328p7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4219g3 interfaceC4219g3;
        interfaceC4219g3 = this.f10220d.f10772d;
        if (interfaceC4219g3 == null) {
            ((v5) this.f10220d).a.b().r().m28014a("Failed to send current screen to service");
            return;
        }
        try {
            C4328p7 c4328p7 = this.f10219c;
            if (c4328p7 == null) {
                interfaceC4219g3.mo27924y0(0L, null, null, ((v5) this.f10220d).a.f().getPackageName());
            } else {
                interfaceC4219g3.mo27924y0(c4328p7.f10584c, c4328p7.f10582a, c4328p7.f10583b, ((v5) this.f10220d).a.f().getPackageName());
            }
            this.f10220d.m27879E();
        } catch (RemoteException e) {
            ((v5) this.f10220d).a.b().r().m28013b("Failed to send current screen to the service", e);
        }
    }
}
