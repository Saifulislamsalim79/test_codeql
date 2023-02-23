package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: MessagesProto.java */
/* renamed from: com.google.firebase.inappmessaging.a0 */
/* loaded from: classes2.dex */
public final class C5999a0 extends AbstractC7141y<C5999a0, C6000a> implements Object {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final C5999a0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile InterfaceC7007a1<C5999a0> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private C6418z action_;
    private C6135g0 body_;
    private C6135g0 title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* compiled from: MessagesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.a0$a */
    /* loaded from: classes2.dex */
    public static final class C6000a extends AbstractC7141y.AbstractC7142a<C5999a0, C6000a> implements Object {
        /* synthetic */ C6000a(C6417y c6417y) {
            this();
        }

        private C6000a() {
            super(C5999a0.DEFAULT_INSTANCE);
        }
    }

    static {
        C5999a0 c5999a0 = new C5999a0();
        DEFAULT_INSTANCE = c5999a0;
        AbstractC7141y.m19380P(C5999a0.class, c5999a0);
    }

    private C5999a0() {
    }

    /* renamed from: V */
    public static C5999a0 m23054V() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6417y.f15504a[enumC7147f.ordinal()]) {
            case 1:
                return new C5999a0();
            case 2:
                return new C6000a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t\u0005Ȉ", new Object[]{"title_", "body_", "imageUrl_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C5999a0> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C5999a0.class) {
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
    public C6418z m23057S() {
        C6418z c6418z = this.action_;
        return c6418z == null ? C6418z.m22079T() : c6418z;
    }

    /* renamed from: T */
    public String m23056T() {
        return this.backgroundHexColor_;
    }

    /* renamed from: U */
    public C6135g0 m23055U() {
        C6135g0 c6135g0 = this.body_;
        return c6135g0 == null ? C6135g0.m22642S() : c6135g0;
    }

    /* renamed from: W */
    public String m23053W() {
        return this.imageUrl_;
    }

    /* renamed from: X */
    public C6135g0 m23052X() {
        C6135g0 c6135g0 = this.title_;
        return c6135g0 == null ? C6135g0.m22642S() : c6135g0;
    }

    /* renamed from: Y */
    public boolean m23051Y() {
        return this.action_ != null;
    }

    /* renamed from: Z */
    public boolean m23050Z() {
        return this.body_ != null;
    }

    /* renamed from: a0 */
    public boolean m23049a0() {
        return this.title_ != null;
    }
}
