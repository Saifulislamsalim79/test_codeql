package io.intercom.com.bumptech.glide.load.p402o.p403c;

import android.util.Log;
import io.intercom.com.bumptech.glide.load.InterfaceC10511e;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
/* compiled from: DefaultImageHeaderParser.java */
/* renamed from: io.intercom.com.bumptech.glide.load.o.c.i */
/* loaded from: classes3.dex */
public final class C10746i implements InterfaceC10511e {

    /* renamed from: a */
    static final byte[] f24568a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f24569b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* compiled from: DefaultImageHeaderParser.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.i$a */
    /* loaded from: classes3.dex */
    private static final class C10747a implements InterfaceC10749c {

        /* renamed from: a */
        private final ByteBuffer f24570a;

        C10747a(ByteBuffer byteBuffer) {
            this.f24570a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10746i.InterfaceC10749c
        /* renamed from: a */
        public long mo12428a(long j) throws IOException {
            int min = (int) Math.min(this.f24570a.remaining(), j);
            ByteBuffer byteBuffer = this.f24570a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10746i.InterfaceC10749c
        /* renamed from: b */
        public int mo12427b() throws IOException {
            return ((mo12425d() << 8) & 65280) | (mo12425d() & 255);
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10746i.InterfaceC10749c
        /* renamed from: c */
        public short mo12426c() throws IOException {
            return (short) (mo12425d() & 255);
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10746i.InterfaceC10749c
        /* renamed from: d */
        public int mo12425d() throws IOException {
            if (this.f24570a.remaining() < 1) {
                return -1;
            }
            return this.f24570a.get();
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10746i.InterfaceC10749c
        public int read(byte[] bArr, int i) throws IOException {
            int min = Math.min(i, this.f24570a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f24570a.get(bArr, 0, min);
            return min;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultImageHeaderParser.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.i$b */
    /* loaded from: classes3.dex */
    public static final class C10748b {

        /* renamed from: a */
        private final ByteBuffer f24571a;

        C10748b(byte[] bArr, int i) {
            this.f24571a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: c */
        private boolean m12431c(int i, int i2) {
            return this.f24571a.remaining() - i >= i2;
        }

        /* renamed from: a */
        short m12433a(int i) {
            if (m12431c(i, 2)) {
                return this.f24571a.getShort(i);
            }
            return (short) -1;
        }

        /* renamed from: b */
        int m12432b(int i) {
            if (m12431c(i, 4)) {
                return this.f24571a.getInt(i);
            }
            return -1;
        }

        /* renamed from: d */
        int m12430d() {
            return this.f24571a.remaining();
        }

        /* renamed from: e */
        void m12429e(ByteOrder byteOrder) {
            this.f24571a.order(byteOrder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultImageHeaderParser.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.i$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC10749c {
        /* renamed from: a */
        long mo12428a(long j) throws IOException;

        /* renamed from: b */
        int mo12427b() throws IOException;

        /* renamed from: c */
        short mo12426c() throws IOException;

        /* renamed from: d */
        int mo12425d() throws IOException;

        int read(byte[] bArr, int i) throws IOException;
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.o.c.i$d */
    /* loaded from: classes3.dex */
    private static final class C10750d implements InterfaceC10749c {

        /* renamed from: a */
        private final InputStream f24572a;

        C10750d(InputStream inputStream) {
            this.f24572a = inputStream;
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10746i.InterfaceC10749c
        /* renamed from: a */
        public long mo12428a(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f24572a.skip(j2);
                if (skip <= 0) {
                    if (this.f24572a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10746i.InterfaceC10749c
        /* renamed from: b */
        public int mo12427b() throws IOException {
            return ((this.f24572a.read() << 8) & 65280) | (this.f24572a.read() & 255);
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10746i.InterfaceC10749c
        /* renamed from: c */
        public short mo12426c() throws IOException {
            return (short) (this.f24572a.read() & 255);
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10746i.InterfaceC10749c
        /* renamed from: d */
        public int mo12425d() throws IOException {
            return this.f24572a.read();
        }

        @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10746i.InterfaceC10749c
        public int read(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f24572a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }
    }

    /* renamed from: d */
    private static int m12441d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: e */
    private int m12440e(InterfaceC10749c interfaceC10749c, InterfaceC10576b interfaceC10576b) throws IOException {
        int mo12427b = interfaceC10749c.mo12427b();
        if (!m12438g(mo12427b)) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + mo12427b);
            }
            return -1;
        }
        int m12436i = m12436i(interfaceC10749c);
        if (m12436i == -1) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        byte[] bArr = (byte[]) interfaceC10576b.mo12686e(m12436i, byte[].class);
        try {
            return m12434k(interfaceC10749c, bArr, m12436i);
        } finally {
            interfaceC10576b.mo12687d(bArr);
        }
    }

    /* renamed from: f */
    private InterfaceC10511e.EnumC10512a m12439f(InterfaceC10749c interfaceC10749c) throws IOException {
        int mo12427b = interfaceC10749c.mo12427b();
        if (mo12427b == 65496) {
            return InterfaceC10511e.EnumC10512a.JPEG;
        }
        int mo12427b2 = ((mo12427b << 16) & (-65536)) | (interfaceC10749c.mo12427b() & 65535);
        if (mo12427b2 == -1991225785) {
            interfaceC10749c.mo12428a(21L);
            return interfaceC10749c.mo12425d() >= 3 ? InterfaceC10511e.EnumC10512a.PNG_A : InterfaceC10511e.EnumC10512a.PNG;
        } else if ((mo12427b2 >> 8) == 4671814) {
            return InterfaceC10511e.EnumC10512a.GIF;
        } else {
            if (mo12427b2 != 1380533830) {
                return InterfaceC10511e.EnumC10512a.UNKNOWN;
            }
            interfaceC10749c.mo12428a(4L);
            if ((((interfaceC10749c.mo12427b() << 16) & (-65536)) | (interfaceC10749c.mo12427b() & 65535)) != 1464156752) {
                return InterfaceC10511e.EnumC10512a.UNKNOWN;
            }
            int mo12427b3 = ((interfaceC10749c.mo12427b() << 16) & (-65536)) | (interfaceC10749c.mo12427b() & 65535);
            if ((mo12427b3 & (-256)) != 1448097792) {
                return InterfaceC10511e.EnumC10512a.UNKNOWN;
            }
            int i = mo12427b3 & 255;
            if (i == 88) {
                interfaceC10749c.mo12428a(4L);
                return (interfaceC10749c.mo12425d() & 16) != 0 ? InterfaceC10511e.EnumC10512a.WEBP_A : InterfaceC10511e.EnumC10512a.WEBP;
            } else if (i == 76) {
                interfaceC10749c.mo12428a(4L);
                return (interfaceC10749c.mo12425d() & 8) != 0 ? InterfaceC10511e.EnumC10512a.WEBP_A : InterfaceC10511e.EnumC10512a.WEBP;
            } else {
                return InterfaceC10511e.EnumC10512a.WEBP;
            }
        }
    }

    /* renamed from: g */
    private static boolean m12438g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: h */
    private boolean m12437h(byte[] bArr, int i) {
        boolean z = bArr != null && i > f24568a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f24568a;
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
    private int m12436i(InterfaceC10749c interfaceC10749c) throws IOException {
        short mo12426c;
        short mo12426c2;
        int mo12427b;
        long j;
        long mo12428a;
        do {
            if (interfaceC10749c.mo12426c() != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) mo12426c));
                }
                return -1;
            }
            mo12426c2 = interfaceC10749c.mo12426c();
            if (mo12426c2 == 218) {
                return -1;
            }
            if (mo12426c2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            mo12427b = interfaceC10749c.mo12427b() - 2;
            if (mo12426c2 == 225) {
                return mo12427b;
            }
            j = mo12427b;
            mo12428a = interfaceC10749c.mo12428a(j);
        } while (mo12428a == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) mo12426c2) + ", wanted to skip: " + mo12427b + ", but actually skipped: " + mo12428a);
        }
        return -1;
    }

    /* renamed from: j */
    private static int m12435j(C10748b c10748b) {
        ByteOrder byteOrder;
        short m12433a = c10748b.m12433a(6);
        if (m12433a == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (m12433a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) m12433a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c10748b.m12429e(byteOrder);
        int m12432b = c10748b.m12432b(10) + 6;
        short m12433a2 = c10748b.m12433a(m12432b);
        for (int i = 0; i < m12433a2; i++) {
            int m12441d = m12441d(m12432b, i);
            short m12433a3 = c10748b.m12433a(m12441d);
            if (m12433a3 == 274) {
                short m12433a4 = c10748b.m12433a(m12441d + 2);
                if (m12433a4 >= 1 && m12433a4 <= 12) {
                    int m12432b2 = c10748b.m12432b(m12441d + 4);
                    if (m12432b2 < 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + ((int) m12433a3) + " formatCode=" + ((int) m12433a4) + " componentCount=" + m12432b2);
                        }
                        int i2 = m12432b2 + f24569b[m12433a4];
                        if (i2 > 4) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) m12433a4));
                            }
                        } else {
                            int i3 = m12441d + 8;
                            if (i3 >= 0 && i3 <= c10748b.m12430d()) {
                                if (i2 >= 0 && i2 + i3 <= c10748b.m12430d()) {
                                    return c10748b.m12433a(i3);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) m12433a3));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) m12433a3));
                            }
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) m12433a4));
                }
            }
        }
        return -1;
    }

    /* renamed from: k */
    private int m12434k(InterfaceC10749c interfaceC10749c, byte[] bArr, int i) throws IOException {
        int read = interfaceC10749c.read(bArr, i);
        if (read != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + read);
            }
            return -1;
        } else if (m12437h(bArr, i)) {
            return m12435j(new C10748b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10511e
    /* renamed from: a */
    public InterfaceC10511e.EnumC10512a mo12444a(ByteBuffer byteBuffer) throws IOException {
        C10892h.m12014d(byteBuffer);
        return m12439f(new C10747a(byteBuffer));
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10511e
    /* renamed from: b */
    public InterfaceC10511e.EnumC10512a mo12443b(InputStream inputStream) throws IOException {
        C10892h.m12014d(inputStream);
        return m12439f(new C10750d(inputStream));
    }

    @Override // io.intercom.com.bumptech.glide.load.InterfaceC10511e
    /* renamed from: c */
    public int mo12442c(InputStream inputStream, InterfaceC10576b interfaceC10576b) throws IOException {
        C10892h.m12014d(inputStream);
        C10750d c10750d = new C10750d(inputStream);
        C10892h.m12014d(interfaceC10576b);
        return m12440e(c10750d, interfaceC10576b);
    }
}
