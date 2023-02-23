package p272h.p286c.p355d.p356a.p357a.p358a.p359e;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C6997a0;
import com.google.protobuf.InterfaceC7007a1;
import java.util.List;
import p272h.p286c.p355d.p356a.p357a.p358a.C9370c;
/* compiled from: FetchEligibleCampaignsResponse.java */
/* renamed from: h.c.d.a.a.a.e.e */
/* loaded from: classes2.dex */
public final class C9388e extends AbstractC7141y<C9388e, C9390b> implements Object {
    private static final C9388e DEFAULT_INSTANCE;
    public static final int EXPIRATION_EPOCH_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile InterfaceC7007a1<C9388e> PARSER;
    private long expirationEpochTimestampMillis_;
    private C6997a0.InterfaceC7006i<C9370c> messages_ = AbstractC7141y.m19392D();

    /* compiled from: FetchEligibleCampaignsResponse.java */
    /* renamed from: h.c.d.a.a.a.e.e$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C9389a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22000a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f22000a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22000a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22000a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22000a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22000a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22000a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22000a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: FetchEligibleCampaignsResponse.java */
    /* renamed from: h.c.d.a.a.a.e.e$b */
    /* loaded from: classes2.dex */
    public static final class C9390b extends AbstractC7141y.AbstractC7142a<C9388e, C9390b> implements Object {
        /* synthetic */ C9390b(C9389a c9389a) {
            this();
        }

        /* renamed from: F */
        public C9390b m14865F(long j) {
            m19358z();
            ((C9388e) this.f17082d).m14866Y(j);
            return this;
        }

        private C9390b() {
            super(C9388e.DEFAULT_INSTANCE);
        }
    }

    static {
        C9388e c9388e = new C9388e();
        DEFAULT_INSTANCE = c9388e;
        AbstractC7141y.m19380P(C9388e.class, c9388e);
    }

    private C9388e() {
    }

    /* renamed from: T */
    public static C9388e m14871T() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: W */
    public static C9390b m14868W() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* renamed from: X */
    public static InterfaceC7007a1<C9388e> m14867X() {
        return DEFAULT_INSTANCE.mo19377g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public void m14866Y(long j) {
        this.expirationEpochTimestampMillis_ = j;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C9389a.f22000a[enumC7147f.ordinal()]) {
            case 1:
                return new C9388e();
            case 2:
                return new C9390b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"messages_", C9370c.class, "expirationEpochTimestampMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C9388e> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C9388e.class) {
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
    public long m14870U() {
        return this.expirationEpochTimestampMillis_;
    }

    /* renamed from: V */
    public List<C9370c> m14869V() {
        return this.messages_;
    }
}
