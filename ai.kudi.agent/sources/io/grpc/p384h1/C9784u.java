package io.grpc.p384h1;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
/* compiled from: CompositeReadableBuffer.java */
/* renamed from: io.grpc.h1.u */
/* loaded from: classes2.dex */
public class C9784u extends AbstractC9564c {

    /* renamed from: c */
    private final Deque<InterfaceC9802v1> f22995c;

    /* renamed from: d */
    private Deque<InterfaceC9802v1> f22996d;

    /* renamed from: e */
    private int f22997e;

    /* renamed from: f */
    private boolean f22998f;

    /* renamed from: w */
    private static final InterfaceC9790f<Void> f22991w = new C9785a();

    /* renamed from: x */
    private static final InterfaceC9790f<Void> f22992x = new C9786b();

    /* renamed from: y */
    private static final InterfaceC9790f<byte[]> f22993y = new C9787c();

    /* renamed from: z */
    private static final InterfaceC9790f<ByteBuffer> f22994z = new C9788d();

    /* renamed from: A */
    private static final InterfaceC9791g<OutputStream> f22990A = new C9789e();

    /* compiled from: CompositeReadableBuffer.java */
    /* renamed from: io.grpc.h1.u$a */
    /* loaded from: classes2.dex */
    class C9785a implements InterfaceC9790f<Void> {
        C9785a() {
        }

        @Override // io.grpc.p384h1.C9784u.InterfaceC9791g
        /* renamed from: b */
        public int mo13975a(InterfaceC9802v1 interfaceC9802v1, int i, Void r3, int i2) {
            return interfaceC9802v1.readUnsignedByte();
        }
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* renamed from: io.grpc.h1.u$b */
    /* loaded from: classes2.dex */
    class C9786b implements InterfaceC9790f<Void> {
        C9786b() {
        }

        @Override // io.grpc.p384h1.C9784u.InterfaceC9791g
        /* renamed from: b */
        public int mo13975a(InterfaceC9802v1 interfaceC9802v1, int i, Void r3, int i2) {
            interfaceC9802v1.skipBytes(i);
            return 0;
        }
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* renamed from: io.grpc.h1.u$c */
    /* loaded from: classes2.dex */
    class C9787c implements InterfaceC9790f<byte[]> {
        C9787c() {
        }

        @Override // io.grpc.p384h1.C9784u.InterfaceC9791g
        /* renamed from: b */
        public int mo13975a(InterfaceC9802v1 interfaceC9802v1, int i, byte[] bArr, int i2) {
            interfaceC9802v1.mo13565n0(bArr, i2, i);
            return i2 + i;
        }
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* renamed from: io.grpc.h1.u$d */
    /* loaded from: classes2.dex */
    class C9788d implements InterfaceC9790f<ByteBuffer> {
        C9788d() {
        }

