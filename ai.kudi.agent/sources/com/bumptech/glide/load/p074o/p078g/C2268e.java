package com.bumptech.glide.load.p074o.p078g;

import com.bumptech.glide.load.engine.InterfaceC2082q;
import com.bumptech.glide.load.p074o.p076e.AbstractC2255b;
/* compiled from: GifDrawableResource.java */
/* renamed from: com.bumptech.glide.load.o.g.e */
/* loaded from: classes2.dex */
public class C2268e extends AbstractC2255b<C2265c> implements InterfaceC2082q {
    public C2268e(C2265c c2265c) {
        super(c2265c);
    }

    @Override // com.bumptech.glide.load.p074o.p076e.AbstractC2255b, com.bumptech.glide.load.engine.InterfaceC2082q
    /* renamed from: a */
    public void mo33329a() {
        ((C2265c) this.f6594c).m33452e().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: b */
    public void mo33303b() {
        ((C2265c) this.f6594c).stop();
        ((C2265c) this.f6594c).m33446k();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    /* renamed from: c */
    public Class<C2265c> mo33302c() {
        return C2265c.class;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2087u
    public int getSize() {
        return ((C2265c) this.f6594c).m33448i();
    }
}
