package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.s8 */
/* loaded from: classes2.dex */
final class RunnableC4364s8 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ InterfaceC4219g3 f10667c;

    /* renamed from: d */
    final /* synthetic */ ServiceConnectionC4399v8 f10668d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4364s8(ServiceConnectionC4399v8 serviceConnectionC4399v8, InterfaceC4219g3 interfaceC4219g3) {
        this.f10668d = serviceConnectionC4399v8;
        this.f10667c = interfaceC4219g3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10668d) {
            this.f10668d.f10740a = false;
            if (!this.f10668d.f10742c.m27848z()) {
                ((v5) this.f10668d.f10742c).a.b().q().m28014a("Connected to remote service");
                this.f10668d.f10742c.m27850x(this.f10667c);
            }
        }
    }
}
