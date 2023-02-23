package io.intercom.com.bumptech.glide.load.p400n;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import java.io.File;
import java.io.InputStream;
/* compiled from: StringLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.u */
/* loaded from: classes3.dex */
public class C10714u<Data> implements InterfaceC10697n<String, Data> {

    /* renamed from: a */
    private final InterfaceC10697n<Uri, Data> f24535a;

    /* compiled from: StringLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.u$a */
    /* loaded from: classes3.dex */
    public static class C10715a implements InterfaceC10699o<String, ParcelFileDescriptor> {
        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<String, ParcelFileDescriptor> mo12453b(C10705r c10705r) {
            return new C10714u(c10705r.m12491d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.u$b */
    /* loaded from: classes3.dex */
    public static class C10716b implements InterfaceC10699o<String, InputStream> {
        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<String, InputStream> mo12453b(C10705r c10705r) {
            return new C10714u(c10705r.m12491d(Uri.class, InputStream.class));
        }
    }

    public C10714u(InterfaceC10697n<Uri, Data> interfaceC10697n) {
        this.f24535a = interfaceC10697n;
    }

    /* renamed from: e */
    private static Uri m12478e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("/")) {
            return m12477f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? m12477f(str) : parse;
    }

    /* renamed from: f */
    private static Uri m12477f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<Data> mo12456b(String str, int i, int i2, C10626i c10626i) {
        Uri m12478e = m12478e(str);
        if (m12478e == null) {
            return null;
        }
        return this.f24535a.mo12456b(m12478e, i, i2, c10626i);
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(String str) {
        return true;
    }
}
