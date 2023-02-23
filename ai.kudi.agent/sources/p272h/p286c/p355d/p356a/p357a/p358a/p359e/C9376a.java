package p272h.p286c.p355d.p356a.p357a.p358a.p359e;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: CampaignImpression.java */
/* renamed from: h.c.d.a.a.a.e.a */
/* loaded from: classes2.dex */
public final class C9376a extends AbstractC7141y<C9376a, C9378b> implements Object {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    private static final C9376a DEFAULT_INSTANCE;
    public static final int IMPRESSION_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    private static volatile InterfaceC7007a1<C9376a> PARSER;
    private String campaignId_ = "";
    private long impressionTimestampMillis_;

    /* compiled from: CampaignImpression.java */
    /* renamed from: h.c.d.a.a.a.e.a$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C9377a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21996a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f21996a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21996a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21996a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21996a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21996a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21996a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21996a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: CampaignImpression.java */
    /* renamed from: h.c.d.a.a.a.e.a$b */
    /* loaded from: classes2.dex */
    public static final class C9378b extends AbstractC7141y.AbstractC7142a<C9376a, C9378b> implements Object {
        /* synthetic */ C9378b(C9377a c9377a) {
            this();
        }

        /* renamed from: F */
        public C9378b m14913F(String str) {
            m19358z();
            ((C9376a) this.f17082d).m14915W(str);
            return this;
        }

        /* renamed from: G */
        public C9378b m14912G(long j) {
            m19358z();
            ((C9376a) this.f17082d).m14914X(j);
            return this;
        }

        private C9378b() {
            super(C9376a.DEFAULT_INSTANCE);
        }
    }

    static {
        C9376a c9376a = new C9376a();
        DEFAULT_INSTANCE = c9376a;
        AbstractC7141y.m19380P(C9376a.class, c9376a);
    }

    private C9376a() {
    }

    /* renamed from: V */
    public static C9378b m14916V() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m14915W(String str) {
        str.getClass();
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m14914X(long j) {
        this.impressionTimestampMillis_ = j;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C9377a.f21996a[enumC7147f.ordinal()]) {
            case 1:
                return new C9376a();
            case 2:
                return new C9378b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"campaignId_", "impressionTimestampMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C9376a> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C9376a.class) {
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

    /* renamed from: U */
    public String m14917U() {
        return this.campaignId_;
    }
}
