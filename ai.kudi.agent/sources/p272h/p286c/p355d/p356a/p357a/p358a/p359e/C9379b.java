package p272h.p286c.p355d.p356a.p357a.p358a.p359e;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C6997a0;
import com.google.protobuf.InterfaceC7007a1;
import java.util.List;
/* compiled from: CampaignImpressionList.java */
/* renamed from: h.c.d.a.a.a.e.b */
/* loaded from: classes2.dex */
public final class C9379b extends AbstractC7141y<C9379b, C9381b> implements Object {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 1;
    private static final C9379b DEFAULT_INSTANCE;
    private static volatile InterfaceC7007a1<C9379b> PARSER;
    private C6997a0.InterfaceC7006i<C9376a> alreadySeenCampaigns_ = AbstractC7141y.m19392D();

    /* compiled from: CampaignImpressionList.java */
    /* renamed from: h.c.d.a.a.a.e.b$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C9380a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21997a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f21997a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21997a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21997a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21997a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21997a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21997a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21997a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: CampaignImpressionList.java */
    /* renamed from: h.c.d.a.a.a.e.b$b */
    /* loaded from: classes2.dex */
    public static final class C9381b extends AbstractC7141y.AbstractC7142a<C9379b, C9381b> implements Object {
        /* synthetic */ C9381b(C9380a c9380a) {
            this();
        }

        /* renamed from: F */
        public C9381b m14902F(C9376a c9376a) {
            m19358z();
            ((C9379b) this.f17082d).m14909T(c9376a);
            return this;
        }

        private C9381b() {
            super(C9379b.DEFAULT_INSTANCE);
        }
    }

    static {
        C9379b c9379b = new C9379b();
        DEFAULT_INSTANCE = c9379b;
        AbstractC7141y.m19380P(C9379b.class, c9379b);
    }

    private C9379b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m14909T(C9376a c9376a) {
        c9376a.getClass();
        m14908U();
        this.alreadySeenCampaigns_.add(c9376a);
    }

    /* renamed from: U */
    private void m14908U() {
        C6997a0.InterfaceC7006i<C9376a> interfaceC7006i = this.alreadySeenCampaigns_;
        if (interfaceC7006i.mo20222c0()) {
            return;
        }
        this.alreadySeenCampaigns_ = AbstractC7141y.m19385K(interfaceC7006i);
    }

    /* renamed from: W */
    public static C9379b m14906W() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: X */
    public static C9381b m14905X() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* renamed from: Y */
    public static C9381b m14904Y(C9379b c9379b) {
        return DEFAULT_INSTANCE.m19371y(c9379b);
    }

    /* renamed from: Z */
    public static InterfaceC7007a1<C9379b> m14903Z() {
        return DEFAULT_INSTANCE.mo19377g();
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C9380a.f21997a[enumC7147f.ordinal()]) {
            case 1:
                return new C9379b();
            case 2:
                return new C9381b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"alreadySeenCampaigns_", C9376a.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C9379b> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C9379b.class) {
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

    /* renamed from: V */
    public List<C9376a> m14907V() {
        return this.alreadySeenCampaigns_;
    }
}
