package io.grpc.p385i1;

import com.google.common.base.C5051n;
import io.grpc.p385i1.C9928i;
import io.grpc.p385i1.p386r.p387j.C9966d;
import io.grpc.p385i1.p386r.p387j.C9978i;
import io.grpc.p385i1.p386r.p387j.EnumC9962a;
import io.grpc.p385i1.p386r.p387j.InterfaceC9965c;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p576m.C14342c;
import p576m.C14347f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExceptionHandlingFrameWriter.java */
/* renamed from: io.grpc.i1.b */
/* loaded from: classes2.dex */
public final class C9904b implements InterfaceC9965c {

    /* renamed from: f */
    private static final Logger f23258f = Logger.getLogger(C9920h.class.getName());

    /* renamed from: c */
    private final InterfaceC9905a f23259c;

    /* renamed from: d */
    private final InterfaceC9965c f23260d;

    /* renamed from: e */
    private final C9928i f23261e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionHandlingFrameWriter.java */
    /* renamed from: io.grpc.i1.b$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC9905a {
        /* renamed from: a */
        void mo13639a(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9904b(InterfaceC9905a interfaceC9905a, InterfaceC9965c interfaceC9965c) {
        this(interfaceC9905a, interfaceC9965c, new C9928i(Level.FINE, C9920h.class));
    }

    /* renamed from: c */
    static Level m13731c(Throwable th) {
        if (th.getClass().equals(IOException.class)) {
            return Level.FINE;
        }
        return Level.INFO;
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
    /* renamed from: E */
    public void mo13405E(int i, EnumC9962a enumC9962a) {
        this.f23261e.m13586h(C9928i.EnumC9929a.OUTBOUND, i, enumC9962a);
        try {
            this.f23260d.mo13405E(i, enumC9962a);
        } catch (IOException e) {
            this.f23259c.mo13639a(e);
        }
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
    /* renamed from: W */
    public void mo13403W(boolean z, int i, C14342c c14342c, int i2) {
        C9928i c9928i = this.f23261e;
        C9928i.EnumC9929a enumC9929a = C9928i.EnumC9929a.OUTBOUND;
        c14342c.mo1992d();
        c9928i.m13592b(enumC9929a, i, c14342c, i2, z);
        try {
            this.f23260d.mo13403W(z, i, c14342c, i2);
        } catch (IOException e) {
            this.f23259c.mo13639a(e);
        }
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
    /* renamed from: W0 */
    public void mo13402W0(boolean z, boolean z2, int i, int i2, List<C9966d> list) {
        try {
            this.f23260d.mo13402W0(z, z2, i, i2, list);
        } catch (IOException e) {
            this.f23259c.mo13639a(e);
        }
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
    /* renamed from: a1 */
    public void mo13401a1(int i, EnumC9962a enumC9962a, byte[] bArr) {
        this.f23261e.m13591c(C9928i.EnumC9929a.OUTBOUND, i, enumC9962a, C14347f.m2034r(bArr));
        try {
            this.f23260d.mo13401a1(i, enumC9962a, bArr);
            this.f23260d.flush();
        } catch (IOException e) {
            this.f23259c.mo13639a(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f23260d.close();
        } catch (IOException e) {
            f23258f.log(m13731c(e), "Failed closing connection", (Throwable) e);
        }
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
    public void connectionPreface() {
        try {
            this.f23260d.connectionPreface();
        } catch (IOException e) {
            this.f23259c.mo13639a(e);
        }
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
    public void flush() {
        try {
            this.f23260d.flush();
        } catch (IOException e) {
            this.f23259c.mo13639a(e);
        }
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
    public int maxDataLength() {
        return this.f23260d.maxDataLength();
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
    /* renamed from: p0 */
    public void mo13397p0(C9978i c9978i) {
        this.f23261e.m13584j(C9928i.EnumC9929a.OUTBOUND);
        try {
            this.f23260d.mo13397p0(c9978i);
        } catch (IOException e) {
            this.f23259c.mo13639a(e);
        }
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
    public void ping(boolean z, int i, int i2) {
        if (z) {
            this.f23261e.m13588f(C9928i.EnumC9929a.OUTBOUND, (4294967295L & i2) | (i << 32));
        } else {
            this.f23261e.m13589e(C9928i.EnumC9929a.OUTBOUND, (4294967295L & i2) | (i << 32));
        }
        try {
            this.f23260d.ping(z, i, i2);
        } catch (IOException e) {
            this.f23259c.mo13639a(e);
        }
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
    /* renamed from: t0 */
    public void mo13396t0(C9978i c9978i) {
        this.f23261e.m13585i(C9928i.EnumC9929a.OUTBOUND, c9978i);
        try {
            this.f23260d.mo13396t0(c9978i);
        } catch (IOException e) {
            this.f23259c.mo13639a(e);
        }
    }

    @Override // io.grpc.p385i1.p386r.p387j.InterfaceC9965c
    public void windowUpdate(int i, long j) {
        this.f23261e.m13583k(C9928i.EnumC9929a.OUTBOUND, i, j);
        try {
            this.f23260d.windowUpdate(i, j);
        } catch (IOException e) {
            this.f23259c.mo13639a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9904b(InterfaceC9905a interfaceC9905a, InterfaceC9965c interfaceC9965c, C9928i c9928i) {
        C5051n.m25779o(interfaceC9905a, "transportExceptionHandler");
        this.f23259c = interfaceC9905a;
        C5051n.m25779o(interfaceC9965c, "frameWriter");
        this.f23260d = interfaceC9965c;
        C5051n.m25779o(c9928i, "frameLogger");
        this.f23261e = c9928i;
    }
}
