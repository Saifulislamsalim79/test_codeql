package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.q3 */
/* loaded from: classes2.dex */
public final class C3951q3 {

    /* renamed from: a */
    final C4075y f9625a;

    /* renamed from: b */
    final C3968r4 f9626b;

    /* renamed from: c */
    final C3968r4 f9627c;

    /* renamed from: d */
    final C3955q7 f9628d;

    public C3951q3() {
        C4075y c4075y = new C4075y();
        this.f9625a = c4075y;
        C3968r4 c3968r4 = new C3968r4(null, c4075y);
        this.f9627c = c3968r4;
        this.f9626b = c3968r4.m29052a();
        this.f9628d = new C3955q7();
        this.f9627c.m29046g("require", new C4074xe(this.f9628d));
        this.f9628d.m29083a("internal.platform", CallableC3966r2.f9645c);
        this.f9627c.m29046g("runtime.counter", new C3822i(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final q m29084a(C3968r4 c3968r4, C3860k5... c3860k5Arr) {
        q qVar = q.i;
        for (C3860k5 c3860k5 : c3860k5Arr) {
            qVar = C3986s6.m28975a(c3860k5);
            C3969r5.m29042c(this.f9627c);
            if ((qVar instanceof C3963r) || (qVar instanceof C3933p)) {
                qVar = this.f9625a.m28619a(c3968r4, qVar);
            }
        }
        return qVar;
    }
}
