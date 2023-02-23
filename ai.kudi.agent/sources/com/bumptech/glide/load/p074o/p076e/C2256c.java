package com.bumptech.glide.load.p074o.p076e;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.InterfaceC2087u;
/* compiled from: NonOwnedDrawableResource.java */
/* renamed from: com.bumptech.glide.load.o.e.c */
/* loaded from: classes2.dex */
final class C2256c extends AbstractC2255b<Drawable> {
    private C2256c(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static InterfaceC2087u<Drawable> m33479e(Drawable drawable) {
        if (drawable != null) {
            return new C2256c(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: b */
    public void mo33303b() {
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: c */
    public Class<Drawable> mo33302c() {
        return this.f6594c.getClass();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    public int getSize() {
        return Math.max(1, this.f6594c.getIntrinsicWidth() * this.f6594c.getIntrinsicHeight() * 4);
    }
}
