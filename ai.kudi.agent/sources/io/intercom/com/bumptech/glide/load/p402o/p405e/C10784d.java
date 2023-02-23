package io.intercom.com.bumptech.glide.load.p402o.p405e;

import android.graphics.drawable.Drawable;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
/* compiled from: NonOwnedDrawableResource.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.e.d */
/* loaded from: classes3.dex */
final class C10784d extends AbstractC10782b<Drawable> {
    private C10784d(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static InterfaceC10569t<Drawable> m12342e(Drawable drawable) {
        return new C10784d(drawable);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: b */
    public void mo12303b() {
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: c */
    public Class<Drawable> mo12302c() {
        return this.f24630c.getClass();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    public int getSize() {
        return Math.max(1, this.f24630c.getIntrinsicWidth() * this.f24630c.getIntrinsicHeight() * 4);
    }
}
