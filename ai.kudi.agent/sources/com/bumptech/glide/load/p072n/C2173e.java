package com.bumptech.glide.load.p072n;

import android.util.Base64;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.p085p.C2366b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: DataUrlLoader.java */
/* renamed from: com.bumptech.glide.load.n.e */
/* loaded from: classes2.dex */
public final class C2173e<Model, Data> implements InterfaceC2199n<Model, Data> {

    /* renamed from: a */
    private final InterfaceC2174a<Data> f6475a;

    /* compiled from: DataUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.e$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2174a<Data> {
        /* renamed from: a */
        Class<Data> mo33595a();

        /* renamed from: b */
        void mo33594b(Data data) throws IOException;

        /* renamed from: c */
        Data mo33593c(String str) throws IllegalArgumentException;
    }

    /* compiled from: DataUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.e$b */
    /* loaded from: classes2.dex */
    private static final class C2175b<Data> implements InterfaceC2130d<Data> {

        /* renamed from: c */
        private final String f6476c;

        /* renamed from: d */
        private final InterfaceC2174a<Data> f6477d;

        /* renamed from: e */
        private Data f6478e;

        C2175b(String str, InterfaceC2174a<Data> interfaceC2174a) {
            this.f6476c = str;
            this.f6477d = interfaceC2174a;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: a */
        public Class<Data> mo33507a() {
            return this.f6477d.mo33595a();
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: b */
        public void mo33506b() {
            try {
                this.f6477d.mo33594b(this.f6478e);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public void cancel() {
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: e */
        public void mo33503e(EnumC1949f enumC1949f, InterfaceC2130d.InterfaceC2131a<? super Data> interfaceC2131a) {
            try {
                Data mo33593c = this.f6477d.mo33593c(this.f6476c);
                this.f6478e = mo33593c;
                interfaceC2131a.mo33545d(mo33593c);
            } catch (IllegalArgumentException e) {
                interfaceC2131a.mo33546c(e);
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public EnumC1993a getDataSource() {
            return EnumC1993a.LOCAL;
        }
    }

    /* compiled from: DataUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.e$c */
    /* loaded from: classes2.dex */
    public static final class C2176c<Model> implements InterfaceC2201o<Model, InputStream> {

        /* renamed from: a */
        private final InterfaceC2174a<InputStream> f6479a = new C2177a(this);

        /* compiled from: DataUrlLoader.java */
        /* renamed from: com.bumptech.glide.load.n.e$c$a */
        /* loaded from: classes2.dex */
        class C2177a implements InterfaceC2174a<InputStream> {
            C2177a(C2176c c2176c) {
            }

            @Override // com.bumptech.glide.load.p072n.C2173e.InterfaceC2174a
            /* renamed from: a */
            public Class<InputStream> mo33595a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.p072n.C2173e.InterfaceC2174a
            /* renamed from: d */
            public void mo33594b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.p072n.C2173e.InterfaceC2174a
            /* renamed from: e */
            public InputStream mo33593c(String str) {
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

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Model, InputStream> mo33496b(C2207r c2207r) {
            return new C2173e(this.f6479a);
        }
    }

    public C2173e(InterfaceC2174a<Data> interfaceC2174a) {
        this.f6475a = interfaceC2174a;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: a */
    public boolean mo33500a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: b */
    public InterfaceC2199n.C2200a<Data> mo33499b(Model model, int i, int i2, C2122h c2122h) {
        return new InterfaceC2199n.C2200a<>(new C2366b(model), new C2175b(model.toString(), this.f6475a));
    }
}
