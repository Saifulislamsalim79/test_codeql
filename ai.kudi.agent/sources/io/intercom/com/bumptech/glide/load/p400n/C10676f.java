package io.intercom.com.bumptech.glide.load.p400n;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.p415q.C10882b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: FileLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.f */
/* loaded from: classes3.dex */
public class C10676f<Data> implements InterfaceC10697n<File, Data> {

    /* renamed from: a */
    private final InterfaceC10681d<Data> f24476a;

    /* compiled from: FileLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.f$a */
    /* loaded from: classes3.dex */
    public static class C10677a<Data> implements InterfaceC10699o<File, Data> {

        /* renamed from: a */
        private final InterfaceC10681d<Data> f24477a;

        public C10677a(InterfaceC10681d<Data> interfaceC10681d) {
            this.f24477a = interfaceC10681d;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public final InterfaceC10697n<File, Data> mo12453b(C10705r c10705r) {
            return new C10676f(this.f24477a);
        }
    }

    /* compiled from: FileLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.f$b */
    /* loaded from: classes3.dex */
    public static class C10678b extends C10677a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* renamed from: io.intercom.com.bumptech.glide.load.n.f$b$a */
        /* loaded from: classes3.dex */
        class C10679a implements InterfaceC10681d<ParcelFileDescriptor> {
            C10679a() {
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10676f.InterfaceC10681d
            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo12530a() {
                return ParcelFileDescriptor.class;
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10676f.InterfaceC10681d
            /* renamed from: d */
            public void mo12529b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10676f.InterfaceC10681d
            /* renamed from: e */
            public ParcelFileDescriptor mo12528c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C10678b() {
            super(new C10679a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.f$c */
    /* loaded from: classes3.dex */
    public static class C10680c<Data> implements InterfaceC10631b<Data> {

        /* renamed from: c */
        private final File f24478c;

        /* renamed from: d */
        private final InterfaceC10681d<Data> f24479d;

        /* renamed from: e */
        private Data f24480e;

        C10680c(File file, InterfaceC10681d<Data> interfaceC10681d) {
            this.f24478c = file;
            this.f24479d = interfaceC10681d;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: a */
        public Class<Data> mo12474a() {
            return this.f24479d.mo12530a();
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: b */
        public void mo12473b() {
            Data data = this.f24480e;
            if (data != null) {
                try {
                    this.f24479d.mo12529b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public void cancel() {
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: e */
        public void mo12472e(EnumC10482g enumC10482g, InterfaceC10631b.InterfaceC10632a<? super Data> interfaceC10632a) {
            try {
                Data mo12528c = this.f24479d.mo12528c(this.f24478c);
                this.f24480e = mo12528c;
                interfaceC10632a.mo12496d(mo12528c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                interfaceC10632a.mo12497c(e);
            }
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public EnumC10507a getDataSource() {
            return EnumC10507a.LOCAL;
        }
    }

    /* compiled from: FileLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.f$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC10681d<Data> {
        /* renamed from: a */
        Class<Data> mo12530a();

        /* renamed from: b */
        void mo12529b(Data data) throws IOException;

        /* renamed from: c */
        Data mo12528c(File file) throws FileNotFoundException;
    }

    /* compiled from: FileLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.f$e */
    /* loaded from: classes3.dex */
    public static class C10682e extends C10677a<InputStream> {

        /* compiled from: FileLoader.java */
        /* renamed from: io.intercom.com.bumptech.glide.load.n.f$e$a */
        /* loaded from: classes3.dex */
        class C10683a implements InterfaceC10681d<InputStream> {
            C10683a() {
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10676f.InterfaceC10681d
            /* renamed from: a */
            public Class<InputStream> mo12530a() {
                return InputStream.class;
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10676f.InterfaceC10681d
            /* renamed from: d */
            public void mo12529b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // io.intercom.com.bumptech.glide.load.p400n.C10676f.InterfaceC10681d
            /* renamed from: e */
            public InputStream mo12528c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C10682e() {
            super(new C10683a());
        }
    }

    public C10676f(InterfaceC10681d<Data> interfaceC10681d) {
        this.f24476a = interfaceC10681d;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: c */
    public InterfaceC10697n.C10698a<Data> mo12456b(File file, int i, int i2, C10626i c10626i) {
        return new InterfaceC10697n.C10698a<>(new C10882b(file), new C10680c(file, this.f24476a));
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: d */
    public boolean mo12457a(File file) {
        return true;
    }
}
