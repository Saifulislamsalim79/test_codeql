package io.intercom.com.bumptech.glide.p416r;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ByteBufferUtil.java */
/* renamed from: io.intercom.com.bumptech.glide.r.a */
/* loaded from: classes3.dex */
public final class C10883a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteBufferUtil.java */
    /* renamed from: io.intercom.com.bumptech.glide.r.a$b */
    /* loaded from: classes3.dex */
    public static final class C10885b {

        /* renamed from: a */
        final int f24846a;

        /* renamed from: b */
        final int f24847b;

        /* renamed from: c */
        final byte[] f24848c;

        C10885b(byte[] bArr, int i, int i2) {
            this.f24848c = bArr;
            this.f24846a = i;
            this.f24847b = i2;
        }
    }

    static {
        new AtomicReference();
    }

    /* renamed from: a */
    public static ByteBuffer m12043a(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused) {
                            }
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        return load;
                    } catch (Throwable th) {
                        th = th;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
                throw new IOException("File unsuitable for memory mapping");
            }
            throw new IOException("File too large to map into memory");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: b */
    private static C10885b m12042b(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new C10885b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: c */
    public static byte[] m12041c(ByteBuffer byteBuffer) {
        C10885b m12042b = m12042b(byteBuffer);
        if (m12042b != null && m12042b.f24846a == 0 && m12042b.f24847b == m12042b.f24848c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: d */
    public static void m12040d(ByteBuffer byteBuffer, File file) throws IOException {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileChannel = randomAccessFile.getChannel();
                fileChannel.write(byteBuffer);
                fileChannel.force(false);
                fileChannel.close();
                randomAccessFile.close();
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused) {
                    }
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: e */
    public static InputStream m12039e(ByteBuffer byteBuffer) {
        return new C10884a(byteBuffer);
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: io.intercom.com.bumptech.glide.r.a$a */
    /* loaded from: classes3.dex */
    private static class C10884a extends InputStream {

        /* renamed from: c */
        private final ByteBuffer f24844c;

        /* renamed from: d */
        private int f24845d = -1;

        C10884a(ByteBuffer byteBuffer) {
            this.f24844c = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f24844c.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f24845d = this.f24844c.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f24844c.hasRemaining()) {
                return this.f24844c.get();
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            if (this.f24845d != -1) {
                this.f24844c.position(this.f24845d);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) throws IOException {
            if (this.f24844c.hasRemaining()) {
                long min = Math.min(j, available());
                ByteBuffer byteBuffer = this.f24844c;
                byteBuffer.position((int) (byteBuffer.position() + min));
                return min;
            }
            return -1L;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.f24844c.hasRemaining()) {
                int min = Math.min(i2, available());
                this.f24844c.get(bArr, i, min);
                return min;
            }
            return -1;
        }
    }
}
