package io.intercom.com.bumptech.glide.load.engine.p396y;

import android.graphics.Bitmap;
/* compiled from: BitmapPoolAdapter.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.y.f */
/* loaded from: classes3.dex */
public class C10582f implements InterfaceC10581e {
    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e
    /* renamed from: a */
    public void mo12671a(int i) {
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e
    /* renamed from: b */
    public void mo12670b() {
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e
    /* renamed from: c */
    public void mo12398c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e
    /* renamed from: d */
    public Bitmap mo12669d(int i, int i2, Bitmap.Config config) {
        return get(i, i2, config);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
