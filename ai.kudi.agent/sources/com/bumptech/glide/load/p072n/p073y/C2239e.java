package com.bumptech.glide.load.p072n.p073y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p070m.p071p.C2152b;
import com.bumptech.glide.load.p072n.C2207r;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.load.p072n.InterfaceC2201o;
import com.bumptech.glide.p085p.C2366b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
/* compiled from: QMediaStoreUriLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.e */
/* loaded from: classes2.dex */
public final class C2239e<DataT> implements InterfaceC2199n<Uri, DataT> {

    /* renamed from: a */
    private final Context f6563a;

    /* renamed from: b */
    private final InterfaceC2199n<File, DataT> f6564b;

    /* renamed from: c */
    private final InterfaceC2199n<Uri, DataT> f6565c;

    /* renamed from: d */
    private final Class<DataT> f6566d;

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.e$a */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC2240a<DataT> implements InterfaceC2201o<Uri, DataT> {

        /* renamed from: a */
        private final Context f6567a;

        /* renamed from: b */
        private final Class<DataT> f6568b;

        AbstractC2240a(Context context, Class<DataT> cls) {
            this.f6567a = context;
            this.f6568b = cls;
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public final InterfaceC2199n<Uri, DataT> mo33496b(C2207r c2207r) {
            return new C2239e(this.f6567a, c2207r.m33540d(File.class, this.f6568b), c2207r.m33540d(Uri.class, this.f6568b), this.f6568b);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.e$b */
    /* loaded from: classes2.dex */
    public static final class C2241b extends AbstractC2240a<ParcelFileDescriptor> {
        public C2241b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.e$c */
    /* loaded from: classes2.dex */
    public static final class C2242c extends AbstractC2240a<InputStream> {
        public C2242c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.e$d */
    /* loaded from: classes2.dex */
    public static final class C2243d<DataT> implements InterfaceC2130d<DataT> {

        /* renamed from: C */
        private static final String[] f6569C = {"_data"};

        /* renamed from: A */
        private volatile boolean f6570A;

        /* renamed from: B */
        private volatile InterfaceC2130d<DataT> f6571B;

        /* renamed from: c */
        private final Context f6572c;

        /* renamed from: d */
        private final InterfaceC2199n<File, DataT> f6573d;

        /* renamed from: e */
        private final InterfaceC2199n<Uri, DataT> f6574e;

        /* renamed from: f */
        private final Uri f6575f;

        /* renamed from: w */
        private final int f6576w;

        /* renamed from: x */
        private final int f6577x;

        /* renamed from: y */
        private final C2122h f6578y;

        /* renamed from: z */
        private final Class<DataT> f6579z;

        C2243d(Context context, InterfaceC2199n<File, DataT> interfaceC2199n, InterfaceC2199n<Uri, DataT> interfaceC2199n2, Uri uri, int i, int i2, C2122h c2122h, Class<DataT> cls) {
            this.f6572c = context.getApplicationContext();
            this.f6573d = interfaceC2199n;
            this.f6574e = interfaceC2199n2;
            this.f6575f = uri;
            this.f6576w = i;
            this.f6577x = i2;
            this.f6578y = c2122h;
            this.f6579z = cls;
        }

        /* renamed from: c */
        private InterfaceC2199n.C2200a<DataT> m33505c() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f6573d.mo33499b(m33501g(this.f6575f), this.f6576w, this.f6577x, this.f6578y);
            }
            return this.f6574e.mo33499b(m33502f() ? MediaStore.setRequireOriginal(this.f6575f) : this.f6575f, this.f6576w, this.f6577x, this.f6578y);
        }

        /* renamed from: d */
        private InterfaceC2130d<DataT> m33504d() throws FileNotFoundException {
            InterfaceC2199n.C2200a<DataT> m33505c = m33505c();
            if (m33505c != null) {
                return m33505c.f6513c;
            }
            return null;
        }

        /* renamed from: f */
        private boolean m33502f() {
            return this.f6572c.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: g */
        private File m33501g(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor query = this.f6572c.getContentResolver().query(uri, f6569C, null, null, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        if (query != null) {
                            query.close();
                        }
                        return file;
                    }
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: a */
        public Class<DataT> mo33507a() {
            return this.f6579z;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: b */
        public void mo33506b() {
            InterfaceC2130d<DataT> interfaceC2130d = this.f6571B;
            if (interfaceC2130d != null) {
                interfaceC2130d.mo33506b();
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public void cancel() {
            this.f6570A = true;
            InterfaceC2130d<DataT> interfaceC2130d = this.f6571B;
            if (interfaceC2130d != null) {
                interfaceC2130d.cancel();
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: e */
        public void mo33503e(EnumC1949f enumC1949f, InterfaceC2130d.InterfaceC2131a<? super DataT> interfaceC2131a) {
            try {
                InterfaceC2130d<DataT> m33504d = m33504d();
                if (m33504d == null) {
                    interfaceC2131a.mo33546c(new IllegalArgumentException("Failed to build fetcher for: " + this.f6575f));
                    return;
                }
                this.f6571B = m33504d;
                if (this.f6570A) {
                    cancel();
                } else {
                    m33504d.mo33503e(enumC1949f, interfaceC2131a);
                }
            } catch (FileNotFoundException e) {
                interfaceC2131a.mo33546c(e);
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public EnumC1993a getDataSource() {
            return EnumC1993a.LOCAL;
        }
    }

    C2239e(Context context, InterfaceC2199n<File, DataT> interfaceC2199n, InterfaceC2199n<Uri, DataT> interfaceC2199n2, Class<DataT> cls) {
        this.f6563a = context.getApplicationContext();
        this.f6564b = interfaceC2199n;
        this.f6565c = interfaceC2199n2;
        this.f6566d = cls;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<DataT> mo33499b(Uri uri, int i, int i2, C2122h c2122h) {
        return new InterfaceC2199n.C2200a<>(new C2366b(uri), new C2243d(this.f6563a, this.f6564b, this.f6565c, uri, i, i2, c2122h, this.f6566d));
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C2152b.m33620b(uri);
    }
}
