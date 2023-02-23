package com.google.firebase.perf.p179k;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C6997a0;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: TransportInfo.java */
/* renamed from: com.google.firebase.perf.k.n */
/* loaded from: classes2.dex */
public final class C6686n extends AbstractC7141y<C6686n, C6688b> implements Object {
    private static final C6686n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile InterfaceC7007a1<C6686n> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* compiled from: TransportInfo.java */
    /* renamed from: com.google.firebase.perf.k.n$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6687a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16062a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f16062a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16062a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16062a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16062a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16062a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16062a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16062a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: TransportInfo.java */
    /* renamed from: com.google.firebase.perf.k.n$b */
    /* loaded from: classes2.dex */
    public static final class C6688b extends AbstractC7141y.AbstractC7142a<C6686n, C6688b> implements Object {
        /* synthetic */ C6688b(C6687a c6687a) {
            this();
        }

        private C6688b() {
            super(C6686n.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: TransportInfo.java */
    /* renamed from: com.google.firebase.perf.k.n$c */
    /* loaded from: classes2.dex */
    public enum EnumC6689c implements C6997a0.InterfaceC7000c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);
        

        /* renamed from: c */
        private final int f16066c;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: TransportInfo.java */
        /* renamed from: com.google.firebase.perf.k.n$c$a */
        /* loaded from: classes2.dex */
        public static final class C6690a implements C6997a0.InterfaceC7002e {

            /* renamed from: a */
            static final C6997a0.InterfaceC7002e f16067a = new C6690a();

            private C6690a() {
            }

            @Override // com.google.protobuf.C6997a0.InterfaceC7002e
            /* renamed from: a */
            public boolean mo20223a(int i) {
                return EnumC6689c.m21138a(i) != null;
            }
        }

        EnumC6689c(int i) {
            this.f16066c = i;
        }

        /* renamed from: a */
        public static EnumC6689c m21138a(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return FL_LEGACY_V1;
            }
            return SOURCE_UNKNOWN;
        }

        /* renamed from: b */
        public static C6997a0.InterfaceC7002e m21137b() {
            return C6690a.f16067a;
        }

        @Override // com.google.protobuf.C6997a0.InterfaceC7000c
        /* renamed from: d */
        public final int mo20225d() {
            return this.f16066c;
        }
    }

    static {
        C6686n c6686n = new C6686n();
        DEFAULT_INSTANCE = c6686n;
        AbstractC7141y.m19380P(C6686n.class, c6686n);
    }

    private C6686n() {
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6687a.f16062a[enumC7147f.ordinal()]) {
            case 1:
                return new C6686n();
            case 2:
                return new C6688b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", EnumC6689c.m21137b()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6686n> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6686n.class) {
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
