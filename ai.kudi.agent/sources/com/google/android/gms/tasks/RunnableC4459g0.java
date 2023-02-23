package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.g0 */
/* loaded from: classes2.dex */
final class RunnableC4459g0 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ j f10881c;

    /* renamed from: d */
    final /* synthetic */ C4461h0 f10882d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4459g0(C4461h0 c4461h0, j jVar) {
        this.f10882d = c4461h0;
        this.f10881c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC4462i interfaceC4462i;
        try {
            interfaceC4462i = this.f10882d.f10884b;
            j mo20894a = interfaceC4462i.mo20894a(this.f10881c.l());
            if (mo20894a == null) {
                this.f10882d.mo15657b(new NullPointerException("Continuation returned null"));
                return;
            }
            mo20894a.g(C4467l.f10892b, this.f10882d);
            mo20894a.e(C4467l.f10892b, this.f10882d);
            mo20894a.a(C4467l.f10892b, this.f10882d);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f10882d.mo15657b((Exception) e.getCause());
            } else {
                this.f10882d.mo15657b(e);
            }
        } catch (CancellationException unused) {
            this.f10882d.mo20881a();
        } catch (Exception e2) {
            this.f10882d.mo15657b(e2);
        }
    }
}
