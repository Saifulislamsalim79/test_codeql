package io.intercom.okhttp3.internal.p424ws;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p425j.p429b.p433b.C11146c;
import p425j.p429b.p433b.C11152f;
import p425j.p429b.p433b.InterfaceC11151e;
/* renamed from: io.intercom.okhttp3.internal.ws.WebSocketReader */
/* loaded from: classes3.dex */
final class WebSocketReader {
    boolean closed;
    final FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final C11146c.C11149c maskCursor;
    private final byte[] maskKey;
    int opcode;
    final InterfaceC11151e source;
    private final C11146c controlFrameBuffer = new C11146c();
    private final C11146c messageFrameBuffer = new C11146c();

    /* renamed from: io.intercom.okhttp3.internal.ws.WebSocketReader$FrameCallback */
    /* loaded from: classes3.dex */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(C11152f c11152f) throws IOException;

        void onReadMessage(String str) throws IOException;

        void onReadPing(C11152f c11152f);

        void onReadPong(C11152f c11152f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketReader(boolean z, InterfaceC11151e interfaceC11151e, FrameCallback frameCallback) {
        if (interfaceC11151e == null) {
            throw new NullPointerException("source == null");
        }
        if (frameCallback != null) {
            this.isClient = z;
            this.source = interfaceC11151e;
            this.frameCallback = frameCallback;
            this.maskKey = z ? null : new byte[4];
            this.maskCursor = z ? null : new C11146c.C11149c();
            return;
        }
        throw new NullPointerException("frameCallback == null");
    }

    private void readControlFrame() throws IOException {
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.mo11497c0(this.controlFrameBuffer, j);
            if (!this.isClient) {
                this.controlFrameBuffer.m11551x0(this.maskCursor);
                this.maskCursor.m11548g(0L);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long m11579J0 = this.controlFrameBuffer.m11579J0();
                if (m11579J0 != 1) {
                    if (m11579J0 != 0) {
                        s = this.controlFrameBuffer.readShort();
                        str = this.controlFrameBuffer.m11584D0();
                        String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        str = "";
                    }
                    this.frameCallback.onReadClose(s, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.m11550z0());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.m11550z0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.opcode));
        }
    }

    /* JADX WARN: Finally extract failed */
    private void readHeader() throws IOException {
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int readByte = this.source.readByte() & 255;
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.opcode = readByte & 15;
                this.isFinalFrame = (readByte & 128) != 0;
                boolean z = (readByte & 8) != 0;
                this.isControlFrame = z;
                if (z && !this.isFinalFrame) {
                    throw new ProtocolException("Control frames must be final.");
                }
                boolean z2 = (readByte & 64) != 0;
                boolean z3 = (readByte & 32) != 0;
                boolean z4 = (readByte & 16) != 0;
                if (!z2 && !z3 && !z4) {
                    int readByte2 = this.source.readByte() & 255;
                    boolean z5 = (readByte2 & 128) != 0;
                    if (z5 == this.isClient) {
                        throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    long j = readByte2 & 127;
                    this.frameLength = j;
                    if (j == 126) {
                        this.frameLength = this.source.readShort() & 65535;
                    } else if (j == 127) {
                        long readLong = this.source.readLong();
                        this.frameLength = readLong;
                        if (readLong < 0) {
                            throw new ProtocolException("Frame length 0x" + Long.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    }
                    if (z5) {
                        this.source.readFully(this.maskKey);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("Reserved flags are unsupported.");
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    private void readMessage() throws IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.mo11497c0(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    this.messageFrameBuffer.m11551x0(this.maskCursor);
                    this.maskCursor.m11548g(this.messageFrameBuffer.m11579J0() - this.frameLength);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.opcode));
            }
        }
        throw new IOException(MetricTracker.Action.CLOSED);
    }

    private void readMessageFrame() throws IOException {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        readMessage();
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.m11584D0());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.m11550z0());
        }
    }

    private void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            }
            readControlFrame();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
