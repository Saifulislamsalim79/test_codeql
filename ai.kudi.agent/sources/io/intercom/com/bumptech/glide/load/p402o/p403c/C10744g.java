package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.content.Context;
import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import java.security.MessageDigest;
/* compiled from: CenterCrop.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.g */
/* loaded from: classes3.dex */
public class C10744g extends AbstractC10742e {

    /* renamed from: ID */
    private static final String f24566ID = "io.intercom.com.bumptech.glide.load.resource.bitmap.CenterCrop";
    private static final byte[] ID_BYTES = f24566ID.getBytes(InterfaceC10622g.f24418a);

    public C10744g() {
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l, io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public boolean equals(Object obj) {
        return obj instanceof C10744g;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l, io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public int hashCode() {
        return -430240337;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10742e
    public Bitmap transform(InterfaceC10581e interfaceC10581e, Bitmap bitmap, int i, int i2) {
        return C10770t.m12379b(interfaceC10581e, bitmap, i, i2);
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ID_BYTES);
    }

    @Deprecated
    public C10744g(Context context) {
        this();
    }

    @Deprecated
    public C10744g(InterfaceC10581e interfaceC10581e) {
        this();
    }
}
