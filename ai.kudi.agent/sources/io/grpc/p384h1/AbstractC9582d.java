package io.grpc.p384h1;

import com.google.common.base.C5051n;
import io.grpc.InterfaceC10014m;
import io.grpc.InterfaceC10033o;
import io.grpc.InterfaceC10080v;
import io.grpc.p384h1.C9599f;
import io.grpc.p384h1.C9702l1;
import io.grpc.p384h1.InterfaceC9695k2;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.InputStream;
import p425j.p443d.C11266b;
import p425j.p443d.C11267c;
/* compiled from: AbstractStream.java */
/* renamed from: io.grpc.h1.d */
/* loaded from: classes2.dex */
public abstract class AbstractC9582d implements InterfaceC9689j2 {

    /* compiled from: AbstractStream.java */
    /* renamed from: io.grpc.h1.d$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC9583a implements C9599f.InterfaceC9607h, C9702l1.InterfaceC9704b {

        /* renamed from: a */
        private InterfaceC9813y f22451a;

        /* renamed from: b */
        private final Object f22452b = new Object();

        /* renamed from: c */
        private final C9730o2 f22453c;

        /* renamed from: d */
        private final C9702l1 f22454d;

        /* renamed from: e */
        private int f22455e;

        /* renamed from: f */
        private boolean f22456f;

        /* renamed from: g */
        private boolean f22457g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AbstractStream.java */
        /* renamed from: io.grpc.h1.d$a$a */
        /* loaded from: classes2.dex */
        public class RunnableC9584a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C11266b f22458c;

            /* renamed from: d */
            final /* synthetic */ int f22459d;

            RunnableC9584a(C11266b c11266b, int i) {
                this.f22458c = c11266b;
                this.f22459d = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                C11267c.m11254f("AbstractStream.request");
                C11267c.m11256d(this.f22458c);
                try {
                    AbstractC9583a.this.f22451a.mo13933c(this.f22459d);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC9583a(int i, C9676i2 c9676i2, C9730o2 c9730o2) {
            C5051n.m25779o(c9676i2, "statsTraceCtx");
            C5051n.m25779o(c9730o2, "transportTracer");
            this.f22453c = c9730o2;
            C9702l1 c9702l1 = new C9702l1(this, InterfaceC10014m.C10016b.f23740a, i, c9676i2, c9730o2);
            this.f22454d = c9702l1;
            this.f22451a = c9702l1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public boolean m14391m() {
            boolean z;
            synchronized (this.f22452b) {
                z = this.f22456f && this.f22455e < 32768 && !this.f22457g;
            }
            return z;
        }

        /* renamed from: o */
        private void m14389o() {
            boolean m14391m;
            synchronized (this.f22452b) {
                m14391m = m14391m();
            }
            if (m14391m) {
                mo14390n().mo13767c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public void m14388p(int i) {
            synchronized (this.f22452b) {
                this.f22455e += i;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public void m14384u(int i) {
            mo13671e(new RunnableC9584a(C11267c.m11255e(), i));
        }

        @Override // io.grpc.p384h1.C9702l1.InterfaceC9704b
        /* renamed from: a */
        public void mo14161a(InterfaceC9695k2.InterfaceC9696a interfaceC9696a) {
            mo14390n().mo13769a(interfaceC9696a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: j */
        public final void m14394j(boolean z) {
            if (z) {
                this.f22451a.close();
            } else {
                this.f22451a.mo13931m();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: k */
        public final void m14393k(InterfaceC9802v1 interfaceC9802v1) {
            try {
                this.f22451a.mo13934I(interfaceC9802v1);
            } catch (Throwable th) {
                mo13673d(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: l */
        public C9730o2 m14392l() {
            return this.f22453c;
        }

        /* renamed from: n */
        protected abstract InterfaceC9695k2 mo14390n();

        /* renamed from: q */
        public final void m14387q(int i) {
            boolean z;
            synchronized (this.f22452b) {
                C5051n.m25773u(this.f22456f, "onStreamAllocated was not called, but it seems the stream is active");
                z = true;
                boolean z2 = this.f22455e < 32768;
                int i2 = this.f22455e - i;
                this.f22455e = i2;
                boolean z3 = i2 < 32768;
                if (z2 || !z3) {
                    z = false;
                }
            }
            if (z) {
                m14389o();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: r */
        public void mo13666r() {
            C5051n.m25774t(mo14390n() != null);
            synchronized (this.f22452b) {
                C5051n.m25773u(this.f22456f ? false : true, "Already allocated");
                this.f22456f = true;
            }
            m14389o();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: s */
        public final void m14386s() {
            synchronized (this.f22452b) {
                this.f22457g = true;
            }
        }

        /* renamed from: t */
        final void m14385t() {
            this.f22454d.m14163i0(this);
            this.f22451a = this.f22454d;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: v */
        public final void m14383v(InterfaceC10080v interfaceC10080v) {
            this.f22451a.mo13935F(interfaceC10080v);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: w */
        public void m14382w(C9775s0 c9775s0) {
            this.f22454d.m14164g0(c9775s0);
            this.f22451a = new C9599f(this, this, this.f22454d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x */
        public final void m14381x(int i) {
            this.f22451a.mo13932g(i);
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: b */
    public final void mo13802b(InterfaceC10033o interfaceC10033o) {
        InterfaceC9746p0 mo14400s = mo14400s();
        C5051n.m25779o(interfaceC10033o, "compressor");
        mo14400s.mo14073b(interfaceC10033o);
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: c */
    public final void mo13800c(int i) {
        mo13689u().m14384u(i);
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: d */
    public boolean mo13798d() {
        if (mo14400s().isClosed()) {
            return false;
        }
        return mo13689u().m14391m();
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: e */
    public final void mo13796e(InputStream inputStream) {
        C5051n.m25779o(inputStream, MetricTracker.Object.MESSAGE);
        try {
            if (!mo14400s().isClosed()) {
                mo14400s().mo14072c(inputStream);
            }
        } finally {
            C9755r0.m14063e(inputStream);
        }
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    /* renamed from: f */
    public void mo13794f() {
        mo13689u().m14385t();
    }

    @Override // io.grpc.p384h1.InterfaceC9689j2
    public final void flush() {
        if (mo14400s().isClosed()) {
            return;
        }
        mo14400s().flush();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m14401r() {
        mo14400s().close();
    }

    /* renamed from: s */
    protected abstract InterfaceC9746p0 mo14400s();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final void m14399t(int i) {
        mo13689u().m14388p(i);
    }

    /* renamed from: u */
    protected abstract AbstractC9583a mo13689u();
}
