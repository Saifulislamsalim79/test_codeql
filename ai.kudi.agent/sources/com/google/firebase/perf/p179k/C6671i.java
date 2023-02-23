package com.google.firebase.perf.p179k;

import com.google.firebase.perf.p179k.C6648c;
import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: PerfMetric.java */
/* renamed from: com.google.firebase.perf.k.i */
/* loaded from: classes2.dex */
public final class C6671i extends AbstractC7141y<C6671i, C6673b> implements InterfaceC6674j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final C6671i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile InterfaceC7007a1<C6671i> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private C6648c applicationInfo_;
    private int bitField0_;
    private C6660g gaugeMetric_;
    private C6663h networkRequestMetric_;
    private C6681m traceMetric_;
    private C6686n transportInfo_;

    /* compiled from: PerfMetric.java */
    /* renamed from: com.google.firebase.perf.k.i$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6672a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16052a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f16052a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16052a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16052a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16052a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16052a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16052a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16052a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: PerfMetric.java */
    /* renamed from: com.google.firebase.perf.k.i$b */
    /* loaded from: classes2.dex */
    public static final class C6673b extends AbstractC7141y.AbstractC7142a<C6671i, C6673b> implements InterfaceC6674j {
        /* synthetic */ C6673b(C6672a c6672a) {
            this();
        }

        /* renamed from: F */
        public C6673b m21208F(C6648c.C6650b c6650b) {
            m19358z();
            ((C6671i) this.f17082d).m21212Z(c6650b.build());
            return this;
        }

        /* renamed from: G */
        public C6673b m21207G(C6660g c6660g) {
            m19358z();
            ((C6671i) this.f17082d).m21211a0(c6660g);
            return this;
        }

        /* renamed from: H */
        public C6673b m21206H(C6663h c6663h) {
            m19358z();
            ((C6671i) this.f17082d).m21210b0(c6663h);
            return this;
        }

        /* renamed from: I */
        public C6673b m21205I(C6681m c6681m) {
            m19358z();
            ((C6671i) this.f17082d).m21209c0(c6681m);
            return this;
        }

        @Override // com.google.firebase.perf.p179k.InterfaceC6674j
        /* renamed from: i */
        public boolean mo21204i() {
            return ((C6671i) this.f17082d).mo21204i();
        }

        @Override // com.google.firebase.perf.p179k.InterfaceC6674j
        /* renamed from: k */
        public boolean mo21203k() {
            return ((C6671i) this.f17082d).mo21203k();
        }

        @Override // com.google.firebase.perf.p179k.InterfaceC6674j
        /* renamed from: l */
        public C6681m mo21202l() {
            return ((C6671i) this.f17082d).mo21202l();
        }

        @Override // com.google.firebase.perf.p179k.InterfaceC6674j
        /* renamed from: o */
        public boolean mo21201o() {
            return ((C6671i) this.f17082d).mo21201o();
        }

        @Override // com.google.firebase.perf.p179k.InterfaceC6674j
        /* renamed from: p */
        public C6663h mo21200p() {
            return ((C6671i) this.f17082d).mo21200p();
        }

        @Override // com.google.firebase.perf.p179k.InterfaceC6674j
        /* renamed from: q */
        public C6660g mo21199q() {
            return ((C6671i) this.f17082d).mo21199q();
        }

        private C6673b() {
            super(C6671i.DEFAULT_INSTANCE);
        }
    }

    static {
        C6671i c6671i = new C6671i();
        DEFAULT_INSTANCE = c6671i;
        AbstractC7141y.m19380P(C6671i.class, c6671i);
    }

    private C6671i() {
    }

    /* renamed from: Y */
    public static C6673b m21213Y() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m21212Z(C6648c c6648c) {
        c6648c.getClass();
        this.applicationInfo_ = c6648c;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public void m21211a0(C6660g c6660g) {
        c6660g.getClass();
        this.gaugeMetric_ = c6660g;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m21210b0(C6663h c6663h) {
        c6663h.getClass();
        this.networkRequestMetric_ = c6663h;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m21209c0(C6681m c6681m) {
        c6681m.getClass();
        this.traceMetric_ = c6681m;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6672a.f16052a[enumC7147f.ordinal()]) {
            case 1:
                return new C6671i();
            case 2:
                return new C6673b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6671i> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6671i.class) {
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

    /* renamed from: W */
    public C6648c m21215W() {
        C6648c c6648c = this.applicationInfo_;
        return c6648c == null ? C6648c.m21359Y() : c6648c;
    }

    /* renamed from: X */
    public boolean m21214X() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.p179k.InterfaceC6674j
    /* renamed from: i */
    public boolean mo21204i() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.p179k.InterfaceC6674j
    /* renamed from: k */
    public boolean mo21203k() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.p179k.InterfaceC6674j
    /* renamed from: l */
    public C6681m mo21202l() {
        C6681m c6681m = this.traceMetric_;
        return c6681m == null ? C6681m.m21164k0() : c6681m;
    }

    @Override // com.google.firebase.perf.p179k.InterfaceC6674j
    /* renamed from: o */
    public boolean mo21201o() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.p179k.InterfaceC6674j
    /* renamed from: p */
    public C6663h mo21200p() {
        C6663h c6663h = this.networkRequestMetric_;
        return c6663h == null ? C6663h.m21257j0() : c6663h;
    }

    @Override // com.google.firebase.perf.p179k.InterfaceC6674j
    /* renamed from: q */
    public C6660g mo21199q() {
        C6660g c6660g = this.gaugeMetric_;
        return c6660g == null ? C6660g.m21301c0() : c6660g;
    }
}
