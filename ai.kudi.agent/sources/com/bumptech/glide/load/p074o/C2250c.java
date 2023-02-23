package com.bumptech.glide.load.p074o;

import android.content.Context;
import com.bumptech.glide.load.InterfaceC2126l;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import java.security.MessageDigest;
/* compiled from: UnitTransformation.java */
/* renamed from: com.bumptech.glide.load.o.c */
/* loaded from: classes2.dex */
public final class C2250c<T> implements InterfaceC2126l<T> {

    /* renamed from: b */
    private static final InterfaceC2126l<?> f6590b = new C2250c();

    private C2250c() {
    }

    /* renamed from: b */
    public static <T> C2250c<T> m33493b() {
        return (C2250c) f6590b;
    }

    @Override // com.bumptech.glide.load.InterfaceC2126l
    /* renamed from: a */
    public InterfaceC2087u<T> mo33346a(Context context, InterfaceC2087u<T> interfaceC2087u, int i, int i2) {
        return interfaceC2087u;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }
}
