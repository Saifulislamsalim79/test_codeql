package com.google.firebase.crashlytics.p112h.p125q;
/* compiled from: MiddleOutFallbackStrategy.java */
/* renamed from: com.google.firebase.crashlytics.h.q.a */
/* loaded from: classes2.dex */
public class C5599a implements InterfaceC5602d {

    /* renamed from: a */
    private final int f13806a;

    /* renamed from: b */
    private final InterfaceC5602d[] f13807b;

    /* renamed from: c */
    private final C5600b f13808c;

    public C5599a(int i, InterfaceC5602d... interfaceC5602dArr) {
        this.f13806a = i;
        this.f13807b = interfaceC5602dArr;
        this.f13808c = new C5600b(i);
    }

    @Override // com.google.firebase.crashlytics.p112h.p125q.InterfaceC5602d
    /* renamed from: a */
    public StackTraceElement[] mo24349a(StackTraceElement[] stackTraceElementArr) {
        InterfaceC5602d[] interfaceC5602dArr;
        if (stackTraceElementArr.length <= this.f13806a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (InterfaceC5602d interfaceC5602d : this.f13807b) {
            if (stackTraceElementArr2.length <= this.f13806a) {
                break;
            }
            stackTraceElementArr2 = interfaceC5602d.mo24349a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f13806a ? this.f13808c.mo24349a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
