package com.bumptech.glide.load.p072n;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p070m.p071p.C2152b;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.p085p.C2366b;
import java.io.File;
import java.io.FileNotFoundException;
/* compiled from: MediaStoreFileLoader.java */
/* renamed from: com.bumptech.glide.load.n.k */
/* loaded from: classes2.dex */
public final class C2192k implements InterfaceC2199n<Uri, File> {

    /* renamed from: a */
    private final Context f6501a;

    /* compiled from: MediaStoreFileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.k$a */
    /* loaded from: classes2.dex */
    public static final class C2193a implements InterfaceC2201o<Uri, File> {

        /* renamed from: a */
        private final Context f6502a;

        public C2193a(Context context) {
            this.f6502a = context;
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Uri, File> mo33496b(C2207r c2207r) {
            return new C2192k(this.f6502a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaStoreFileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.k$b */
    /* loaded from: classes2.dex */
    public static class C2194b implements InterfaceC2130d<File> {

        /* renamed from: e */
        private static final String[] f6503e = {"_data"};

        /* renamed from: c */
        private final Context f6504c;

        /* renamed from: d */
        private final Uri f6505d;

        C2194b(Context context, Uri uri) {
            this.f6504c = context;
            this.f6505d = uri;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: a */
        public Class<File> mo33507a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: b */
        public void mo33506b() {
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: e */
        public void mo33503e(EnumC1949f enumC1949f, InterfaceC2130d.InterfaceC2131a<? super File> interfaceC2131a) {
            Cursor query = this.f6504c.getContentResolver().query(this.f6505d, f6503e, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(r0)) {
                interfaceC2131a.mo33546c(new FileNotFoundException("Failed to find file path for: " + this.f6505d));
                return;
            }
            interfaceC2131a.mo33545d(new File(r0));
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public EnumC1993a getDataSource() {
            return EnumC1993a.LOCAL;
        }
    }

    public C2192k(Context context) {
        this.f6501a = context;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<File> mo33499b(Uri uri, int i, int i2, C2122h c2122h) {
        return new InterfaceC2199n.C2200a<>(new C2366b(uri), new C2194b(this.f6501a, uri));
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(Uri uri) {
        return C2152b.m33620b(uri);
    }
}
