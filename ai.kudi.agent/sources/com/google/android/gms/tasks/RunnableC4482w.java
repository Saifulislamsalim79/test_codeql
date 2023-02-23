package com.google.android.gms.tasks;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.w */
/* loaded from: classes2.dex */
final class RunnableC4482w implements Runnable {

    /* renamed from: c */
    final /* synthetic */ j f10919c;

    /* renamed from: d */
    final /* synthetic */ C4483x f10920d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4482w(C4483x c4483x, j jVar) {
        this.f10920d = c4483x;
        this.f10919c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4472n0 c4472n0;
        C4472n0 c4472n02;
        C4472n0 c4472n03;
        InterfaceC4450c interfaceC4450c;
        try {
            interfaceC4450c = this.f10920d.f10922b;
            j jVar = (j) interfaceC4450c.mo20893a(this.f10919c);
            if (jVar == null) {
                this.f10920d.mo15657b(new NullPointerException("Continuation returned null"));
                return;
            }
            jVar.g(C4467l.f10892b, this.f10920d);
            jVar.e(C4467l.f10892b, this.f10920d);
            jVar.a(C4467l.f10892b, this.f10920d);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                c4472n03 = this.f10920d.f10923c;
                c4472n03.m27739s((Exception) e.getCause());
                return;
            }
            c4472n02 = this.f10920d.f10923c;
            c4472n02.m27739s(e);
        } catch (Exception e2) {
            c4472n0 = this.f10920d.f10923c;
            c4472n0.m27739s(e2);
        }
    }
}
