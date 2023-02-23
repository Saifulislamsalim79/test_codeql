package com.google.firebase.crashlytics.p112h.p115j;
/* compiled from: DeliveryMechanism.java */
/* renamed from: com.google.firebase.crashlytics.h.j.x */
/* loaded from: classes2.dex */
public enum EnumC5407x {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: c */
    private final int f13359c;

    EnumC5407x(int i) {
        this.f13359c = i;
    }

    /* renamed from: a */
    public static EnumC5407x m24838a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: b */
    public int m24837b() {
        return this.f13359c;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f13359c);
    }
}
