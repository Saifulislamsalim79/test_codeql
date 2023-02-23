package com.google.android.gms.tasks;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* renamed from: com.google.android.gms.tasks.k */
/* loaded from: classes2.dex */
public class C4465k<TResult> {

    /* renamed from: a */
    private final C4472n0<TResult> f10889a = new C4472n0<>();

    public C4465k() {
    }

    public C4465k(AbstractC4446a abstractC4446a) {
        abstractC4446a.mo27727b(new C4466k0(this));
    }

    /* renamed from: a */
    public j<TResult> m27777a() {
        return this.f10889a;
    }

    /* renamed from: b */
    public void m27776b(Exception exc) {
        this.f10889a.m27739s(exc);
    }

    /* renamed from: c */
    public void m27775c(TResult tresult) {
        this.f10889a.m27738t(tresult);
    }

    /* renamed from: d */
    public boolean m27774d(Exception exc) {
        return this.f10889a.m27736v(exc);
    }

    /* renamed from: e */
    public boolean m27773e(TResult tresult) {
        return this.f10889a.m27735w(tresult);
    }
}
