package io.intercom.com.bumptech.glide.load.p400n;

import android.util.Base64;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.p415q.C10882b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: DataUrlLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.e */
/* loaded from: classes3.dex */
public final class C10671e<Data> implements InterfaceC10697n<String, Data> {

    /* renamed from: a */
    private final InterfaceC10672a<Data> f24471a;

    /* compiled from: DataUrlLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.e$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC10672a<Data> {
        /* renamed from: a */
        Class<Data> mo12539a();

        /* renamed from: b */
        void mo12538b(Data data) throws IOException;

        /* renamed from: c */
        Data mo12537c(String str) throws IllegalArgumentException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DataUrlLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.e$b */
    /* loaded from: classes3.dex */
    public static final class C10673b<Data> implements InterfaceC10631b<Data> {

        /* renamed from: c */
        private final String f24472c;

        /* renamed from: d */
        private final InterfaceC10672a<Data> f24473d;

        /* renamed from: e */
        private Data f24474e;

        C10673b(String str, InterfaceC10672a<Data> interfaceC10672a) {
            this.f24472c = str;
            this.f24473d = interfaceC10672a;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: a */
        public Class<Data> mo12474a() {
            return this.f24473d.mo12539a();
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: b */
        public void mo12473b() {
            try {
                this.f24473d.mo12538b(this.f24474e);
            } catch (IOException unused) {
            }
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public void cancel() {
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: e */
        public void mo12472e(EnumC10482g enumC10482g, InterfaceC10631b.InterfaceC10632a<? super Data> interfaceC10632a) {
            try {
                Data mo12537c = this.f24473d.mo12537c(this.f24472c);
                this.f24474e = mo12537c;
                interfaceC10632a.mo12496d(mo12537c);
            } catch (IllegalArgumentException e) {
                interfaceC10632a.mo12497c(e);
            }
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public EnumC10507a getDataSource() {
            return EnumC10507a.LOCAL;
        }
    }

    /* compiled from: DataUrlLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.e$c */
    /* loaded from: classes3.dex */
    public static final class C10674c implements InterfaceC10699o<String, InputStream> {

        /* renamed from: a */
        private final InterfaceC10672a<InputStream> f24475a = new C10675a(this);

        /* compiled from: DataUrlLoader.java */
        /* renamed from: io.intercom.com.bumptech.glide.load.n.e$c$a */
        /* loaded from: classes3.dex */
        class C10675a implements InterfaceC10672a<InputStream> {
            C10675a(C10674c c10674c) {
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10671e.InterfaceC10672a
            /* renamed from: a */
            public Class<InputStream> mo12539a() {
                return InputStream.class;
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10671e.InterfaceC10672a
            /* renamed from: d */
            public void mo12538b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10671e.InterfaceC10672a
            /* renamed from: e */
            public InputStream mo12537c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public final InterfaceC10697n<String, InputStream> mo12453b(C10705r c10705r) {
            return new C10671e(this.f24475a);
        }
    }

    public C10671e(InterfaceC10672a<Data> interfaceC10672a) {
        this.f24471a = interfaceC10672a;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<Data> mo12456b(String str, int i, int i2, C10626i c10626i) {
        return new InterfaceC10697n.C10698a<>(new C10882b(str), new C10673b(str, this.f24471a));
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(String str) {
        return str.startsWith("data:image");
    }
}
