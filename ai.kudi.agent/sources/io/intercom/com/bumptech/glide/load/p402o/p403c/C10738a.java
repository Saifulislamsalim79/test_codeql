package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10627j;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.io.IOException;
/* compiled from: BitmapDrawableDecoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.a */
/* loaded from: classes3.dex */
public class C10738a<DataType> implements InterfaceC10627j<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final InterfaceC10627j<DataType, Bitmap> f24557a;

    /* renamed from: b */
    private final Resources f24558b;

    public C10738a(Resources resources, InterfaceC10627j<DataType, Bitmap> interfaceC10627j) {
        C10892h.m12014d(resources);
        this.f24558b = resources;
        C10892h.m12014d(interfaceC10627j);
        this.f24557a = interfaceC10627j;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: a */
    public InterfaceC10569t<BitmapDrawable> mo12276a(DataType datatype, int i, int i2, C10626i c10626i) throws IOException {
        return C10764p.m12391e(this.f24558b, this.f24557a.mo12276a(datatype, i, i2, c10626i));
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: b */
    public boolean mo12275b(DataType datatype, C10626i c10626i) throws IOException {
        return this.f24557a.mo12275b(datatype, c10626i);
    }
}
