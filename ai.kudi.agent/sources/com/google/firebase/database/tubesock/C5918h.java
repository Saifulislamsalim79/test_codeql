package com.google.firebase.database.tubesock;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: WebSocketWriter.java */
/* renamed from: com.google.firebase.database.tubesock.h */
/* loaded from: classes2.dex */
class C5918h {

    /* renamed from: a */
    private BlockingQueue<ByteBuffer> f14535a;

    /* renamed from: e */
    private C5909c f14539e;

    /* renamed from: f */
    private WritableByteChannel f14540f;

    /* renamed from: b */
    private final Random f14536b = new Random();

    /* renamed from: c */
    private volatile boolean f14537c = false;

    /* renamed from: d */
    private boolean f14538d = false;

    /* renamed from: g */
    private final Thread f14541g = C5909c.m23340j().newThread(new RunnableC5919a());

    /* compiled from: WebSocketWriter.java */
    /* renamed from: com.google.firebase.database.tubesock.h$a */
    /* loaded from: classes2.dex */
    class RunnableC5919a implements Runnable {
        RunnableC5919a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5918h.this.m23306f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5918h(C5909c c5909c, String str, int i) {
        InterfaceC5908b m23341i = C5909c.m23341i();
        Thread m23308d = m23308d();
        m23341i.mo23331a(m23308d, str + "Writer-" + i);
        this.f14539e = c5909c;
        this.f14535a = new LinkedBlockingQueue();
    }

    /* renamed from: b */
    private ByteBuffer m23310b(byte b, boolean z, byte[] bArr) throws IOException {
        int i = z ? 6 : 2;
        int length = bArr.length;
        if (length >= 126) {
            i = length <= 65535 ? i + 2 : i + 8;
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + i);
        allocate.put((byte) (b | Byte.MIN_VALUE));
        if (length < 126) {
            if (z) {
                length |= 128;
            }
            allocate.put((byte) length);
        } else if (length <= 65535) {
            allocate.put((byte) (z ? 254 : 126));
            allocate.putShort((short) length);
        } else {
            allocate.put((byte) (z ? 255 : 127));
            allocate.putInt(0);
            allocate.putInt(length);
        }
        if (z) {
            byte[] m23309c = m23309c();
            allocate.put(m23309c);
            for (int i2 = 0; i2 < bArr.length; i2++) {
                allocate.put((byte) (bArr[i2] ^ m23309c[i2 % 4]));
            }
        }
        allocate.flip();
        return allocate;
    }

    /* renamed from: c */
    private byte[] m23309c() {
        byte[] bArr = new byte[4];
        this.f14536b.nextBytes(bArr);
        return bArr;
    }

    /* renamed from: e */
    private void m23307e(WebSocketException webSocketException) {
        this.f14539e.m23339k(webSocketException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m23306f() {
        while (!this.f14537c && !Thread.interrupted()) {
            try {
                m23302j();
            } catch (IOException e) {
                m23307e(new WebSocketException("IO Exception", e));
                return;
            } catch (InterruptedException unused) {
                return;
            }
        }
        for (int i = 0; i < this.f14535a.size(); i++) {
            m23302j();
        }
    }

    /* renamed from: j */
    private void m23302j() throws InterruptedException, IOException {
        this.f14540f.write(this.f14535a.take());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Thread m23308d() {
        return this.f14541g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1.f14538d = true;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m23305g(byte r2, boolean r3, byte[] r4) throws java.io.IOException {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r3 = r1.m23310b(r2, r3, r4)     // Catch: java.lang.Throwable -> L26
            boolean r4 = r1.f14537c     // Catch: java.lang.Throwable -> L26
            r0 = 8
            if (r4 == 0) goto L1a
            boolean r4 = r1.f14538d     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L12
            if (r2 != r0) goto L12
            goto L1a
        L12:
            com.google.firebase.database.tubesock.WebSocketException r2 = new com.google.firebase.database.tubesock.WebSocketException     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "Shouldn't be sending"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            throw r2     // Catch: java.lang.Throwable -> L26
        L1a:
            if (r2 != r0) goto L1f
            r2 = 1
            r1.f14538d = r2     // Catch: java.lang.Throwable -> L26
        L1f:
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r2 = r1.f14535a     // Catch: java.lang.Throwable -> L26
            r2.add(r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)
            return
        L26:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.database.tubesock.C5918h.m23305g(byte, boolean, byte[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m23304h(OutputStream outputStream) {
        this.f14540f = Channels.newChannel(outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m23303i() {
        this.f14537c = true;
    }
}
