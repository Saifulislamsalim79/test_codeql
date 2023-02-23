package com.google.firebase.perf.p179k;

import com.google.protobuf.AbstractC6994a;
import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C6997a0;
import com.google.protobuf.C7064k0;
import com.google.protobuf.C7076l0;
import com.google.protobuf.C7118t1;
import com.google.protobuf.InterfaceC7007a1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: TraceMetric.java */
/* renamed from: com.google.firebase.perf.k.m */
/* loaded from: classes2.dex */
public final class C6681m extends AbstractC7141y<C6681m, C6683b> implements Object {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final C6681m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC7007a1<C6681m> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private C7076l0<String, Long> counters_ = C7076l0.m19831e();
    private C7076l0<String, String> customAttributes_ = C7076l0.m19831e();
    private String name_ = "";
    private C6997a0.InterfaceC7006i<C6681m> subtraces_ = AbstractC7141y.m19392D();
    private C6997a0.InterfaceC7006i<C6675k> perfSessions_ = AbstractC7141y.m19392D();

    /* compiled from: TraceMetric.java */
    /* renamed from: com.google.firebase.perf.k.m$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6682a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16059a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f16059a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16059a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16059a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16059a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16059a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16059a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16059a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: TraceMetric.java */
    /* renamed from: com.google.firebase.perf.k.m$b */
    /* loaded from: classes2.dex */
    public static final class C6683b extends AbstractC7141y.AbstractC7142a<C6681m, C6683b> implements Object {
        /* synthetic */ C6683b(C6682a c6682a) {
            this();
        }

        /* renamed from: F */
        public C6683b m21149F(Iterable<? extends C6675k> iterable) {
            m19358z();
            ((C6681m) this.f17082d).m21173b0(iterable);
            return this;
        }

        /* renamed from: G */
        public C6683b m21148G(Iterable<? extends C6681m> iterable) {
            m19358z();
            ((C6681m) this.f17082d).m21172c0(iterable);
            return this;
        }

        /* renamed from: H */
        public C6683b m21147H(C6675k c6675k) {
            m19358z();
            ((C6681m) this.f17082d).m21171d0(c6675k);
            return this;
        }

        /* renamed from: I */
        public C6683b m21146I(C6681m c6681m) {
            m19358z();
            ((C6681m) this.f17082d).m21170e0(c6681m);
            return this;
        }

        /* renamed from: K */
        public C6683b m21145K(Map<String, Long> map) {
            m19358z();
            ((C6681m) this.f17082d).m21162m0().putAll(map);
            return this;
        }

        /* renamed from: L */
        public C6683b m21144L(Map<String, String> map) {
            m19358z();
            ((C6681m) this.f17082d).m21161n0().putAll(map);
            return this;
        }

