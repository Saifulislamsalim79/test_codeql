package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: MessagesProto.java */
/* renamed from: com.google.firebase.inappmessaging.d0 */
/* loaded from: classes2.dex */
public final class C6010d0 extends AbstractC7141y<C6010d0, C6011a> implements Object {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CARD_FIELD_NUMBER = 4;
    private static final C6010d0 DEFAULT_INSTANCE;
    public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
    public static final int MODAL_FIELD_NUMBER = 2;
    private static volatile InterfaceC7007a1<C6010d0> PARSER;
    private int messageDetailsCase_ = 0;
    private Object messageDetails_;

    /* compiled from: MessagesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.d0$a */
    /* loaded from: classes2.dex */
    public static final class C6011a extends AbstractC7141y.AbstractC7142a<C6010d0, C6011a> implements Object {
        /* synthetic */ C6011a(C6417y c6417y) {
            this();
        }

        private C6011a() {
            super(C6010d0.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: MessagesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.d0$b */
    /* loaded from: classes2.dex */
    public enum EnumC6012b {
        BANNER(1),
        MODAL(2),
        IMAGE_ONLY(3),
        CARD(4),
        MESSAGEDETAILS_NOT_SET(0);

        EnumC6012b(int i) {
        }

        /* renamed from: a */
        public static EnumC6012b m22993a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return CARD;
                        }
                        return IMAGE_ONLY;
                    }
                    return MODAL;
                }
                return BANNER;
            }
            return MESSAGEDETAILS_NOT_SET;
        }
    }

    static {
        C6010d0 c6010d0 = new C6010d0();
        DEFAULT_INSTANCE = c6010d0;
        AbstractC7141y.m19380P(C6010d0.class, c6010d0);
    }

    private C6010d0() {
    }

    /* renamed from: U */
    public static C6010d0 m22997U() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6417y.f15504a[enumC7147f.ordinal()]) {
            case 1:
                return new C6010d0();
            case 2:
                return new C6011a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", C5999a0.class, C6131f0.class, C6128e0.class, C6005c0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6010d0> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6010d0.class) {
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
    public C5999a0 m22999S() {
        if (this.messageDetailsCase_ == 1) {
            return (C5999a0) this.messageDetails_;
        }
        return C5999a0.m23054V();
    }

    /* renamed from: T */
    public C6005c0 m22998T() {
        if (this.messageDetailsCase_ == 4) {
            return (C6005c0) this.messageDetails_;
        }
        return C6005c0.m23040U();
    }

    /* renamed from: V */
    public C6128e0 m22996V() {
        if (this.messageDetailsCase_ == 3) {
            return (C6128e0) this.messageDetails_;
        }
        return C6128e0.m22660T();
    }

    /* renamed from: W */
    public EnumC6012b m22995W() {
        return EnumC6012b.m22993a(this.messageDetailsCase_);
    }

    /* renamed from: X */
    public C6131f0 m22994X() {
        if (this.messageDetailsCase_ == 2) {
            return (C6131f0) this.messageDetails_;
        }
        return C6131f0.m22652W();
    }
}
