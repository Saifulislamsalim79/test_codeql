package io.intercom.com.bumptech.glide.load.p402o.p407g;

import android.content.Context;
import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.bumptech.glide.load.InterfaceC10629l;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10741d;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.security.MessageDigest;
/* compiled from: GifDrawableTransformation.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.g.f */
/* loaded from: classes3.dex */
public class C10797f implements InterfaceC10629l<C10793c> {

    /* renamed from: b */
    private final InterfaceC10629l<Bitmap> f24653b;

    public C10797f(InterfaceC10629l<Bitmap> interfaceC10629l) {
        C10892h.m12014d(interfaceC10629l);
        this.f24653b = interfaceC10629l;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l, io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public boolean equals(Object obj) {
        if (obj instanceof C10797f) {
            return this.f24653b.equals(((C10797f) obj).f24653b);
        }
        return false;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l, io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public int hashCode() {
        return this.f24653b.hashCode();
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l
    public InterfaceC10569t<C10793c> transform(Context context, InterfaceC10569t<C10793c> interfaceC10569t, int i, int i2) {
        C10793c c10793c = interfaceC10569t.get();
        InterfaceC10569t<Bitmap> c10741d = new C10741d(c10793c.m12317e(), ComponentCallbacks2C10478c.m13034c(context).m13031f());
        InterfaceC10569t<Bitmap> transform = this.f24653b.transform(context, c10741d, i, i2);
        if (!c10741d.equals(transform)) {
            c10741d.mo12303b();
        }
        c10793c.m12310l(this.f24653b, transform.get());
        return interfaceC10569t;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f24653b.updateDiskCacheKey(messageDigest);
    }
}
