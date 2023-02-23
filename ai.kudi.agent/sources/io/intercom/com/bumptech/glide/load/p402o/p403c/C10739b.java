package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10509c;
import io.intercom.com.bumptech.glide.load.InterfaceC10628k;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import java.io.File;
/* compiled from: BitmapDrawableEncoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.b */
/* loaded from: classes3.dex */
public class C10739b implements InterfaceC10628k<BitmapDrawable> {

    /* renamed from: a */
    private final InterfaceC10581e f24559a;

    /* renamed from: b */
    private final InterfaceC10628k<Bitmap> f24560b;

    public C10739b(InterfaceC10581e interfaceC10581e, InterfaceC10628k<Bitmap> interfaceC10628k) {
        this.f24559a = interfaceC10581e;
        this.f24560b = interfaceC10628k;
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10628k
    /* renamed from: a */
    public EnumC10509c mo12307a(C10626i c10626i) {
        return this.f24560b.mo12307a(c10626i);
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10510d
    /* renamed from: c */
    public boolean mo12306b(InterfaceC10569t<BitmapDrawable> interfaceC10569t, File file, C10626i c10626i) {
        return this.f24560b.mo12306b(new C10741d(interfaceC10569t.get().getBitmap(), this.f24559a), file, c10626i);
    }
}
