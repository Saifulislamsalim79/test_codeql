package io.grpc.p384h1;

import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
import io.grpc.AbstractC9520g;
import io.grpc.C9477a;
import io.grpc.C9484b0;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ClientTransportFactory.java */
/* renamed from: io.grpc.h1.t */
/* loaded from: classes2.dex */
public interface InterfaceC9780t extends Closeable {

    /* compiled from: ClientTransportFactory.java */
    /* renamed from: io.grpc.h1.t$a */
    /* loaded from: classes2.dex */
    public static final class C9781a {

        /* renamed from: a */
        private String f22980a = "unknown-authority";

        /* renamed from: b */
        private C9477a f22981b = C9477a.f22159b;

        /* renamed from: c */
        private String f22982c;

        /* renamed from: d */
        private C9484b0 f22983d;

        /* renamed from: a */
        public String m13994a() {
            return this.f22980a;
        }

        /* renamed from: b */
        public C9477a m13993b() {
            return this.f22981b;
        }

        /* renamed from: c */
        public C9484b0 m13992c() {
            return this.f22983d;
        }

        /* renamed from: d */
        public String m13991d() {
            return this.f22982c;
        }

        /* renamed from: e */
        public C9781a m13990e(String str) {
            C5051n.m25779o(str, "authority");
            this.f22980a = str;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C9781a) {
                C9781a c9781a = (C9781a) obj;
                return this.f22980a.equals(c9781a.f22980a) && this.f22981b.equals(c9781a.f22981b) && C5046k.m25800a(this.f22982c, c9781a.f22982c) && C5046k.m25800a(this.f22983d, c9781a.f22983d);
            }
            return false;
        }

        /* renamed from: f */
        public C9781a m13989f(C9477a c9477a) {
            C5051n.m25779o(c9477a, "eagAttributes");
            this.f22981b = c9477a;
            return this;
        }

        /* renamed from: g */
        public C9781a m13988g(C9484b0 c9484b0) {
            this.f22983d = c9484b0;
            return this;
        }

        /* renamed from: h */
        public C9781a m13987h(String str) {
            this.f22982c = str;
            return this;
        }

        public int hashCode() {
            return C5046k.m25799b(this.f22980a, this.f22981b, this.f22982c, this.f22983d);
        }
    }

    /* renamed from: S0 */
    ScheduledExecutorService mo13717S0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* renamed from: q0 */
    InterfaceC9798v mo13716q0(SocketAddress socketAddress, C9781a c9781a, AbstractC9520g abstractC9520g);
}
