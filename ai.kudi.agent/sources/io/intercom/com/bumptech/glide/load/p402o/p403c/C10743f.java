package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10627j;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.p416r.C10883a;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ByteBufferBitmapDecoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.f */
/* loaded from: classes3.dex */
public class C10743f implements InterfaceC10627j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    private final C10756k f24565a;

    public C10743f(C10756k c10756k) {
        this.f24565a = c10756k;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: c */
    public InterfaceC10569t<Bitmap> mo12276a(ByteBuffer byteBuffer, int i, int i2, C10626i c10626i) throws IOException {
        return this.f24565a.m12419d(C10883a.m12039e(byteBuffer), i, i2, c10626i);
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: d */
    public boolean mo12275b(ByteBuffer byteBuffer, C10626i c10626i) throws IOException {
        return this.f24565a.m12409n(byteBuffer);
    }
}
