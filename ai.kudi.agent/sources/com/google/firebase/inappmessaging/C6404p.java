package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C6997a0;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: ExperimentPayloadProto.java */
/* renamed from: com.google.firebase.inappmessaging.p */
/* loaded from: classes2.dex */
public final class C6404p extends AbstractC7141y<C6404p, C6405a> implements Object {
    public static final int ACTIVATE_EVENT_TO_LOG_FIELD_NUMBER = 8;
    public static final int CLEAR_EVENT_TO_LOG_FIELD_NUMBER = 9;
    private static final C6404p DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    public static final int EXPERIMENT_START_TIME_MILLIS_FIELD_NUMBER = 3;
    public static final int ONGOING_EXPERIMENTS_FIELD_NUMBER = 13;
    public static final int OVERFLOW_POLICY_FIELD_NUMBER = 12;
    private static volatile InterfaceC7007a1<C6404p> PARSER = null;
    public static final int SET_EVENT_TO_LOG_FIELD_NUMBER = 7;
    public static final int TIMEOUT_EVENT_TO_LOG_FIELD_NUMBER = 10;
    public static final int TIME_TO_LIVE_MILLIS_FIELD_NUMBER = 6;
    public static final int TRIGGER_EVENT_FIELD_NUMBER = 4;
    public static final int TRIGGER_TIMEOUT_MILLIS_FIELD_NUMBER = 5;
    public static final int TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER = 11;
    public static final int VARIANT_ID_FIELD_NUMBER = 2;
    private long experimentStartTimeMillis_;
    private int overflowPolicy_;
    private long timeToLiveMillis_;
    private long triggerTimeoutMillis_;
    private String experimentId_ = "";
    private String variantId_ = "";
    private String triggerEvent_ = "";
    private String setEventToLog_ = "";
    private String activateEventToLog_ = "";
    private String clearEventToLog_ = "";
    private String timeoutEventToLog_ = "";
    private String ttlExpiryEventToLog_ = "";
    private C6997a0.InterfaceC7006i<C6402o> ongoingExperiments_ = AbstractC7141y.m19392D();

    /* compiled from: ExperimentPayloadProto.java */
    /* renamed from: com.google.firebase.inappmessaging.p$a */
    /* loaded from: classes2.dex */
    public static final class C6405a extends AbstractC7141y.AbstractC7142a<C6404p, C6405a> implements Object {
        /* synthetic */ C6405a(C6401n c6401n) {
            this();
        }

        private C6405a() {
            super(C6404p.DEFAULT_INSTANCE);
        }
    }

    static {
        C6404p c6404p = new C6404p();
        DEFAULT_INSTANCE = c6404p;
        AbstractC7141y.m19380P(C6404p.class, c6404p);
    }

    private C6404p() {
    }

    /* renamed from: S */
    public static C6404p m22108S() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6401n.f15476a[enumC7147f.ordinal()]) {
            case 1:
                return new C6404p();
            case 2:
                return new C6405a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\f\r\u001b", new Object[]{"experimentId_", "variantId_", "experimentStartTimeMillis_", "triggerEvent_", "triggerTimeoutMillis_", "timeToLiveMillis_", "setEventToLog_", "activateEventToLog_", "clearEventToLog_", "timeoutEventToLog_", "ttlExpiryEventToLog_", "overflowPolicy_", "ongoingExperiments_", C6402o.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6404p> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6404p.class) {
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

    /* renamed from: T */
    public String m22107T() {
        return this.experimentId_;
    }

    /* renamed from: U */
    public long m22106U() {
        return this.experimentStartTimeMillis_;
    }

    /* renamed from: V */
    public long m22105V() {
        return this.timeToLiveMillis_;
    }

    /* renamed from: W */
    public String m22104W() {
        return this.triggerEvent_;
    }

    /* renamed from: X */
    public long m22103X() {
        return this.triggerTimeoutMillis_;
    }

    /* renamed from: Y */
    public String m22102Y() {
        return this.variantId_;
    }
}
