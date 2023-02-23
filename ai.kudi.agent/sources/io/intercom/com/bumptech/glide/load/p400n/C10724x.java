package io.intercom.com.bumptech.glide.load.p400n;

import android.net.Uri;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: UrlUriLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.x */
/* loaded from: classes3.dex */
public class C10724x<Data> implements InterfaceC10697n<Uri, Data> {

    /* renamed from: b */
    private static final Set<String> f24543b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    private final InterfaceC10697n<C10684g, Data> f24544a;

    /* compiled from: UrlUriLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.x$a */
    /* loaded from: classes3.dex */
    public static class C10725a implements InterfaceC10699o<Uri, InputStream> {
        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<Uri, InputStream> mo12453b(C10705r c10705r) {
            return new C10724x(c10705r.m12491d(C10684g.class, InputStream.class));
        }
    }

    public C10724x(InterfaceC10697n<C10684g, Data> interfaceC10697n) {
        this.f24544a = interfaceC10697n;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<Data> mo12456b(Uri uri, int i, int i2, C10626i c10626i) {
        return this.f24544a.mo12456b(new C10684g(uri.toString()), i, i2, c10626i);
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(Uri uri) {
        return f24543b.contains(uri.getScheme());
    }
}
