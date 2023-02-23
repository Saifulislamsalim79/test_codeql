package com.google.android.play.core.tasks;
/* renamed from: com.google.android.play.core.tasks.h */
/* loaded from: classes2.dex */
final class RunnableC5016h implements Runnable {

    /* renamed from: c */
    final /* synthetic */ AbstractC5011c f12664c;

    /* renamed from: d */
    final /* synthetic */ C5017i f12665d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5016h(C5017i c5017i, AbstractC5011c abstractC5011c) {
        this.f12665d = c5017i;
        this.f12664c = abstractC5011c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC5010b interfaceC5010b;
        InterfaceC5010b interfaceC5010b2;
        obj = this.f12665d.f12667b;
        synchronized (obj) {
            interfaceC5010b = this.f12665d.f12668c;
            if (interfaceC5010b != null) {
                interfaceC5010b2 = this.f12665d.f12668c;
                interfaceC5010b2.mo25838c(this.f12664c.mo25850e());
            }
        }
    }
}
