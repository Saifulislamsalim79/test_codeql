package com.google.firebase.perf.p179k;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C6997a0;
import com.google.protobuf.InterfaceC7007a1;
import com.google.protobuf.InterfaceC7009b0;
/* compiled from: PerfSession.java */
/* renamed from: com.google.firebase.perf.k.k */
/* loaded from: classes2.dex */
public final class C6675k extends AbstractC7141y<C6675k, C6678c> implements Object {
    private static final C6675k DEFAULT_INSTANCE;
    private static volatile InterfaceC7007a1<C6675k> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC7009b0<Integer, EnumC6679l> sessionVerbosity_converter_ = new C6676a();
    private int bitField0_;
    private String sessionId_ = "";
    private C6997a0.InterfaceC7004g sessionVerbosity_ = AbstractC7141y.m19393C();

    /* compiled from: PerfSession.java */
    /* renamed from: com.google.firebase.perf.k.k$a */
    /* loaded from: classes2.dex */
    class C6676a implements InterfaceC7009b0<Integer, EnumC6679l> {
        C6676a() {
        }

        @Override // com.google.protobuf.InterfaceC7009b0
        /* renamed from: a */
        public EnumC6679l convert(Integer num) {
            EnumC6679l m21186a = EnumC6679l.m21186a(num.intValue());
            return m21186a == null ? EnumC6679l.SESSION_VERBOSITY_NONE : m21186a;
        }
    }

    /* compiled from: PerfSession.java */
    /* renamed from: com.google.firebase.perf.k.k$b */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6677b {

        /* renamed from: a */
        static final /* synthetic */ int[] f16053a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f16053a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16053a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16053a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16053a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16053a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16053a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16053a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: PerfSession.java */
    /* renamed from: com.google.firebase.perf.k.k$c */
    /* loaded from: classes2.dex */
    public static final class C6678c extends AbstractC7141y.AbstractC7142a<C6675k, C6678c> implements Object {
        /* synthetic */ C6678c(C6676a c6676a) {
            this();
        }

        /* renamed from: F */
        public C6678c m21188F(EnumC6679l enumC6679l) {
            m19358z();
            ((C6675k) this.f17082d).m21195U(enumC6679l);
            return this;
        }

        /* renamed from: G */
        public C6678c m21187G(String str) {
            m19358z();
            ((C6675k) this.f17082d).m21190Z(str);
            return this;
        }

        private C6678c() {
            super(C6675k.DEFAULT_INSTANCE);
        }
    }

    static {
        C6675k c6675k = new C6675k();
        DEFAULT_INSTANCE = c6675k;
        AbstractC7141y.m19380P(C6675k.class, c6675k);
    }

    private C6675k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m21195U(EnumC6679l enumC6679l) {
        enumC6679l.getClass();
        m21194V();
        this.sessionVerbosity_.mo19336C(enumC6679l.mo20225d());
    }

    /* renamed from: V */
    private void m21194V() {
        C6997a0.InterfaceC7004g interfaceC7004g = this.sessionVerbosity_;
        if (interfaceC7004g.mo20222c0()) {
            return;
        }
        this.sessionVerbosity_ = AbstractC7141y.m19386J(interfaceC7004g);
    }

    /* renamed from: Y */
    public static C6678c m21191Y() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m21190Z(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6677b.f16053a[enumC7147f.ordinal()]) {
            case 1:
                return new C6675k();
            case 2:
                return new C6678c(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", EnumC6679l.m21185b()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6675k> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6675k.class) {
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
    public EnumC6679l m21193W(int i) {
        return sessionVerbosity_converter_.convert(Integer.valueOf(this.sessionVerbosity_.getInt(i)));
    }

    /* renamed from: X */
    public int m21192X() {
        return this.sessionVerbosity_.size();
    }
}
