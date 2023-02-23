package io.intercom.com.bumptech.glide.load.p402o.p407g;

import io.intercom.com.bumptech.glide.load.engine.InterfaceC10564p;
import io.intercom.com.bumptech.glide.load.p402o.p405e.AbstractC10782b;
/* compiled from: GifDrawableResource.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.g.e */
/* loaded from: classes3.dex */
public class C10796e extends AbstractC10782b<C10793c> implements InterfaceC10564p {
    public C10796e(C10793c c10793c) {
        super(c10793c);
    }

    @Override // io.intercom.com.bumptech.glide.load.p402o.p405e.AbstractC10782b, io.intercom.com.bumptech.glide.load.engine.InterfaceC10564p
    /* renamed from: a */
    public void mo12304a() {
        ((C10793c) this.f24630c).m12317e().prepareToDraw();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: b */
    public void mo12303b() {
        ((C10793c) this.f24630c).stop();
        ((C10793c) this.f24630c).m12312j();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    /* renamed from: c */
    public Class<C10793c> mo12302c() {
        return C10793c.class;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t
    public int getSize() {
        return ((C10793c) this.f24630c).m12313i();
    }
}
