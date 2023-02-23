package com.squareup.picasso;
/* compiled from: NetworkPolicy.java */
/* renamed from: com.squareup.picasso.q */
/* loaded from: classes2.dex */
public enum EnumC7355q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: c */
    final int f17423c;

    EnumC7355q(int i) {
        this.f17423c = i;
    }

    /* renamed from: a */
    public static boolean m18892a(int i) {
        return (i & OFFLINE.f17423c) != 0;
    }

    /* renamed from: b */
    public static boolean m18891b(int i) {
        return (i & NO_CACHE.f17423c) == 0;
    }

    /* renamed from: e */
    public static boolean m18890e(int i) {
        return (i & NO_STORE.f17423c) == 0;
    }
}
