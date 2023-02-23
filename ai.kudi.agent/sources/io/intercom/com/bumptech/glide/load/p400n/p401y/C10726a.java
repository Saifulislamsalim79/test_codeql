package io.intercom.com.bumptech.glide.load.p400n.p401y;

import io.intercom.com.bumptech.glide.load.C10623h;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.p398m.C10641h;
import io.intercom.com.bumptech.glide.load.p400n.C10684g;
import io.intercom.com.bumptech.glide.load.p400n.C10694m;
import io.intercom.com.bumptech.glide.load.p400n.C10705r;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o;
import java.io.InputStream;
/* compiled from: HttpGlideUrlLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.y.a */
/* loaded from: classes3.dex */
public class C10726a implements InterfaceC10697n<C10684g, InputStream> {

    /* renamed from: b */
    public static final C10623h<Integer> f24545b = C10623h.m12595f("io.intercom.com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    private final C10694m<C10684g, C10684g> f24546a;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.y.a$a */
    /* loaded from: classes3.dex */
    public static class C10727a implements InterfaceC10699o<C10684g, InputStream> {

        /* renamed from: a */
        private final C10694m<C10684g, C10684g> f24547a = new C10694m<>(500);

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<C10684g, InputStream> mo12453b(C10705r c10705r) {
            return new C10726a(this.f24547a);
        }
    }

    public C10726a(C10694m<C10684g, C10684g> c10694m) {
        this.f24546a = c10694m;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<InputStream> mo12456b(C10684g c10684g, int i, int i2, C10626i c10626i) {
        C10694m<C10684g, C10684g> c10694m = this.f24546a;
        if (c10694m != null) {
            C10684g m12511a = c10694m.m12511a(c10684g, 0, 0);
            if (m12511a == null) {
                this.f24546a.m12510b(c10684g, 0, 0, c10684g);
            } else {
                c10684g = m12511a;
            }
        }
        return new InterfaceC10697n.C10698a<>(c10684g, new C10641h(c10684g, ((Integer) c10626i.m12593a(f24545b)).intValue()));
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(C10684g c10684g) {
        return true;
    }
}
