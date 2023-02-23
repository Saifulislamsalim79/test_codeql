package io.intercom.com.bumptech.glide.p411o;

import io.intercom.com.bumptech.glide.load.InterfaceC10511e;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ImageHeaderParserRegistry.java */
/* renamed from: io.intercom.com.bumptech.glide.o.b */
/* loaded from: classes3.dex */
public final class C10841b {

    /* renamed from: a */
    private final List<InterfaceC10511e> f24724a = new ArrayList();

    /* renamed from: a */
    public synchronized void m12204a(InterfaceC10511e interfaceC10511e) {
        this.f24724a.add(interfaceC10511e);
    }

    /* renamed from: b */
    public synchronized List<InterfaceC10511e> m12203b() {
        return this.f24724a;
    }
}
