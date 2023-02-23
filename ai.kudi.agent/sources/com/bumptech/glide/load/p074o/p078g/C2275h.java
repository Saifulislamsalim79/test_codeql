package com.bumptech.glide.load.p074o.p078g;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2124j;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import com.bumptech.glide.load.resource.bitmap.C2293e;
import com.bumptech.glide.p065k.InterfaceC1965a;
/* compiled from: GifFrameResourceDecoder.java */
/* renamed from: com.bumptech.glide.load.o.g.h */
/* loaded from: classes2.dex */
public final class C2275h implements InterfaceC2124j<InterfaceC1965a, Bitmap> {

    /* renamed from: a */
    private final InterfaceC2100e f6642a;

    public C2275h(InterfaceC2100e interfaceC2100e) {
        this.f6642a = interfaceC2100e;
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: c */
    public InterfaceC2087u<Bitmap> mo33300b(InterfaceC1965a interfaceC1965a, int i, int i2, C2122h c2122h) {
        return C2293e.m33382e(interfaceC1965a.mo34031a(), this.f6642a);
    }

    @Override // com.bumptech.glide.load.InterfaceC2124j
    /* renamed from: d */
    public boolean mo33301a(InterfaceC1965a interfaceC1965a, C2122h c2122h) {
        return true;
    }
}
