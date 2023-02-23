package p272h.p286c.p355d.p356a.p357a.p358a;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: CampaignProto.java */
/* renamed from: h.c.d.a.a.a.d */
/* loaded from: classes2.dex */
public final class C9374d extends AbstractC7141y<C9374d, C9375a> implements Object {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final C9374d DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_CAMPAIGN_ID_FIELD_NUMBER = 2;
    private static volatile InterfaceC7007a1<C9374d> PARSER;
    private long campaignEndTimeMillis_;
    private long campaignStartTimeMillis_;
    private String campaignId_ = "";
    private String experimentalCampaignId_ = "";
    private String campaignName_ = "";

    /* compiled from: CampaignProto.java */
    /* renamed from: h.c.d.a.a.a.d$a */
    /* loaded from: classes2.dex */
    public static final class C9375a extends AbstractC7141y.AbstractC7142a<C9374d, C9375a> implements Object {
        /* synthetic */ C9375a(C9367a c9367a) {
            this();
        }

        private C9375a() {
            super(C9374d.DEFAULT_INSTANCE);
        }
    }

    static {
        C9374d c9374d = new C9374d();
        DEFAULT_INSTANCE = c9374d;
        AbstractC7141y.m19380P(C9374d.class, c9374d);
    }

    private C9374d() {
    }

    /* renamed from: W */
    public static C9374d m14921W() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C9367a.f21990a[enumC7147f.ordinal()]) {
            case 1:
                return new C9374d();
            case 2:
                return new C9375a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentalCampaignId_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C9374d> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C9374d.class) {
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
    public long m14925S() {
        return this.campaignEndTimeMillis_;
    }

    /* renamed from: T */
    public String m14924T() {
        return this.campaignId_;
    }

    /* renamed from: U */
    public String m14923U() {
        return this.campaignName_;
    }

    /* renamed from: V */
    public long m14922V() {
        return this.campaignStartTimeMillis_;
    }
}
