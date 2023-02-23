package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.p086q.C2380j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f6659a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f6660b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface Reader {

        /* loaded from: classes2.dex */
        public static final class EndOfFileException extends IOException {
            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        long mo33392a(long j) throws IOException;

        /* renamed from: b */
        int mo33391b() throws IOException;

        /* renamed from: c */
        short mo33390c() throws IOException;

        int read(byte[] bArr, int i) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    /* loaded from: classes2.dex */
    private static final class C2286a implements Reader {

        /* renamed from: a */
        private final ByteBuffer f6661a;

        C2286a(ByteBuffer byteBuffer) {
            this.f6661a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public long mo33392a(long j) {
            int min = (int) Math.min(this.f6661a.remaining(), j);
            ByteBuffer byteBuffer = this.f6661a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo33391b() throws Reader.EndOfFileException {
            return (mo33390c() << 8) | mo33390c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo33390c() throws Reader.EndOfFileException {
            if (this.f6661a.remaining() >= 1) {
                return (short) (this.f6661a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i) {
            int min = Math.min(i, this.f6661a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f6661a.get(bArr, 0, min);
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    /* loaded from: classes2.dex */
    public static final class C2287b {

        /* renamed from: a */
        private final ByteBuffer f6662a;

        C2287b(byte[] bArr, int i) {
            this.f6662a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: c */
        private boolean m33395c(int i, int i2) {
            return this.f6662a.remaining() - i >= i2;
        }

        /* renamed from: a */
        short m33397a(int i) {
            if (m33395c(i, 2)) {
                return this.f6662a.getShort(i);
            }
            return (short) -1;
        }

        /* renamed from: b */
        int m33396b(int i) {
            if (m33395c(i, 4)) {
                return this.f6662a.getInt(i);
            }
            return -1;
        }

        /* renamed from: d */
        int m33394d() {
            return this.f6662a.remaining();
        }

        /* renamed from: e */
        void m33393e(ByteOrder byteOrder) {
            this.f6662a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    /* loaded from: classes2.dex */
    private static final class C2288c implements Reader {

        /* renamed from: a */
        private final InputStream f6663a;

        C2288c(InputStream inputStream) {
            this.f6663a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public long mo33392a(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f6663a.skip(j2);
                if (skip <= 0) {
                    if (this.f6663a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo33391b() throws IOException {
            return (mo33390c() << 8) | mo33390c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo33390c() throws IOException {
            int read = this.f6663a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f6663a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }
    }

    /* renamed from: d */
    private static int m33405d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: e */
    private int m33404e(Reader reader, InterfaceC2095b interfaceC2095b) throws IOException {
        try {
            int mo33391b = reader.mo33391b();
            if (!m33402g(mo33391b)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + mo33391b);
                }
                return -1;
            }
            int m33400i = m33400i(reader);
            if (m33400i == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC2095b.mo33714e(m33400i, byte[].class);
            int m33398k = m33398k(reader, bArr, m33400i);
            interfaceC2095b.mo33715d(bArr);
            return m33398k;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    /* renamed from: f */
    private ImageHeaderParser.ImageType m33403f(Reader reader) throws IOException {
        try {
            int mo33391b = reader.mo33391b();
            if (mo33391b == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int mo33390c = (mo33391b << 8) | reader.mo33390c();
            if (mo33390c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int mo33390c2 = (mo33390c << 8) | reader.mo33390c();
            if (mo33390c2 == -1991225785) {
                reader.mo33392a(21L);
                try {
                    return reader.mo33390c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (mo33390c2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                reader.mo33392a(4L);
                if (((reader.mo33391b() << 16) | reader.mo33391b()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int mo33391b2 = (reader.mo33391b() << 16) | reader.mo33391b();
                if ((mo33391b2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = mo33391b2 & 255;
                if (i == 88) {
                    reader.mo33392a(4L);
                    return (reader.mo33390c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i == 76) {
                    reader.mo33392a(4L);
                    return (reader.mo33390c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: g */
    private static boolean m33402g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: h */
    private boolean m33401h(byte[] bArr, int i) {
        boolean z = bArr != null && i > f6659a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f6659a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    private int m33400i(Reader reader) throws IOException {
        short mo33390c;
        short mo33390c2;
        int mo33391b;
        long j;
        long mo33392a;
        do {
            if (reader.mo33390c() != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) mo33390c));
                }
                return -1;
            }
            mo33390c2 = reader.mo33390c();
            if (mo33390c2 == 218) {
                return -1;
            }
            if (mo33390c2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            mo33391b = reader.mo33391b() - 2;
            if (mo33390c2 == 225) {
                return mo33391b;
            }
            j = mo33391b;
            mo33392a = reader.mo33392a(j);
        } while (mo33392a == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) mo33390c2) + ", wanted to skip: " + mo33391b + ", but actually skipped: " + mo33392a);
        }
        return -1;
    }

    /* renamed from: j */
    private static int m33399j(C2287b c2287b) {
        ByteOrder byteOrder;
        short m33397a = c2287b.m33397a(6);
        if (m33397a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (m33397a != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) m33397a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c2287b.m33393e(byteOrder);
        int m33396b = c2287b.m33396b(10) + 6;
        short m33397a2 = c2287b.m33397a(m33396b);
        for (int i = 0; i < m33397a2; i++) {
            int m33405d = m33405d(m33396b, i);
            short m33397a3 = c2287b.m33397a(m33405d);
            if (m33397a3 == 274) {
                short m33397a4 = c2287b.m33397a(m33405d + 2);
                if (m33397a4 >= 1 && m33397a4 <= 12) {
                    int m33396b2 = c2287b.m33396b(m33405d + 4);
                    if (m33396b2 < 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + ((int) m33397a3) + " formatCode=" + ((int) m33397a4) + " componentCount=" + m33396b2);
                        }
                        int i2 = m33396b2 + f6660b[m33397a4];
                        if (i2 > 4) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) m33397a4));
                            }
                        } else {
                            int i3 = m33405d + 8;
                            if (i3 >= 0 && i3 <= c2287b.m33394d()) {
                                if (i2 >= 0 && i2 + i3 <= c2287b.m33394d()) {
                                    return c2287b.m33397a(i3);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) m33397a3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) m33397a3));
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) m33397a4));
                }
            }
        }
        return -1;
    }

    /* renamed from: k */
    private int m33398k(Reader reader, byte[] bArr, int i) throws IOException {
        int read = reader.read(bArr, i);
        if (read != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + read);
            }
            return -1;
        } else if (m33401h(bArr, i)) {
            return m33399j(new C2287b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo33343a(ByteBuffer byteBuffer) throws IOException {
        C2380j.m33129d(byteBuffer);
        return m33403f(new C2286a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo33342b(InputStream inputStream) throws IOException {
        C2380j.m33129d(inputStream);
        return m33403f(new C2288c(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo33341c(InputStream inputStream, InterfaceC2095b interfaceC2095b) throws IOException {
        C2380j.m33129d(inputStream);
        C2288c c2288c = new C2288c(inputStream);
        C2380j.m33129d(interfaceC2095b);
        return m33404e(c2288c, interfaceC2095b);
    }
}
