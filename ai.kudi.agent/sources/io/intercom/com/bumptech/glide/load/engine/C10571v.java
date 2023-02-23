package io.intercom.com.bumptech.glide.load.engine;

import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.InterfaceC10629l;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.p416r.C10889e;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: ResourceCacheKey.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.v */
/* loaded from: classes3.dex */
final class C10571v implements InterfaceC10622g {

    /* renamed from: j */
    private static final C10889e<Class<?>, byte[]> f24324j = new C10889e<>(50);

    /* renamed from: b */
    private final InterfaceC10576b f24325b;

    /* renamed from: c */
    private final InterfaceC10622g f24326c;

    /* renamed from: d */
    private final InterfaceC10622g f24327d;

    /* renamed from: e */
    private final int f24328e;

    /* renamed from: f */
    private final int f24329f;

    /* renamed from: g */
    private final Class<?> f24330g;

    /* renamed from: h */
    private final C10626i f24331h;

    /* renamed from: i */
    private final InterfaceC10629l<?> f24332i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10571v(InterfaceC10576b interfaceC10576b, InterfaceC10622g interfaceC10622g, InterfaceC10622g interfaceC10622g2, int i, int i2, InterfaceC10629l<?> interfaceC10629l, Class<?> cls, C10626i c10626i) {
        this.f24325b = interfaceC10576b;
        this.f24326c = interfaceC10622g;
        this.f24327d = interfaceC10622g2;
        this.f24328e = i;
        this.f24329f = i2;
        this.f24332i = interfaceC10629l;
        this.f24330g = cls;
        this.f24331h = c10626i;
    }

    /* renamed from: a */
    private byte[] m12721a() {
        byte[] m12028g = f24324j.m12028g(this.f24330g);
        if (m12028g == null) {
            byte[] bytes = this.f24330g.getName().getBytes(InterfaceC10622g.f24418a);
            f24324j.m12024k(this.f24330g, bytes);
            return bytes;
        }
        return m12028g;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public boolean equals(Object obj) {
        if (obj instanceof C10571v) {
            C10571v c10571v = (C10571v) obj;
            return this.f24329f == c10571v.f24329f && this.f24328e == c10571v.f24328e && C10893i.m12009d(this.f24332i, c10571v.f24332i) && this.f24330g.equals(c10571v.f24330g) && this.f24326c.equals(c10571v.f24326c) && this.f24327d.equals(c10571v.f24327d) && this.f24331h.equals(c10571v.f24331h);
        }
        return false;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public int hashCode() {
        int hashCode = (((((this.f24326c.hashCode() * 31) + this.f24327d.hashCode()) * 31) + this.f24328e) * 31) + this.f24329f;
        InterfaceC10629l<?> interfaceC10629l = this.f24332i;
        if (interfaceC10629l != null) {
            hashCode = (hashCode * 31) + interfaceC10629l.hashCode();
        }
        return (((hashCode * 31) + this.f24330g.hashCode()) * 31) + this.f24331h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f24326c + ", signature=" + this.f24327d + ", width=" + this.f24328e + ", height=" + this.f24329f + ", decodedResourceClass=" + this.f24330g + ", transformation='" + this.f24332i + "', options=" + this.f24331h + '}';
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f24325b.mo12688c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f24328e).putInt(this.f24329f).array();
        this.f24327d.updateDiskCacheKey(messageDigest);
        this.f24326c.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        InterfaceC10629l<?> interfaceC10629l = this.f24332i;
        if (interfaceC10629l != null) {
            interfaceC10629l.updateDiskCacheKey(messageDigest);
        }
        this.f24331h.updateDiskCacheKey(messageDigest);
        messageDigest.update(m12721a());
        this.f24325b.mo12687d(bArr);
    }
}
