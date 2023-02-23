package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import java.security.MessageDigest;
/* compiled from: FitCenter.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.n */
/* loaded from: classes3.dex */
public class C10762n extends AbstractC10742e {

    /* renamed from: b */
    private static final byte[] f24596b = "io.intercom.com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC10622g.f24418a);

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l, io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public boolean equals(Object obj) {
        return obj instanceof C10762n;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l, io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public int hashCode() {
        return -1885888164;
    }

    @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10742e
    protected Bitmap transform(InterfaceC10581e interfaceC10581e, Bitmap bitmap, int i, int i2) {
        return C10770t.m12376e(interfaceC10581e, bitmap, i, i2);
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f24596b);
    }
}
