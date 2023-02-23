package com.google.android.gms.tasks;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.e0 */
/* loaded from: classes2.dex */
final class RunnableC4455e0 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ j f10876c;

    /* renamed from: d */
    final /* synthetic */ C4457f0 f10877d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4455e0(C4457f0 c4457f0, j jVar) {
        this.f10877d = c4457f0;
        this.f10876c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC4458g interfaceC4458g;
        InterfaceC4458g interfaceC4458g2;
        obj = this.f10877d.f10879b;
        synchronized (obj) {
            C4457f0 c4457f0 = this.f10877d;
            interfaceC4458g = c4457f0.f10880c;
            if (interfaceC4458g != null) {
                interfaceC4458g2 = c4457f0.f10880c;
                interfaceC4458g2.mo18742c(this.f10876c.l());
            }
        }
    }
}
