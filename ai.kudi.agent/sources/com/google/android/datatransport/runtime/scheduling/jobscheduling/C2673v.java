package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.InterfaceC2676a;
import java.util.concurrent.Executor;
import p272h.p286c.p287a.p288a.p289i.AbstractC8352p;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0;
/* compiled from: WorkInitializer.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.v */
/* loaded from: classes2.dex */
public class C2673v {

    /* renamed from: a */
    private final Executor f7490a;

    /* renamed from: b */
    private final InterfaceC8272i0 f7491b;

    /* renamed from: c */
    private final InterfaceC2675x f7492c;

    /* renamed from: d */
    private final InterfaceC2676a f7493d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2673v(Executor executor, InterfaceC8272i0 interfaceC8272i0, InterfaceC2675x interfaceC2675x, InterfaceC2676a interfaceC2676a) {
        this.f7490a = executor;
        this.f7491b = interfaceC8272i0;
        this.f7492c = interfaceC2675x;
        this.f7493d = interfaceC2676a;
    }

    /* renamed from: a */
    public void m32405a() {
        this.f7490a.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.m
            @Override // java.lang.Runnable
            public final void run() {
                C2673v.this.m32403c();
            }
        });
    }

    /* renamed from: b */
    public /* synthetic */ Object m32404b() {
        for (AbstractC8352p abstractC8352p : this.f7491b.mo16364U()) {
            this.f7492c.mo32399a(abstractC8352p, 1);
        }
        return null;
    }

    /* renamed from: c */
    public /* synthetic */ void m32403c() {
        this.f7493d.mo16354c(new InterfaceC2676a.InterfaceC2677a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.n
            @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC2676a.InterfaceC2677a
            public final Object execute() {
                return C2673v.this.m32404b();
            }
        });
    }
}
