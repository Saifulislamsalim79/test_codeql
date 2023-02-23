package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.load.p070m.C2146m;
import com.bumptech.glide.load.resource.bitmap.C2315r;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: ImageHeaderParserUtils.java */
/* renamed from: com.bumptech.glide.load.e */
/* loaded from: classes2.dex */
public final class C1997e {

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.e$a */
    /* loaded from: classes2.dex */
    class C1998a implements InterfaceC2004g {

        /* renamed from: a */
        final /* synthetic */ InputStream f6085a;

        C1998a(InputStream inputStream) {
            this.f6085a = inputStream;
        }

        @Override // com.bumptech.glide.load.C1997e.InterfaceC2004g
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo33943a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo33342b(this.f6085a);
            } finally {
                this.f6085a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.e$b */
    /* loaded from: classes2.dex */
    class C1999b implements InterfaceC2004g {

        /* renamed from: a */
        final /* synthetic */ ByteBuffer f6086a;

        C1999b(ByteBuffer byteBuffer) {
            this.f6086a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.C1997e.InterfaceC2004g
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo33943a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo33343a(this.f6086a);
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.e$c */
    /* loaded from: classes2.dex */
    class C2000c implements InterfaceC2004g {

        /* renamed from: a */
        final /* synthetic */ C2146m f6087a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC2095b f6088b;

        C2000c(C2146m c2146m, InterfaceC2095b interfaceC2095b) {
            this.f6087a = c2146m;
            this.f6088b = interfaceC2095b;
        }

        @Override // com.bumptech.glide.load.C1997e.InterfaceC2004g
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo33943a(ImageHeaderParser imageHeaderParser) throws IOException {
            C2315r c2315r = null;
            try {
                C2315r c2315r2 = new C2315r(new FileInputStream(this.f6087a.mo33492a().getFileDescriptor()), this.f6088b);
                try {
                    ImageHeaderParser.ImageType mo33342b = imageHeaderParser.mo33342b(c2315r2);
                    try {
                        c2315r2.close();
                    } catch (IOException unused) {
                    }
                    this.f6087a.mo33492a();
                    return mo33342b;
                } catch (Throwable th) {
                    th = th;
                    c2315r = c2315r2;
                    if (c2315r != null) {
                        try {
                            c2315r.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f6087a.mo33492a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.e$d */
    /* loaded from: classes2.dex */
    class C2001d implements InterfaceC2003f {

        /* renamed from: a */
        final /* synthetic */ InputStream f6089a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC2095b f6090b;

        C2001d(InputStream inputStream, InterfaceC2095b interfaceC2095b) {
            this.f6089a = inputStream;
            this.f6090b = interfaceC2095b;
        }

        @Override // com.bumptech.glide.load.C1997e.InterfaceC2003f
        /* renamed from: a */
        public int mo33944a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo33341c(this.f6089a, this.f6090b);
            } finally {
                this.f6089a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.e$e */
    /* loaded from: classes2.dex */
    class C2002e implements InterfaceC2003f {

        /* renamed from: a */
        final /* synthetic */ C2146m f6091a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC2095b f6092b;

        C2002e(C2146m c2146m, InterfaceC2095b interfaceC2095b) {
            this.f6091a = c2146m;
            this.f6092b = interfaceC2095b;
        }

        @Override // com.bumptech.glide.load.C1997e.InterfaceC2003f
        /* renamed from: a */
        public int mo33944a(ImageHeaderParser imageHeaderParser) throws IOException {
            C2315r c2315r = null;
            try {
                C2315r c2315r2 = new C2315r(new FileInputStream(this.f6091a.mo33492a().getFileDescriptor()), this.f6092b);
                try {
                    int mo33341c = imageHeaderParser.mo33341c(c2315r2, this.f6092b);
                    try {
                        c2315r2.close();
                    } catch (IOException unused) {
                    }
                    this.f6091a.mo33492a();
                    return mo33341c;
                } catch (Throwable th) {
                    th = th;
                    c2315r = c2315r2;
                    if (c2315r != null) {
                        try {
                            c2315r.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f6091a.mo33492a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.e$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC2003f {
        /* renamed from: a */
        int mo33944a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.e$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC2004g {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo33943a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: a */
    public static int m33951a(List<ImageHeaderParser> list, C2146m c2146m, InterfaceC2095b interfaceC2095b) throws IOException {
        return m33949c(list, new C2002e(c2146m, interfaceC2095b));
    }

    /* renamed from: b */
    public static int m33950b(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC2095b interfaceC2095b) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2315r(inputStream, interfaceC2095b);
        }
        inputStream.mark(5242880);
        return m33949c(list, new C2001d(inputStream, interfaceC2095b));
    }

    /* renamed from: c */
    private static int m33949c(List<ImageHeaderParser> list, InterfaceC2003f interfaceC2003f) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int mo33944a = interfaceC2003f.mo33944a(list.get(i));
            if (mo33944a != -1) {
                return mo33944a;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static ImageHeaderParser.ImageType m33948d(List<ImageHeaderParser> list, C2146m c2146m, InterfaceC2095b interfaceC2095b) throws IOException {
        return m33945g(list, new C2000c(c2146m, interfaceC2095b));
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m33947e(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC2095b interfaceC2095b) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C2315r(inputStream, interfaceC2095b);
        }
        inputStream.mark(5242880);
        return m33945g(list, new C1998a(inputStream));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m33946f(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return m33945g(list, new C1999b(byteBuffer));
    }

    /* renamed from: g */
    private static ImageHeaderParser.ImageType m33945g(List<ImageHeaderParser> list, InterfaceC2004g interfaceC2004g) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType mo33943a = interfaceC2004g.mo33943a(list.get(i));
            if (mo33943a != ImageHeaderParser.ImageType.UNKNOWN) {
                return mo33943a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
