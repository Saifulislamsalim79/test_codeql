package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: MessagesProto.java */
/* renamed from: com.google.firebase.inappmessaging.c0 */
/* loaded from: classes2.dex */
public final class C6005c0 extends AbstractC7141y<C6005c0, C6006a> implements Object {
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final C6005c0 DEFAULT_INSTANCE;
    public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile InterfaceC7007a1<C6005c0> PARSER = null;
    public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
    public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
    public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    private C6135g0 body_;
    private C6002b0 primaryActionButton_;
    private C6418z primaryAction_;
    private C6002b0 secondaryActionButton_;
    private C6418z secondaryAction_;
    private C6135g0 title_;
    private String portraitImageUrl_ = "";
    private String landscapeImageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* compiled from: MessagesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.c0$a */
    /* loaded from: classes2.dex */
    public static final class C6006a extends AbstractC7141y.AbstractC7142a<C6005c0, C6006a> implements Object {
        /* synthetic */ C6006a(C6417y c6417y) {
            this();
        }

        private C6006a() {
            super(C6005c0.DEFAULT_INSTANCE);
        }
    }

    static {
        C6005c0 c6005c0 = new C6005c0();
        DEFAULT_INSTANCE = c6005c0;
        AbstractC7141y.m19380P(C6005c0.class, c6005c0);
    }

    private C6005c0() {
    }

    /* renamed from: U */
    public static C6005c0 m23040U() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6417y.f15504a[enumC7147f.ordinal()]) {
            case 1:
                return new C6005c0();
            case 2:
                return new C6006a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\t\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\t\u0007\t\b\t\t\t", new Object[]{"title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6005c0> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6005c0.class) {
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
    public String m23042S() {
        return this.backgroundHexColor_;
    }

    /* renamed from: T */
    public C6135g0 m23041T() {
        C6135g0 c6135g0 = this.body_;
        return c6135g0 == null ? C6135g0.m22642S() : c6135g0;
    }

    /* renamed from: V */
    public String m23039V() {
        return this.landscapeImageUrl_;
    }

    /* renamed from: W */
    public String m23038W() {
        return this.portraitImageUrl_;
    }

    /* renamed from: X */
    public C6418z m23037X() {
        C6418z c6418z = this.primaryAction_;
        return c6418z == null ? C6418z.m22079T() : c6418z;
    }

    /* renamed from: Y */
    public C6002b0 m23036Y() {
        C6002b0 c6002b0 = this.primaryActionButton_;
        return c6002b0 == null ? C6002b0.m23046T() : c6002b0;
    }

    /* renamed from: Z */
    public C6418z m23035Z() {
        C6418z c6418z = this.secondaryAction_;
        return c6418z == null ? C6418z.m22079T() : c6418z;
    }

    /* renamed from: a0 */
    public C6002b0 m23034a0() {
        C6002b0 c6002b0 = this.secondaryActionButton_;
        return c6002b0 == null ? C6002b0.m23046T() : c6002b0;
    }

    /* renamed from: b0 */
    public C6135g0 m23033b0() {
        C6135g0 c6135g0 = this.title_;
        return c6135g0 == null ? C6135g0.m22642S() : c6135g0;
    }

    /* renamed from: c0 */
    public boolean m23032c0() {
        return this.body_ != null;
    }

    /* renamed from: d0 */
    public boolean m23031d0() {
        return this.primaryAction_ != null;
    }

    /* renamed from: e0 */
    public boolean m23030e0() {
        return this.primaryActionButton_ != null;
    }

    /* renamed from: f0 */
    public boolean m23029f0() {
        return this.secondaryAction_ != null;
    }

    /* renamed from: g0 */
    public boolean m23028g0() {
        return this.secondaryActionButton_ != null;
    }

    /* renamed from: h0 */
    public boolean m23027h0() {
        return this.title_ != null;
    }
}
