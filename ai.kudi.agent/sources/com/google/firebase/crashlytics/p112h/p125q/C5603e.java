package com.google.firebase.crashlytics.p112h.p125q;
/* compiled from: TrimmedThrowableData.java */
/* renamed from: com.google.firebase.crashlytics.h.q.e */
/* loaded from: classes2.dex */
public class C5603e {

    /* renamed from: a */
    public final String f13811a;

    /* renamed from: b */
    public final String f13812b;

    /* renamed from: c */
    public final StackTraceElement[] f13813c;

    /* renamed from: d */
    public final C5603e f13814d;

    public C5603e(Throwable th, InterfaceC5602d interfaceC5602d) {
        this.f13811a = th.getLocalizedMessage();
        this.f13812b = th.getClass().getName();
        this.f13813c = interfaceC5602d.mo24349a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f13814d = cause != null ? new C5603e(cause, interfaceC5602d) : null;
    }
}
