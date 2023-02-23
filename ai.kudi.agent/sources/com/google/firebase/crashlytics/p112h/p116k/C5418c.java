package com.google.firebase.crashlytics.p112h.p116k;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueueFile.java */
/* renamed from: com.google.firebase.crashlytics.h.k.c */
/* loaded from: classes2.dex */
public class C5418c implements Closeable {

    /* renamed from: y */
    private static final Logger f13374y = Logger.getLogger(C5418c.class.getName());

    /* renamed from: c */
    private final RandomAccessFile f13375c;

    /* renamed from: d */
    int f13376d;

    /* renamed from: e */
    private int f13377e;

    /* renamed from: f */
    private C5420b f13378f;

    /* renamed from: w */
    private C5420b f13379w;

    /* renamed from: x */
    private final byte[] f13380x = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFile.java */
    /* renamed from: com.google.firebase.crashlytics.h.k.c$a */
    /* loaded from: classes2.dex */
    public class C5419a implements InterfaceC5422d {

        /* renamed from: a */
        boolean f13381a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f13382b;

        C5419a(C5418c c5418c, StringBuilder sb) {
            this.f13382b = sb;
        }

        @Override // com.google.firebase.crashlytics.p112h.p116k.C5418c.InterfaceC5422d
        /* renamed from: a */
        public void mo24784a(InputStream inputStream, int i) throws IOException {
            if (this.f13381a) {
                this.f13381a = false;
            } else {
                this.f13382b.append(", ");
            }
            this.f13382b.append(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QueueFile.java */
    /* renamed from: com.google.firebase.crashlytics.h.k.c$b */
    /* loaded from: classes2.dex */
    public static class C5420b {

        /* renamed from: c */
        static final C5420b f13383c = new C5420b(0, 0);

        /* renamed from: a */
        final int f13384a;

        /* renamed from: b */
        final int f13385b;

        C5420b(int i, int i2) {
            this.f13384a = i;
            this.f13385b = i2;
        }

        public String toString() {
            return C5420b.class.getSimpleName() + "[position = " + this.f13384a + ", length = " + this.f13385b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueueFile.java */
    /* renamed from: com.google.firebase.crashlytics.h.k.c$c */
    /* loaded from: classes2.dex */
    public final class C5421c extends InputStream {

        /* renamed from: c */
        private int f13386c;

        /* renamed from: d */
        private int f13387d;

        /* synthetic */ C5421c(C5418c c5418c, C5420b c5420b, C5419a c5419a) {
            this(c5420b);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            C5418c.m24805b0(bArr, "buffer");
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.f13387d;
                if (i3 > 0) {
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    C5418c.this.m24795w0(this.f13386c, bArr, i, i2);
                    this.f13386c = C5418c.this.m24817C0(this.f13386c + i2);
                    this.f13387d -= i2;
                    return i2;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private C5421c(C5420b c5420b) {
            this.f13386c = C5418c.this.m24817C0(c5420b.f13384a + 4);
            this.f13387d = c5420b.f13385b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f13387d == 0) {
                return -1;
            }
            C5418c.this.f13375c.seek(this.f13386c);
            int read = C5418c.this.f13375c.read();
            this.f13386c = C5418c.this.m24817C0(this.f13386c + 1);
            this.f13387d--;
            return read;
        }
    }

    /* compiled from: QueueFile.java */
    /* renamed from: com.google.firebase.crashlytics.h.k.c$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC5422d {
        /* renamed from: a */
        void mo24784a(InputStream inputStream, int i) throws IOException;
    }

    public C5418c(File file) throws IOException {
        if (!file.exists()) {
            m24807X(file);
        }
        this.f13375c = m24803f0(file);
        m24800i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public int m24817C0(int i) {
        int i2 = this.f13376d;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: D0 */
    private void m24816D0(int i, int i2, int i3, int i4) throws IOException {
        m24813F0(this.f13380x, i, i2, i3, i4);
        this.f13375c.seek(0L);
        this.f13375c.write(this.f13380x);
    }

    /* renamed from: E0 */
    private static void m24815E0(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: F0 */
    private static void m24813F0(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            m24815E0(bArr, i, i2);
            i += 4;
        }
    }

    /* renamed from: P */
    private void m24809P(int i) throws IOException {
        int i2 = i + 4;
        int m24797o0 = m24797o0();
        if (m24797o0 >= i2) {
            return;
        }
        int i3 = this.f13376d;
        do {
            m24797o0 += i3;
            i3 <<= 1;
        } while (m24797o0 < i2);
        m24793z0(i3);
        C5420b c5420b = this.f13379w;
        int m24817C0 = m24817C0(c5420b.f13384a + 4 + c5420b.f13385b);
        if (m24817C0 < this.f13378f.f13384a) {
            FileChannel channel = this.f13375c.getChannel();
            channel.position(this.f13376d);
            long j = m24817C0 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f13379w.f13384a;
        int i5 = this.f13378f.f13384a;
        if (i4 < i5) {
            int i6 = (this.f13376d + i4) - 16;
            m24816D0(i3, this.f13377e, i5, i6);
            this.f13379w = new C5420b(i6, this.f13379w.f13385b);
        } else {
            m24816D0(i3, this.f13377e, i5, i4);
        }
        this.f13376d = i3;
    }

    /* renamed from: X */
    private static void m24807X(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile m24803f0 = m24803f0(file2);
        try {
            m24803f0.setLength(4096L);
            m24803f0.seek(0L);
            byte[] bArr = new byte[16];
            m24813F0(bArr, 4096, 0, 0, 0);
            m24803f0.write(bArr);
            m24803f0.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            m24803f0.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public static <T> T m24805b0(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: f0 */
    private static RandomAccessFile m24803f0(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: g0 */
    private C5420b m24801g0(int i) throws IOException {
        if (i == 0) {
            return C5420b.f13383c;
        }
        this.f13375c.seek(i);
        return new C5420b(i, this.f13375c.readInt());
    }

    /* renamed from: i0 */
    private void m24800i0() throws IOException {
        this.f13375c.seek(0L);
        this.f13375c.readFully(this.f13380x);
        int m24799k0 = m24799k0(this.f13380x, 0);
        this.f13376d = m24799k0;
        if (m24799k0 <= this.f13375c.length()) {
            this.f13377e = m24799k0(this.f13380x, 4);
            int m24799k02 = m24799k0(this.f13380x, 8);
            int m24799k03 = m24799k0(this.f13380x, 12);
            this.f13378f = m24801g0(m24799k02);
            this.f13379w = m24801g0(m24799k03);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f13376d + ", Actual length: " + this.f13375c.length());
    }

    /* renamed from: k0 */
    private static int m24799k0(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: o0 */
    private int m24797o0() {
        return this.f13376d - m24818A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public void m24795w0(int i, byte[] bArr, int i2, int i3) throws IOException {
        int m24817C0 = m24817C0(i);
        int i4 = m24817C0 + i3;
        int i5 = this.f13376d;
        if (i4 <= i5) {
            this.f13375c.seek(m24817C0);
            this.f13375c.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - m24817C0;
        this.f13375c.seek(m24817C0);
        this.f13375c.readFully(bArr, i2, i6);
        this.f13375c.seek(16L);
        this.f13375c.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: x0 */
    private void m24794x0(int i, byte[] bArr, int i2, int i3) throws IOException {
        int m24817C0 = m24817C0(i);
        int i4 = m24817C0 + i3;
        int i5 = this.f13376d;
        if (i4 <= i5) {
            this.f13375c.seek(m24817C0);
            this.f13375c.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - m24817C0;
        this.f13375c.seek(m24817C0);
        this.f13375c.write(bArr, i2, i6);
        this.f13375c.seek(16L);
        this.f13375c.write(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: z0 */
    private void m24793z0(int i) throws IOException {
        this.f13375c.setLength(i);
        this.f13375c.getChannel().force(true);
    }

    /* renamed from: A0 */
    public int m24818A0() {
        if (this.f13377e == 0) {
            return 16;
        }
        C5420b c5420b = this.f13379w;
        int i = c5420b.f13384a;
        int i2 = this.f13378f.f13384a;
        if (i >= i2) {
            return (i - i2) + 4 + c5420b.f13385b + 16;
        }
        return (((i + 4) + c5420b.f13385b) + this.f13376d) - i2;
    }

    /* renamed from: I */
    public void m24812I(byte[] bArr) throws IOException {
        m24811J(bArr, 0, bArr.length);
    }

    /* renamed from: J */
    public synchronized void m24811J(byte[] bArr, int i, int i2) throws IOException {
        m24805b0(bArr, "buffer");
        if ((i | i2) >= 0 && i2 <= bArr.length - i) {
            m24809P(i2);
            boolean m24806Z = m24806Z();
            C5420b c5420b = new C5420b(m24806Z ? 16 : m24817C0(this.f13379w.f13384a + 4 + this.f13379w.f13385b), i2);
            m24815E0(this.f13380x, 0, i2);
            m24794x0(c5420b.f13384a, this.f13380x, 0, 4);
            m24794x0(c5420b.f13384a + 4, bArr, i, i2);
            m24816D0(this.f13376d, this.f13377e + 1, m24806Z ? c5420b.f13384a : this.f13378f.f13384a, c5420b.f13384a);
            this.f13379w = c5420b;
            this.f13377e++;
            if (m24806Z) {
                this.f13378f = c5420b;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: O */
    public synchronized void m24810O() throws IOException {
        m24816D0(4096, 0, 0, 0);
        this.f13377e = 0;
        this.f13378f = C5420b.f13383c;
        this.f13379w = C5420b.f13383c;
        if (this.f13376d > 4096) {
            m24793z0(4096);
        }
        this.f13376d = 4096;
    }

    /* renamed from: V */
    public synchronized void m24808V(InterfaceC5422d interfaceC5422d) throws IOException {
        int i = this.f13378f.f13384a;
        for (int i2 = 0; i2 < this.f13377e; i2++) {
            C5420b m24801g0 = m24801g0(i);
            interfaceC5422d.mo24784a(new C5421c(this, m24801g0, null), m24801g0.f13385b);
            i = m24817C0(m24801g0.f13384a + 4 + m24801g0.f13385b);
        }
    }

    /* renamed from: Z */
    public synchronized boolean m24806Z() {
        return this.f13377e == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f13375c.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C5418c.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f13376d);
        sb.append(", size=");
        sb.append(this.f13377e);
        sb.append(", first=");
        sb.append(this.f13378f);
        sb.append(", last=");
        sb.append(this.f13379w);
        sb.append(", element lengths=[");
        try {
            m24808V(new C5419a(this, sb));
        } catch (IOException e) {
            f13374y.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: u0 */
    public synchronized void m24796u0() throws IOException {
        if (!m24806Z()) {
            if (this.f13377e == 1) {
                m24810O();
            } else {
                int m24817C0 = m24817C0(this.f13378f.f13384a + 4 + this.f13378f.f13385b);
                m24795w0(m24817C0, this.f13380x, 0, 4);
                int m24799k0 = m24799k0(this.f13380x, 0);
                m24816D0(this.f13376d, this.f13377e - 1, m24817C0, this.f13379w.f13384a);
                this.f13377e--;
                this.f13378f = new C5420b(m24817C0, m24799k0);
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}
