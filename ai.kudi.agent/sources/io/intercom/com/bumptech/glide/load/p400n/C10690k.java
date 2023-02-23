package io.intercom.com.bumptech.glide.load.p400n;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p398m.p399m.C10650b;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.p415q.C10882b;
import java.io.File;
import java.io.FileNotFoundException;
/* compiled from: MediaStoreFileLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.k */
/* loaded from: classes3.dex */
public final class C10690k implements InterfaceC10697n<Uri, File> {

    /* renamed from: a */
    private final Context f24495a;

    /* compiled from: MediaStoreFileLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.k$a */
    /* loaded from: classes3.dex */
    public static final class C10691a implements InterfaceC10699o<Uri, File> {

        /* renamed from: a */
        private final Context f24496a;

        public C10691a(Context context) {
            this.f24496a = context;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<Uri, File> mo12453b(C10705r c10705r) {
            return new C10690k(this.f24496a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaStoreFileLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.k$b */
    /* loaded from: classes3.dex */
    public static class C10692b implements InterfaceC10631b<File> {

        /* renamed from: e */
        private static final String[] f24497e = {"_data"};

        /* renamed from: c */
        private final Context f24498c;

        /* renamed from: d */
        private final Uri f24499d;

        C10692b(Context context, Uri uri) {
            this.f24498c = context;
            this.f24499d = uri;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: a */
        public Class<File> mo12474a() {
            return File.class;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: b */
        public void mo12473b() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public void cancel() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: e */
        public void mo12472e(EnumC10482g enumC10482g, InterfaceC10631b.InterfaceC10632a<? super File> interfaceC10632a) {
            Cursor query = this.f24498c.getContentResolver().query(this.f24499d, f24497e, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(r0)) {
                interfaceC10632a.mo12497c(new FileNotFoundException("Failed to find file path for: " + this.f24499d));
                return;
            }
            interfaceC10632a.mo12496d(new File(r0));
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public EnumC10507a getDataSource() {
            return EnumC10507a.LOCAL;
        }
    }

    public C10690k(Context context) {
        this.f24495a = context;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<File> mo12456b(Uri uri, int i, int i2, C10626i c10626i) {
        return new InterfaceC10697n.C10698a<>(new C10882b(uri), new C10692b(this.f24495a, uri));
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(Uri uri) {
        return C10650b.m12564b(uri);
    }
}
