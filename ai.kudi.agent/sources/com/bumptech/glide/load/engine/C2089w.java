package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.InterfaceC2126l;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.p086q.C2377g;
import com.bumptech.glide.p086q.C2381k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: ResourceCacheKey.java */
/* renamed from: com.bumptech.glide.load.engine.w */
/* loaded from: classes2.dex */
final class C2089w implements InterfaceC2118f {

    /* renamed from: j */
    private static final C2377g<Class<?>, byte[]> f6349j = new C2377g<>(50);

    /* renamed from: b */
    private final InterfaceC2095b f6350b;

    /* renamed from: c */
    private final InterfaceC2118f f6351c;

    /* renamed from: d */
    private final InterfaceC2118f f6352d;

    /* renamed from: e */
    private final int f6353e;

    /* renamed from: f */
    private final int f6354f;

    /* renamed from: g */
    private final Class<?> f6355g;

    /* renamed from: h */
    private final C2122h f6356h;

    /* renamed from: i */
    private final InterfaceC2126l<?> f6357i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2089w(InterfaceC2095b interfaceC2095b, InterfaceC2118f interfaceC2118f, InterfaceC2118f interfaceC2118f2, int i, int i2, InterfaceC2126l<?> interfaceC2126l, Class<?> cls, C2122h c2122h) {
        this.f6350b = interfaceC2095b;
        this.f6351c = interfaceC2118f;
        this.f6352d = interfaceC2118f2;
        this.f6353e = i;
        this.f6354f = i2;
        this.f6357i = interfaceC2126l;
        this.f6355g = cls;
        this.f6356h = c2122h;
    }

    /* renamed from: b */
    private byte[] m33753b() {
        byte[] m33142g = f6349j.m33142g(this.f6355g);
        if (m33142g == null) {
            byte[] bytes = this.f6355g.getName().getBytes(InterfaceC2118f.f6413a);
            f6349j.m33138k(this.f6355g, bytes);
            return bytes;
        }
        return m33142g;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public boolean equals(Object obj) {
        if (obj instanceof C2089w) {
            C2089w c2089w = (C2089w) obj;
            return this.f6354f == c2089w.f6354f && this.f6353e == c2089w.f6353e && C2381k.m33125c(this.f6357i, c2089w.f6357i) && this.f6355g.equals(c2089w.f6355g) && this.f6351c.equals(c2089w.f6351c) && this.f6352d.equals(c2089w.f6352d) && this.f6356h.equals(c2089w.f6356h);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public int hashCode() {
        int hashCode = (((((this.f6351c.hashCode() * 31) + this.f6352d.hashCode()) * 31) + this.f6353e) * 31) + this.f6354f;
        InterfaceC2126l<?> interfaceC2126l = this.f6357i;
        if (interfaceC2126l != null) {
            hashCode = (hashCode * 31) + interfaceC2126l.hashCode();
        }
        return (((hashCode * 31) + this.f6355g.hashCode()) * 31) + this.f6356h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f6351c + ", signature=" + this.f6352d + ", width=" + this.f6353e + ", height=" + this.f6354f + ", decodedResourceClass=" + this.f6355g + ", transformation='" + this.f6357i + "', options=" + this.f6356h + '}';
    }

    @Override // com.bumptech.glide.load.InterfaceC2118f
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f6350b.mo33716c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f6353e).putInt(this.f6354f).array();
        this.f6352d.updateDiskCacheKey(messageDigest);
        this.f6351c.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        InterfaceC2126l<?> interfaceC2126l = this.f6357i;
        if (interfaceC2126l != null) {
            interfaceC2126l.updateDiskCacheKey(messageDigest);
        }
        this.f6356h.updateDiskCacheKey(messageDigest);
        messageDigest.update(m33753b());
        this.f6350b.mo33715d(bArr);
    }
}
