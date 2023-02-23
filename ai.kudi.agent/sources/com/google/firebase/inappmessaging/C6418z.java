package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: MessagesProto.java */
/* renamed from: com.google.firebase.inappmessaging.z */
/* loaded from: classes2.dex */
public final class C6418z extends AbstractC7141y<C6418z, C6419a> implements Object {
    public static final int ACTION_URL_FIELD_NUMBER = 1;
    private static final C6418z DEFAULT_INSTANCE;
    private static volatile InterfaceC7007a1<C6418z> PARSER;
    private String actionUrl_ = "";

    /* compiled from: MessagesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.z$a */
    /* loaded from: classes2.dex */
    public static final class C6419a extends AbstractC7141y.AbstractC7142a<C6418z, C6419a> implements Object {
        /* synthetic */ C6419a(C6417y c6417y) {
            this();
        }

        private C6419a() {
            super(C6418z.DEFAULT_INSTANCE);
        }
    }

    static {
        C6418z c6418z = new C6418z();
        DEFAULT_INSTANCE = c6418z;
        AbstractC7141y.m19380P(C6418z.class, c6418z);
    }

    private C6418z() {
    }

    /* renamed from: T */
    public static C6418z m22079T() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6417y.f15504a[enumC7147f.ordinal()]) {
            case 1:
                return new C6418z();
            case 2:
                return new C6419a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"actionUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6418z> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6418z.class) {
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
    public String m22080S() {
        return this.actionUrl_;
    }
}