        @Override // io.grpc.p384h1.C9784u.InterfaceC9791g
        /* renamed from: b */
        public int mo13975a(InterfaceC9802v1 interfaceC9802v1, int i, ByteBuffer byteBuffer, int i2) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i);
            interfaceC9802v1.mo13568Y0(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* renamed from: io.grpc.h1.u$e */
    /* loaded from: classes2.dex */
    class C9789e implements InterfaceC9791g<OutputStream> {
        C9789e() {
        }

        @Override // io.grpc.p384h1.C9784u.InterfaceC9791g
        /* renamed from: b */
        public int mo13975a(InterfaceC9802v1 interfaceC9802v1, int i, OutputStream outputStream, int i2) throws IOException {
            interfaceC9802v1.mo13569N0(outputStream, i);
            return 0;
        }
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* renamed from: io.grpc.h1.u$f */
    /* loaded from: classes2.dex */
    private interface InterfaceC9790f<T> extends InterfaceC9791g<T> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CompositeReadableBuffer.java */
    /* renamed from: io.grpc.h1.u$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC9791g<T> {
        /* renamed from: a */
        int mo13975a(InterfaceC9802v1 interfaceC9802v1, int i, T t, int i2) throws IOException;
    }

    public C9784u(int i) {
        this.f22995c = new ArrayDeque(i);
    }

    /* renamed from: F */
    private void m13986F() {
        if (this.f22995c.peek().mo13566h() == 0) {
            m13981m();
        }
    }

    /* renamed from: I */
    private void m13985I(InterfaceC9802v1 interfaceC9802v1) {
        if (!(interfaceC9802v1 instanceof C9784u)) {
            this.f22995c.add(interfaceC9802v1);
            this.f22997e += interfaceC9802v1.mo13566h();
            return;
        }
        C9784u c9784u = (C9784u) interfaceC9802v1;
        while (!c9784u.f22995c.isEmpty()) {
            this.f22995c.add(c9784u.f22995c.remove());
        }
        this.f22997e += c9784u.f22997e;
        c9784u.f22997e = 0;
        c9784u.close();
    }

    /* renamed from: J */
    private <T> int m13984J(InterfaceC9791g<T> interfaceC9791g, int i, T t, int i2) throws IOException {
        m14454c(i);
        if (!this.f22995c.isEmpty()) {
            m13986F();
        }
        while (i > 0 && !this.f22995c.isEmpty()) {
            InterfaceC9802v1 peek = this.f22995c.peek();
            int min = Math.min(i, peek.mo13566h());
            i2 = interfaceC9791g.mo13975a(peek, min, t, i2);
            i -= min;
            this.f22997e -= min;
            m13986F();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    /* renamed from: O */
    private <T> int m13983O(InterfaceC9790f<T> interfaceC9790f, int i, T t, int i2) {
        try {
            return m13984J(interfaceC9790f, i, t, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: m */
    private void m13981m() {
        if (this.f22998f) {
            this.f22996d.add(this.f22995c.remove());
            InterfaceC9802v1 peek = this.f22995c.peek();
            if (peek != null) {
                peek.mo13940v0();
                return;
            }
            return;
        }
        this.f22995c.remove().close();
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: M */
    public InterfaceC9802v1 mo13570M(int i) {
        InterfaceC9802v1 poll;
        int i2;
        InterfaceC9802v1 interfaceC9802v1;
        if (i <= 0) {
            return C9806w1.m13947a();
        }
        m14454c(i);
        this.f22997e -= i;
        C9784u c9784u = null;
        C9784u c9784u2 = null;
        while (true) {
            InterfaceC9802v1 peek = this.f22995c.peek();
            int mo13566h = peek.mo13566h();
            if (mo13566h > i) {
                interfaceC9802v1 = peek.mo13570M(i);
                i2 = 0;
            } else {
                if (this.f22998f) {
                    poll = peek.mo13570M(mo13566h);
                    m13981m();
                } else {
                    poll = this.f22995c.poll();
                }
                InterfaceC9802v1 interfaceC9802v12 = poll;
                i2 = i - mo13566h;
                interfaceC9802v1 = interfaceC9802v12;
            }
            if (c9784u == null) {
                c9784u = interfaceC9802v1;
            } else {
                if (c9784u2 == null) {
                    c9784u2 = new C9784u(i2 != 0 ? Math.min(this.f22995c.size() + 2, 16) : 2);
                    c9784u2.m13982g(c9784u);
                    c9784u = c9784u2;
                }
                c9784u2.m13982g(interfaceC9802v1);
            }
            if (i2 <= 0) {
                return c9784u;
            }
            i = i2;
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: N0 */
    public void mo13569N0(OutputStream outputStream, int i) throws IOException {
        m13984J(f22990A, i, outputStream, 0);
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: Y0 */
    public void mo13568Y0(ByteBuffer byteBuffer) {
        m13983O(f22994z, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // io.grpc.p384h1.AbstractC9564c, io.grpc.p384h1.InterfaceC9802v1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f22995c.isEmpty()) {
            this.f22995c.remove().close();
        }
        if (this.f22996d != null) {
            while (!this.f22996d.isEmpty()) {
                this.f22996d.remove().close();
            }
        }
    }

    /* renamed from: g */
    public void m13982g(InterfaceC9802v1 interfaceC9802v1) {
        boolean z = this.f22998f && this.f22995c.isEmpty();
        m13985I(interfaceC9802v1);
        if (z) {
            this.f22995c.peek().mo13940v0();
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: h */
    public int mo13566h() {
        return this.f22997e;
    }

    @Override // io.grpc.p384h1.AbstractC9564c, io.grpc.p384h1.InterfaceC9802v1
    public boolean markSupported() {
        for (InterfaceC9802v1 interfaceC9802v1 : this.f22995c) {
            if (!interfaceC9802v1.markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: n0 */
    public void mo13565n0(byte[] bArr, int i, int i2) {
        m13983O(f22993y, i2, bArr, i);
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    public int readUnsignedByte() {
        return m13983O(f22991w, 1, null, 0);
    }

    @Override // io.grpc.p384h1.AbstractC9564c, io.grpc.p384h1.InterfaceC9802v1
    public void reset() {
        if (this.f22998f) {
            InterfaceC9802v1 peek = this.f22995c.peek();
            if (peek != null) {
                int mo13566h = peek.mo13566h();
                peek.reset();
                this.f22997e += peek.mo13566h() - mo13566h;
            }
            while (true) {
                InterfaceC9802v1 pollLast = this.f22996d.pollLast();
                if (pollLast == null) {
                    return;
                }
                pollLast.reset();
                this.f22995c.addFirst(pollLast);
                this.f22997e += pollLast.mo13566h();
            }
        } else {
            throw new InvalidMarkException();
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9802v1
    public void skipBytes(int i) {
        m13983O(f22992x, i, null, 0);
    }

    @Override // io.grpc.p384h1.AbstractC9564c, io.grpc.p384h1.InterfaceC9802v1
    /* renamed from: v0 */
    public void mo13940v0() {
        if (this.f22996d == null) {
            this.f22996d = new ArrayDeque(Math.min(this.f22995c.size(), 16));
        }
        while (!this.f22996d.isEmpty()) {
            this.f22996d.remove().close();
        }
        this.f22998f = true;
        InterfaceC9802v1 peek = this.f22995c.peek();
        if (peek != null) {
            peek.mo13940v0();
        }
    }

    public C9784u() {
        this.f22995c = new ArrayDeque();
    }
}
