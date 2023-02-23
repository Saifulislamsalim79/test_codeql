package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: MessagesProto.java */
/* renamed from: com.google.firebase.inappmessaging.g0 */
/* loaded from: classes2.dex */
public final class C6135g0 extends AbstractC7141y<C6135g0, C6136a> implements Object {
    private static final C6135g0 DEFAULT_INSTANCE;
    public static final int HEX_COLOR_FIELD_NUMBER = 2;
    private static volatile InterfaceC7007a1<C6135g0> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String text_ = "";
    private String hexColor_ = "";

    /* compiled from: MessagesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.g0$a */
    /* loaded from: classes2.dex */
    public static final class C6136a extends AbstractC7141y.AbstractC7142a<C6135g0, C6136a> implements Object {
        /* synthetic */ C6136a(C6417y c6417y) {
            this();
        }

        private C6136a() {
            super(C6135g0.DEFAULT_INSTANCE);
        }
    }

    static {
        C6135g0 c6135g0 = new C6135g0();
        DEFAULT_INSTANCE = c6135g0;
        AbstractC7141y.m19380P(C6135g0.class, c6135g0);
    }

    private C6135g0() {
    }

    /* renamed from: S */
    public static C6135g0 m22642S() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6417y.f15504a[enumC7147f.ordinal()]) {
            case 1:
                return new C6135g0();
            case 2:
                return new C6136a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"text_", "hexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6135g0> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6135g0.class) {
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
    public String m22641T() {
        return this.hexColor_;
    }

    /* renamed from: U */
    public String m22640U() {
        return this.text_;
    }
}
