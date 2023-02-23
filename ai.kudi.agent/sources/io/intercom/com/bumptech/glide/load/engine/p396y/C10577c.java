package io.intercom.com.bumptech.glide.load.engine.p396y;

import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.p416r.C10893i;
/* compiled from: AttributeStrategy.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.y.c */
/* loaded from: classes3.dex */
class C10577c implements InterfaceC10593l {

    /* renamed from: a */
    private final C10579b f24342a = new C10579b();

    /* renamed from: b */
    private final C10584h<C10578a, Bitmap> f24343b = new C10584h<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.y.c$a */
    /* loaded from: classes3.dex */
    public static class C10578a implements InterfaceC10594m {

        /* renamed from: a */
        private final C10579b f24344a;

        /* renamed from: b */
        private int f24345b;

        /* renamed from: c */
        private int f24346c;

        /* renamed from: d */
        private Bitmap.Config f24347d;

        public C10578a(C10579b c10579b) {
            this.f24344a = c10579b;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10594m
        /* renamed from: a */
        public void mo12647a() {
            this.f24344a.m12707c(this);
        }

        /* renamed from: b */
        public void m12711b(int i, int i2, Bitmap.Config config) {
            this.f24345b = i;
            this.f24346c = i2;
            this.f24347d = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C10578a) {
                C10578a c10578a = (C10578a) obj;
                return this.f24345b == c10578a.f24345b && this.f24346c == c10578a.f24346c && this.f24347d == c10578a.f24347d;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f24345b * 31) + this.f24346c) * 31;
            Bitmap.Config config = this.f24347d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C10577c.m12713e(this.f24345b, this.f24346c, this.f24347d);
        }
    }

    /* compiled from: AttributeStrategy.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.y.c$b */
    /* loaded from: classes3.dex */
    static class C10579b extends AbstractC10580d<C10578a> {
        C10579b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.intercom.com.bumptech.glide.load.engine.p396y.AbstractC10580d
        /* renamed from: d */
        public C10578a mo12645a() {
            return new C10578a(this);
        }

        /* renamed from: e */
        C10578a m12709e(int i, int i2, Bitmap.Config config) {
            C10578a m12708b = m12708b();
            m12708b.m12711b(i, i2, config);
            return m12708b;
        }
    }

    /* renamed from: e */
    static String m12713e(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: f */
    private static String m12712f(Bitmap bitmap) {
        return m12713e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10593l
    /* renamed from: a */
    public String mo12656a(int i, int i2, Bitmap.Config config) {
        return m12713e(i, i2, config);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10593l
    /* renamed from: b */
    public int mo12655b(Bitmap bitmap) {
        return C10893i.m12005h(bitmap);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10593l
    /* renamed from: c */
    public void mo12654c(Bitmap bitmap) {
        this.f24343b.m12701d(this.f24342a.m12709e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10593l
    /* renamed from: d */
    public String mo12653d(Bitmap bitmap) {
        return m12712f(bitmap);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10593l
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        return this.f24343b.m12704a(this.f24342a.m12709e(i, i2, config));
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10593l
    public Bitmap removeLast() {
        return this.f24343b.m12699f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f24343b;
    }
}
