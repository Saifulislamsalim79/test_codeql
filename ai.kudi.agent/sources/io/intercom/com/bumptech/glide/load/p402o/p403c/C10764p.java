package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10564p;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.p416r.C10892h;
/* compiled from: LazyBitmapDrawableResource.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.p */
/* loaded from: classes3.dex */
public final class C10764p implements InterfaceC10569t<BitmapDrawable>, InterfaceC10564p {

    /* renamed from: c */
    private final Resources f24601c;

    /* renamed from: d */
    private final InterfaceC10569t<Bitmap> f24602d;

    private C10764p(Resources resources, InterfaceC10569t<Bitmap> interfaceC10569t) {
        C10892h.m12014d(resources);
        this.f24601c = resources;
        C10892h.m12014d(interfaceC10569t);
        this.f24602d = interfaceC10569t;
    }

    /* renamed from: e */
    public static InterfaceC10569t<BitmapDrawable> m12391e(Resources resources, InterfaceC10569t<Bitmap> interfaceC10569t) {
        if (interfaceC10569t == null) {
            return null;
        }
        return new C10764p(resources, interfaceC10569t);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10564p
    /* renamed from: a */
    public void mo12304a() {
        InterfaceC10569t<Bitmap> interfaceC10569t = this.f24602d;
        if (interfaceC10569t instanceof InterfaceC10564p) {
            ((InterfaceC10564p) interfaceC10569t).mo12304a();
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: b */
    public void mo12303b() {
        this.f24602d.mo12303b();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: c */
    public Class<BitmapDrawable> mo12302c() {
        return BitmapDrawable.class;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: d */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f24601c, this.f24602d.get());
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    public int getSize() {
        return this.f24602d.getSize();
    }
}
