package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: MessagesProto.java */
/* renamed from: com.google.firebase.inappmessaging.f0 */
/* loaded from: classes2.dex */
public final class C6131f0 extends AbstractC7141y<C6131f0, C6132a> implements Object {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final C6131f0 DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile InterfaceC7007a1<C6131f0> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private C6002b0 actionButton_;
    private C6418z action_;
    private C6135g0 body_;
    private C6135g0 title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* compiled from: MessagesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.f0$a */
    /* loaded from: classes2.dex */
    public static final class C6132a extends AbstractC7141y.AbstractC7142a<C6131f0, C6132a> implements Object {
        /* synthetic */ C6132a(C6417y c6417y) {
            this();
        }

        private C6132a() {
            super(C6131f0.DEFAULT_INSTANCE);
        }
    }

    static {
        C6131f0 c6131f0 = new C6131f0();
        DEFAULT_INSTANCE = c6131f0;
        AbstractC7141y.m19380P(C6131f0.class, c6131f0);
    }

    private C6131f0() {
    }

    /* renamed from: W */
    public static C6131f0 m22652W() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6417y.f15504a[enumC7147f.ordinal()]) {
            case 1:
                return new C6131f0();
            case 2:
                return new C6132a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004\t\u0005\t\u0006Ȉ", new Object[]{"title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6131f0> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6131f0.class) {
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
    public C6418z m22656S() {
        C6418z c6418z = this.action_;
        return c6418z == null ? C6418z.m22079T() : c6418z;
    }

    /* renamed from: T */
    public C6002b0 m22655T() {
        C6002b0 c6002b0 = this.actionButton_;
        return c6002b0 == null ? C6002b0.m23046T() : c6002b0;
    }

    /* renamed from: U */
    public String m22654U() {
        return this.backgroundHexColor_;
    }

    /* renamed from: V */
    public C6135g0 m22653V() {
        C6135g0 c6135g0 = this.body_;
        return c6135g0 == null ? C6135g0.m22642S() : c6135g0;
    }

    /* renamed from: X */
    public String m22651X() {
        return this.imageUrl_;
    }

    /* renamed from: Y */
    public C6135g0 m22650Y() {
        C6135g0 c6135g0 = this.title_;
        return c6135g0 == null ? C6135g0.m22642S() : c6135g0;
    }

    /* renamed from: Z */
    public boolean m22649Z() {
        return this.action_ != null;
    }

    /* renamed from: a0 */
    public boolean m22648a0() {
        return this.body_ != null;
    }

    /* renamed from: b0 */
    public boolean m22647b0() {
        return this.title_ != null;
    }
}
