package com.google.android.gms.tasks;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.y */
/* loaded from: classes2.dex */
final class RunnableC4484y implements Runnable {

    /* renamed from: c */
    final /* synthetic */ C4485z f10924c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4484y(C4485z c4485z) {
        this.f10924c = c4485z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC4452d interfaceC4452d;
        InterfaceC4452d interfaceC4452d2;
        obj = this.f10924c.f10926b;
        synchronized (obj) {
            C4485z c4485z = this.f10924c;
            interfaceC4452d = c4485z.f10927c;
            if (interfaceC4452d != null) {
                interfaceC4452d2 = c4485z.f10927c;
                interfaceC4452d2.mo20881a();
            }
        }
    }
}
