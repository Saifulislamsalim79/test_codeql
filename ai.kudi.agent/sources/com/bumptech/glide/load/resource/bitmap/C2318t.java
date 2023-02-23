package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import com.bumptech.glide.load.resource.bitmap.C2301i;
import com.bumptech.glide.p086q.C2372d;
import com.bumptech.glide.p086q.C2378h;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamBitmapDecoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.t */
/* loaded from: classes2.dex */
public class C2318t implements InterfaceC2124j<InputStream, Bitmap> {

    /* renamed from: a */
    private final C2301i f6726a;

    /* renamed from: b */
    private final InterfaceC2095b f6727b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StreamBitmapDecoder.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.t$a */
    /* loaded from: classes2.dex */
    public static class C2319a implements C2301i.InterfaceC2303b {

        /* renamed from: a */
        private final C2315r f6728a;

        /* renamed from: b */
        private final C2372d f6729b;

        C2319a(C2315r c2315r, C2372d c2372d) {
            this.f6728a = c2315r;
            this.f6729b = c2372d;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2301i.InterfaceC2303b
        /* renamed from: a */
        public void mo33316a() {
            this.f6728a.m33322g();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2301i.InterfaceC2303b
        /* renamed from: b */
        public void mo33315b(InterfaceC2100e interfaceC2100e, Bitmap bitmap) throws IOException {
            IOException m33151c = this.f6729b.m33151c();
            if (m33151c != null) {
                if (bitmap != null) {
                    interfaceC2100e.mo33347c(bitmap);
                }
                throw m33151c;
            }
        }
    }

    public C2318t(C2301i c2301i, InterfaceC2095b interfaceC2095b) {
        this.f6726a = c2301i;
        this.f6727b = interfaceC2095b;
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: c */
    public InterfaceC2087u<Bitmap> mo33300b(InputStream inputStream, int i, int i2, C2122h c2122h) throws IOException {
        C2315r c2315r;
        boolean z;
        if (inputStream instanceof C2315r) {
            c2315r = (C2315r) inputStream;
            z = false;
        } else {
            c2315r = new C2315r(inputStream, this.f6727b);
            z = true;
        }
        C2372d m33150g = C2372d.m33150g(c2315r);
        try {
            return this.f6726a.m33369g(new C2378h(m33150g), i, i2, c2122h, new C2319a(c2315r, m33150g));
        } finally {
            m33150g.m33149m();
            if (z) {
                c2315r.m33321m();
            }
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: d */
    public boolean mo33301a(InputStream inputStream, C2122h c2122h) {
        return this.f6726a.m33360p(inputStream);
    }
}
