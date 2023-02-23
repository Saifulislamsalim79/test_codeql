package com.google.android.gms.internal.p104firebaseauthapi;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jk */
/* loaded from: classes2.dex */
final class RunnableC3273jk implements Runnable {

    /* renamed from: c */
    final /* synthetic */ InterfaceC3327lk f8639c;

    /* renamed from: d */
    final /* synthetic */ BinderC3300kk f8640d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3273jk(BinderC3300kk binderC3300kk, InterfaceC3327lk interfaceC3327lk) {
        this.f8640d = binderC3300kk;
        this.f8639c = interfaceC3327lk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8640d.f8685a.f8766g) {
            if (!this.f8640d.f8685a.f8766g.isEmpty()) {
                this.f8639c.mo30766a(this.f8640d.f8685a.f8766g.get(0), new Object[0]);
            }
        }
    }
}
