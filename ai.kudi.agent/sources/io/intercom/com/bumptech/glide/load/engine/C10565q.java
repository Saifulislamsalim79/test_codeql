package io.intercom.com.bumptech.glide.load.engine;

import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import java.util.HashMap;
import java.util.Map;
/* compiled from: Jobs.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.q */
/* loaded from: classes3.dex */
final class C10565q {

    /* renamed from: a */
    private final Map<InterfaceC10622g, C10556k<?>> f24304a = new HashMap();

    /* renamed from: b */
    private final Map<InterfaceC10622g, C10556k<?>> f24305b = new HashMap();

    /* renamed from: b */
    private Map<InterfaceC10622g, C10556k<?>> m12732b(boolean z) {
        return z ? this.f24305b : this.f24304a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C10556k<?> m12733a(InterfaceC10622g interfaceC10622g, boolean z) {
        return m12732b(z).get(interfaceC10622g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m12731c(InterfaceC10622g interfaceC10622g, C10556k<?> c10556k) {
        m12732b(c10556k.m12747n()).put(interfaceC10622g, c10556k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m12730d(InterfaceC10622g interfaceC10622g, C10556k<?> c10556k) {
        Map<InterfaceC10622g, C10556k<?>> m12732b = m12732b(c10556k.m12747n());
        if (c10556k.equals(m12732b.get(interfaceC10622g))) {
            m12732b.remove(interfaceC10622g);
        }
    }
}
