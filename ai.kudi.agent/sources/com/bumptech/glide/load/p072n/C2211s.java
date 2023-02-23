package com.bumptech.glide.load.p072n;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import java.io.InputStream;
/* compiled from: ResourceLoader.java */
/* renamed from: com.bumptech.glide.load.n.s */
/* loaded from: classes2.dex */
public class C2211s<Data> implements InterfaceC2199n<Integer, Data> {

    /* renamed from: a */
    private final InterfaceC2199n<Uri, Data> f6536a;

    /* renamed from: b */
    private final Resources f6537b;

    /* compiled from: ResourceLoader.java */
    /* renamed from: com.bumptech.glide.load.n.s$a */
    /* loaded from: classes2.dex */
    public static final class C2212a implements InterfaceC2201o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f6538a;

        public C2212a(Resources resources) {
            this.f6538a = resources;
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Integer, AssetFileDescriptor> mo33496b(C2207r c2207r) {
            return new C2211s(this.f6538a, c2207r.m33540d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* renamed from: com.bumptech.glide.load.n.s$b */
    /* loaded from: classes2.dex */
    public static class C2213b implements InterfaceC2201o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f6539a;

        public C2213b(Resources resources) {
            this.f6539a = resources;
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Integer, ParcelFileDescriptor> mo33496b(C2207r c2207r) {
            return new C2211s(this.f6539a, c2207r.m33540d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* renamed from: com.bumptech.glide.load.n.s$c */
    /* loaded from: classes2.dex */
    public static class C2214c implements InterfaceC2201o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f6540a;

        public C2214c(Resources resources) {
            this.f6540a = resources;
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Integer, InputStream> mo33496b(C2207r c2207r) {
            return new C2211s(this.f6540a, c2207r.m33540d(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* renamed from: com.bumptech.glide.load.n.s$d */
    /* loaded from: classes2.dex */
    public static class C2215d implements InterfaceC2201o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f6541a;

        public C2215d(Resources resources) {
            this.f6541a = resources;
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Integer, Uri> mo33496b(C2207r c2207r) {
            return new C2211s(this.f6541a, C2221v.m33525c());
        }
    }

    public C2211s(Resources resources, InterfaceC2199n<Uri, Data> interfaceC2199n) {
        this.f6537b = resources;
        this.f6536a = interfaceC2199n;
    }

    /* renamed from: d */
    private Uri m33532d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f6537b.getResourcePackageName(num.intValue()) + '/' + this.f6537b.getResourceTypeName(num.intValue()) + '/' + this.f6537b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
                return null;
            }
            return null;
        }
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<Data> mo33499b(Integer num, int i, int i2, C2122h c2122h) {
        Uri m33532d = m33532d(num);
        if (m33532d == null) {
            return null;
        }
        return this.f6536a.mo33499b(m33532d, i, i2, c2122h);
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: e */
    public boolean mo33500a(Integer num) {
        return true;
    }
}
