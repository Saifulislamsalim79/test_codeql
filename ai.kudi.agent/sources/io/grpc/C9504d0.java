package io.grpc;

import com.google.common.base.C5042j;
import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
/* compiled from: InternalChannelz.java */
/* renamed from: io.grpc.d0 */
/* loaded from: classes2.dex */
public final class C9504d0 {

    /* renamed from: a */
    public final String f22236a;

    /* renamed from: b */
    public final EnumC9506b f22237b;

    /* renamed from: c */
    public final long f22238c;

    /* renamed from: d */
    public final InterfaceC10006l0 f22239d;

    /* renamed from: e */
    public final InterfaceC10006l0 f22240e;

    /* compiled from: InternalChannelz.java */
    /* renamed from: io.grpc.d0$a */
    /* loaded from: classes2.dex */
    public static final class C9505a {

        /* renamed from: a */
        private String f22241a;

        /* renamed from: b */
        private EnumC9506b f22242b;

        /* renamed from: c */
        private Long f22243c;

        /* renamed from: d */
        private InterfaceC10006l0 f22244d;

        /* renamed from: e */
        private InterfaceC10006l0 f22245e;

        /* renamed from: a */
        public C9504d0 m14545a() {
            C5051n.m25779o(this.f22241a, "description");
            C5051n.m25779o(this.f22242b, "severity");
            C5051n.m25779o(this.f22243c, "timestampNanos");
            C5051n.m25773u(this.f22244d == null || this.f22245e == null, "at least one of channelRef and subchannelRef must be null");
            return new C9504d0(this.f22241a, this.f22242b, this.f22243c.longValue(), this.f22244d, this.f22245e);
        }

        /* renamed from: b */
        public C9505a m14544b(String str) {
            this.f22241a = str;
            return this;
        }

        /* renamed from: c */
        public C9505a m14543c(EnumC9506b enumC9506b) {
            this.f22242b = enumC9506b;
            return this;
        }

        /* renamed from: d */
        public C9505a m14542d(InterfaceC10006l0 interfaceC10006l0) {
            this.f22245e = interfaceC10006l0;
            return this;
        }

        /* renamed from: e */
        public C9505a m14541e(long j) {
            this.f22243c = Long.valueOf(j);
            return this;
        }
    }

    /* compiled from: InternalChannelz.java */
    /* renamed from: io.grpc.d0$b */
    /* loaded from: classes2.dex */
    public enum EnumC9506b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9504d0) {
            C9504d0 c9504d0 = (C9504d0) obj;
            return C5046k.m25800a(this.f22236a, c9504d0.f22236a) && C5046k.m25800a(this.f22237b, c9504d0.f22237b) && this.f22238c == c9504d0.f22238c && C5046k.m25800a(this.f22239d, c9504d0.f22239d) && C5046k.m25800a(this.f22240e, c9504d0.f22240e);
        }
        return false;
    }

    public int hashCode() {
        return C5046k.m25799b(this.f22236a, this.f22237b, Long.valueOf(this.f22238c), this.f22239d, this.f22240e);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("description", this.f22236a);
        m25812c.m25808d("severity", this.f22237b);
        m25812c.m25809c("timestampNanos", this.f22238c);
        m25812c.m25808d("channelRef", this.f22239d);
        m25812c.m25808d("subchannelRef", this.f22240e);
        return m25812c.toString();
    }

    private C9504d0(String str, EnumC9506b enumC9506b, long j, InterfaceC10006l0 interfaceC10006l0, InterfaceC10006l0 interfaceC10006l02) {
        this.f22236a = str;
        C5051n.m25779o(enumC9506b, "severity");
        this.f22237b = enumC9506b;
        this.f22238c = j;
        this.f22239d = interfaceC10006l0;
        this.f22240e = interfaceC10006l02;
    }
}
