package io.intercom.com.bumptech.glide.p415q;

import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.security.MessageDigest;
/* compiled from: ObjectKey.java */
/* renamed from: io.intercom.com.bumptech.glide.q.b */
/* loaded from: classes3.dex */
public final class C10882b implements InterfaceC10622g {

    /* renamed from: b */
    private final Object f24843b;

    public C10882b(Object obj) {
        C10892h.m12014d(obj);
        this.f24843b = obj;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public boolean equals(Object obj) {
        if (obj instanceof C10882b) {
            return this.f24843b.equals(((C10882b) obj).f24843b);
        }
        return false;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public int hashCode() {
        return this.f24843b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f24843b + '}';
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f24843b.toString().getBytes(InterfaceC10622g.f24418a));
    }
}
