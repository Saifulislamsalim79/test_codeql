package com.bumptech.glide.load.p072n.p073y;

import com.bumptech.glide.load.C2119g;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.p070m.C2140j;
import com.bumptech.glide.load.p072n.C2186g;
import com.bumptech.glide.load.p072n.C2196m;
import com.bumptech.glide.load.p072n.C2207r;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.load.p072n.InterfaceC2201o;
import java.io.InputStream;
/* compiled from: HttpGlideUrlLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.a */
/* loaded from: classes2.dex */
public class C2231a implements InterfaceC2199n<C2186g, InputStream> {

    /* renamed from: b */
    public static final C2119g<Integer> f6554b = C2119g.m33663f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    private final C2196m<C2186g, C2186g> f6555a;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.a$a */
    /* loaded from: classes2.dex */
    public static class C2232a implements InterfaceC2201o<C2186g, InputStream> {

        /* renamed from: a */
        private final C2196m<C2186g, C2186g> f6556a = new C2196m<>(500);

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<C2186g, InputStream> mo33496b(C2207r c2207r) {
            return new C2231a(this.f6556a);
        }
    }

    public C2231a(C2196m<C2186g, C2186g> c2196m) {
        this.f6555a = c2196m;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<InputStream> mo33499b(C2186g c2186g, int i, int i2, C2122h c2122h) {
        C2196m<C2186g, C2186g> c2196m = this.f6555a;
        if (c2196m != null) {
            C2186g m33560a = c2196m.m33560a(c2186g, 0, 0);
            if (m33560a == null) {
                this.f6555a.m33559b(c2186g, 0, 0, c2186g);
            } else {
                c2186g = m33560a;
            }
        }
        return new InterfaceC2199n.C2200a<>(c2186g, new C2140j(c2186g, ((Integer) c2122h.m33661b(f6554b)).intValue()));
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(C2186g c2186g) {
        return true;
    }
}
