package com.google.firebase.inappmessaging;

import com.google.firebase.inappmessaging.C6125e;
import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: CampaignAnalytics.java */
/* renamed from: com.google.firebase.inappmessaging.d */
/* loaded from: classes2.dex */
public final class C6007d extends AbstractC7141y<C6007d, C6009b> implements Object {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int CLIENT_APP_FIELD_NUMBER = 3;
    public static final int CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    private static final C6007d DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 6;
    public static final int ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    public static final int FETCH_ERROR_REASON_FIELD_NUMBER = 8;
    public static final int FIAM_SDK_VERSION_FIELD_NUMBER = 9;
    private static volatile InterfaceC7007a1<C6007d> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int RENDER_ERROR_REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private C6125e clientApp_;
    private long clientTimestampMillis_;
    private int engagementMetricsDeliveryRetryCount_;
    private Object event_;
    private int eventCase_ = 0;
    private String projectNumber_ = "";
    private String campaignId_ = "";
    private String fiamSdkVersion_ = "";

    /* compiled from: CampaignAnalytics.java */
    /* renamed from: com.google.firebase.inappmessaging.d$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6008a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14682a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f14682a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14682a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14682a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14682a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14682a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14682a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14682a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: CampaignAnalytics.java */
    /* renamed from: com.google.firebase.inappmessaging.d$b */
    /* loaded from: classes2.dex */
    public static final class C6009b extends AbstractC7141y.AbstractC7142a<C6007d, C6009b> implements Object {
        /* synthetic */ C6009b(C6008a c6008a) {
            this();
        }

        /* renamed from: F */
        public C6009b m23008F(String str) {
            m19358z();
            ((C6007d) this.f17082d).m23016b0(str);
            return this;
        }

        /* renamed from: G */
        public C6009b m23007G(C6125e.C6127b c6127b) {
            m19358z();
            ((C6007d) this.f17082d).m23015c0(c6127b.build());
            return this;
        }

        /* renamed from: H */
        public C6009b m23006H(long j) {
            m19358z();
            ((C6007d) this.f17082d).m23014d0(j);
            return this;
        }

        /* renamed from: I */
        public C6009b m23005I(EnumC6361l enumC6361l) {
            m19358z();
            ((C6007d) this.f17082d).m23013e0(enumC6361l);
            return this;
        }

        /* renamed from: K */
        public C6009b m23004K(EnumC6363m enumC6363m) {
            m19358z();
            ((C6007d) this.f17082d).m23012f0(enumC6363m);
            return this;
        }

        /* renamed from: L */
        public C6009b m23003L(String str) {
            m19358z();
            ((C6007d) this.f17082d).m23011g0(str);
            return this;
        }

        /* renamed from: M */
        public C6009b m23002M(String str) {
            m19358z();
            ((C6007d) this.f17082d).m23010h0(str);
            return this;
        }

        /* renamed from: N */
        public C6009b m23001N(EnumC6139h0 enumC6139h0) {
            m19358z();
            ((C6007d) this.f17082d).m23009i0(enumC6139h0);
            return this;
        }

        private C6009b() {
            super(C6007d.DEFAULT_INSTANCE);
        }
    }

    static {
        C6007d c6007d = new C6007d();
        DEFAULT_INSTANCE = c6007d;
        AbstractC7141y.m19380P(C6007d.class, c6007d);
    }

    private C6007d() {
    }

    /* renamed from: a0 */
    public static C6009b m23017a0() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m23016b0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m23015c0(C6125e c6125e) {
        c6125e.getClass();
        this.clientApp_ = c6125e;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public void m23014d0(long j) {
        this.bitField0_ |= 8;
        this.clientTimestampMillis_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m23013e0(EnumC6361l enumC6361l) {
        this.event_ = Integer.valueOf(enumC6361l.mo20225d());
        this.eventCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public void m23012f0(EnumC6363m enumC6363m) {
        this.event_ = Integer.valueOf(enumC6363m.mo20225d());
        this.eventCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m23011g0(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.fiamSdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m23010h0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.projectNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m23009i0(EnumC6139h0 enumC6139h0) {
        this.event_ = Integer.valueOf(enumC6139h0.mo20225d());
        this.eventCase_ = 7;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6008a.f14682a[enumC7147f.ordinal()]) {
            case 1:
                return new C6007d();
            case 2:
                return new C6009b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005ဿ\u0000\u0006ဿ\u0000\u0007ဿ\u0000\bဿ\u0000\tဈ\b\nင\t", new Object[]{"event_", "eventCase_", "bitField0_", "projectNumber_", "campaignId_", "clientApp_", "clientTimestampMillis_", EnumC6363m.m22204b(), EnumC6361l.m22206b(), EnumC6139h0.m22635b(), EnumC6406q.m22100b(), "fiamSdkVersion_", "engagementMetricsDeliveryRetryCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6007d> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6007d.class) {
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
}
