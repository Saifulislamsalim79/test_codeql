package com.google.firebase.perf.p179k;

import com.google.protobuf.AbstractC6994a;
import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C6997a0;
import com.google.protobuf.C7064k0;
import com.google.protobuf.C7076l0;
import com.google.protobuf.C7118t1;
import com.google.protobuf.InterfaceC7007a1;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: NetworkRequestMetric.java */
/* renamed from: com.google.firebase.perf.k.h */
/* loaded from: classes2.dex */
public final class C6663h extends AbstractC7141y<C6663h, C6665b> implements Object {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final C6663h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile InterfaceC7007a1<C6663h> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private C7076l0<String, String> customAttributes_ = C7076l0.m19831e();
    private String url_ = "";
    private String responseContentType_ = "";
    private C6997a0.InterfaceC7006i<C6675k> perfSessions_ = AbstractC7141y.m19392D();

    /* compiled from: NetworkRequestMetric.java */
    /* renamed from: com.google.firebase.perf.k.h$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6664a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16032a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f16032a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16032a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16032a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16032a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16032a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16032a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16032a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* renamed from: com.google.firebase.perf.k.h$b */
    /* loaded from: classes2.dex */
    public static final class C6665b extends AbstractC7141y.AbstractC7142a<C6663h, C6665b> implements Object {
        /* synthetic */ C6665b(C6664a c6664a) {
            this();
        }

        /* renamed from: F */
        public C6665b m21241F(Iterable<? extends C6675k> iterable) {
            m19358z();
            ((C6663h) this.f17082d).m21261f0(iterable);
            return this;
        }

        /* renamed from: G */
        public C6665b m21240G() {
            m19358z();
            ((C6663h) this.f17082d).m21260g0();
            return this;
        }

        /* renamed from: H */
        public long m21239H() {
            return ((C6663h) this.f17082d).m21248s0();
        }

        /* renamed from: I */
        public boolean m21238I() {
            return ((C6663h) this.f17082d).m21246u0();
        }

        /* renamed from: K */
        public boolean m21237K() {
            return ((C6663h) this.f17082d).m21244x0();
        }

        /* renamed from: L */
        public boolean m21236L() {
            return ((C6663h) this.f17082d).m21289B0();
        }

        /* renamed from: M */
        public C6665b m21235M(long j) {
            m19358z();
            ((C6663h) this.f17082d).m21286F0(j);
            return this;
        }

        /* renamed from: N */
        public C6665b m21234N(EnumC6667d enumC6667d) {
            m19358z();
            ((C6663h) this.f17082d).m21285G0(enumC6667d);
            return this;
        }

        /* renamed from: O */
        public C6665b m21233O(int i) {
            m19358z();
            ((C6663h) this.f17082d).m21284H0(i);
            return this;
        }

        /* renamed from: P */
        public C6665b m21232P(EnumC6669e enumC6669e) {
            m19358z();
            ((C6663h) this.f17082d).m21283I0(enumC6669e);
            return this;
        }

        /* renamed from: Q */
        public C6665b m21231Q(long j) {
            m19358z();
            ((C6663h) this.f17082d).m21282J0(j);
            return this;
        }

        /* renamed from: R */
        public C6665b m21230R(String str) {
            m19358z();
            ((C6663h) this.f17082d).m21281K0(str);
            return this;
        }

        /* renamed from: S */
        public C6665b m21229S(long j) {
            m19358z();
            ((C6663h) this.f17082d).m21280L0(j);
            return this;
        }

        /* renamed from: T */
        public C6665b m21228T(long j) {
            m19358z();
            ((C6663h) this.f17082d).m21279M0(j);
            return this;
        }

        /* renamed from: U */
        public C6665b m21227U(long j) {
            m19358z();
            ((C6663h) this.f17082d).m21278N0(j);
            return this;
        }

        /* renamed from: W */
        public C6665b m21226W(long j) {
            m19358z();
            ((C6663h) this.f17082d).m21277O0(j);
            return this;
        }

        /* renamed from: X */
        public C6665b m21225X(String str) {
            m19358z();
            ((C6663h) this.f17082d).m21276P0(str);
            return this;
        }

