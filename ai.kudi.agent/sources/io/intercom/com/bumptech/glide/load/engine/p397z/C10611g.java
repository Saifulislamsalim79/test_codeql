package io.intercom.com.bumptech.glide.load.engine.p397z;

import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10569t;
import io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10612h;
import io.intercom.com.bumptech.glide.p416r.C10889e;
/* compiled from: LruResourceCache.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.z.g */
/* loaded from: classes3.dex */
public class C10611g extends C10889e<InterfaceC10622g, InterfaceC10569t<?>> implements InterfaceC10612h {

    /* renamed from: d */
    private InterfaceC10612h.InterfaceC10613a f24399d;

    public C10611g(long j) {
        super(j);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10612h
    /* renamed from: a */
    public void mo12630a(int i) {
        if (i >= 40) {
            m12030b();
        } else if (i >= 20) {
            m12022m(m12027h() / 2);
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10612h
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC10569t mo12628c(InterfaceC10622g interfaceC10622g) {
        return (InterfaceC10569t) super.m12023l(interfaceC10622g);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10612h
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC10569t mo12627d(InterfaceC10622g interfaceC10622g, InterfaceC10569t interfaceC10569t) {
        return (InterfaceC10569t) super.m12024k(interfaceC10622g, interfaceC10569t);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10612h
    /* renamed from: e */
    public void mo12626e(InterfaceC10612h.InterfaceC10613a interfaceC10613a) {
        this.f24399d = interfaceC10613a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.intercom.com.bumptech.glide.p416r.C10889e
    /* renamed from: n */
    public int mo12026i(InterfaceC10569t<?> interfaceC10569t) {
        return interfaceC10569t.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.intercom.com.bumptech.glide.p416r.C10889e
    /* renamed from: o */
    public void mo12025j(InterfaceC10622g interfaceC10622g, InterfaceC10569t<?> interfaceC10569t) {
        InterfaceC10612h.InterfaceC10613a interfaceC10613a = this.f24399d;
        if (interfaceC10613a == null || interfaceC10569t == null) {
            return;
        }
        interfaceC10613a.mo12625b(interfaceC10569t);
    }
}
