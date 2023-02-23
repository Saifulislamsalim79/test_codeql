package io.intercom.com.bumptech.glide.load.p402o.p408h;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10764p;
import io.intercom.com.bumptech.glide.p416r.C10892h;
/* compiled from: BitmapDrawableTranscoder.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.h.b */
/* loaded from: classes3.dex */
public class C10807b implements InterfaceC10809d<Bitmap, BitmapDrawable> {

    /* renamed from: a */
    private final Resources f24682a;

    public C10807b(Resources resources) {
        C10892h.m12014d(resources);
        this.f24682a = resources;
    }

    @Override // io.intercom.com.bumptech.glide.load.p402o.p408h.InterfaceC10809d
    /* renamed from: a */
    public InterfaceC10569t<BitmapDrawable> mo12267a(InterfaceC10569t<Bitmap> interfaceC10569t, C10626i c10626i) {
        return C10764p.m12391e(this.f24682a, interfaceC10569t);
    }
}
