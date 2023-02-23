package com.google.firebase.perf.p179k;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: GaugeMetadata.java */
/* renamed from: com.google.firebase.perf.k.f */
/* loaded from: classes2.dex */
public final class C6657f extends AbstractC7141y<C6657f, C6659b> implements Object {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final C6657f DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile InterfaceC7007a1<C6657f> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    /* compiled from: GaugeMetadata.java */
    /* renamed from: com.google.firebase.perf.k.f$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6658a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16030a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f16030a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16030a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16030a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16030a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16030a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16030a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16030a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: GaugeMetadata.java */
    /* renamed from: com.google.firebase.perf.k.f$b */
    /* loaded from: classes2.dex */
    public static final class C6659b extends AbstractC7141y.AbstractC7142a<C6657f, C6659b> implements Object {
        /* synthetic */ C6659b(C6658a c6658a) {
            this();
        }

        /* renamed from: F */
        public C6659b m21316F(int i) {
            m19358z();
            ((C6657f) this.f17082d).m21320Z(i);
            return this;
        }

        /* renamed from: G */
        public C6659b m21315G(int i) {
            m19358z();
            ((C6657f) this.f17082d).m21319a0(i);
            return this;
        }

        /* renamed from: H */
        public C6659b m21314H(int i) {
            m19358z();
            ((C6657f) this.f17082d).m21318b0(i);
            return this;
        }

        /* renamed from: I */
        public C6659b m21313I(String str) {
            m19358z();
            ((C6657f) this.f17082d).m21317c0(str);
            return this;
        }

        private C6659b() {
            super(C6657f.DEFAULT_INSTANCE);
        }
    }

    static {
        C6657f c6657f = new C6657f();
        DEFAULT_INSTANCE = c6657f;
        AbstractC7141y.m19380P(C6657f.class, c6657f);
    }

    private C6657f() {
    }

    /* renamed from: W */
    public static C6657f m21323W() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Y */
    public static C6659b m21321Y() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m21320Z(int i) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public void m21319a0(int i) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m21318b0(int i) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m21317c0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.processName_ = str;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6658a.f16030a[enumC7147f.ordinal()]) {
            case 1:
                return new C6657f();
            case 2:
                return new C6659b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6657f> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6657f.class) {
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

    /* renamed from: X */
    public boolean m21322X() {
        return (this.bitField0_ & 16) != 0;
    }
}
