package io.intercom.com.bumptech.glide.load.p400n;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import java.io.InputStream;
/* compiled from: ResourceLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.s */
/* loaded from: classes3.dex */
public class C10709s<Data> implements InterfaceC10697n<Integer, Data> {

    /* renamed from: a */
    private final InterfaceC10697n<Uri, Data> f24529a;

    /* renamed from: b */
    private final Resources f24530b;

    /* compiled from: ResourceLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.s$a */
    /* loaded from: classes3.dex */
    public static class C10710a implements InterfaceC10699o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f24531a;

        public C10710a(Resources resources) {
            this.f24531a = resources;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<Integer, ParcelFileDescriptor> mo12453b(C10705r c10705r) {
            return new C10709s(this.f24531a, c10705r.m12491d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.s$b */
    /* loaded from: classes3.dex */
    public static class C10711b implements InterfaceC10699o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f24532a;

        public C10711b(Resources resources) {
            this.f24532a = resources;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<Integer, InputStream> mo12453b(C10705r c10705r) {
            return new C10709s(this.f24532a, c10705r.m12491d(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.s$c */
    /* loaded from: classes3.dex */
    public static class C10712c implements InterfaceC10699o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f24533a;

        public C10712c(Resources resources) {
            this.f24533a = resources;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<Integer, Uri> mo12453b(C10705r c10705r) {
            return new C10709s(this.f24533a, C10717v.m12476c());
        }
    }

    public C10709s(Resources resources, InterfaceC10697n<Uri, Data> interfaceC10697n) {
        this.f24530b = resources;
        this.f24529a = interfaceC10697n;
    }

    /* renamed from: d */
    private Uri m12483d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f24530b.getResourcePackageName(num.intValue()) + '/' + this.f24530b.getResourceTypeName(num.intValue()) + '/' + this.f24530b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
                return null;
            }
            return null;
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<Data> mo12456b(Integer num, int i, int i2, C10626i c10626i) {
        Uri m12483d = m12483d(num);
        if (m12483d == null) {
            return null;
        }
        return this.f24529a.mo12456b(m12483d, i, i2, c10626i);
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: e */
    public boolean mo12457a(Integer num) {
        return true;
    }
}
