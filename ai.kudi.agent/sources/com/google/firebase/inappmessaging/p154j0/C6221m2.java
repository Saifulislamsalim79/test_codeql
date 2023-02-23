package com.google.firebase.inappmessaging.p154j0;

import android.app.Application;
import com.google.firebase.inappmessaging.p154j0.p158t3.InterfaceC6332a;
import j.e.e0.e;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9388e;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p450e0.InterfaceC11292g;
/* compiled from: CampaignCacheClient.java */
/* renamed from: com.google.firebase.inappmessaging.j0.m2 */
/* loaded from: classes2.dex */
public class C6221m2 {

    /* renamed from: a */
    private final C6181f3 f15101a;

    /* renamed from: b */
    private final Application f15102b;

    /* renamed from: c */
    private final InterfaceC6332a f15103c;

    /* renamed from: d */
    private C9388e f15104d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6221m2(C6181f3 c6181f3, Application application, InterfaceC6332a interfaceC6332a) {
        this.f15101a = c6181f3;
        this.f15102b = application;
        this.f15103c = interfaceC6332a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m22540b(C9388e c9388e) {
        long m14870U = c9388e.m14870U();
        long mo22281a = this.f15103c.mo22281a();
        File file = new File(this.f15102b.getApplicationContext().getFilesDir(), "fiam_eligible_campaigns_cache_file");
        return m14870U != 0 ? mo22281a < m14870U : !file.exists() || mo22281a < file.lastModified() + TimeUnit.DAYS.toMillis(1L);
    }

    /* renamed from: a */
    public AbstractC11677k<C9388e> m22541a() {
        return AbstractC11677k.m10591l(new Callable() { // from class: com.google.firebase.inappmessaging.j0.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C6221m2.this.m22538d();
            }
        }).m10579x(this.f15101a.m22597c(C9388e.m14867X()).m10597f(new e() { // from class: com.google.firebase.inappmessaging.j0.f
            public final void accept(Object obj) {
                C6221m2.this.m22537e((C9388e) obj);
            }
        })).m10595h(new InterfaceC11292g() { // from class: com.google.firebase.inappmessaging.j0.d
            @Override // p425j.p444e.p450e0.InterfaceC11292g
            /* renamed from: c */
            public final boolean mo10557c(Object obj) {
                boolean m22540b;
                m22540b = C6221m2.this.m22540b((C9388e) obj);
                return m22540b;
            }
        }).m10598e(new e() { // from class: com.google.firebase.inappmessaging.j0.e
            public final void accept(Object obj) {
                C6221m2.this.m22536f((Throwable) obj);
            }
        });
    }

    /* renamed from: d */
    public /* synthetic */ C9388e m22538d() throws Exception {
        return this.f15104d;
    }

    /* renamed from: e */
    public /* synthetic */ void m22537e(C9388e c9388e) throws Exception {
        this.f15104d = c9388e;
    }

    /* renamed from: f */
    public /* synthetic */ void m22536f(Throwable th) throws Exception {
        this.f15104d = null;
    }

    /* renamed from: g */
    public /* synthetic */ void m22535g(C9388e c9388e) throws Exception {
        this.f15104d = c9388e;
    }

    /* renamed from: h */
    public AbstractC11271b m22534h(final C9388e c9388e) {
        return this.f15101a.m22596d(c9388e).m11244g(new InterfaceC11287a() { // from class: com.google.firebase.inappmessaging.j0.c
            @Override // p425j.p444e.p450e0.InterfaceC11287a
            public final void run() {
                C6221m2.this.m22535g(c9388e);
            }
        });
    }
}
