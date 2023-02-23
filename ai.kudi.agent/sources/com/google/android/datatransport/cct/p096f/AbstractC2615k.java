package com.google.android.datatransport.cct.p096f;

import com.google.android.datatransport.cct.p096f.C2601e;
/* compiled from: ClientInfo.java */
/* renamed from: com.google.android.datatransport.cct.f.k */
/* loaded from: classes2.dex */
public abstract class AbstractC2615k {

    /* compiled from: ClientInfo.java */
    /* renamed from: com.google.android.datatransport.cct.f.k$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC2616a {
        /* renamed from: a */
        public abstract AbstractC2615k mo32528a();

        /* renamed from: b */
        public abstract AbstractC2616a mo32527b(AbstractC2588a abstractC2588a);

        /* renamed from: c */
        public abstract AbstractC2616a mo32526c(EnumC2617b enumC2617b);
    }

    /* compiled from: ClientInfo.java */
    /* renamed from: com.google.android.datatransport.cct.f.k$b */
    /* loaded from: classes2.dex */
    public enum EnumC2617b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        EnumC2617b(int i) {
        }
    }

    /* renamed from: a */
    public static AbstractC2616a m32531a() {
        return new C2601e.C2603b();
    }

    /* renamed from: b */
    public abstract AbstractC2588a mo32530b();

    /* renamed from: c */
    public abstract EnumC2617b mo32529c();
}
