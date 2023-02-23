package com.google.firebase.perf.p179k;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: AndroidMemoryReading.java */
/* renamed from: com.google.firebase.perf.k.b */
/* loaded from: classes2.dex */
public final class C6645b extends AbstractC7141y<C6645b, C6647b> implements Object {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C6645b DEFAULT_INSTANCE;
    private static volatile InterfaceC7007a1<C6645b> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* compiled from: AndroidMemoryReading.java */
    /* renamed from: com.google.firebase.perf.k.b$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6646a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16019a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f16019a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16019a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16019a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16019a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16019a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16019a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16019a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AndroidMemoryReading.java */
    /* renamed from: com.google.firebase.perf.k.b$b */
    /* loaded from: classes2.dex */
    public static final class C6647b extends AbstractC7141y.AbstractC7142a<C6645b, C6647b> implements Object {
        /* synthetic */ C6647b(C6646a c6646a) {
            this();
        }

        /* renamed from: F */
        public C6647b m21368F(long j) {
            m19358z();
            ((C6645b) this.f17082d).m21370V(j);
            return this;
        }

        /* renamed from: G */
        public C6647b m21367G(int i) {
            m19358z();
            ((C6645b) this.f17082d).m21369W(i);
            return this;
        }

        private C6647b() {
            super(C6645b.DEFAULT_INSTANCE);
        }
    }

    static {
        C6645b c6645b = new C6645b();
        DEFAULT_INSTANCE = c6645b;
        AbstractC7141y.m19380P(C6645b.class, c6645b);
    }

    private C6645b() {
    }

    /* renamed from: U */
    public static C6647b m21371U() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m21370V(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m21369W(int i) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6646a.f16019a[enumC7147f.ordinal()]) {
            case 1:
                return new C6645b();
            case 2:
                return new C6647b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6645b> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6645b.class) {
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
