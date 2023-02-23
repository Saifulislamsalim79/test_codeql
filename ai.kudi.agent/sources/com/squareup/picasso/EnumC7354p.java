package com.squareup.picasso;
/* compiled from: MemoryPolicy.java */
/* renamed from: com.squareup.picasso.p */
/* loaded from: classes2.dex */
public enum EnumC7354p {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: c */
    final int f17418c;

    EnumC7354p(int i) {
        this.f17418c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m18894a(int i) {
        return (i & NO_CACHE.f17418c) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m18893b(int i) {
        return (i & NO_STORE.f17418c) == 0;
    }
}
