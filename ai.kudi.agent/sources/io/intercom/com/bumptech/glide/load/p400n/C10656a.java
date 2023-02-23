package io.intercom.com.bumptech.glide.load.p400n;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.p398m.C10639f;
import io.intercom.com.bumptech.glide.load.p398m.C10647k;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.p415q.C10882b;
import java.io.InputStream;
/* compiled from: AssetUriLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.a */
/* loaded from: classes3.dex */
public class C10656a<Data> implements InterfaceC10697n<Uri, Data> {

    /* renamed from: c */
    private static final int f24462c = 22;

    /* renamed from: a */
    private final AssetManager f24463a;

    /* renamed from: b */
    private final InterfaceC10657a<Data> f24464b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.a$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC10657a<Data> {
        /* renamed from: a */
        InterfaceC10631b<Data> mo12551a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.a$b */
    /* loaded from: classes3.dex */
    public static class C10658b implements InterfaceC10699o<Uri, ParcelFileDescriptor>, InterfaceC10657a<ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f24465a;

        public C10658b(AssetManager assetManager) {
            this.f24465a = assetManager;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.C10656a.InterfaceC10657a
        /* renamed from: a */
        public InterfaceC10631b<ParcelFileDescriptor> mo12551a(AssetManager assetManager, String str) {
            return new C10639f(assetManager, str);
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<Uri, ParcelFileDescriptor> mo12453b(C10705r c10705r) {
            return new C10656a(this.f24465a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.a$c */
    /* loaded from: classes3.dex */
    public static class C10659c implements InterfaceC10699o<Uri, InputStream>, InterfaceC10657a<InputStream> {

        /* renamed from: a */
        private final AssetManager f24466a;

        public C10659c(AssetManager assetManager) {
            this.f24466a = assetManager;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.C10656a.InterfaceC10657a
        /* renamed from: a */
        public InterfaceC10631b<InputStream> mo12551a(AssetManager assetManager, String str) {
            return new C10647k(assetManager, str);
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<Uri, InputStream> mo12453b(C10705r c10705r) {
            return new C10656a(this.f24466a, this);
        }
    }

    public C10656a(AssetManager assetManager, InterfaceC10657a<Data> interfaceC10657a) {
        this.f24463a = assetManager;
        this.f24464b = interfaceC10657a;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<Data> mo12456b(Uri uri, int i, int i2, C10626i c10626i) {
        return new InterfaceC10697n.C10698a<>(new C10882b(uri), this.f24464b.mo12551a(this.f24463a, uri.toString().substring(f24462c)));
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
