package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.InterfaceC2118f;
import java.util.HashMap;
import java.util.Map;
/* compiled from: Jobs.java */
/* renamed from: com.bumptech.glide.load.engine.r */
/* loaded from: classes2.dex */
final class C2083r {

    /* renamed from: a */
    private final Map<InterfaceC2118f, C2071l<?>> f6329a = new HashMap();

    /* renamed from: b */
    private final Map<InterfaceC2118f, C2071l<?>> f6330b = new HashMap();

    /* renamed from: b */
    private Map<InterfaceC2118f, C2071l<?>> m33764b(boolean z) {
        return z ? this.f6330b : this.f6329a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C2071l<?> m33765a(InterfaceC2118f interfaceC2118f, boolean z) {
        return m33764b(z).get(interfaceC2118f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m33763c(InterfaceC2118f interfaceC2118f, C2071l<?> c2071l) {
        m33764b(c2071l.m33783p()).put(interfaceC2118f, c2071l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m33762d(InterfaceC2118f interfaceC2118f, C2071l<?> c2071l) {
        Map<InterfaceC2118f, C2071l<?>> m33764b = m33764b(c2071l.m33783p());
        if (c2071l.equals(m33764b.get(interfaceC2118f))) {
            m33764b.remove(interfaceC2118f);
        }
    }
}
