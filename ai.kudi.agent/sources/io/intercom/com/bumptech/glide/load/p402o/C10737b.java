package io.intercom.com.bumptech.glide.load.p402o;

import android.content.Context;
import io.intercom.com.bumptech.glide.load.InterfaceC10629l;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import java.security.MessageDigest;
/* compiled from: UnitTransformation.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.b */
/* loaded from: classes3.dex */
public final class C10737b<T> implements InterfaceC10629l<T> {

    /* renamed from: b */
    private static final InterfaceC10629l<?> f24556b = new C10737b();

    private C10737b() {
    }

    /* renamed from: a */
    public static <T> C10737b<T> m12452a() {
        return (C10737b) f24556b;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l
    public InterfaceC10569t<T> transform(Context context, InterfaceC10569t<T> interfaceC10569t, int i, int i2) {
        return interfaceC10569t;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }
}
