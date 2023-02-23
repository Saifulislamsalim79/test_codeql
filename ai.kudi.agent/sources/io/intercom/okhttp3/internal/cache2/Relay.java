package io.intercom.okhttp3.internal.cache2;

import io.intercom.okhttp3.internal.Util;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import p425j.p429b.p433b.C11146c;
import p425j.p429b.p433b.C11152f;
import p425j.p429b.p433b.C11171t;
import p425j.p429b.p433b.InterfaceC11170s;
/* loaded from: classes3.dex */
final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    static final C11152f PREFIX_CLEAN = C11152f.m11539n("OkHttp cache v1\n");
    static final C11152f PREFIX_DIRTY = C11152f.m11539n("OkHttp DIRTY :(\n");
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    final long bufferMaxSize;
    boolean complete;
    RandomAccessFile file;
    private final C11152f metadata;
    int sourceCount;
    InterfaceC11170s upstream;
    long upstreamPos;
    Thread upstreamReader;
    final C11146c upstreamBuffer = new C11146c();
    final C11146c buffer = new C11146c();

    /* loaded from: classes3.dex */
    class RelaySource implements InterfaceC11170s {
        private FileOperator fileOperator;
        private long sourcePos;
        private final C11171t timeout = new C11171t();

        RelaySource() {
            this.fileOperator = new FileOperator(Relay.this.file.getChannel());
        }

        @Override // p425j.p429b.p433b.InterfaceC11170s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (Relay.this) {
                Relay relay = Relay.this;
                relay.sourceCount--;
                if (Relay.this.sourceCount == 0) {
                    RandomAccessFile randomAccessFile2 = Relay.this.file;
                    Relay.this.file = null;
                    randomAccessFile = randomAccessFile2;
                }
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
            if (r5 != 2) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
            r2 = java.lang.Math.min(r23, r7 - r21.sourcePos);
            r21.fileOperator.read(r21.sourcePos + 32, r22, r2);
            r21.sourcePos += r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
            r5 = r21.this$0.upstream.read(r21.this$0.upstreamBuffer, r21.this$0.bufferMaxSize);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
            if (r5 != (-1)) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
            r21.this$0.commit(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
            r2 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
            r21.this$0.upstreamReader = null;
            r21.this$0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
            r2 = java.lang.Math.min(r5, r23);
            r21.this$0.upstreamBuffer.m11580I(r22, 0, r2);
            r21.sourcePos += r2;
            r21.fileOperator.write(r7 + 32, r21.this$0.upstreamBuffer.clone(), r5);
            r7 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
            monitor-enter(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
            r21.this$0.buffer.write(r21.this$0.upstreamBuffer, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
            if (r21.this$0.buffer.m11579J0() <= r21.this$0.bufferMaxSize) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
            r21.this$0.buffer.mo11499a(r21.this$0.buffer.m11579J0() - r21.this$0.bufferMaxSize);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
            r21.this$0.upstreamPos += r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
            monitor-exit(r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
            r5 = r21.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:
            monitor-enter(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
            r21.this$0.upstreamReader = null;
            r21.this$0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:
            monitor-exit(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0109, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
            monitor-enter(r21.this$0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x010d, code lost:
            r21.this$0.upstreamReader = null;
            r21.this$0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0117, code lost:
            throw r0;
         */
        @Override // p425j.p429b.p433b.InterfaceC11170s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(p425j.p429b.p433b.C11146c r22, long r23) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.okhttp3.internal.cache2.Relay.RelaySource.read(j.b.b.c, long):long");
        }

        @Override // p425j.p429b.p433b.InterfaceC11170s
        public C11171t timeout() {
            return this.timeout;
        }
    }

    private Relay(RandomAccessFile randomAccessFile, InterfaceC11170s interfaceC11170s, long j, C11152f c11152f, long j2) {
        this.file = randomAccessFile;
        this.upstream = interfaceC11170s;
        this.complete = interfaceC11170s == null;
        this.upstreamPos = j;
        this.metadata = c11152f;
        this.bufferMaxSize = j2;
    }

    public static Relay edit(File file, InterfaceC11170s interfaceC11170s, C11152f c11152f, long j) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        Relay relay = new Relay(randomAccessFile, interfaceC11170s, 0L, c11152f, j);
        randomAccessFile.setLength(0L);
        relay.writeHeader(PREFIX_DIRTY, -1L, -1L);
        return relay;
    }

    public static Relay read(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        FileOperator fileOperator = new FileOperator(randomAccessFile.getChannel());
        C11146c c11146c = new C11146c();
        fileOperator.read(0L, c11146c, 32L);
        if (c11146c.mo11494f(PREFIX_CLEAN.mo11470F()).equals(PREFIX_CLEAN)) {
            long readLong = c11146c.readLong();
            long readLong2 = c11146c.readLong();
            C11146c c11146c2 = new C11146c();
            fileOperator.read(readLong + 32, c11146c2, readLong2);
            return new Relay(randomAccessFile, null, readLong, c11146c2.m11550z0(), 0L);
        }
        throw new IOException("unreadable cache file");
    }

    private void writeHeader(C11152f c11152f, long j, long j2) throws IOException {
        C11146c c11146c = new C11146c();
        c11146c.m11572X0(c11152f);
        c11146c.m11561g1(j);
        c11146c.m11561g1(j2);
        if (c11146c.m11579J0() == 32) {
            new FileOperator(this.file.getChannel()).write(0L, c11146c, 32L);
            return;
        }
        throw new IllegalArgumentException();
    }

    private void writeMetadata(long j) throws IOException {
        C11146c c11146c = new C11146c();
        c11146c.m11572X0(this.metadata);
        new FileOperator(this.file.getChannel()).write(32 + j, c11146c, this.metadata.mo11470F());
    }

    void commit(long j) throws IOException {
        writeMetadata(j);
        this.file.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.mo11470F());
        this.file.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
        }
        Util.closeQuietly(this.upstream);
        this.upstream = null;
    }

    boolean isClosed() {
        return this.file == null;
    }

    public C11152f metadata() {
        return this.metadata;
    }

    public InterfaceC11170s newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }
}
