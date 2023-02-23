package com.bumptech.glide.load.engine.p067a0;

import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.engine.InterfaceC2087u;
import com.bumptech.glide.load.engine.p067a0.InterfaceC2025h;
import com.bumptech.glide.p086q.C2377g;
/* compiled from: LruResourceCache.java */
/* renamed from: com.bumptech.glide.load.engine.a0.g */
/* loaded from: classes2.dex */
public class C2024g extends C2377g<InterfaceC2118f, InterfaceC2087u<?>> implements InterfaceC2025h {

    /* renamed from: d */
    private InterfaceC2025h.InterfaceC2026a f6126d;

    public C2024g(long j) {
        super(j);
    }

    @Override // com.bumptech.glide.load.engine.p067a0.InterfaceC2025h
    /* renamed from: a */
    public void mo33911a(int i) {
        if (i >= 40) {
            m33144b();
        } else if (i >= 20 || i == 15) {
            m33136m(m33141h() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.p067a0.InterfaceC2025h
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC2087u mo33909c(InterfaceC2118f interfaceC2118f, InterfaceC2087u interfaceC2087u) {
        return (InterfaceC2087u) super.m33138k(interfaceC2118f, interfaceC2087u);
    }

    @Override // com.bumptech.glide.load.engine.p067a0.InterfaceC2025h
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC2087u mo33908d(InterfaceC2118f interfaceC2118f) {
        return (InterfaceC2087u) super.m33137l(interfaceC2118f);
    }

    @Override // com.bumptech.glide.load.engine.p067a0.InterfaceC2025h
    /* renamed from: e */
    public void mo33907e(InterfaceC2025h.InterfaceC2026a interfaceC2026a) {
        this.f6126d = interfaceC2026a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.p086q.C2377g
    /* renamed from: n */
    public int mo33140i(InterfaceC2087u<?> interfaceC2087u) {
        if (interfaceC2087u == null) {
            return super.mo33140i(null);
        }
        return interfaceC2087u.getSize();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.p086q.C2377g
    /* renamed from: o */
    public void mo33139j(InterfaceC2118f interfaceC2118f, InterfaceC2087u<?> interfaceC2087u) {
        InterfaceC2025h.InterfaceC2026a interfaceC2026a = this.f6126d;
        if (interfaceC2026a == null || interfaceC2087u == null) {
            return;
        }
        interfaceC2026a.mo33812a(interfaceC2087u);
    }
}
