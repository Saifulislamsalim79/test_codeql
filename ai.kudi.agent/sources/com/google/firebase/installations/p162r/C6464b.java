package com.google.firebase.installations.p162r;
/* compiled from: SystemClock.java */
/* renamed from: com.google.firebase.installations.r.b */
/* loaded from: classes2.dex */
public class C6464b implements InterfaceC6463a {

    /* renamed from: a */
    private static C6464b f15608a;

    private C6464b() {
    }

    /* renamed from: a */
    public static C6464b m21941a() {
        if (f15608a == null) {
            f15608a = new C6464b();
        }
        return f15608a;
    }

    @Override // com.google.firebase.installations.p162r.InterfaceC6463a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
