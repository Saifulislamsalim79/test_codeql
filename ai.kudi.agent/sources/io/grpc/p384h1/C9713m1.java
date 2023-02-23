package io.grpc.p384h1;

import com.google.common.base.C5051n;
import com.google.common.p109io.C5141a;
import io.grpc.C9497c1;
import io.grpc.InterfaceC10014m;
import io.grpc.InterfaceC10017m0;
import io.grpc.InterfaceC10033o;
import io.grpc.InterfaceC10088x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MessageFramer.java */
/* renamed from: io.grpc.h1.m1 */
/* loaded from: classes2.dex */
public class C9713m1 implements InterfaceC9746p0 {

    /* renamed from: a */
    private final InterfaceC9717d f22796a;

    /* renamed from: c */
    private InterfaceC9748p2 f22798c;

    /* renamed from: h */
    private final InterfaceC9752q2 f22803h;

    /* renamed from: i */
    private final C9676i2 f22804i;

    /* renamed from: j */
    private boolean f22805j;

    /* renamed from: k */
    private int f22806k;

    /* renamed from: m */
    private long f22808m;

    /* renamed from: b */
    private int f22797b = -1;

    /* renamed from: d */
    private InterfaceC10033o f22799d = InterfaceC10014m.C10016b.f23740a;

    /* renamed from: e */
    private boolean f22800e = true;

    /* renamed from: f */
    private final C9716c f22801f = new C9716c();

    /* renamed from: g */
    private final ByteBuffer f22802g = ByteBuffer.allocate(5);

    /* renamed from: l */
    private int f22807l = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MessageFramer.java */
    /* renamed from: io.grpc.h1.m1$c */
    /* loaded from: classes2.dex */
    public class C9716c extends OutputStream {
        private C9716c() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            write(new byte[]{(byte) i}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C9713m1.this.m14145n(bArr, i, i2);
        }
    }

