package com.bumptech.glide.load.p072n;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.p070m.C2127a;
import com.bumptech.glide.load.p070m.C2139i;
import com.bumptech.glide.load.p070m.C2150o;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.p085p.C2366b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: UriLoader.java */
/* renamed from: com.bumptech.glide.load.n.w */
/* loaded from: classes2.dex */
public class C2224w<Data> implements InterfaceC2199n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f6547b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a */
    private final InterfaceC2227c<Data> f6548a;

    /* compiled from: UriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.w$a */
    /* loaded from: classes2.dex */
    public static final class C2225a implements InterfaceC2201o<Uri, AssetFileDescriptor>, InterfaceC2227c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f6549a;

        public C2225a(ContentResolver contentResolver) {
            this.f6549a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p072n.C2224w.InterfaceC2227c
        /* renamed from: a */
        public InterfaceC2130d<AssetFileDescriptor> mo33521a(Uri uri) {
            return new C2127a(this.f6549a, uri);
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Uri, AssetFileDescriptor> mo33496b(C2207r c2207r) {
            return new C2224w(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.w$b */
    /* loaded from: classes2.dex */
    public static class C2226b implements InterfaceC2201o<Uri, ParcelFileDescriptor>, InterfaceC2227c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f6550a;

        public C2226b(ContentResolver contentResolver) {
            this.f6550a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p072n.C2224w.InterfaceC2227c
        /* renamed from: a */
        public InterfaceC2130d<ParcelFileDescriptor> mo33521a(Uri uri) {
            return new C2139i(this.f6550a, uri);
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Uri, ParcelFileDescriptor> mo33496b(C2207r c2207r) {
            return new C2224w(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.w$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC2227c<Data> {
        /* renamed from: a */
        InterfaceC2130d<Data> mo33521a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.w$d */
    /* loaded from: classes2.dex */
    public static class C2228d implements InterfaceC2201o<Uri, InputStream>, InterfaceC2227c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f6551a;

        public C2228d(ContentResolver contentResolver) {
            this.f6551a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p072n.C2224w.InterfaceC2227c
        /* renamed from: a */
        public InterfaceC2130d<InputStream> mo33521a(Uri uri) {
            return new C2150o(this.f6551a, uri);
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Uri, InputStream> mo33496b(C2207r c2207r) {
            return new C2224w(this);
        }
    }

    public C2224w(InterfaceC2227c<Data> interfaceC2227c) {
        this.f6548a = interfaceC2227c;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<Data> mo33499b(Uri uri, int i, int i2, C2122h c2122h) {
        return new InterfaceC2199n.C2200a<>(new C2366b(uri), this.f6548a.mo33521a(uri));
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(Uri uri) {
        return f6547b.contains(uri.getScheme());
    }
}