        private C6665b() {
            super(C6663h.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* renamed from: com.google.firebase.perf.k.h$c */
    /* loaded from: classes2.dex */
    private static final class C6666c {

        /* renamed from: a */
        static final C7064k0<String, String> f16033a;

        static {
            C7118t1.EnumC7120b enumC7120b = C7118t1.EnumC7120b.f16951C;
            f16033a = C7064k0.m19868d(enumC7120b, "", enumC7120b, "");
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* renamed from: com.google.firebase.perf.k.h$d */
    /* loaded from: classes2.dex */
    public enum EnumC6667d implements C6997a0.InterfaceC7000c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        

        /* renamed from: c */
        private final int f16045c;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NetworkRequestMetric.java */
        /* renamed from: com.google.firebase.perf.k.h$d$a */
        /* loaded from: classes2.dex */
        public static final class C6668a implements C6997a0.InterfaceC7002e {

            /* renamed from: a */
            static final C6997a0.InterfaceC7002e f16046a = new C6668a();

            private C6668a() {
            }

            @Override // com.google.protobuf.C6997a0.InterfaceC7002e
            /* renamed from: a */
            public boolean mo20223a(int i) {
                return EnumC6667d.m21224a(i) != null;
            }
        }

        EnumC6667d(int i) {
            this.f16045c = i;
        }

        /* renamed from: a */
        public static EnumC6667d m21224a(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static C6997a0.InterfaceC7002e m21223b() {
            return C6668a.f16046a;
        }

        @Override // com.google.protobuf.C6997a0.InterfaceC7000c
        /* renamed from: d */
        public final int mo20225d() {
            return this.f16045c;
        }
    }

    /* compiled from: NetworkRequestMetric.java */
    /* renamed from: com.google.firebase.perf.k.h$e */
    /* loaded from: classes2.dex */
    public enum EnumC6669e implements C6997a0.InterfaceC7000c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        

        /* renamed from: c */
        private final int f16050c;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NetworkRequestMetric.java */
        /* renamed from: com.google.firebase.perf.k.h$e$a */
        /* loaded from: classes2.dex */
        public static final class C6670a implements C6997a0.InterfaceC7002e {

            /* renamed from: a */
            static final C6997a0.InterfaceC7002e f16051a = new C6670a();

            private C6670a() {
            }

            @Override // com.google.protobuf.C6997a0.InterfaceC7002e
            /* renamed from: a */
            public boolean mo20223a(int i) {
                return EnumC6669e.m21222a(i) != null;
            }
        }

        EnumC6669e(int i) {
            this.f16050c = i;
        }

        /* renamed from: a */
        public static EnumC6669e m21222a(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return GENERIC_CLIENT_ERROR;
            }
            return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }

        /* renamed from: b */
        public static C6997a0.InterfaceC7002e m21221b() {
            return C6670a.f16051a;
        }

        @Override // com.google.protobuf.C6997a0.InterfaceC7000c
        /* renamed from: d */
        public final int mo20225d() {
            return this.f16050c;
        }
    }

    static {
        C6663h c6663h = new C6663h();
        DEFAULT_INSTANCE = c6663h;
        AbstractC7141y.m19380P(C6663h.class, c6663h);
    }

    private C6663h() {
    }

    /* renamed from: E0 */
    public static C6665b m21287E0() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public void m21286F0(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G0 */
    public void m21285G0(EnumC6667d enumC6667d) {
        this.httpMethod_ = enumC6667d.mo20225d();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public void m21284H0(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public void m21283I0(EnumC6669e enumC6669e) {
        this.networkClientErrorReason_ = enumC6669e.mo20225d();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public void m21282J0(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public void m21281K0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public void m21280L0(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public void m21279M0(long j) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public void m21278N0(long j) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public void m21277O0(long j) {
        this.bitField0_ |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        this.timeToResponseInitiatedUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public void m21276P0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m21261f0(Iterable<? extends C6675k> iterable) {
        m21259h0();
        AbstractC6994a.m20243m(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m21260g0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = m21257j0().m21252o0();
    }

    /* renamed from: h0 */
    private void m21259h0() {
        C6997a0.InterfaceC7006i<C6675k> interfaceC7006i = this.perfSessions_;
        if (interfaceC7006i.mo20222c0()) {
            return;
        }
        this.perfSessions_ = AbstractC7141y.m19385K(interfaceC7006i);
    }

    /* renamed from: j0 */
    public static C6663h m21257j0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: A0 */
    public boolean m21290A0() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6664a.f16032a[enumC7147f.ordinal()]) {
            case 1:
                return new C6663h();
            case 2:
                return new C6665b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", EnumC6667d.m21223b(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", EnumC6669e.m21221b(), "customAttributes_", C6666c.f16033a, "perfSessions_", C6675k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6663h> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6663h.class) {
                        interfaceC7007a1 = PARSER;
                        if (interfaceC7007a1 == null) {
                            interfaceC7007a1 = new AbstractC7141y.C7143b<>(DEFAULT_INSTANCE);
                            PARSER = interfaceC7007a1;
                        }
                    }
                }
                return interfaceC7007a1;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: B0 */
    public boolean m21289B0() {
        return (this.bitField0_ & 1024) != 0;
    }

    /* renamed from: D0 */
    public boolean m21288D0() {
        return (this.bitField0_ & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0;
    }

    /* renamed from: i0 */
    public long m21258i0() {
        return this.clientStartTimeUs_;
    }

    /* renamed from: k0 */
    public EnumC6667d m21256k0() {
        EnumC6667d m21224a = EnumC6667d.m21224a(this.httpMethod_);
        return m21224a == null ? EnumC6667d.HTTP_METHOD_UNKNOWN : m21224a;
    }

    /* renamed from: l0 */
    public int m21255l0() {
        return this.httpResponseCode_;
    }

    /* renamed from: m0 */
    public List<C6675k> m21254m0() {
        return this.perfSessions_;
    }

    /* renamed from: n0 */
    public long m21253n0() {
        return this.requestPayloadBytes_;
    }

    /* renamed from: o0 */
    public String m21252o0() {
        return this.responseContentType_;
    }

    /* renamed from: p0 */
    public long m21251p0() {
        return this.responsePayloadBytes_;
    }

    /* renamed from: q0 */
    public long m21250q0() {
        return this.timeToRequestCompletedUs_;
    }

    /* renamed from: r0 */
    public long m21249r0() {
        return this.timeToResponseCompletedUs_;
    }

    /* renamed from: s0 */
    public long m21248s0() {
        return this.timeToResponseInitiatedUs_;
    }

    /* renamed from: t0 */
    public String m21247t0() {
        return this.url_;
    }

    /* renamed from: u0 */
    public boolean m21246u0() {
        return (this.bitField0_ & 128) != 0;
    }

    /* renamed from: v0 */
    public boolean m21245v0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: x0 */
    public boolean m21244x0() {
        return (this.bitField0_ & 32) != 0;
    }

    /* renamed from: y0 */
    public boolean m21243y0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: z0 */
    public boolean m21242z0() {
        return (this.bitField0_ & 8) != 0;
    }
}
