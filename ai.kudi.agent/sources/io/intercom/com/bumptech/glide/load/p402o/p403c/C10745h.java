package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import java.security.MessageDigest;
/* compiled from: CenterInside.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.h */
/* loaded from: classes3.dex */
public class C10745h extends AbstractC10742e {

    /* renamed from: b */
    private static final byte[] f24567b = "io.intercom.com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC10622g.f24418a);

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l, io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public boolean equals(Object obj) {
        return obj instanceof C10745h;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l, io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public int hashCode() {
        return -975906981;
    }

    @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10742e
    protected Bitmap transform(InterfaceC10581e interfaceC10581e, Bitmap bitmap, int i, int i2) {
        return C10770t.m12378c(interfaceC10581e, bitmap, i, i2);
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f24567b);
    }
}
