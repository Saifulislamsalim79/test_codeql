package io.intercom.com.bumptech.glide.load.p400n.p401y;

import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.p400n.C10684g;
import io.intercom.com.bumptech.glide.load.p400n.C10705r;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o;
import java.io.InputStream;
import java.net.URL;
/* compiled from: UrlLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.y.e */
/* loaded from: classes3.dex */
public class C10734e implements InterfaceC10697n<URL, InputStream> {

    /* renamed from: a */
    private final InterfaceC10697n<C10684g, InputStream> f24554a;

    /* compiled from: UrlLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.y.e$a */
    /* loaded from: classes3.dex */
    public static class C10735a implements InterfaceC10699o<URL, InputStream> {
        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<URL, InputStream> mo12453b(C10705r c10705r) {
            return new C10734e(c10705r.m12491d(C10684g.class, InputStream.class));
        }
    }

    public C10734e(InterfaceC10697n<C10684g, InputStream> interfaceC10697n) {
        this.f24554a = interfaceC10697n;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<InputStream> mo12456b(URL url, int i, int i2, C10626i c10626i) {
        return this.f24554a.mo12456b(new C10684g(url), i, i2, c10626i);
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(URL url) {
        return true;
    }
}
