package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.InterfaceC2126l;
import com.bumptech.glide.p086q.C2380j;
import java.security.MessageDigest;
import java.util.Map;
/* compiled from: EngineKey.java */
/* renamed from: com.bumptech.glide.load.engine.n */
/* loaded from: classes2.dex */
class C2078n implements InterfaceC2118f {

    /* renamed from: b */
    private final Object f6313b;

    /* renamed from: c */
    private final int f6314c;

    /* renamed from: d */
    private final int f6315d;

    /* renamed from: e */
    private final Class<?> f6316e;

    /* renamed from: f */
    private final Class<?> f6317f;

    /* renamed from: g */
    private final InterfaceC2118f f6318g;

    /* renamed from: h */
    private final Map<Class<?>, InterfaceC2126l<?>> f6319h;

    /* renamed from: i */
    private final C2122h f6320i;

    /* renamed from: j */
    private int f6321j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2078n(Object obj, InterfaceC2118f interfaceC2118f, int i, int i2, Map<Class<?>, InterfaceC2126l<?>> map, Class<?> cls, Class<?> cls2, C2122h c2122h) {
        C2380j.m33129d(obj);
        this.f6313b = obj;
        C2380j.m33128e(interfaceC2118f, "Signature must not be null");
        this.f6318g = interfaceC2118f;
        this.f6314c = i;
        this.f6315d = i2;
        C2380j.m33129d(map);
        this.f6319h = map;
        C2380j.m33128e(cls, "Resource class must not be null");
        this.f6316e = cls;
        C2380j.m33128e(cls2, "Transcode class must not be null");
        this.f6317f = cls2;
        C2380j.m33129d(c2122h);
        this.f6320i = c2122h;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public boolean equals(Object obj) {
        if (obj instanceof C2078n) {
            C2078n c2078n = (C2078n) obj;
            return this.f6313b.equals(c2078n.f6313b) && this.f6318g.equals(c2078n.f6318g) && this.f6315d == c2078n.f6315d && this.f6314c == c2078n.f6314c && this.f6319h.equals(c2078n.f6319h) && this.f6316e.equals(c2078n.f6316e) && this.f6317f.equals(c2078n.f6317f) && this.f6320i.equals(c2078n.f6320i);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public int hashCode() {
        if (this.f6321j == 0) {
            int hashCode = this.f6313b.hashCode();
            this.f6321j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f6318g.hashCode();
            this.f6321j = hashCode2;
            int i = (hashCode2 * 31) + this.f6314c;
            this.f6321j = i;
            int i2 = (i * 31) + this.f6315d;
            this.f6321j = i2;
            int hashCode3 = (i2 * 31) + this.f6319h.hashCode();
            this.f6321j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f6316e.hashCode();
            this.f6321j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f6317f.hashCode();
            this.f6321j = hashCode5;
            this.f6321j = (hashCode5 * 31) + this.f6320i.hashCode();
        }
        return this.f6321j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f6313b + ", width=" + this.f6314c + ", height=" + this.f6315d + ", resourceClass=" + this.f6316e + ", transcodeClass=" + this.f6317f + ", signature=" + this.f6318g + ", hashCode=" + this.f6321j + ", transformations=" + this.f6319h + ", options=" + this.f6320i + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
