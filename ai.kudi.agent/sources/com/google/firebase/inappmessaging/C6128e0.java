package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: MessagesProto.java */
/* renamed from: com.google.firebase.inappmessaging.e0 */
/* loaded from: classes2.dex */
public final class C6128e0 extends AbstractC7141y<C6128e0, C6129a> implements Object {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final C6128e0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile InterfaceC7007a1<C6128e0> PARSER;
    private C6418z action_;
    private String imageUrl_ = "";

    /* compiled from: MessagesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.e0$a */
    /* loaded from: classes2.dex */
    public static final class C6129a extends AbstractC7141y.AbstractC7142a<C6128e0, C6129a> implements Object {
        /* synthetic */ C6129a(C6417y c6417y) {
            this();
        }

        private C6129a() {
            super(C6128e0.DEFAULT_INSTANCE);
        }
    }

    static {
        C6128e0 c6128e0 = new C6128e0();
        DEFAULT_INSTANCE = c6128e0;
        AbstractC7141y.m19380P(C6128e0.class, c6128e0);
    }

    private C6128e0() {
    }

    /* renamed from: T */
    public static C6128e0 m22660T() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6417y.f15504a[enumC7147f.ordinal()]) {
            case 1:
                return new C6128e0();
            case 2:
                return new C6129a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"imageUrl_", "action_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6128e0> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6128e0.class) {
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
    public C6418z m22661S() {
        C6418z c6418z = this.action_;
        return c6418z == null ? C6418z.m22079T() : c6418z;
    }

    /* renamed from: U */
    public String m22659U() {
        return this.imageUrl_;
    }

    /* renamed from: V */
    public boolean m22658V() {
        return this.action_ != null;
    }
}
