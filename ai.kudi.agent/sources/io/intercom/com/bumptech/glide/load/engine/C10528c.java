package io.intercom.com.bumptech.glide.load.engine;

import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import java.security.MessageDigest;
/* compiled from: DataCacheKey.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.c */
/* loaded from: classes3.dex */
final class C10528c implements InterfaceC10622g {

    /* renamed from: b */
    private final InterfaceC10622g f24157b;

    /* renamed from: c */
    private final InterfaceC10622g f24158c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10528c(InterfaceC10622g interfaceC10622g, InterfaceC10622g interfaceC10622g2) {
        this.f24157b = interfaceC10622g;
        this.f24158c = interfaceC10622g2;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public boolean equals(Object obj) {
        if (obj instanceof C10528c) {
            C10528c c10528c = (C10528c) obj;
            return this.f24157b.equals(c10528c.f24157b) && this.f24158c.equals(c10528c.f24158c);
        }
        return false;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public int hashCode() {
        return (this.f24157b.hashCode() * 31) + this.f24158c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f24157b + ", signature=" + this.f24158c + '}';
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f24157b.updateDiskCacheKey(messageDigest);
        this.f24158c.updateDiskCacheKey(messageDigest);
    }
}
