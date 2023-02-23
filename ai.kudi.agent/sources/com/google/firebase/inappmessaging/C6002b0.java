package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: MessagesProto.java */
/* renamed from: com.google.firebase.inappmessaging.b0 */
/* loaded from: classes2.dex */
public final class C6002b0 extends AbstractC7141y<C6002b0, C6003a> implements Object {
    public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
    private static final C6002b0 DEFAULT_INSTANCE;
    private static volatile InterfaceC7007a1<C6002b0> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private String buttonHexColor_ = "";
    private C6135g0 text_;

    /* compiled from: MessagesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.b0$a */
    /* loaded from: classes2.dex */
    public static final class C6003a extends AbstractC7141y.AbstractC7142a<C6002b0, C6003a> implements Object {
        /* synthetic */ C6003a(C6417y c6417y) {
            this();
        }

        private C6003a() {
            super(C6002b0.DEFAULT_INSTANCE);
        }
    }

    static {
        C6002b0 c6002b0 = new C6002b0();
        DEFAULT_INSTANCE = c6002b0;
        AbstractC7141y.m19380P(C6002b0.class, c6002b0);
    }

    private C6002b0() {
    }

    /* renamed from: T */
    public static C6002b0 m23046T() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6417y.f15504a[enumC7147f.ordinal()]) {
            case 1:
                return new C6002b0();
            case 2:
                return new C6003a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002Ȉ", new Object[]{"text_", "buttonHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6002b0> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6002b0.class) {
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
    public String m23047S() {
        return this.buttonHexColor_;
    }

    /* renamed from: U */
    public C6135g0 m23045U() {
        C6135g0 c6135g0 = this.text_;
        return c6135g0 == null ? C6135g0.m22642S() : c6135g0;
    }

    /* renamed from: V */
    public boolean m23044V() {
        return this.text_ != null;
    }
}
