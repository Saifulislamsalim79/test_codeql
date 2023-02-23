package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import android.net.Uri;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10627j;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.load.p402o.p405e.C10785e;
import java.io.IOException;
/* compiled from: ResourceBitmapDecoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.r */
/* loaded from: classes3.dex */
public class C10767r implements InterfaceC10627j<Uri, Bitmap> {

    /* renamed from: a */
    private final C10785e f24609a;

    /* renamed from: b */
    private final InterfaceC10581e f24610b;

    public C10767r(C10785e c10785e, InterfaceC10581e interfaceC10581e) {
        this.f24609a = c10785e;
        this.f24610b = interfaceC10581e;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: c */
    public InterfaceC10569t<Bitmap> mo12276a(Uri uri, int i, int i2, C10626i c10626i) throws IOException {
        return C10759l.m12400a(this.f24610b, this.f24609a.mo12276a(uri, i, i2, c10626i).get(), i, i2);
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: d */
    public boolean mo12275b(Uri uri, C10626i c10626i) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }
}
