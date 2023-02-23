package com.bumptech.glide.load.p072n;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import java.io.File;
import java.io.InputStream;
/* compiled from: StringLoader.java */
/* renamed from: com.bumptech.glide.load.n.u */
/* loaded from: classes2.dex */
public class C2217u<Data> implements InterfaceC2199n<String, Data> {

    /* renamed from: a */
    private final InterfaceC2199n<Uri, Data> f6543a;

    /* compiled from: StringLoader.java */
    /* renamed from: com.bumptech.glide.load.n.u$a */
    /* loaded from: classes2.dex */
    public static final class C2218a implements InterfaceC2201o<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<String, AssetFileDescriptor> mo33496b(C2207r c2207r) {
            return new C2217u(c2207r.m33540d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* renamed from: com.bumptech.glide.load.n.u$b */
    /* loaded from: classes2.dex */
    public static class C2219b implements InterfaceC2201o<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<String, ParcelFileDescriptor> mo33496b(C2207r c2207r) {
            return new C2217u(c2207r.m33540d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* renamed from: com.bumptech.glide.load.n.u$c */
    /* loaded from: classes2.dex */
    public static class C2220c implements InterfaceC2201o<String, InputStream> {
        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<String, InputStream> mo33496b(C2207r c2207r) {
            return new C2217u(c2207r.m33540d(Uri.class, InputStream.class));
        }
    }

    public C2217u(InterfaceC2199n<Uri, Data> interfaceC2199n) {
        this.f6543a = interfaceC2199n;
    }

    /* renamed from: e */
    private static Uri m33527e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m33526f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? m33526f(str) : parse;
    }

    /* renamed from: f */
    private static Uri m33526f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<Data> mo33499b(String str, int i, int i2, C2122h c2122h) {
        Uri m33527e = m33527e(str);
        if (m33527e == null || !this.f6543a.mo33500a(m33527e)) {
            return null;
        }
        return this.f6543a.mo33499b(m33527e, i, i2, c2122h);
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(String str) {
        return true;
    }
}
