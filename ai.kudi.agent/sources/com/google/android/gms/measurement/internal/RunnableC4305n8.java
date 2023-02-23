package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.n8 */
/* loaded from: classes2.dex */
public final class RunnableC4305n8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ AtomicReference f10508c;

    /* renamed from: d */
    final /* synthetic */ String f10509d;

    /* renamed from: e */
    final /* synthetic */ String f10510e;

    /* renamed from: f */
    final /* synthetic */ C4307na f10511f;

    /* renamed from: w */
    final /* synthetic */ C4410w8 f10512w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4305n8(C4410w8 c4410w8, AtomicReference atomicReference, String str, String str2, String str3, C4307na c4307na) {
        this.f10512w = c4410w8;
        this.f10508c = atomicReference;
        this.f10509d = str2;
        this.f10510e = str3;
        this.f10511f = c4307na;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC4219g3 interfaceC4219g3;
        synchronized (this.f10508c) {
            try {
                interfaceC4219g3 = this.f10512w.f10772d;
            } catch (RemoteException e) {
                ((v5) this.f10512w).a.b().r().m28011d("(legacy) Failed to get conditional properties; remote exception", null, this.f10509d, e);
                this.f10508c.set(Collections.emptyList());
                atomicReference = this.f10508c;
            }
            if (interfaceC4219g3 == null) {
                ((v5) this.f10512w).a.b().r().m28011d("(legacy) Failed to get conditional properties; not connected to service", null, this.f10509d, this.f10510e);
                this.f10508c.set(Collections.emptyList());
                this.f10508c.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                com.google.android.gms.common.internal.s.j(this.f10511f);
                this.f10508c.set(interfaceC4219g3.mo27941d0(this.f10509d, this.f10510e, this.f10511f));
            } else {
                this.f10508c.set(interfaceC4219g3.mo27946M(null, this.f10509d, this.f10510e));
            }
            this.f10512w.m27879E();
            atomicReference = this.f10508c;
            atomicReference.notify();
        }
    }
}