    /* compiled from: MessageFramer.java */
    /* renamed from: io.grpc.h1.m1$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC9717d {
        /* renamed from: p */
        void mo14139p(InterfaceC9748p2 interfaceC9748p2, boolean z, boolean z2, int i);
    }

    public C9713m1(InterfaceC9717d interfaceC9717d, InterfaceC9752q2 interfaceC9752q2, C9676i2 c9676i2) {
        C5051n.m25779o(interfaceC9717d, "sink");
        this.f22796a = interfaceC9717d;
        C5051n.m25779o(interfaceC9752q2, "bufferAllocator");
        this.f22803h = interfaceC9752q2;
        C5051n.m25779o(c9676i2, "statsTraceCtx");
        this.f22804i = c9676i2;
    }

    /* renamed from: e */
    private void m14153e(boolean z, boolean z2) {
        InterfaceC9748p2 interfaceC9748p2 = this.f22798c;
        this.f22798c = null;
        this.f22796a.mo14139p(interfaceC9748p2, z, z2, this.f22806k);
        this.f22806k = 0;
    }

    /* renamed from: f */
    private int m14152f(InputStream inputStream) throws IOException {
        if ((inputStream instanceof InterfaceC10017m0) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    /* renamed from: g */
    private void m14151g() {
        InterfaceC9748p2 interfaceC9748p2 = this.f22798c;
        if (interfaceC9748p2 != null) {
            interfaceC9748p2.release();
            this.f22798c = null;
        }
    }

    /* renamed from: j */
    private void m14149j() {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    /* renamed from: k */
    private void m14148k(C9715b c9715b, boolean z) {
        int m14140h = c9715b.m14140h();
        this.f22802g.clear();
        this.f22802g.put(z ? (byte) 1 : (byte) 0).putInt(m14140h);
        InterfaceC9748p2 mo13554a = this.f22803h.mo13554a(5);
        mo13554a.mo13558b(this.f22802g.array(), 0, this.f22802g.position());
        if (m14140h == 0) {
            this.f22798c = mo13554a;
            return;
        }
        this.f22796a.mo14139p(mo13554a, false, false, this.f22806k - 1);
        this.f22806k = 1;
        List list = c9715b.f22809c;
        for (int i = 0; i < list.size() - 1; i++) {
            this.f22796a.mo14139p((InterfaceC9748p2) list.get(i), false, false, 0);
        }
        this.f22798c = (InterfaceC9748p2) list.get(list.size() - 1);
        this.f22808m = m14140h;
    }

    /* renamed from: l */
    private int m14147l(InputStream inputStream, int i) throws IOException {
        C9715b c9715b = new C9715b();
        OutputStream mo13258c = this.f22799d.mo13258c(c9715b);
        try {
            int m14144o = m14144o(inputStream, mo13258c);
            mo13258c.close();
            int i2 = this.f22797b;
            if (i2 >= 0 && m14144o > i2) {
                throw C9497c1.f22193l.m14578r(String.format("message too large %d > %d", Integer.valueOf(m14144o), Integer.valueOf(this.f22797b))).m14592d();
            }
            m14148k(c9715b, true);
            return m14144o;
        } catch (Throwable th) {
            mo13258c.close();
            throw th;
        }
    }

    /* renamed from: m */
    private int m14146m(InputStream inputStream, int i) throws IOException {
        int i2 = this.f22797b;
        if (i2 >= 0 && i > i2) {
            throw C9497c1.f22193l.m14578r(String.format("message too large %d > %d", Integer.valueOf(i), Integer.valueOf(this.f22797b))).m14592d();
        }
        this.f22802g.clear();
        this.f22802g.put((byte) 0).putInt(i);
        if (this.f22798c == null) {
            this.f22798c = this.f22803h.mo13554a(this.f22802g.position() + i);
        }
        m14145n(this.f22802g.array(), 0, this.f22802g.position());
        return m14144o(inputStream, this.f22801f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m14145n(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            InterfaceC9748p2 interfaceC9748p2 = this.f22798c;
            if (interfaceC9748p2 != null && interfaceC9748p2.mo13557c() == 0) {
                m14153e(false, false);
            }
            if (this.f22798c == null) {
                this.f22798c = this.f22803h.mo13554a(i2);
            }
            int min = Math.min(i2, this.f22798c.mo13557c());
            this.f22798c.mo13558b(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    /* renamed from: o */
    private static int m14144o(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof InterfaceC10088x) {
            return ((InterfaceC10088x) inputStream).mo13082c(outputStream);
        }
        long m25527b = C5141a.m25527b(inputStream, outputStream);
        C5051n.m25785i(m25527b <= 2147483647L, "Message size overflow: %s", m25527b);
        return (int) m25527b;
    }

    /* renamed from: p */
    private int m14143p(InputStream inputStream, int i) throws IOException {
        if (i != -1) {
            this.f22808m = i;
            return m14146m(inputStream, i);
        }
        C9715b c9715b = new C9715b();
        int m14144o = m14144o(inputStream, c9715b);
        int i2 = this.f22797b;
        if (i2 >= 0 && m14144o > i2) {
            throw C9497c1.f22193l.m14578r(String.format("message too large %d > %d", Integer.valueOf(m14144o), Integer.valueOf(this.f22797b))).m14592d();
        }
        m14148k(c9715b, false);
        return m14144o;
    }

    @Override // io.grpc.p384h1.InterfaceC9746p0
    /* renamed from: b */
    public /* bridge */ /* synthetic */ InterfaceC9746p0 mo14073b(InterfaceC10033o interfaceC10033o) {
        m14150i(interfaceC10033o);
        return this;
    }

    @Override // io.grpc.p384h1.InterfaceC9746p0
    /* renamed from: c */
    public void mo14072c(InputStream inputStream) {
        int m14143p;
        m14149j();
        this.f22806k++;
        int i = this.f22807l + 1;
        this.f22807l = i;
        this.f22808m = 0L;
        this.f22804i.m14211i(i);
        boolean z = this.f22800e && this.f22799d != InterfaceC10014m.C10016b.f23740a;
        try {
            int m14152f = m14152f(inputStream);
            if (m14152f != 0 && z) {
                m14143p = m14147l(inputStream, m14152f);
            } else {
                m14143p = m14143p(inputStream, m14152f);
            }
            if (m14152f != -1 && m14143p != m14152f) {
                throw C9497c1.f22194m.m14578r(String.format("Message length inaccurate %s != %s", Integer.valueOf(m14143p), Integer.valueOf(m14152f))).m14592d();
            }
            long j = m14143p;
            this.f22804i.m14209k(j);
            this.f22804i.m14208l(this.f22808m);
            this.f22804i.m14210j(this.f22807l, this.f22808m, j);
        } catch (IOException e) {
            throw C9497c1.f22194m.m14578r("Failed to frame message").m14579q(e).m14592d();
        } catch (RuntimeException e2) {
            throw C9497c1.f22194m.m14578r("Failed to frame message").m14579q(e2).m14592d();
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9746p0
    public void close() {
        if (isClosed()) {
            return;
        }
        this.f22805j = true;
        InterfaceC9748p2 interfaceC9748p2 = this.f22798c;
        if (interfaceC9748p2 != null && interfaceC9748p2.mo13555h() == 0) {
            m14151g();
        }
        m14153e(true, true);
    }

    @Override // io.grpc.p384h1.InterfaceC9746p0
    public void flush() {
        InterfaceC9748p2 interfaceC9748p2 = this.f22798c;
        if (interfaceC9748p2 == null || interfaceC9748p2.mo13555h() <= 0) {
            return;
        }
        m14153e(false, true);
    }

    @Override // io.grpc.p384h1.InterfaceC9746p0
    /* renamed from: h */
    public void mo14071h(int i) {
        C5051n.m25773u(this.f22797b == -1, "max size already set");
        this.f22797b = i;
    }

    /* renamed from: i */
    public C9713m1 m14150i(InterfaceC10033o interfaceC10033o) {
        C5051n.m25779o(interfaceC10033o, "Can't pass an empty compressor");
        this.f22799d = interfaceC10033o;
        return this;
    }

    @Override // io.grpc.p384h1.InterfaceC9746p0
    public boolean isClosed() {
        return this.f22805j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MessageFramer.java */
    /* renamed from: io.grpc.h1.m1$b */
    /* loaded from: classes2.dex */
    public final class C9715b extends OutputStream {

        /* renamed from: c */
        private final List<InterfaceC9748p2> f22809c;

        /* renamed from: d */
        private InterfaceC9748p2 f22810d;

        private C9715b() {
            this.f22809c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public int m14140h() {
            int i = 0;
            for (InterfaceC9748p2 interfaceC9748p2 : this.f22809c) {
                i += interfaceC9748p2.mo13555h();
            }
            return i;
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            InterfaceC9748p2 interfaceC9748p2 = this.f22810d;
            if (interfaceC9748p2 != null && interfaceC9748p2.mo13557c() > 0) {
                this.f22810d.mo13556d((byte) i);
            } else {
                write(new byte[]{(byte) i}, 0, 1);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            if (this.f22810d == null) {
                InterfaceC9748p2 mo13554a = C9713m1.this.f22803h.mo13554a(i2);
                this.f22810d = mo13554a;
                this.f22809c.add(mo13554a);
            }
            while (i2 > 0) {
                int min = Math.min(i2, this.f22810d.mo13557c());
                if (min == 0) {
                    InterfaceC9748p2 mo13554a2 = C9713m1.this.f22803h.mo13554a(Math.max(i2, this.f22810d.mo13555h() * 2));
                    this.f22810d = mo13554a2;
                    this.f22809c.add(mo13554a2);
                } else {
                    this.f22810d.mo13558b(bArr, i, min);
                    i += min;
                    i2 -= min;
                }
            }
        }
    }
}
