package com.bumptech.glide.load.p072n.p073y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.p070m.p071p.C2152b;
import com.bumptech.glide.load.p070m.p071p.C2153c;
import com.bumptech.glide.load.p072n.C2207r;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.load.p072n.InterfaceC2201o;
import com.bumptech.glide.load.resource.bitmap.C2324w;
import com.bumptech.glide.p085p.C2366b;
import java.io.InputStream;
/* compiled from: MediaStoreVideoThumbLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.d */
/* loaded from: classes2.dex */
public class C2237d implements InterfaceC2199n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f6561a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.d$a */
    /* loaded from: classes2.dex */
    public static class C2238a implements InterfaceC2201o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f6562a;

        public C2238a(Context context) {
            this.f6562a = context;
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Uri, InputStream> mo33496b(C2207r c2207r) {
            return new C2237d(this.f6562a);
        }
    }

    public C2237d(Context context) {
        this.f6561a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m33510e(C2122h c2122h) {
        Long l = (Long) c2122h.m33661b(C2324w.f6735d);
        return l != null && l.longValue() == -1;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<InputStream> mo33499b(Uri uri, int i, int i2, C2122h c2122h) {
        if (C2152b.m33618d(i, i2) && m33510e(c2122h)) {
            return new InterfaceC2199n.C2200a<>(new C2366b(uri), C2153c.m33614f(this.f6561a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(Uri uri) {
        return C2152b.m33619c(uri);
    }
}
