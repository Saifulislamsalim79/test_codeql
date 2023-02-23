package p272h.p286c.p355d.p356a.p357a.p358a.p359e;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: ClientAppInfo.java */
/* renamed from: h.c.d.a.a.a.e.c */
/* loaded from: classes2.dex */
public final class C9382c extends AbstractC7141y<C9382c, C9384b> implements Object {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int APP_INSTANCE_ID_TOKEN_FIELD_NUMBER = 3;
    private static final C9382c DEFAULT_INSTANCE;
    public static final int GMP_APP_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC7007a1<C9382c> PARSER;
    private String gmpAppId_ = "";
    private String appInstanceId_ = "";
    private String appInstanceIdToken_ = "";

    /* compiled from: ClientAppInfo.java */
    /* renamed from: h.c.d.a.a.a.e.c$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C9383a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21998a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f21998a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21998a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21998a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21998a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21998a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21998a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21998a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: ClientAppInfo.java */
    /* renamed from: h.c.d.a.a.a.e.c$b */
    /* loaded from: classes2.dex */
    public static final class C9384b extends AbstractC7141y.AbstractC7142a<C9382c, C9384b> implements Object {
        /* synthetic */ C9384b(C9383a c9383a) {
            this();
        }

        /* renamed from: F */
        public C9384b m14893F(String str) {
            m19358z();
            ((C9382c) this.f17082d).m14896W(str);
            return this;
        }

        /* renamed from: G */
        public C9384b m14892G(String str) {
            m19358z();
            ((C9382c) this.f17082d).m14895X(str);
            return this;
        }

        /* renamed from: H */
        public C9384b m14891H(String str) {
            m19358z();
            ((C9382c) this.f17082d).m14894Y(str);
            return this;
        }

        private C9384b() {
            super(C9382c.DEFAULT_INSTANCE);
        }
    }

    static {
        C9382c c9382c = new C9382c();
        DEFAULT_INSTANCE = c9382c;
        AbstractC7141y.m19380P(C9382c.class, c9382c);
    }

    private C9382c() {
    }

    /* renamed from: V */
    public static C9384b m14897V() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m14896W(String str) {
        str.getClass();
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m14895X(String str) {
        str.getClass();
        this.appInstanceIdToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m14894Y(String str) {
        str.getClass();
        this.gmpAppId_ = str;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C9383a.f21998a[enumC7147f.ordinal()]) {
            case 1:
                return new C9382c();
            case 2:
                return new C9384b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"gmpAppId_", "appInstanceId_", "appInstanceIdToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C9382c> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C9382c.class) {
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
