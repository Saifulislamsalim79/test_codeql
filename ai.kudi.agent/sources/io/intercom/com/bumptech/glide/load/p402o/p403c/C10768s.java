package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10627j;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10756k;
import io.intercom.com.bumptech.glide.p416r.C10887c;
import io.intercom.com.bumptech.glide.p416r.C10890f;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: StreamBitmapDecoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.s */
/* loaded from: classes3.dex */
public class C10768s implements InterfaceC10627j<InputStream, Bitmap> {

    /* renamed from: a */
    private final C10756k f24611a;

    /* renamed from: b */
    private final InterfaceC10576b f24612b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StreamBitmapDecoder.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.s$a */
    /* loaded from: classes3.dex */
    public static class C10769a implements C10756k.InterfaceC10758b {

        /* renamed from: a */
        private final C10765q f24613a;

        /* renamed from: b */
        private final C10887c f24614b;

        C10769a(C10765q c10765q, C10887c c10887c) {
            this.f24613a = c10765q;
            this.f24614b = c10887c;
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10756k.InterfaceC10758b
        /* renamed from: a */
        public void mo12382a() {
            this.f24613a.m12388g();
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10756k.InterfaceC10758b
        /* renamed from: b */
        public void mo12381b(InterfaceC10581e interfaceC10581e, Bitmap bitmap) throws IOException {
            IOException m12035c = this.f24614b.m12035c();
            if (m12035c != null) {
                if (bitmap != null) {
                    interfaceC10581e.mo12398c(bitmap);
                }
                throw m12035c;
            }
        }
    }

    public C10768s(C10756k c10756k, InterfaceC10576b interfaceC10576b) {
        this.f24611a = c10756k;
        this.f24612b = interfaceC10576b;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: c */
    public InterfaceC10569t<Bitmap> mo12276a(InputStream inputStream, int i, int i2, C10626i c10626i) throws IOException {
        C10765q c10765q;
        boolean z;
        if (inputStream instanceof C10765q) {
            c10765q = (C10765q) inputStream;
            z = false;
        } else {
            c10765q = new C10765q(inputStream, this.f24612b);
            z = true;
        }
        C10887c m12034g = C10887c.m12034g(c10765q);
        try {
            return this.f24611a.m12418e(new C10890f(m12034g), i, i2, c10626i, new C10769a(c10765q, m12034g));
        } finally {
            m12034g.m12033m();
            if (z) {
                c10765q.m12387m();
            }
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10627j
    /* renamed from: d */
    public boolean mo12275b(InputStream inputStream, C10626i c10626i) throws IOException {
        return this.f24611a.m12410m(inputStream);
    }
}
