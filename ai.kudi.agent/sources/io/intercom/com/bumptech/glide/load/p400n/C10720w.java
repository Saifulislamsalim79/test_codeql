package io.intercom.com.bumptech.glide.load.p400n;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.p398m.C10640g;
import io.intercom.com.bumptech.glide.load.p398m.C10648l;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.p415q.C10882b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: UriLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.w */
/* loaded from: classes3.dex */
public class C10720w<Data> implements InterfaceC10697n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f24539b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a */
    private final InterfaceC10722b<Data> f24540a;

    /* compiled from: UriLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.w$a */
    /* loaded from: classes3.dex */
    public static class C10721a implements InterfaceC10699o<Uri, ParcelFileDescriptor>, InterfaceC10722b<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f24541a;

        public C10721a(ContentResolver contentResolver) {
            this.f24541a = contentResolver;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.C10720w.InterfaceC10722b
        /* renamed from: a */
        public InterfaceC10631b<ParcelFileDescriptor> mo12469a(Uri uri) {
            return new C10640g(this.f24541a, uri);
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<Uri, ParcelFileDescriptor> mo12453b(C10705r c10705r) {
            return new C10720w(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.w$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10722b<Data> {
        /* renamed from: a */
        InterfaceC10631b<Data> mo12469a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.w$c */
    /* loaded from: classes3.dex */
    public static class C10723c implements InterfaceC10699o<Uri, InputStream>, InterfaceC10722b<InputStream> {

        /* renamed from: a */
        private final ContentResolver f24542a;

        public C10723c(ContentResolver contentResolver) {
            this.f24542a = contentResolver;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.C10720w.InterfaceC10722b
        /* renamed from: a */
        public InterfaceC10631b<InputStream> mo12469a(Uri uri) {
            return new C10648l(this.f24542a, uri);
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<Uri, InputStream> mo12453b(C10705r c10705r) {
            return new C10720w(this);
        }
    }

    public C10720w(InterfaceC10722b<Data> interfaceC10722b) {
        this.f24540a = interfaceC10722b;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<Data> mo12456b(Uri uri, int i, int i2, C10626i c10626i) {
        return new InterfaceC10697n.C10698a<>(new C10882b(uri), this.f24540a.mo12469a(uri));
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(Uri uri) {
        return f24539b.contains(uri.getScheme());
    }
}
