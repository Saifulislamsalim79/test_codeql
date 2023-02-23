package com.google.android.gms.tasks;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.u */
/* loaded from: classes2.dex */
final class RunnableC4480u implements Runnable {

    /* renamed from: c */
    final /* synthetic */ j f10914c;

    /* renamed from: d */
    final /* synthetic */ C4481v f10915d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4480u(C4481v c4481v, j jVar) {
        this.f10915d = c4481v;
        this.f10914c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4472n0 c4472n0;
        C4472n0 c4472n02;
        C4472n0 c4472n03;
        InterfaceC4450c interfaceC4450c;
        C4472n0 c4472n04;
        C4472n0 c4472n05;
        if (this.f10914c.n()) {
            c4472n05 = this.f10915d.f10918c;
            c4472n05.m27737u();
            return;
        }
        try {
            interfaceC4450c = this.f10915d.f10917b;
            Object mo20893a = interfaceC4450c.mo20893a(this.f10914c);
            c4472n04 = this.f10915d.f10918c;
            c4472n04.m27738t(mo20893a);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                c4472n03 = this.f10915d.f10918c;
                c4472n03.m27739s((Exception) e.getCause());
                return;
            }
            c4472n02 = this.f10915d.f10918c;
            c4472n02.m27739s(e);
        } catch (Exception e2) {
            c4472n0 = this.f10915d.f10918c;
            c4472n0.m27739s(e2);
        }
    }
}
