package com.google.android.gms.tasks;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.c0 */
/* loaded from: classes2.dex */
final class RunnableC4451c0 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ j f10871c;

    /* renamed from: d */
    final /* synthetic */ C4453d0 f10872d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4451c0(C4453d0 c4453d0, j jVar) {
        this.f10872d = c4453d0;
        this.f10871c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC4456f interfaceC4456f;
        InterfaceC4456f interfaceC4456f2;
        obj = this.f10872d.f10874b;
        synchronized (obj) {
            C4453d0 c4453d0 = this.f10872d;
            interfaceC4456f = c4453d0.f10875c;
            if (interfaceC4456f != null) {
                interfaceC4456f2 = c4453d0.f10875c;
                Exception k = this.f10871c.k();
                com.google.android.gms.common.internal.s.j(k);
                interfaceC4456f2.mo15657b(k);
            }
        }
    }
}
