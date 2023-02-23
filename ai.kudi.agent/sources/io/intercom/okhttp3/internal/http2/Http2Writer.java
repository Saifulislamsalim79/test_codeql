package io.intercom.okhttp3.internal.http2;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.okhttp3.internal.Util;
import io.intercom.okhttp3.internal.http2.Hpack;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p425j.p429b.p433b.C11146c;
import p425j.p429b.p433b.InterfaceC11150d;
/* loaded from: classes3.dex */
final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());

    /* renamed from: client  reason: collision with root package name */
    private final boolean f33392client;
    private boolean closed;
    private final C11146c hpackBuffer;
    final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final InterfaceC11150d sink;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Http2Writer(InterfaceC11150d interfaceC11150d, boolean z) {
        this.sink = interfaceC11150d;
        this.f33392client = z;
        C11146c c11146c = new C11146c();
        this.hpackBuffer = c11146c;
        this.hpackWriter = new Hpack.Writer(c11146c);
        this.maxFrameSize = 16384;
    }

    private void writeContinuationFrames(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min(this.maxFrameSize, j);
            long j2 = min;
            j -= j2;
            frameHeader(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.sink.write(this.hpackBuffer, j2);
        }
    }

    private static void writeMedium(InterfaceC11150d interfaceC11150d, int i) throws IOException {
        interfaceC11150d.mo11509n((i >>> 16) & 255);
        interfaceC11150d.mo11509n((i >>> 8) & 255);
        interfaceC11150d.mo11509n(i & 255);
    }

    public synchronized void applyAndAckSettings(Settings settings) throws IOException {
        if (!this.closed) {
            this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
            if (settings.getHeaderTableSize() != -1) {
                this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
            }
            frameHeader(0, 0, (byte) 4, (byte) 1);
            this.sink.flush();
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.closed = true;
        this.sink.close();
    }

    public synchronized void connectionPreface() throws IOException {
        if (!this.closed) {
            if (this.f33392client) {
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.mo11460q()));
                }
                this.sink.mo11505x(Http2.CONNECTION_PREFACE.mo11467O());
                this.sink.flush();
                return;
            }
            return;
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    public synchronized void data(boolean z, int i, C11146c c11146c, int i2) throws IOException {
        if (!this.closed) {
            dataFrame(i, z ? (byte) 1 : (byte) 0, c11146c, i2);
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    void dataFrame(int i, byte b, C11146c c11146c, int i2) throws IOException {
        frameHeader(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.sink.write(c11146c, i2);
        }
    }

    public synchronized void flush() throws IOException {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public void frameHeader(int i, int i2, byte b, byte b2) throws IOException {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.frameLog(false, i, i2, b, b2));
        }
        int i3 = this.maxFrameSize;
        if (i2 > i3) {
            throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
        }
        writeMedium(this.sink, i2);
        this.sink.mo11509n(b & 255);
        this.sink.mo11509n(b2 & 255);
        this.sink.mo11510j(i & Integer.MAX_VALUE);
    }

    public synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (!this.closed) {
            if (errorCode.httpCode != -1) {
                frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.sink.mo11510j(i);
                this.sink.mo11510j(errorCode.httpCode);
                if (bArr.length > 0) {
                    this.sink.mo11505x(bArr);
                }
                this.sink.flush();
            } else {
                throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
            }
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public synchronized void headers(int i, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(false, i, list);
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public int maxDataLength() {
        return this.maxFrameSize;
    }

    public synchronized void ping(boolean z, int i, int i2) throws IOException {
        if (!this.closed) {
            frameHeader(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.sink.mo11510j(i);
            this.sink.mo11510j(i2);
            this.sink.flush();
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public synchronized void pushPromise(int i, int i2, List<Header> list) throws IOException {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long m11579J0 = this.hpackBuffer.m11579J0();
            int min = (int) Math.min(this.maxFrameSize - 4, m11579J0);
            long j = min;
            frameHeader(i, min + 4, (byte) 5, m11579J0 == j ? (byte) 4 : (byte) 0);
            this.sink.mo11510j(i2 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j);
            if (m11579J0 > j) {
                writeContinuationFrames(i, m11579J0 - j);
            }
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public synchronized void rstStream(int i, ErrorCode errorCode) throws IOException {
        if (!this.closed) {
            if (errorCode.httpCode != -1) {
                frameHeader(i, 4, (byte) 3, (byte) 0);
                this.sink.mo11510j(errorCode.httpCode);
                this.sink.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public synchronized void settings(Settings settings) throws IOException {
        if (!this.closed) {
            int i = 0;
            frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (settings.isSet(i)) {
                    this.sink.mo11511i(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.sink.mo11510j(settings.get(i));
                }
                i++;
            }
            this.sink.flush();
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public synchronized void synReply(boolean z, int i, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public synchronized void synStream(boolean z, int i, int i2, List<Header> list) throws IOException {
        if (!this.closed) {
            headers(z, i, list);
        } else {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    public synchronized void windowUpdate(int i, long j) throws IOException {
        if (this.closed) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        if (j != 0 && j <= 2147483647L) {
            frameHeader(i, 4, (byte) 8, (byte) 0);
            this.sink.mo11510j((int) j);
            this.sink.flush();
        } else {
            throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
    }

    void headers(boolean z, int i, List<Header> list) throws IOException {
        if (!this.closed) {
            this.hpackWriter.writeHeaders(list);
            long m11579J0 = this.hpackBuffer.m11579J0();
            int min = (int) Math.min(this.maxFrameSize, m11579J0);
            long j = min;
            byte b = m11579J0 == j ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            frameHeader(i, min, (byte) 1, b);
            this.sink.write(this.hpackBuffer, j);
            if (m11579J0 > j) {
                writeContinuationFrames(i, m11579J0 - j);
                return;
            }
            return;
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }
}
