package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import io.intercom.com.bumptech.glide.ComponentCallbacks2C10478c;
import io.intercom.com.bumptech.glide.load.InterfaceC10629l;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import java.security.MessageDigest;
/* compiled from: DrawableTransformation.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.m */
/* loaded from: classes3.dex */
public class C10761m implements InterfaceC10629l<Drawable> {

    /* renamed from: b */
    private final InterfaceC10629l<Bitmap> f24594b;

    /* renamed from: c */
    private final boolean f24595c;

    public C10761m(InterfaceC10629l<Bitmap> interfaceC10629l, boolean z) {
        this.f24594b = interfaceC10629l;
        this.f24595c = z;
    }

    /* renamed from: b */
    private InterfaceC10569t<Drawable> m12396b(Context context, InterfaceC10569t<Bitmap> interfaceC10569t) {
        return C10764p.m12391e(context.getResources(), interfaceC10569t);
    }

    /* renamed from: a */
    public InterfaceC10629l<BitmapDrawable> m12397a() {
        return this;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l, io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public boolean equals(Object obj) {
        if (obj instanceof C10761m) {
            return this.f24594b.equals(((C10761m) obj).f24594b);
        }
        return false;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l, io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public int hashCode() {
        return this.f24594b.hashCode();
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10629l
    public InterfaceC10569t<Drawable> transform(Context context, InterfaceC10569t<Drawable> interfaceC10569t, int i, int i2) {
        InterfaceC10581e m13031f = ComponentCallbacks2C10478c.m13034c(context).m13031f();
        Drawable drawable = interfaceC10569t.get();
        InterfaceC10569t<Bitmap> m12400a = C10759l.m12400a(m13031f, drawable, i, i2);
        if (m12400a == null) {
            if (this.f24595c) {
                throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
            }
            return interfaceC10569t;
        }
        InterfaceC10569t<Bitmap> transform = this.f24594b.transform(context, m12400a, i, i2);
        if (transform.equals(m12400a)) {
            transform.mo12303b();
            return interfaceC10569t;
        }
        return m12396b(context, transform);
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10622g
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f24594b.updateDiskCacheKey(messageDigest);
    }
}
