package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10564p;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import io.intercom.com.bumptech.glide.p416r.C10893i;
/* compiled from: BitmapResource.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.d */
/* loaded from: classes3.dex */
public class C10741d implements InterfaceC10569t<Bitmap>, InterfaceC10564p {

    /* renamed from: c */
    private final Bitmap f24563c;

    /* renamed from: d */
    private final InterfaceC10581e f24564d;

    public C10741d(Bitmap bitmap, InterfaceC10581e interfaceC10581e) {
        C10892h.m12013e(bitmap, "Bitmap must not be null");
        this.f24563c = bitmap;
        C10892h.m12013e(interfaceC10581e, "BitmapPool must not be null");
        this.f24564d = interfaceC10581e;
    }

    /* renamed from: e */
    public static C10741d m12447e(Bitmap bitmap, InterfaceC10581e interfaceC10581e) {
        if (bitmap == null) {
            return null;
        }
        return new C10741d(bitmap, interfaceC10581e);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10564p
    /* renamed from: a */
    public void mo12304a() {
        this.f24563c.prepareToDraw();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: b */
    public void mo12303b() {
        this.f24564d.mo12398c(this.f24563c);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: c */
    public Class<Bitmap> mo12302c() {
        return Bitmap.class;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: d */
    public Bitmap get() {
        return this.f24563c;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    public int getSize() {
        return C10893i.m12005h(this.f24563c);
    }
}
