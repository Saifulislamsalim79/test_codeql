package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: ExperimentPayloadProto.java */
/* renamed from: com.google.firebase.inappmessaging.o */
/* loaded from: classes2.dex */
public final class C6402o extends AbstractC7141y<C6402o, C6403a> implements Object {
    private static final C6402o DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC7007a1<C6402o> PARSER;
    private String experimentId_ = "";

    /* compiled from: ExperimentPayloadProto.java */
    /* renamed from: com.google.firebase.inappmessaging.o$a */
    /* loaded from: classes2.dex */
    public static final class C6403a extends AbstractC7141y.AbstractC7142a<C6402o, C6403a> implements Object {
        /* synthetic */ C6403a(C6401n c6401n) {
            this();
        }

        private C6403a() {
            super(C6402o.DEFAULT_INSTANCE);
        }
    }

    static {
        C6402o c6402o = new C6402o();
        DEFAULT_INSTANCE = c6402o;
        AbstractC7141y.m19380P(C6402o.class, c6402o);
    }

    private C6402o() {
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6401n.f15476a[enumC7147f.ordinal()]) {
            case 1:
                return new C6402o();
            case 2:
                return new C6403a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6402o> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6402o.class) {
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
