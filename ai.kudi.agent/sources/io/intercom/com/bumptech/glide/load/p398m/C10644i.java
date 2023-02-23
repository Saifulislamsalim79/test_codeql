package io.intercom.com.bumptech.glide.load.p398m;

import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10765q;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: InputStreamRewinder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.m.i */
/* loaded from: classes3.dex */
public final class C10644i implements InterfaceC10633c<InputStream> {

    /* renamed from: a */
    private final C10765q f24443a;

    /* compiled from: InputStreamRewinder.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.m.i$a */
    /* loaded from: classes3.dex */
    public static final class C10645a implements InterfaceC10633c.InterfaceC10634a<InputStream> {

        /* renamed from: a */
        private final InterfaceC10576b f24444a;

        public C10645a(InterfaceC10576b interfaceC10576b) {
            this.f24444a = interfaceC10576b;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c.InterfaceC10634a
        /* renamed from: a */
        public Class<InputStream> mo12355a() {
            return InputStream.class;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c.InterfaceC10634a
        /* renamed from: c */
        public InterfaceC10633c<InputStream> mo12354b(InputStream inputStream) {
            return new C10644i(inputStream, this.f24444a);
        }
    }

    C10644i(InputStream inputStream, InterfaceC10576b interfaceC10576b) {
        C10765q c10765q = new C10765q(inputStream, interfaceC10576b);
        this.f24443a = c10765q;
        c10765q.mark(5242880);
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c
    /* renamed from: b */
    public void mo12357b() {
        this.f24443a.m12387m();
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c
    /* renamed from: c */
    public InputStream mo12358a() throws IOException {
        this.f24443a.reset();
        return this.f24443a;
    }
}
