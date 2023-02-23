package com.bumptech.glide.load.p072n;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.p070m.C2138h;
import com.bumptech.glide.load.p070m.C2149n;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.p085p.C2366b;
import java.io.InputStream;
/* compiled from: AssetUriLoader.java */
/* renamed from: com.bumptech.glide.load.n.a */
/* loaded from: classes2.dex */
public class C2158a<Data> implements InterfaceC2199n<Uri, Data> {

    /* renamed from: c */
    private static final int f6466c = 22;

    /* renamed from: a */
    private final AssetManager f6467a;

    /* renamed from: b */
    private final InterfaceC2159a<Data> f6468b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2159a<Data> {
        /* renamed from: a */
        InterfaceC2130d<Data> mo33605a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.a$b */
    /* loaded from: classes2.dex */
    public static class C2160b implements InterfaceC2201o<Uri, ParcelFileDescriptor>, InterfaceC2159a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f6469a;

        public C2160b(AssetManager assetManager) {
            this.f6469a = assetManager;
        }

        @Override // com.bumptech.glide.load.p072n.C2158a.InterfaceC2159a
        /* renamed from: a */
        public InterfaceC2130d<ParcelFileDescriptor> mo33605a(AssetManager assetManager, String str) {
            return new C2138h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Uri, ParcelFileDescriptor> mo33496b(C2207r c2207r) {
            return new C2158a(this.f6469a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.a$c */
    /* loaded from: classes2.dex */
    public static class C2161c implements InterfaceC2201o<Uri, InputStream>, InterfaceC2159a<InputStream> {

        /* renamed from: a */
        private final AssetManager f6470a;

        public C2161c(AssetManager assetManager) {
            this.f6470a = assetManager;
        }

        @Override // com.bumptech.glide.load.p072n.C2158a.InterfaceC2159a
        /* renamed from: a */
        public InterfaceC2130d<InputStream> mo33605a(AssetManager assetManager, String str) {
            return new C2149n(assetManager, str);
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Uri, InputStream> mo33496b(C2207r c2207r) {
            return new C2158a(this.f6470a, this);
        }
    }

    public C2158a(AssetManager assetManager, InterfaceC2159a<Data> interfaceC2159a) {
        this.f6467a = assetManager;
        this.f6468b = interfaceC2159a;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<Data> mo33499b(Uri uri, int i, int i2, C2122h c2122h) {
        return new InterfaceC2199n.C2200a<>(new C2366b(uri), this.f6468b.mo33605a(this.f6467a, uri.toString().substring(f6466c)));
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
