package com.google.firebase.crashlytics.p112h.p125q;
/* compiled from: MiddleOutStrategy.java */
/* renamed from: com.google.firebase.crashlytics.h.q.b */
/* loaded from: classes2.dex */
public class C5600b implements InterfaceC5602d {

    /* renamed from: a */
    private final int f13809a;

    public C5600b(int i) {
        this.f13809a = i;
    }

    @Override // com.google.firebase.crashlytics.p112h.p125q.InterfaceC5602d
    /* renamed from: a */
    public StackTraceElement[] mo24349a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f13809a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
