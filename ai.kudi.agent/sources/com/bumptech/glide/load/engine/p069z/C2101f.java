package com.bumptech.glide.load.engine.p069z;

import android.graphics.Bitmap;
/* compiled from: BitmapPoolAdapter.java */
/* renamed from: com.bumptech.glide.load.engine.z.f */
/* loaded from: classes2.dex */
public class C2101f implements InterfaceC2100e {
    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2100e
    /* renamed from: a */
    public void mo33699a(int i) {
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2100e
    /* renamed from: b */
    public void mo33698b() {
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2100e
    /* renamed from: c */
    public void mo33347c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2100e
    /* renamed from: d */
    public Bitmap mo33697d(int i, int i2, Bitmap.Config config) {
        return get(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2100e
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
