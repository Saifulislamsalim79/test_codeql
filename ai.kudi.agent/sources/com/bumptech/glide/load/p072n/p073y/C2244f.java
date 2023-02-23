package com.bumptech.glide.load.p072n.p073y;

import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.p072n.C2186g;
import com.bumptech.glide.load.p072n.C2207r;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.load.p072n.InterfaceC2201o;
import java.io.InputStream;
import java.net.URL;
/* compiled from: UrlLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.f */
/* loaded from: classes2.dex */
public class C2244f implements InterfaceC2199n<URL, InputStream> {

    /* renamed from: a */
    private final InterfaceC2199n<C2186g, InputStream> f6580a;

    /* compiled from: UrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.f$a */
    /* loaded from: classes2.dex */
    public static class C2245a implements InterfaceC2201o<URL, InputStream> {
        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<URL, InputStream> mo33496b(C2207r c2207r) {
            return new C2244f(c2207r.m33540d(C2186g.class, InputStream.class));
        }
    }

    public C2244f(InterfaceC2199n<C2186g, InputStream> interfaceC2199n) {
        this.f6580a = interfaceC2199n;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<InputStream> mo33499b(URL url, int i, int i2, C2122h c2122h) {
        return this.f6580a.mo33499b(new C2186g(url), i, i2, c2122h);
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(URL url) {
        return true;
    }
}
