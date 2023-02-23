package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10627j;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.io.IOException;
/* compiled from: UnitBitmapDecoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.u */
/* loaded from: classes3.dex */
public final class C10772u implements InterfaceC10627j<Bitmap, Bitmap> {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnitBitmapDecoder.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.u$a */
    /* loaded from: classes3.dex */
    public static final class C10773a implements InterfaceC10569t<Bitmap> {

        /* renamed from: c */
        private final Bitmap f24619c;

        C10773a(Bitmap bitmap) {
            this.f24619c = bitmap;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
        /* renamed from: a */
        public Bitmap get() {
            return this.f24619c;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
        /* renamed from: b */
        public void mo12303b() {
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
        /* renamed from: c */
        public Class<Bitmap> mo12302c() {
            return Bitmap.class;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
        public int getSize() {
            return C10893i.m12005h(this.f24619c);
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: c */
    public InterfaceC10569t<Bitmap> mo12276a(Bitmap bitmap, int i, int i2, C10626i c10626i) throws IOException {
        return new C10773a(bitmap);
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: d */
    public boolean mo12275b(Bitmap bitmap, C10626i c10626i) throws IOException {
        return true;
    }
}
