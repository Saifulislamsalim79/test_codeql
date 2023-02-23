package io.grpc.p385i1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.common.base.C5051n;
import io.grpc.p385i1.p386r.p387j.InterfaceC9965c;
import java.io.IOException;
import p576m.C14342c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OutboundFlowController.java */
/* renamed from: io.grpc.i1.p */
/* loaded from: classes2.dex */
public class C9938p {

    /* renamed from: a */
    private final C9920h f23439a;

    /* renamed from: b */
    private final InterfaceC9965c f23440b;

    /* renamed from: c */
    private int f23441c;

    /* renamed from: d */
    private final C9940b f23442d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OutboundFlowController.java */
    /* renamed from: io.grpc.i1.p$c */
    /* loaded from: classes2.dex */
    public static final class C9941c {

        /* renamed from: a */
        int f23450a;

        private C9941c() {
        }

        /* renamed from: a */
        boolean m13533a() {
            return this.f23450a > 0;
        }

        /* renamed from: b */
        void m13532b() {
            this.f23450a++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9938p(C9920h c9920h, InterfaceC9965c interfaceC9965c) {
        C5051n.m25779o(c9920h, "transport");
        this.f23439a = c9920h;
        C5051n.m25779o(interfaceC9965c, "frameWriter");
        this.f23440b = interfaceC9965c;
        this.f23441c = 65535;
        this.f23442d = new C9940b(0, 65535);
    }

    /* renamed from: f */
    private C9940b m13548f(C9917g c9917g) {
        C9940b c9940b = (C9940b) c9917g.m13697O();
        if (c9940b == null) {
            C9940b c9940b2 = new C9940b(this, c9917g, this.f23441c);
            c9917g.m13694R(c9940b2);
            return c9940b2;
        }
        return c9940b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m13551c(boolean z, int i, C14342c c14342c, boolean z2) {
        C5051n.m25779o(c14342c, TransactionField.TRANSACTION_CHANNEL);
        C9917g m13638a0 = this.f23439a.m13638a0(i);
        if (m13638a0 == null) {
            return;
        }
        C9940b m13548f = m13548f(m13638a0);
        int m13536j = m13548f.m13536j();
        boolean m13541e = m13548f.m13541e();
        int m2072F0 = (int) c14342c.m2072F0();
        if (!m13541e && m13536j >= m2072F0) {
            m13548f.m13535k(c14342c, m2072F0, z);
        } else {
            if (!m13541e && m13536j > 0) {
                m13548f.m13535k(c14342c, m13536j, false);
            }
            m13548f.m13542d(c14342c, (int) c14342c.m2072F0(), z);
        }
        if (z2) {
            m13550d();
        }
    }

    /* renamed from: d */
    void m13550d() {
        try {
            this.f23440b.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m13549e(int i) {
        C9917g[] m13644V;
        if (i >= 0) {
            int i2 = i - this.f23441c;
            this.f23441c = i;
            for (C9917g c9917g : this.f23439a.m13644V()) {
                C9940b c9940b = (C9940b) c9917g.m13697O();
                if (c9940b == null) {
                    c9917g.m13694R(new C9940b(this, c9917g, this.f23441c));
                } else {
                    c9940b.m13540f(i2);
                }
            }
            return i2 > 0;
        }
        throw new IllegalArgumentException("Invalid initial window size: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m13547g(C9917g c9917g, int i) {
        if (c9917g == null) {
            int m13540f = this.f23442d.m13540f(i);
            m13546h();
            return m13540f;
        }
        C9940b m13548f = m13548f(c9917g);
        int m13540f2 = m13548f.m13540f(i);
        C9941c c9941c = new C9941c();
        m13548f.m13534l(m13548f.m13536j(), c9941c);
        if (c9941c.m13533a()) {
            m13550d();
        }
        return m13540f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m13546h() {
        int i;
        C9917g[] m13644V = this.f23439a.m13644V();
        int m13537i = this.f23442d.m13537i();
        int length = m13644V.length;
        while (true) {
            i = 0;
            if (length <= 0 || m13537i <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(m13537i / length);
            for (int i2 = 0; i2 < length && m13537i > 0; i2++) {
                C9917g c9917g = m13644V[i2];
                C9940b m13548f = m13548f(c9917g);
                int min = Math.min(m13537i, Math.min(m13548f.m13538h(), ceil));
                if (min > 0) {
                    m13548f.m13545a(min);
                    m13537i -= min;
                }
                if (m13548f.m13538h() > 0) {
                    m13644V[i] = c9917g;
                    i++;
                }
            }
            length = i;
        }
        C9941c c9941c = new C9941c();
        C9917g[] m13644V2 = this.f23439a.m13644V();
        int length2 = m13644V2.length;
        while (i < length2) {
            C9940b m13548f2 = m13548f(m13644V2[i]);
            m13548f2.m13534l(m13548f2.m13544b(), c9941c);
            m13548f2.m13543c();
            i++;
        }
        if (c9941c.m13533a()) {
            m13550d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OutboundFlowController.java */
    /* renamed from: io.grpc.i1.p$b */
    /* loaded from: classes2.dex */
    public final class C9940b {

        /* renamed from: a */
        final C14342c f23443a;

        /* renamed from: b */
        final int f23444b;

        /* renamed from: c */
        int f23445c;

        /* renamed from: d */
        int f23446d;

        /* renamed from: e */
        C9917g f23447e;

        /* renamed from: f */
        boolean f23448f;

        C9940b(int i, int i2) {
            this.f23448f = false;
            this.f23444b = i;
            this.f23445c = i2;
            this.f23443a = new C14342c();
        }

        /* renamed from: a */
        void m13545a(int i) {
            this.f23446d += i;
        }

        /* renamed from: b */
        int m13544b() {
            return this.f23446d;
        }

        /* renamed from: c */
        void m13543c() {
            this.f23446d = 0;
        }

        /* renamed from: d */
        void m13542d(C14342c c14342c, int i, boolean z) {
            this.f23443a.mo1444r0(c14342c, i);
            this.f23448f |= z;
        }

        /* renamed from: e */
        boolean m13541e() {
            return this.f23443a.m2072F0() > 0;
        }

        /* renamed from: f */
        int m13540f(int i) {
            if (i > 0 && Integer.MAX_VALUE - i < this.f23445c) {
                throw new IllegalArgumentException("Window size overflow for stream: " + this.f23444b);
            }
            int i2 = this.f23445c + i;
            this.f23445c = i2;
            return i2;
        }

        /* renamed from: g */
        int m13539g() {
            return Math.max(0, Math.min(this.f23445c, (int) this.f23443a.m2072F0()));
        }

        /* renamed from: h */
        int m13538h() {
            return m13539g() - this.f23446d;
        }

        /* renamed from: i */
        int m13537i() {
            return this.f23445c;
        }

        /* renamed from: j */
        int m13536j() {
            return Math.min(this.f23445c, C9938p.this.f23442d.m13537i());
        }

        /* renamed from: k */
        void m13535k(C14342c c14342c, int i, boolean z) {
            do {
                int min = Math.min(i, C9938p.this.f23440b.maxDataLength());
                int i2 = -min;
                C9938p.this.f23442d.m13540f(i2);
                m13540f(i2);
                try {
                    C9938p.this.f23440b.mo13403W(c14342c.m2072F0() == ((long) min) && z, this.f23444b, c14342c, min);
                    this.f23447e.mo13687z().m14387q(min);
                    i -= min;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } while (i > 0);
        }

        /* renamed from: l */
        int m13534l(int i, C9941c c9941c) {
            int min = Math.min(i, m13536j());
            int i2 = 0;
            while (m13541e() && min > 0) {
                if (min >= this.f23443a.m2072F0()) {
                    i2 += (int) this.f23443a.m2072F0();
                    C14342c c14342c = this.f23443a;
                    m13535k(c14342c, (int) c14342c.m2072F0(), this.f23448f);
                } else {
                    i2 += min;
                    m13535k(this.f23443a, min, false);
                }
                c9941c.m13532b();
                min = Math.min(i - i2, m13536j());
            }
            return i2;
        }

        C9940b(C9938p c9938p, C9917g c9917g, int i) {
            this(c9917g.m13695Q(), i);
            this.f23447e = c9917g;
        }
    }
}
