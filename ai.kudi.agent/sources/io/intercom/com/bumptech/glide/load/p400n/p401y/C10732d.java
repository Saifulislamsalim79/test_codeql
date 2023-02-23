package io.intercom.com.bumptech.glide.load.p400n.p401y;

import android.content.Context;
import android.net.Uri;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.p398m.p399m.C10650b;
import io.intercom.com.bumptech.glide.load.p398m.p399m.C10651c;
import io.intercom.com.bumptech.glide.load.p400n.C10705r;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10774v;
import io.intercom.com.bumptech.glide.p415q.C10882b;
import java.io.InputStream;
/* compiled from: MediaStoreVideoThumbLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.y.d */
/* loaded from: classes3.dex */
public class C10732d implements InterfaceC10697n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f24552a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.y.d$a */
    /* loaded from: classes3.dex */
    public static class C10733a implements InterfaceC10699o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f24553a;

        public C10733a(Context context) {
            this.f24553a = context;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<Uri, InputStream> mo12453b(C10705r c10705r) {
            return new C10732d(this.f24553a);
        }
    }

    public C10732d(Context context) {
        this.f24552a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m12458e(C10626i c10626i) {
        Long l = (Long) c10626i.m12593a(C10774v.f24620c);
        return l != null && l.longValue() == -1;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<InputStream> mo12456b(Uri uri, int i, int i2, C10626i c10626i) {
        if (C10650b.m12562d(i, i2) && m12458e(c10626i)) {
            return new InterfaceC10697n.C10698a<>(new C10882b(uri), C10651c.m12558f(this.f24552a, uri));
        }
        return null;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(Uri uri) {
        return C10650b.m12563c(uri);
    }
}
