package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.l2 */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC3873l2 implements Runnable {

    /* renamed from: c */
    final long f9458c;

    /* renamed from: d */
    final long f9459d;

    /* renamed from: e */
    final boolean f9460e;

    /* renamed from: f */
    final /* synthetic */ C4046w2 f9461f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC3873l2(C4046w2 c4046w2, boolean z) {
        this.f9461f = c4046w2;
        this.f9458c = c4046w2.f9808b.currentTimeMillis();
        this.f9459d = c4046w2.f9808b.mo31535a();
        this.f9460e = z;
    }

    /* renamed from: a */
    abstract void mo28583a() throws RemoteException;

    /* renamed from: b */
    protected void mo28582b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.f9461f.f9813g;
        if (z) {
            mo28582b();
            return;
        }
        try {
            mo28583a();
        } catch (Exception e) {
            this.f9461f.m28714k(e, false, this.f9460e);
            mo28582b();
        }
    }
}
