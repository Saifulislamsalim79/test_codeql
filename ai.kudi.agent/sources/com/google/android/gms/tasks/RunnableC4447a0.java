package com.google.android.gms.tasks;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.a0 */
/* loaded from: classes2.dex */
final class RunnableC4447a0 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ j f10865c;

    /* renamed from: d */
    final /* synthetic */ C4449b0 f10866d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4447a0(C4449b0 c4449b0, j jVar) {
        this.f10866d = c4449b0;
        this.f10865c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC4454e interfaceC4454e;
        InterfaceC4454e interfaceC4454e2;
        obj = this.f10866d.f10869b;
        synchronized (obj) {
            C4449b0 c4449b0 = this.f10866d;
            interfaceC4454e = c4449b0.f10870c;
            if (interfaceC4454e != null) {
                interfaceC4454e2 = c4449b0.f10870c;
                interfaceC4454e2.mo21856a(this.f10865c);
            }
        }
    }
}
