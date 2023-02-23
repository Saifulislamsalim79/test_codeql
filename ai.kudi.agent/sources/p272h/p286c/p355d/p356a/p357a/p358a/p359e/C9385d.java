package p272h.p286c.p355d.p356a.p357a.p358a.p359e;

import com.google.protobuf.AbstractC6994a;
import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C6997a0;
import com.google.protobuf.InterfaceC7007a1;
import p272h.p286c.p351c.p352a.p353a.p354a.C9365b;
/* compiled from: FetchEligibleCampaignsRequest.java */
/* renamed from: h.c.d.a.a.a.e.d */
/* loaded from: classes2.dex */
public final class C9385d extends AbstractC7141y<C9385d, C9387b> implements Object {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 3;
    public static final int CLIENT_SIGNALS_FIELD_NUMBER = 4;
    private static final C9385d DEFAULT_INSTANCE;
    private static volatile InterfaceC7007a1<C9385d> PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int REQUESTING_CLIENT_APP_FIELD_NUMBER = 2;
    private C9365b clientSignals_;
    private C9382c requestingClientApp_;
    private String projectNumber_ = "";
    private C6997a0.InterfaceC7006i<C9376a> alreadySeenCampaigns_ = AbstractC7141y.m19392D();

    /* compiled from: FetchEligibleCampaignsRequest.java */
    /* renamed from: h.c.d.a.a.a.e.d$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C9386a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21999a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f21999a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21999a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21999a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21999a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21999a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21999a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21999a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: FetchEligibleCampaignsRequest.java */
    /* renamed from: h.c.d.a.a.a.e.d$b */
    /* loaded from: classes2.dex */
    public static final class C9387b extends AbstractC7141y.AbstractC7142a<C9385d, C9387b> implements Object {
        /* synthetic */ C9387b(C9386a c9386a) {
            this();
        }

        /* renamed from: F */
        public C9387b m14878F(Iterable<? extends C9376a> iterable) {
            m19358z();
            ((C9385d) this.f17082d).m14885W(iterable);
            return this;
        }

        /* renamed from: G */
        public C9387b m14877G(C9365b c9365b) {
            m19358z();
            ((C9385d) this.f17082d).m14881a0(c9365b);
            return this;
        }

        /* renamed from: H */
        public C9387b m14876H(String str) {
            m19358z();
            ((C9385d) this.f17082d).m14880b0(str);
            return this;
        }

        /* renamed from: I */
        public C9387b m14875I(C9382c c9382c) {
            m19358z();
            ((C9385d) this.f17082d).m14879c0(c9382c);
            return this;
        }

        private C9387b() {
            super(C9385d.DEFAULT_INSTANCE);
        }
    }

    static {
        C9385d c9385d = new C9385d();
        DEFAULT_INSTANCE = c9385d;
        AbstractC7141y.m19380P(C9385d.class, c9385d);
    }

    private C9385d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m14885W(Iterable<? extends C9376a> iterable) {
        m14884X();
        AbstractC6994a.m20243m(iterable, this.alreadySeenCampaigns_);
    }

    /* renamed from: X */
    private void m14884X() {
        C6997a0.InterfaceC7006i<C9376a> interfaceC7006i = this.alreadySeenCampaigns_;
        if (interfaceC7006i.mo20222c0()) {
            return;
        }
        this.alreadySeenCampaigns_ = AbstractC7141y.m19385K(interfaceC7006i);
    }

    /* renamed from: Y */
    public static C9385d m14883Y() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Z */
    public static C9387b m14882Z() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public void m14881a0(C9365b c9365b) {
        c9365b.getClass();
        this.clientSignals_ = c9365b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m14880b0(String str) {
        str.getClass();
        this.projectNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m14879c0(C9382c c9382c) {
        c9382c.getClass();
        this.requestingClientApp_ = c9382c;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C9386a.f21999a[enumC7147f.ordinal()]) {
            case 1:
                return new C9385d();
            case 2:
                return new C9387b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\u001b\u0004\t", new Object[]{"projectNumber_", "requestingClientApp_", "alreadySeenCampaigns_", C9376a.class, "clientSignals_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C9385d> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C9385d.class) {
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
