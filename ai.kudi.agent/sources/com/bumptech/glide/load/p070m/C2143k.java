package com.bumptech.glide.load.p070m;

import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.load.p070m.InterfaceC2132e;
import com.bumptech.glide.load.resource.bitmap.C2315r;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: InputStreamRewinder.java */
/* renamed from: com.bumptech.glide.load.m.k */
/* loaded from: classes2.dex */
public final class C2143k implements InterfaceC2132e<InputStream> {

    /* renamed from: a */
    private final C2315r f6445a;

    /* compiled from: InputStreamRewinder.java */
    /* renamed from: com.bumptech.glide.load.m.k$a */
    /* loaded from: classes2.dex */
    public static final class C2144a implements InterfaceC2132e.InterfaceC2133a<InputStream> {

        /* renamed from: a */
        private final InterfaceC2095b f6446a;

        public C2144a(InterfaceC2095b interfaceC2095b) {
            this.f6446a = interfaceC2095b;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2132e.InterfaceC2133a
        /* renamed from: a */
        public Class<InputStream> mo33489a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2132e.InterfaceC2133a
        /* renamed from: c */
        public InterfaceC2132e<InputStream> mo33488b(InputStream inputStream) {
            return new C2143k(inputStream, this.f6446a);
        }
    }

    public C2143k(InputStream inputStream, InterfaceC2095b interfaceC2095b) {
        C2315r c2315r = new C2315r(inputStream, interfaceC2095b);
        this.f6445a = c2315r;
        c2315r.mark(5242880);
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2132e
    /* renamed from: b */
    public void mo33491b() {
        this.f6445a.m33321m();
    }

    /* renamed from: c */
    public void m33641c() {
        this.f6445a.m33322g();
    }

    @Override // com.bumptech.glide.load.p070m.InterfaceC2132e
    /* renamed from: d */
    public InputStream mo33492a() throws IOException {
        this.f6445a.reset();
        return this.f6445a;
    }
}
