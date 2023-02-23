package com.google.firebase.perf.p179k;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: CpuMetricReading.java */
/* renamed from: com.google.firebase.perf.k.e */
/* loaded from: classes2.dex */
public final class C6654e extends AbstractC7141y<C6654e, C6656b> implements Object {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C6654e DEFAULT_INSTANCE;
    private static volatile InterfaceC7007a1<C6654e> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* compiled from: CpuMetricReading.java */
    /* renamed from: com.google.firebase.perf.k.e$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6655a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16029a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f16029a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16029a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16029a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16029a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16029a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16029a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16029a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: CpuMetricReading.java */
    /* renamed from: com.google.firebase.perf.k.e$b */
    /* loaded from: classes2.dex */
    public static final class C6656b extends AbstractC7141y.AbstractC7142a<C6654e, C6656b> implements Object {
        /* synthetic */ C6656b(C6655a c6655a) {
            this();
        }

        /* renamed from: F */
        public C6656b m21331F(long j) {
            m19358z();
            ((C6654e) this.f17082d).m21334W(j);
            return this;
        }

        /* renamed from: G */
        public C6656b m21330G(long j) {
            m19358z();
            ((C6654e) this.f17082d).m21333X(j);
            return this;
        }

        /* renamed from: H */
        public C6656b m21329H(long j) {
            m19358z();
            ((C6654e) this.f17082d).m21332Y(j);
            return this;
        }

        private C6656b() {
            super(C6654e.DEFAULT_INSTANCE);
        }
    }

    static {
        C6654e c6654e = new C6654e();
        DEFAULT_INSTANCE = c6654e;
        AbstractC7141y.m19380P(C6654e.class, c6654e);
    }

    private C6654e() {
    }

    /* renamed from: V */
    public static C6656b m21335V() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m21334W(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m21333X(long j) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m21332Y(long j) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6655a.f16029a[enumC7147f.ordinal()]) {
            case 1:
                return new C6654e();
            case 2:
                return new C6656b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6654e> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6654e.class) {
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
