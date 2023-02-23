package p272h.p286c.p355d.p356a.p357a.p358a;

import com.google.firebase.inappmessaging.C6404p;
import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: CampaignProto.java */
/* renamed from: h.c.d.a.a.a.b */
/* loaded from: classes2.dex */
public final class C9368b extends AbstractC7141y<C9368b, C9369a> implements Object {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final C9368b DEFAULT_INSTANCE;
    public static final int EXPERIMENT_PAYLOAD_FIELD_NUMBER = 2;
    private static volatile InterfaceC7007a1<C9368b> PARSER;
    private long campaignEndTimeMillis_;
    private String campaignId_ = "";
    private String campaignName_ = "";
    private long campaignStartTimeMillis_;
    private C6404p experimentPayload_;

    /* compiled from: CampaignProto.java */
    /* renamed from: h.c.d.a.a.a.b$a */
    /* loaded from: classes2.dex */
    public static final class C9369a extends AbstractC7141y.AbstractC7142a<C9368b, C9369a> implements Object {
        /* synthetic */ C9369a(C9367a c9367a) {
            this();
        }

        private C9369a() {
            super(C9368b.DEFAULT_INSTANCE);
        }
    }

    static {
        C9368b c9368b = new C9368b();
        DEFAULT_INSTANCE = c9368b;
        AbstractC7141y.m19380P(C9368b.class, c9368b);
    }

    private C9368b() {
    }

    /* renamed from: W */
    public static C9368b m14939W() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C9367a.f21990a[enumC7147f.ordinal()]) {
            case 1:
                return new C9368b();
            case 2:
                return new C9369a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentPayload_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C9368b> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C9368b.class) {
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

    /* renamed from: S */
    public long m14943S() {
        return this.campaignEndTimeMillis_;
    }

    /* renamed from: T */
    public String m14942T() {
        return this.campaignId_;
    }

    /* renamed from: U */
    public String m14941U() {
        return this.campaignName_;
    }

    /* renamed from: V */
    public long m14940V() {
        return this.campaignStartTimeMillis_;
    }

    /* renamed from: X */
    public C6404p m14938X() {
        C6404p c6404p = this.experimentPayload_;
        return c6404p == null ? C6404p.m22108S() : c6404p;
    }
}
