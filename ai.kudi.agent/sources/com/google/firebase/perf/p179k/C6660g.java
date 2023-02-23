package com.google.firebase.perf.p179k;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C6997a0;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: GaugeMetric.java */
/* renamed from: com.google.firebase.perf.k.g */
/* loaded from: classes2.dex */
public final class C6660g extends AbstractC7141y<C6660g, C6662b> implements Object {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final C6660g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile InterfaceC7007a1<C6660g> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private C6657f gaugeMetadata_;
    private String sessionId_ = "";
    private C6997a0.InterfaceC7006i<C6654e> cpuMetricReadings_ = AbstractC7141y.m19392D();
    private C6997a0.InterfaceC7006i<C6645b> androidMemoryReadings_ = AbstractC7141y.m19392D();

    /* compiled from: GaugeMetric.java */
    /* renamed from: com.google.firebase.perf.k.g$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6661a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16031a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f16031a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16031a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16031a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16031a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16031a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16031a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16031a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: GaugeMetric.java */
    /* renamed from: com.google.firebase.perf.k.g$b */
    /* loaded from: classes2.dex */
    public static final class C6662b extends AbstractC7141y.AbstractC7142a<C6660g, C6662b> implements Object {
        /* synthetic */ C6662b(C6661a c6661a) {
            this();
        }

        /* renamed from: F */
        public C6662b m21294F(C6645b c6645b) {
            m19358z();
            ((C6660g) this.f17082d).m21307W(c6645b);
            return this;
        }

        /* renamed from: G */
        public C6662b m21293G(C6654e c6654e) {
            m19358z();
            ((C6660g) this.f17082d).m21306X(c6654e);
            return this;
        }

        /* renamed from: H */
        public C6662b m21292H(C6657f c6657f) {
            m19358z();
            ((C6660g) this.f17082d).m21296h0(c6657f);
            return this;
        }

        /* renamed from: I */
        public C6662b m21291I(String str) {
            m19358z();
            ((C6660g) this.f17082d).m21295i0(str);
            return this;
        }

        private C6662b() {
            super(C6660g.DEFAULT_INSTANCE);
        }
    }

    static {
        C6660g c6660g = new C6660g();
        DEFAULT_INSTANCE = c6660g;
        AbstractC7141y.m19380P(C6660g.class, c6660g);
    }

    private C6660g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m21307W(C6645b c6645b) {
        c6645b.getClass();
        m21305Y();
        this.androidMemoryReadings_.add(c6645b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m21306X(C6654e c6654e) {
        c6654e.getClass();
        m21304Z();
        this.cpuMetricReadings_.add(c6654e);
    }

    /* renamed from: Y */
    private void m21305Y() {
        C6997a0.InterfaceC7006i<C6645b> interfaceC7006i = this.androidMemoryReadings_;
        if (interfaceC7006i.mo20222c0()) {
            return;
        }
        this.androidMemoryReadings_ = AbstractC7141y.m19385K(interfaceC7006i);
    }

    /* renamed from: Z */
    private void m21304Z() {
        C6997a0.InterfaceC7006i<C6654e> interfaceC7006i = this.cpuMetricReadings_;
        if (interfaceC7006i.mo20222c0()) {
            return;
        }
        this.cpuMetricReadings_ = AbstractC7141y.m19385K(interfaceC7006i);
    }

    /* renamed from: c0 */
    public static C6660g m21301c0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: g0 */
    public static C6662b m21297g0() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m21296h0(C6657f c6657f) {
        c6657f.getClass();
        this.gaugeMetadata_ = c6657f;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m21295i0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6661a.f16031a[enumC7147f.ordinal()]) {
            case 1:
                return new C6660g();
            case 2:
                return new C6662b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", C6654e.class, "gaugeMetadata_", "androidMemoryReadings_", C6645b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6660g> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6660g.class) {
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

    /* renamed from: a0 */
    public int m21303a0() {
        return this.androidMemoryReadings_.size();
    }

    /* renamed from: b0 */
    public int m21302b0() {
        return this.cpuMetricReadings_.size();
    }

    /* renamed from: d0 */
    public C6657f m21300d0() {
        C6657f c6657f = this.gaugeMetadata_;
        return c6657f == null ? C6657f.m21323W() : c6657f;
    }

    /* renamed from: e0 */
    public boolean m21299e0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: f0 */
    public boolean m21298f0() {
        return (this.bitField0_ & 1) != 0;
    }
}
