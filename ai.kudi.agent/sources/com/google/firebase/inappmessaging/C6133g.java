package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C6997a0;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: CommonTypesProto.java */
/* renamed from: com.google.firebase.inappmessaging.g */
/* loaded from: classes2.dex */
public final class C6133g extends AbstractC7141y<C6133g, C6134a> implements Object {
    public static final int COUNT_FIELD_NUMBER = 5;
    private static final C6133g DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile InterfaceC7007a1<C6133g> PARSER = null;
    public static final int PREVIOUS_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_MILLIS_FIELD_NUMBER = 3;
    public static final int TRIGGER_PARAMS_FIELD_NUMBER = 1;
    private int count_;
    private long previousTimestampMillis_;
    private long timestampMillis_;
    private C6997a0.InterfaceC7006i<C6147j> triggerParams_ = AbstractC7141y.m19392D();
    private String name_ = "";

    /* compiled from: CommonTypesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.g$a */
    /* loaded from: classes2.dex */
    public static final class C6134a extends AbstractC7141y.AbstractC7142a<C6133g, C6134a> implements Object {
        /* synthetic */ C6134a(C6130f c6130f) {
            this();
        }

        private C6134a() {
            super(C6133g.DEFAULT_INSTANCE);
        }
    }

    static {
        C6133g c6133g = new C6133g();
        DEFAULT_INSTANCE = c6133g;
        AbstractC7141y.m19380P(C6133g.class, c6133g);
    }

    private C6133g() {
    }

    /* renamed from: S */
    public static C6133g m22645S() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6130f.f14968a[enumC7147f.ordinal()]) {
            case 1:
                return new C6133g();
            case 2:
                return new C6134a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0004", new Object[]{"triggerParams_", C6147j.class, "name_", "timestampMillis_", "previousTimestampMillis_", "count_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6133g> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6133g.class) {
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
    public String m22644T() {
        return this.name_;
    }
}
