package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.p086q.C2381k;
/* compiled from: UnitBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.v */
/* loaded from: classes2.dex */
public final class C2322v implements InterfaceC2124j<Bitmap, Bitmap> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnitBitmapDecoder.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.v$a */
    /* loaded from: classes2.dex */
    public static final class C2323a implements InterfaceC2087u<Bitmap> {

        /* renamed from: c */
        private final Bitmap f6734c;

        C2323a(Bitmap bitmap) {
            this.f6734c = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC2087u
        /* renamed from: a */
        public Bitmap get() {
            return this.f6734c;
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC2087u
        /* renamed from: b */
        public void mo33303b() {
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC2087u
        /* renamed from: c */
        public Class<Bitmap> mo33302c() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.InterfaceC2087u
        public int getSize() {
            return C2381k.m33121g(this.f6734c);
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: c */
    public InterfaceC2087u<Bitmap> mo33300b(Bitmap bitmap, int i, int i2, C2122h c2122h) {
        return new C2323a(bitmap);
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: d */
    public boolean mo33301a(Bitmap bitmap, C2122h c2122h) {
        return true;
    }
}
