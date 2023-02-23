package com.bumptech.glide.load.p072n;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.p085p.C2366b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: FileLoader.java */
/* renamed from: com.bumptech.glide.load.n.f */
/* loaded from: classes2.dex */
public class C2178f<Data> implements InterfaceC2199n<File, Data> {

    /* renamed from: a */
    private final InterfaceC2183d<Data> f6480a;

    /* compiled from: FileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.f$a */
    /* loaded from: classes2.dex */
    public static class C2179a<Data> implements InterfaceC2201o<File, Data> {

        /* renamed from: a */
        private final InterfaceC2183d<Data> f6481a;

        public C2179a(InterfaceC2183d<Data> interfaceC2183d) {
            this.f6481a = interfaceC2183d;
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public final InterfaceC2199n<File, Data> mo33496b(C2207r c2207r) {
            return new C2178f(this.f6481a);
        }
    }

    /* compiled from: FileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.f$b */
    /* loaded from: classes2.dex */
    public static class C2180b extends C2179a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* renamed from: com.bumptech.glide.load.n.f$b$a */
        /* loaded from: classes2.dex */
        class C2181a implements InterfaceC2183d<ParcelFileDescriptor> {
            C2181a() {
            }

            @Override // com.bumptech.glide.load.p072n.C2178f.InterfaceC2183d
            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo33586a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.p072n.C2178f.InterfaceC2183d
            /* renamed from: d */
            public void mo33585b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // com.bumptech.glide.load.p072n.C2178f.InterfaceC2183d
            /* renamed from: e */
            public ParcelFileDescriptor mo33584c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C2180b() {
            super(new C2181a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.f$c */
    /* loaded from: classes2.dex */
    public static final class C2182c<Data> implements InterfaceC2130d<Data> {

        /* renamed from: c */
        private final File f6482c;

        /* renamed from: d */
        private final InterfaceC2183d<Data> f6483d;

        /* renamed from: e */
        private Data f6484e;

        C2182c(File file, InterfaceC2183d<Data> interfaceC2183d) {
            this.f6482c = file;
            this.f6483d = interfaceC2183d;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: a */
        public Class<Data> mo33507a() {
            return this.f6483d.mo33586a();
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: b */
        public void mo33506b() {
            Data data = this.f6484e;
            if (data != null) {
                try {
                    this.f6483d.mo33585b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public void cancel() {
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: e */
        public void mo33503e(EnumC1949f enumC1949f, InterfaceC2130d.InterfaceC2131a<? super Data> interfaceC2131a) {
            try {
                Data mo33584c = this.f6483d.mo33584c(this.f6482c);
                this.f6484e = mo33584c;
                interfaceC2131a.mo33545d(mo33584c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                interfaceC2131a.mo33546c(e);
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public EnumC1993a getDataSource() {
            return EnumC1993a.LOCAL;
        }
    }

    /* compiled from: FileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.f$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC2183d<Data> {
        /* renamed from: a */
        Class<Data> mo33586a();

        /* renamed from: b */
        void mo33585b(Data data) throws IOException;

        /* renamed from: c */
        Data mo33584c(File file) throws FileNotFoundException;
    }

    /* compiled from: FileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.f$e */
    /* loaded from: classes2.dex */
    public static class C2184e extends C2179a<InputStream> {

        /* compiled from: FileLoader.java */
        /* renamed from: com.bumptech.glide.load.n.f$e$a */
        /* loaded from: classes2.dex */
        class C2185a implements InterfaceC2183d<InputStream> {
            C2185a() {
            }

            @Override // com.bumptech.glide.load.p072n.C2178f.InterfaceC2183d
            /* renamed from: a */
            public Class<InputStream> mo33586a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.p072n.C2178f.InterfaceC2183d
            /* renamed from: d */
            public void mo33585b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.p072n.C2178f.InterfaceC2183d
            /* renamed from: e */
            public InputStream mo33584c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C2184e() {
            super(new C2185a());
        }
    }

    public C2178f(InterfaceC2183d<Data> interfaceC2183d) {
        this.f6480a = interfaceC2183d;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: c */
    public InterfaceC2199n.C2200a<Data> mo33499b(File file, int i, int i2, C2122h c2122h) {
        return new InterfaceC2199n.C2200a<>(new C2366b(file), new C2182c(file, this.f6480a));
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: d */
    public boolean mo33500a(File file) {
        return true;
    }
}
