package com.google.android.play.core.tasks;
/* renamed from: com.google.android.play.core.tasks.f */
/* loaded from: classes2.dex */
final class RunnableC5014f implements Runnable {

    /* renamed from: c */
    final /* synthetic */ AbstractC5011c f12659c;

    /* renamed from: d */
    final /* synthetic */ C5015g f12660d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5014f(C5015g c5015g, AbstractC5011c abstractC5011c) {
        this.f12660d = c5015g;
        this.f12659c = abstractC5011c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        InterfaceC5009a interfaceC5009a;
        InterfaceC5009a interfaceC5009a2;
        obj = this.f12660d.f12662b;
        synchronized (obj) {
            interfaceC5009a = this.f12660d.f12663c;
            if (interfaceC5009a != null) {
                interfaceC5009a2 = this.f12660d.f12663c;
                interfaceC5009a2.mo25839b(this.f12659c.mo25851d());
            }
        }
    }
}