        /* renamed from: M */
        public C6683b m21143M(String str, long j) {
            str.getClass();
            m19358z();
            ((C6681m) this.f17082d).m21162m0().put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: N */
        public C6683b m21142N(long j) {
            m19358z();
            ((C6681m) this.f17082d).m21151y0(j);
            return this;
        }

        /* renamed from: O */
        public C6683b m21141O(long j) {
            m19358z();
            ((C6681m) this.f17082d).m21150z0(j);
            return this;
        }

        /* renamed from: P */
        public C6683b m21140P(String str) {
            m19358z();
            ((C6681m) this.f17082d).m21184A0(str);
            return this;
        }

        private C6683b() {
            super(C6681m.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: TraceMetric.java */
    /* renamed from: com.google.firebase.perf.k.m$c */
    /* loaded from: classes2.dex */
    private static final class C6684c {

        /* renamed from: a */
        static final C7064k0<String, Long> f16060a = C7064k0.m19868d(C7118t1.EnumC7120b.f16951C, "", C7118t1.EnumC7120b.f16964w, 0L);
    }

    /* compiled from: TraceMetric.java */
    /* renamed from: com.google.firebase.perf.k.m$d */
    /* loaded from: classes2.dex */
    private static final class C6685d {

        /* renamed from: a */
        static final C7064k0<String, String> f16061a;

        static {
            C7118t1.EnumC7120b enumC7120b = C7118t1.EnumC7120b.f16951C;
            f16061a = C7064k0.m19868d(enumC7120b, "", enumC7120b, "");
        }
    }

    static {
        C6681m c6681m = new C6681m();
        DEFAULT_INSTANCE = c6681m;
        AbstractC7141y.m19380P(C6681m.class, c6681m);
    }

    private C6681m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public void m21184A0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m21173b0(Iterable<? extends C6675k> iterable) {
        m21169f0();
        AbstractC6994a.m20243m(iterable, this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m21172c0(Iterable<? extends C6681m> iterable) {
        m21168g0();
        AbstractC6994a.m20243m(iterable, this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public void m21171d0(C6675k c6675k) {
        c6675k.getClass();
        m21169f0();
        this.perfSessions_.add(c6675k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m21170e0(C6681m c6681m) {
        c6681m.getClass();
        m21168g0();
        this.subtraces_.add(c6681m);
    }

    /* renamed from: f0 */
    private void m21169f0() {
        C6997a0.InterfaceC7006i<C6675k> interfaceC7006i = this.perfSessions_;
        if (interfaceC7006i.mo20222c0()) {
            return;
        }
        this.perfSessions_ = AbstractC7141y.m19385K(interfaceC7006i);
    }

    /* renamed from: g0 */
    private void m21168g0() {
        C6997a0.InterfaceC7006i<C6681m> interfaceC7006i = this.subtraces_;
        if (interfaceC7006i.mo20222c0()) {
            return;
        }
        this.subtraces_ = AbstractC7141y.m19385K(interfaceC7006i);
    }

    /* renamed from: k0 */
    public static C6681m m21164k0() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public Map<String, Long> m21162m0() {
        return m21154u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public Map<String, String> m21161n0() {
        return m21153v0();
    }

    /* renamed from: s0 */
    private C7076l0<String, Long> m21156s0() {
        return this.counters_;
    }

    /* renamed from: t0 */
    private C7076l0<String, String> m21155t0() {
        return this.customAttributes_;
    }

    /* renamed from: u0 */
    private C7076l0<String, Long> m21154u0() {
        if (!this.counters_.m19827j()) {
            this.counters_ = this.counters_.m19824n();
        }
        return this.counters_;
    }

    /* renamed from: v0 */
    private C7076l0<String, String> m21153v0() {
        if (!this.customAttributes_.m19827j()) {
            this.customAttributes_ = this.customAttributes_.m19824n();
        }
        return this.customAttributes_;
    }

    /* renamed from: x0 */
    public static C6683b m21152x0() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public void m21151y0(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public void m21150z0(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6682a.f16059a[enumC7147f.ordinal()]) {
            case 1:
                return new C6681m();
            case 2:
                return new C6683b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", C6684c.f16060a, "subtraces_", C6681m.class, "customAttributes_", C6685d.f16061a, "perfSessions_", C6675k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6681m> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6681m.class) {
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

    /* renamed from: h0 */
    public int m21167h0() {
        return m21156s0().size();
    }

    /* renamed from: i0 */
    public Map<String, Long> m21166i0() {
        return Collections.unmodifiableMap(m21156s0());
    }

    /* renamed from: j0 */
    public Map<String, String> m21165j0() {
        return Collections.unmodifiableMap(m21155t0());
    }

    /* renamed from: l0 */
    public long m21163l0() {
        return this.durationUs_;
    }

    /* renamed from: o0 */
    public String m21160o0() {
        return this.name_;
    }

    /* renamed from: p0 */
    public List<C6675k> m21159p0() {
        return this.perfSessions_;
    }

    /* renamed from: q0 */
    public List<C6681m> m21158q0() {
        return this.subtraces_;
    }

    /* renamed from: r0 */
    public boolean m21157r0() {
        return (this.bitField0_ & 4) != 0;
    }
}
