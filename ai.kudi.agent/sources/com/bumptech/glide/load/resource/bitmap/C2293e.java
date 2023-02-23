package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.InterfaceC2082q;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import com.bumptech.glide.p086q.C2380j;
import com.bumptech.glide.p086q.C2381k;
/* compiled from: BitmapResource.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.e */
/* loaded from: classes2.dex */
public class C2293e implements InterfaceC2087u<Bitmap>, InterfaceC2082q {

    /* renamed from: c */
    private final Bitmap f6672c;

    /* renamed from: d */
    private final InterfaceC2100e f6673d;

    public C2293e(Bitmap bitmap, InterfaceC2100e interfaceC2100e) {
        C2380j.m33128e(bitmap, "Bitmap must not be null");
        this.f6672c = bitmap;
        C2380j.m33128e(interfaceC2100e, "BitmapPool must not be null");
        this.f6673d = interfaceC2100e;
    }

    /* renamed from: e */
    public static C2293e m33382e(Bitmap bitmap, InterfaceC2100e interfaceC2100e) {
        if (bitmap == null) {
            return null;
        }
        return new C2293e(bitmap, interfaceC2100e);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2082q
    /* renamed from: a */
    public void mo33329a() {
        this.f6672c.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: b */
    public void mo33303b() {
        this.f6673d.mo33347c(this.f6672c);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: c */
    public Class<Bitmap> mo33302c() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: d */
    public Bitmap get() {
        return this.f6672c;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    public int getSize() {
        return C2381k.m33121g(this.f6672c);
    }
}
