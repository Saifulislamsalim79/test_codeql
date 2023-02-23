package com.google.android.datatransport.runtime.backends;
/* compiled from: BackendResponse.java */
/* renamed from: com.google.android.datatransport.runtime.backends.g */
/* loaded from: classes2.dex */
public abstract class AbstractC2637g {

    /* compiled from: BackendResponse.java */
    /* renamed from: com.google.android.datatransport.runtime.backends.g$a */
    /* loaded from: classes2.dex */
    public enum EnumC2638a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC2637g m32470a() {
        return new C2631b(EnumC2638a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC2637g m32467d() {
        return new C2631b(EnumC2638a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC2637g m32466e(long j) {
        return new C2631b(EnumC2638a.OK, j);
    }

    /* renamed from: f */
    public static AbstractC2637g m32465f() {
        return new C2631b(EnumC2638a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo32469b();

    /* renamed from: c */
    public abstract EnumC2638a mo32468c();
}
