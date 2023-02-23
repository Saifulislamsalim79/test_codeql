package p272h.p286c.p351c.p352a.p353a.p354a;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: ClientSignalsProto.java */
/* renamed from: h.c.c.a.a.a.b */
/* loaded from: classes2.dex */
public final class C9365b extends AbstractC7141y<C9365b, C9366a> implements Object {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    private static final C9365b DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    private static volatile InterfaceC7007a1<C9365b> PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 4;
    private String appVersion_ = "";
    private String platformVersion_ = "";
    private String languageCode_ = "";
    private String timeZone_ = "";

    /* compiled from: ClientSignalsProto.java */
    /* renamed from: h.c.c.a.a.a.b$a */
    /* loaded from: classes2.dex */
    public static final class C9366a extends AbstractC7141y.AbstractC7142a<C9365b, C9366a> implements Object {
        /* synthetic */ C9366a(C9364a c9364a) {
            this();
        }

        /* renamed from: F */
        public C9366a m14948F(String str) {
            m19358z();
            ((C9365b) this.f17082d).m14952X(str);
            return this;
        }

        /* renamed from: G */
        public C9366a m14947G(String str) {
            m19358z();
            ((C9365b) this.f17082d).m14951Y(str);
            return this;
        }

        /* renamed from: H */
        public C9366a m14946H(String str) {
            m19358z();
            ((C9365b) this.f17082d).m14950Z(str);
            return this;
        }

        /* renamed from: I */
        public C9366a m14945I(String str) {
            m19358z();
            ((C9365b) this.f17082d).m14949a0(str);
            return this;
        }

        private C9366a() {
            super(C9365b.DEFAULT_INSTANCE);
        }
    }

    static {
        C9365b c9365b = new C9365b();
        DEFAULT_INSTANCE = c9365b;
        AbstractC7141y.m19380P(C9365b.class, c9365b);
    }

    private C9365b() {
    }

    /* renamed from: W */
    public static C9366a m14953W() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m14952X(String str) {
        str.getClass();
        this.appVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m14951Y(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m14950Z(String str) {
        str.getClass();
        this.platformVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public void m14949a0(String str) {
        str.getClass();
        this.timeZone_ = str;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C9364a.f21989a[enumC7147f.ordinal()]) {
            case 1:
                return new C9365b();
            case 2:
                return new C9366a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C9365b> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C9365b.class) {
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
