package io.intercom.com.bumptech.glide.load.engine;

import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.InterfaceC10629l;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.security.MessageDigest;
import java.util.Map;
/* compiled from: EngineKey.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.m */
/* loaded from: classes3.dex */
class C10560m implements InterfaceC10622g {

    /* renamed from: b */
    private final Object f24288b;

    /* renamed from: c */
    private final int f24289c;

    /* renamed from: d */
    private final int f24290d;

    /* renamed from: e */
    private final Class<?> f24291e;

    /* renamed from: f */
    private final Class<?> f24292f;

    /* renamed from: g */
    private final InterfaceC10622g f24293g;

    /* renamed from: h */
    private final Map<Class<?>, InterfaceC10629l<?>> f24294h;

    /* renamed from: i */
    private final C10626i f24295i;

    /* renamed from: j */
    private int f24296j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10560m(Object obj, InterfaceC10622g interfaceC10622g, int i, int i2, Map<Class<?>, InterfaceC10629l<?>> map, Class<?> cls, Class<?> cls2, C10626i c10626i) {
        C10892h.m12014d(obj);
        this.f24288b = obj;
        C10892h.m12013e(interfaceC10622g, "Signature must not be null");
        this.f24293g = interfaceC10622g;
        this.f24289c = i;
        this.f24290d = i2;
        C10892h.m12014d(map);
        this.f24294h = map;
        C10892h.m12013e(cls, "Resource class must not be null");
        this.f24291e = cls;
        C10892h.m12013e(cls2, "Transcode class must not be null");
        this.f24292f = cls2;
        C10892h.m12014d(c10626i);
        this.f24295i = c10626i;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public boolean equals(Object obj) {
        if (obj instanceof C10560m) {
            C10560m c10560m = (C10560m) obj;
            return this.f24288b.equals(c10560m.f24288b) && this.f24293g.equals(c10560m.f24293g) && this.f24290d == c10560m.f24290d && this.f24289c == c10560m.f24289c && this.f24294h.equals(c10560m.f24294h) && this.f24291e.equals(c10560m.f24291e) && this.f24292f.equals(c10560m.f24292f) && this.f24295i.equals(c10560m.f24295i);
        }
        return false;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public int hashCode() {
        if (this.f24296j == 0) {
            int hashCode = this.f24288b.hashCode();
            this.f24296j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f24293g.hashCode();
            this.f24296j = hashCode2;
            int i = (hashCode2 * 31) + this.f24289c;
            this.f24296j = i;
            int i2 = (i * 31) + this.f24290d;
            this.f24296j = i2;
            int hashCode3 = (i2 * 31) + this.f24294h.hashCode();
            this.f24296j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f24291e.hashCode();
            this.f24296j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f24292f.hashCode();
            this.f24296j = hashCode5;
            this.f24296j = (hashCode5 * 31) + this.f24295i.hashCode();
        }
        return this.f24296j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f24288b + ", width=" + this.f24289c + ", height=" + this.f24290d + ", resourceClass=" + this.f24291e + ", transcodeClass=" + this.f24292f + ", signature=" + this.f24293g + ", hashCode=" + this.f24296j + ", transformations=" + this.f24294h + ", options=" + this.f24295i + '}';
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
