package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1997e;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.load.p070m.C2143k;
import com.bumptech.glide.load.p070m.C2146m;
import com.bumptech.glide.p086q.C2380j;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* compiled from: ImageReader.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.n */
/* loaded from: classes2.dex */
interface InterfaceC2309n {

    /* compiled from: ImageReader.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.n$a */
    /* loaded from: classes2.dex */
    public static final class C2310a implements InterfaceC2309n {

        /* renamed from: a */
        private final C2143k f6708a;

        /* renamed from: b */
        private final InterfaceC2095b f6709b;

        /* renamed from: c */
        private final List<ImageHeaderParser> f6710c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C2310a(InputStream inputStream, List<ImageHeaderParser> list, InterfaceC2095b interfaceC2095b) {
            C2380j.m33129d(interfaceC2095b);
            this.f6709b = interfaceC2095b;
            C2380j.m33129d(list);
            this.f6710c = list;
            this.f6708a = new C2143k(inputStream, interfaceC2095b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2309n
        /* renamed from: a */
        public int mo33335a() throws IOException {
            return C1997e.m33950b(this.f6710c, this.f6708a.mo33492a(), this.f6709b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2309n
        /* renamed from: b */
        public Bitmap mo33334b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f6708a.mo33492a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2309n
        /* renamed from: c */
        public void mo33333c() {
            this.f6708a.m33641c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2309n
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo33332d() throws IOException {
            return C1997e.m33947e(this.f6710c, this.f6708a.mo33492a(), this.f6709b);
        }
    }

    /* compiled from: ImageReader.java */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.n$b */
    /* loaded from: classes2.dex */
    public static final class C2311b implements InterfaceC2309n {

        /* renamed from: a */
        private final InterfaceC2095b f6711a;

        /* renamed from: b */
        private final List<ImageHeaderParser> f6712b;

        /* renamed from: c */
        private final C2146m f6713c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C2311b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, InterfaceC2095b interfaceC2095b) {
            C2380j.m33129d(interfaceC2095b);
            this.f6711a = interfaceC2095b;
            C2380j.m33129d(list);
            this.f6712b = list;
            this.f6713c = new C2146m(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2309n
        /* renamed from: a */
        public int mo33335a() throws IOException {
            return C1997e.m33951a(this.f6712b, this.f6713c, this.f6711a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2309n
        /* renamed from: b */
        public Bitmap mo33334b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f6713c.mo33492a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2309n
        /* renamed from: c */
        public void mo33333c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC2309n
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo33332d() throws IOException {
            return C1997e.m33948d(this.f6712b, this.f6713c, this.f6711a);
        }
    }

    /* renamed from: a */
    int mo33335a() throws IOException;

    /* renamed from: b */
    Bitmap mo33334b(BitmapFactory.Options options) throws IOException;

    /* renamed from: c */
    void mo33333c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo33332d() throws IOException;
}
