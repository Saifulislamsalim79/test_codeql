package io.intercom.com.bumptech.glide.load.p400n.p401y;

import android.content.Context;
import android.net.Uri;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.p398m.p399m.C10650b;
import io.intercom.com.bumptech.glide.load.p398m.p399m.C10651c;
import io.intercom.com.bumptech.glide.load.p400n.C10705r;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o;
import io.intercom.com.bumptech.glide.p415q.C10882b;
import java.io.InputStream;
/* compiled from: MediaStoreImageThumbLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.y.c */
/* loaded from: classes3.dex */
public class C10730c implements InterfaceC10697n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f24550a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.y.c$a */
    /* loaded from: classes3.dex */
    public static class C10731a implements InterfaceC10699o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f24551a;

        public C10731a(Context context) {
            this.f24551a = context;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<Uri, InputStream> mo12453b(C10705r c10705r) {
            return new C10730c(this.f24551a);
        }
    }

    public C10730c(Context context) {
        this.f24550a = context.getApplicationContext();
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<InputStream> mo12456b(Uri uri, int i, int i2, C10626i c10626i) {
        if (C10650b.m12562d(i, i2)) {
            return new InterfaceC10697n.C10698a<>(new C10882b(uri), C10651c.m12559d(this.f24550a, uri));
        }
        return null;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(Uri uri) {
        return C10650b.m12565a(uri);
    }
}
