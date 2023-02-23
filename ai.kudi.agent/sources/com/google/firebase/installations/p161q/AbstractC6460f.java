package com.google.firebase.installations.p161q;

import com.google.firebase.installations.p161q.C6452b;
/* compiled from: TokenResult.java */
/* renamed from: com.google.firebase.installations.q.f */
/* loaded from: classes2.dex */
public abstract class AbstractC6460f {

    /* compiled from: TokenResult.java */
    /* renamed from: com.google.firebase.installations.q.f$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6461a {
        /* renamed from: a */
        public abstract AbstractC6460f mo21945a();

        /* renamed from: b */
        public abstract AbstractC6461a mo21944b(EnumC6462b enumC6462b);

        /* renamed from: c */
        public abstract AbstractC6461a mo21943c(String str);

        /* renamed from: d */
        public abstract AbstractC6461a mo21942d(long j);
    }

    /* compiled from: TokenResult.java */
    /* renamed from: com.google.firebase.installations.q.f$b */
    /* loaded from: classes2.dex */
    public enum EnumC6462b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static AbstractC6461a m21949a() {
        C6452b.C6454b c6454b = new C6452b.C6454b();
        c6454b.mo21942d(0L);
        return c6454b;
    }

    /* renamed from: b */
    public abstract EnumC6462b mo21948b();

    /* renamed from: c */
    public abstract String mo21947c();

    /* renamed from: d */
    public abstract long mo21946d();
}
