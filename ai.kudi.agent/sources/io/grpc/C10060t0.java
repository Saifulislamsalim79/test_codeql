package io.grpc;

import com.google.common.base.C5042j;
import com.google.common.base.C5051n;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: MethodDescriptor.java */
/* renamed from: io.grpc.t0 */
/* loaded from: classes2.dex */
public final class C10060t0<ReqT, RespT> {

    /* renamed from: a */
    private final EnumC10064d f23800a;

    /* renamed from: b */
    private final String f23801b;

    /* renamed from: c */
    private final String f23802c;

    /* renamed from: d */
    private final InterfaceC10063c<ReqT> f23803d;

    /* renamed from: e */
    private final InterfaceC10063c<RespT> f23804e;

    /* renamed from: f */
    private final Object f23805f;

    /* renamed from: g */
    private final boolean f23806g;

    /* renamed from: h */
    private final boolean f23807h;

    /* renamed from: i */
    private final boolean f23808i;

    /* compiled from: MethodDescriptor.java */
    /* renamed from: io.grpc.t0$b */
    /* loaded from: classes2.dex */
    public static final class C10062b<ReqT, RespT> {

        /* renamed from: a */
        private InterfaceC10063c<ReqT> f23809a;

        /* renamed from: b */
        private InterfaceC10063c<RespT> f23810b;

        /* renamed from: c */
        private EnumC10064d f23811c;

        /* renamed from: d */
        private String f23812d;

        /* renamed from: e */
        private boolean f23813e;

        /* renamed from: f */
        private boolean f23814f;

        /* renamed from: g */
        private Object f23815g;

        /* renamed from: h */
        private boolean f23816h;

        /* renamed from: a */
        public C10060t0<ReqT, RespT> m13160a() {
            return new C10060t0<>(this.f23811c, this.f23812d, this.f23809a, this.f23810b, this.f23815g, this.f23813e, this.f23814f, this.f23816h);
        }

        /* renamed from: b */
        public C10062b<ReqT, RespT> m13159b(String str) {
            this.f23812d = str;
            return this;
        }

        /* renamed from: c */
        public C10062b<ReqT, RespT> m13158c(InterfaceC10063c<ReqT> interfaceC10063c) {
            this.f23809a = interfaceC10063c;
            return this;
        }

        /* renamed from: d */
        public C10062b<ReqT, RespT> m13157d(InterfaceC10063c<RespT> interfaceC10063c) {
            this.f23810b = interfaceC10063c;
            return this;
        }

        /* renamed from: e */
        public C10062b<ReqT, RespT> m13156e(boolean z) {
            this.f23816h = z;
            return this;
        }

        /* renamed from: f */
        public C10062b<ReqT, RespT> m13155f(EnumC10064d enumC10064d) {
            this.f23811c = enumC10064d;
            return this;
        }

        private C10062b() {
        }
    }

    /* compiled from: MethodDescriptor.java */
    /* renamed from: io.grpc.t0$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC10063c<T> {
        /* renamed from: a */
        T m13154a(InputStream inputStream);

        /* renamed from: b */
        InputStream m13153b(T t);
    }

    /* compiled from: MethodDescriptor.java */
    /* renamed from: io.grpc.t0$d */
    /* loaded from: classes2.dex */
    public enum EnumC10064d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        /* renamed from: a */
        public final boolean m13152a() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    /* renamed from: a */
    public static String m13170a(String str) {
        C5051n.m25779o(str, "fullMethodName");
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: b */
    public static String m13169b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        C5051n.m25779o(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        C5051n.m25779o(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: g */
    public static <ReqT, RespT> C10062b<ReqT, RespT> m13164g() {
        return m13163h(null, null);
    }

    /* renamed from: h */
    public static <ReqT, RespT> C10062b<ReqT, RespT> m13163h(InterfaceC10063c<ReqT> interfaceC10063c, InterfaceC10063c<RespT> interfaceC10063c2) {
        C10062b<ReqT, RespT> c10062b = new C10062b<>();
        c10062b.m13158c(interfaceC10063c);
        c10062b.m13157d(interfaceC10063c2);
        return c10062b;
    }

    /* renamed from: c */
    public String m13168c() {
        return this.f23801b;
    }

    /* renamed from: d */
    public String m13167d() {
        return this.f23802c;
    }

    /* renamed from: e */
    public EnumC10064d m13166e() {
        return this.f23800a;
    }

    /* renamed from: f */
    public boolean m13165f() {
        return this.f23807h;
    }

    /* renamed from: i */
    public RespT m13162i(InputStream inputStream) {
        return this.f23804e.m13154a(inputStream);
    }

    /* renamed from: j */
    public InputStream m13161j(ReqT reqt) {
        return this.f23803d.m13153b(reqt);
    }

    public String toString() {
        C5042j.C5044b m25812c = C5042j.m25812c(this);
        m25812c.m25808d("fullMethodName", this.f23801b);
        m25812c.m25808d("type", this.f23800a);
        m25812c.m25807e("idempotent", this.f23806g);
        m25812c.m25807e("safe", this.f23807h);
        m25812c.m25807e("sampledToLocalTracing", this.f23808i);
        m25812c.m25808d("requestMarshaller", this.f23803d);
        m25812c.m25808d("responseMarshaller", this.f23804e);
        m25812c.m25808d("schemaDescriptor", this.f23805f);
        m25812c.m25801k();
        return m25812c.toString();
    }

    private C10060t0(EnumC10064d enumC10064d, String str, InterfaceC10063c<ReqT> interfaceC10063c, InterfaceC10063c<RespT> interfaceC10063c2, Object obj, boolean z, boolean z2, boolean z3) {
        new AtomicReferenceArray(2);
        C5051n.m25779o(enumC10064d, "type");
        this.f23800a = enumC10064d;
        C5051n.m25779o(str, "fullMethodName");
        this.f23801b = str;
        this.f23802c = m13170a(str);
        C5051n.m25779o(interfaceC10063c, "requestMarshaller");
        this.f23803d = interfaceC10063c;
        C5051n.m25779o(interfaceC10063c2, "responseMarshaller");
        this.f23804e = interfaceC10063c2;
        this.f23805f = obj;
        this.f23806g = z;
        this.f23807h = z2;
        this.f23808i = z3;
    }
}
