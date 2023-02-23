package io.intercom.okhttp3.internal.p424ws;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.util.Random;
import p425j.p429b.p433b.C11146c;
import p425j.p429b.p433b.C11152f;
import p425j.p429b.p433b.C11171t;
import p425j.p429b.p433b.InterfaceC11150d;
import p425j.p429b.p433b.InterfaceC11169r;
/* renamed from: io.intercom.okhttp3.internal.ws.WebSocketWriter */
/* loaded from: classes3.dex */
final class WebSocketWriter {
    boolean activeWriter;
    final C11146c buffer = new C11146c();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    private final C11146c.C11149c maskCursor;
    private final byte[] maskKey;
    final Random random;
    final InterfaceC11150d sink;
    final C11146c sinkBuffer;
    boolean writerClosed;

    /* renamed from: io.intercom.okhttp3.internal.ws.WebSocketWriter$FrameSink */
    /* loaded from: classes3.dex */
    final class FrameSink implements InterfaceC11169r {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        FrameSink() {
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.m11579J0(), this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.activeWriter = false;
                return;
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r, java.io.Flushable
        public void flush() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.m11579J0(), this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r
        public C11171t timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // p425j.p429b.p433b.InterfaceC11169r
        public void write(C11146c c11146c, long j) throws IOException {
            if (!this.closed) {
                WebSocketWriter.this.buffer.write(c11146c, j);
                boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.m11579J0() > this.contentLength - 8192;
                long m11583F = WebSocketWriter.this.buffer.m11583F();
                if (m11583F <= 0 || z) {
                    return;
                }
                WebSocketWriter.this.writeMessageFrame(this.formatOpcode, m11583F, this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketWriter(boolean z, InterfaceC11150d interfaceC11150d, Random random) {
        if (interfaceC11150d == null) {
            throw new NullPointerException("sink == null");
        }
        if (random != null) {
            this.isClient = z;
            this.sink = interfaceC11150d;
            this.sinkBuffer = interfaceC11150d.mo11496d();
            this.random = random;
            this.maskKey = z ? new byte[4] : null;
            this.maskCursor = z ? new C11146c.C11149c() : null;
            return;
        }
        throw new NullPointerException("random == null");
    }

    private void writeControlFrame(int i, C11152f c11152f) throws IOException {
        if (!this.writerClosed) {
            int mo11470F = c11152f.mo11470F();
            if (mo11470F <= 125) {
                this.sinkBuffer.m11567c1(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.m11567c1(mo11470F | 128);
                    this.random.nextBytes(this.maskKey);
                    this.sinkBuffer.m11571Z0(this.maskKey);
                    if (mo11470F > 0) {
                        long m11579J0 = this.sinkBuffer.m11579J0();
                        this.sinkBuffer.m11572X0(c11152f);
                        this.sinkBuffer.m11551x0(this.maskCursor);
                        this.maskCursor.m11548g(m11579J0);
                        WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.m11567c1(mo11470F);
                    this.sinkBuffer.m11572X0(c11152f);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InterfaceC11169r newMessageSink(int i, long j) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            FrameSink frameSink = this.frameSink;
            frameSink.formatOpcode = i;
            frameSink.contentLength = j;
            frameSink.isFirstFrame = true;
            frameSink.closed = false;
            return frameSink;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeClose(int i, C11152f c11152f) throws IOException {
        C11152f c11152f2 = C11152f.f25217w;
        if (i != 0 || c11152f != null) {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            C11146c c11146c = new C11146c();
            c11146c.m11560h1(i);
            if (c11152f != null) {
                c11146c.m11572X0(c11152f);
            }
            c11152f2 = c11146c.m11550z0();
        }
        try {
            writeControlFrame(8, c11152f2);
        } finally {
            this.writerClosed = true;
        }
    }

    void writeMessageFrame(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.writerClosed) {
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.sinkBuffer.m11567c1(i);
            int i2 = this.isClient ? 128 : 0;
            if (j <= 125) {
                this.sinkBuffer.m11567c1(((int) j) | i2);
            } else if (j <= 65535) {
                this.sinkBuffer.m11567c1(i2 | 126);
                this.sinkBuffer.m11560h1((int) j);
            } else {
                this.sinkBuffer.m11567c1(i2 | 127);
                this.sinkBuffer.m11561g1(j);
            }
            if (this.isClient) {
                this.random.nextBytes(this.maskKey);
                this.sinkBuffer.m11571Z0(this.maskKey);
                if (j > 0) {
                    long m11579J0 = this.sinkBuffer.m11579J0();
                    this.sinkBuffer.write(this.buffer, j);
                    this.sinkBuffer.m11551x0(this.maskCursor);
                    this.maskCursor.m11548g(m11579J0);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            } else {
                this.sinkBuffer.write(this.buffer, j);
            }
            this.sink.mo11514K();
            return;
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writePing(C11152f c11152f) throws IOException {
        writeControlFrame(9, c11152f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writePong(C11152f c11152f) throws IOException {
        writeControlFrame(10, c11152f);
    }
}
