package com.bumptech.glide.load.engine.p069z;

import android.graphics.Bitmap;
import com.bumptech.glide.p086q.C2381k;
/* compiled from: AttributeStrategy.java */
/* renamed from: com.bumptech.glide.load.engine.z.c */
/* loaded from: classes2.dex */
class C2096c implements InterfaceC2112l {

    /* renamed from: a */
    private final C2098b f6369a = new C2098b();

    /* renamed from: b */
    private final C2103h<C2097a, Bitmap> f6370b = new C2103h<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AttributeStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.z.c$a */
    /* loaded from: classes2.dex */
    public static class C2097a implements InterfaceC2113m {

        /* renamed from: a */
        private final C2098b f6371a;

        /* renamed from: b */
        private int f6372b;

        /* renamed from: c */
        private int f6373c;

        /* renamed from: d */
        private Bitmap.Config f6374d;

        public C2097a(C2098b c2098b) {
            this.f6371a = c2098b;
        }

        @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2113m
        /* renamed from: a */
        public void mo33673a() {
            this.f6371a.m33735c(this);
        }

        /* renamed from: b */
        public void m33739b(int i, int i2, Bitmap.Config config) {
            this.f6372b = i;
            this.f6373c = i2;
            this.f6374d = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2097a) {
                C2097a c2097a = (C2097a) obj;
                return this.f6372b == c2097a.f6372b && this.f6373c == c2097a.f6373c && this.f6374d == c2097a.f6374d;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f6372b * 31) + this.f6373c) * 31;
            Bitmap.Config config = this.f6374d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C2096c.m33741e(this.f6372b, this.f6373c, this.f6374d);
        }
    }

    /* compiled from: AttributeStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.z.c$b */
    /* loaded from: classes2.dex */
    static class C2098b extends AbstractC2099d<C2097a> {
        C2098b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.p069z.AbstractC2099d
        /* renamed from: d */
        public C2097a mo33671a() {
            return new C2097a(this);
        }

        /* renamed from: e */
        C2097a m33737e(int i, int i2, Bitmap.Config config) {
            C2097a m33736b = m33736b();
            m33736b.m33739b(i, i2, config);
            return m33736b;
        }
    }

    /* renamed from: e */
    static String m33741e(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: f */
    private static String m33740f(Bitmap bitmap) {
        return m33741e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2112l
    /* renamed from: a */
    public String mo33682a(int i, int i2, Bitmap.Config config) {
        return m33741e(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2112l
    /* renamed from: b */
    public int mo33681b(Bitmap bitmap) {
        return C2381k.m33121g(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2112l
    /* renamed from: c */
    public void mo33680c(Bitmap bitmap) {
        this.f6370b.m33729d(this.f6369a.m33737e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2112l
    /* renamed from: d */
    public String mo33679d(Bitmap bitmap) {
        return m33740f(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2112l
    public Bitmap get(int i, int i2, Bitmap.Config config) {
        return this.f6370b.m33732a(this.f6369a.m33737e(i, i2, config));
    }

    @Override // com.bumptech.glide.load.engine.p069z.InterfaceC2112l
    public Bitmap removeLast() {
        return this.f6370b.m33727f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f6370b;
    }
}
