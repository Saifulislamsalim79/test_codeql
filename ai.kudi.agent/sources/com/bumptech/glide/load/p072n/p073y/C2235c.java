package com.bumptech.glide.load.p072n.p073y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.p070m.p071p.C2152b;
import com.bumptech.glide.load.p070m.p071p.C2153c;
import com.bumptech.glide.load.p072n.C2207r;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.load.p072n.InterfaceC2201o;
import com.bumptech.glide.p085p.C2366b;
import java.io.InputStream;
/* compiled from: MediaStoreImageThumbLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.c */
/* loaded from: classes2.dex */
public class C2235c implements InterfaceC2199n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f6559a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.c$a */
    /* loaded from: classes2.dex */
    public static class C2236a implements InterfaceC2201o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f6560a;

        public C2236a(Context context) {
            this.f6560a = context;
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Uri, InputStream> mo33496b(C2207r c2207r) {
            return new C2235c(this.f6560a);
        }
    }

    public C2235c(Context context) {
        this.f6559a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<InputStream> mo33499b(Uri uri, int i, int i2, C2122h c2122h) {
        if (C2152b.m33618d(i, i2)) {
            return new InterfaceC2199n.C2200a<>(new C2366b(uri), C2153c.m33615d(this.f6559a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(Uri uri) {
        return C2152b.m33621a(uri);
    }
}
