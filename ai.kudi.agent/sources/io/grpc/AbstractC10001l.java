package io.grpc;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
/* compiled from: ClientStreamTracer.java */
/* renamed from: io.grpc.l */
/* loaded from: classes2.dex */
public abstract class AbstractC10001l extends AbstractC9507d1 {

    /* compiled from: ClientStreamTracer.java */
    /* renamed from: io.grpc.l$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10002a {
        /* renamed from: a */
        public AbstractC10001l mo13332a(C10004c c10004c, C10049s0 c10049s0) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* compiled from: ClientStreamTracer.java */
    /* renamed from: io.grpc.l$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10003b extends AbstractC10002a {
    }

    /* compiled from: ClientStreamTracer.java */
    /* renamed from: io.grpc.l$c */
    /* loaded from: classes2.dex */
    public static final class C10004c {

        /* renamed from: a */
        private final C9477a f23718a;

        /* renamed from: b */
        private final C9502d f23719b;

        /* renamed from: c */
        private final int f23720c;

        /* renamed from: d */
        private final boolean f23721d;

        /* compiled from: ClientStreamTracer.java */
        /* renamed from: io.grpc.l$c$a */
        /* loaded from: classes2.dex */
        public static final class C10005a {

            /* renamed from: a */
            private C9477a f23722a = C9477a.f22159b;

            /* renamed from: b */
            private C9502d f23723b = C9502d.f22223k;

            /* renamed from: c */
            private int f23724c;

            /* renamed from: d */
            private boolean f23725d;

            C10005a() {
            }

            /* renamed from: a */
            public C10004c m13329a() {
                return new C10004c(this.f23722a, this.f23723b, this.f23724c, this.f23725d);
            }

            /* renamed from: b */
            public C10005a m13328b(C9502d c9502d) {
                C5051n.m25779o(c9502d, "callOptions cannot be null");
                this.f23723b = c9502d;
                return this;
            }

            /* renamed from: c */
            public C10005a m13327c(boolean z) {
                this.f23725d = z;
                return this;
            }

            /* renamed from: d */
            public C10005a m13326d(int i) {
                this.f23724c = i;
                return this;
            }

            @Deprecated
            /* renamed from: e */
            public C10005a m13325e(C9477a c9477a) {
                C5051n.m25779o(c9477a, "transportAttrs cannot be null");
                this.f23722a = c9477a;
                return this;
            }
        }

        C10004c(C9477a c9477a, C9502d c9502d, int i, boolean z) {
            C5051n.m25779o(c9477a, "transportAttrs");
            this.f23718a = c9477a;
            C5051n.m25779o(c9502d, "callOptions");
            this.f23719b = c9502d;
            this.f23720c = i;
            this.f23721d = z;
        }

        /* renamed from: a */
        public static C10005a m13331a() {
            return new C10005a();
        }

        /* renamed from: b */
        public C10005a m13330b() {
            C10005a c10005a = new C10005a();
            c10005a.m13328b(this.f23719b);
            c10005a.m13325e(this.f23718a);
            c10005a.m13326d(this.f23720c);
            c10005a.m13327c(this.f23721d);
            return c10005a;
        }

        public String toString() {
            C5042j.C5044b m25812c = C5042j.m25812c(this);
            m25812c.m25808d("transportAttrs", this.f23718a);
            m25812c.m25808d("callOptions", this.f23719b);
            m25812c.m25810b("previousAttempts", this.f23720c);
            m25812c.m25807e("isTransparentRetry", this.f23721d);
            return m25812c.toString();
        }
    }

    /* renamed from: j */
    public void mo13336j() {
    }

    /* renamed from: k */
    public void mo13335k(C10049s0 c10049s0) {
    }

    /* renamed from: l */
    public void mo13334l() {
    }

    /* renamed from: m */
    public void mo13333m(C9477a c9477a, C10049s0 c10049s0) {
    }
}
