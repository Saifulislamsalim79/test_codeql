package com.bumptech.glide.load.p072n.p073y;

import android.net.Uri;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.p072n.C2186g;
import com.bumptech.glide.load.p072n.C2207r;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.load.p072n.InterfaceC2201o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: HttpUriLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.b */
/* loaded from: classes2.dex */
public class C2233b implements InterfaceC2199n<Uri, InputStream> {

    /* renamed from: b */
    private static final Set<String> f6557b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    private final InterfaceC2199n<C2186g, InputStream> f6558a;

    /* compiled from: HttpUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.b$a */
    /* loaded from: classes2.dex */
    public static class C2234a implements InterfaceC2201o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Uri, InputStream> mo33496b(C2207r c2207r) {
            return new C2233b(c2207r.m33540d(C2186g.class, InputStream.class));
        }
    }

    public C2233b(InterfaceC2199n<C2186g, InputStream> interfaceC2199n) {
        this.f6558a = interfaceC2199n;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<InputStream> mo33499b(Uri uri, int i, int i2, C2122h c2122h) {
        return this.f6558a.mo33499b(new C2186g(uri.toString()), i, i2, c2122h);
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(Uri uri) {
        return f6557b.contains(uri.getScheme());
    }
}
