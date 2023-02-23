package p272h.p286c.p355d.p356a.p357a.p358a;

import com.google.firebase.inappmessaging.C6010d0;
import com.google.firebase.inappmessaging.C6137h;
import com.google.firebase.inappmessaging.C6359k;
import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C6997a0;
import com.google.protobuf.C7064k0;
import com.google.protobuf.C7076l0;
import com.google.protobuf.C7118t1;
import com.google.protobuf.InterfaceC7007a1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: CampaignProto.java */
/* renamed from: h.c.d.a.a.a.c */
/* loaded from: classes2.dex */
public final class C9370c extends AbstractC7141y<C9370c, C9371a> implements Object {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
    private static final C9370c DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
    private static volatile InterfaceC7007a1<C9370c> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
    public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
    private C6010d0 content_;
    private boolean isTestCampaign_;
    private Object payload_;
    private C6137h priority_;
    private int payloadCase_ = 0;
    private C7076l0<String, String> dataBundle_ = C7076l0.m19831e();
    private C6997a0.InterfaceC7006i<C6359k> triggeringConditions_ = AbstractC7141y.m19392D();

    /* compiled from: CampaignProto.java */
    /* renamed from: h.c.d.a.a.a.c$a */
    /* loaded from: classes2.dex */
    public static final class C9371a extends AbstractC7141y.AbstractC7142a<C9370c, C9371a> implements Object {
        /* synthetic */ C9371a(C9367a c9367a) {
            this();
        }

        private C9371a() {
            super(C9370c.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: CampaignProto.java */
    /* renamed from: h.c.d.a.a.a.c$b */
    /* loaded from: classes2.dex */
    private static final class C9372b {

        /* renamed from: a */
        static final C7064k0<String, String> f21991a;

        static {
            C7118t1.EnumC7120b enumC7120b = C7118t1.EnumC7120b.f16951C;
            f21991a = C7064k0.m19868d(enumC7120b, "", enumC7120b, "");
        }
    }

    /* compiled from: CampaignProto.java */
    /* renamed from: h.c.d.a.a.a.c$c */
    /* loaded from: classes2.dex */
    public enum EnumC9373c {
        VANILLA_PAYLOAD(1),
        EXPERIMENTAL_PAYLOAD(2),
        PAYLOAD_NOT_SET(0);

        EnumC9373c(int i) {
        }

        /* renamed from: a */
        public static EnumC9373c m14927a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return EXPERIMENTAL_PAYLOAD;
                }
                return VANILLA_PAYLOAD;
            }
            return PAYLOAD_NOT_SET;
        }
    }

    static {
        C9370c c9370c = new C9370c();
        DEFAULT_INSTANCE = c9370c;
        AbstractC7141y.m19380P(C9370c.class, c9370c);
    }

    private C9370c() {
    }

    /* renamed from: a0 */
    private C7076l0<String, String> m14928a0() {
        return this.dataBundle_;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C9367a.f21990a[enumC7147f.ordinal()]) {
            case 1:
                return new C9370c();
            case 2:
                return new C9371a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003\t\u0004\t\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", C9374d.class, C9368b.class, "content_", "priority_", "triggeringConditions_", C6359k.class, "isTestCampaign_", "dataBundle_", C9372b.f21991a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C9370c> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C9370c.class) {
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
    public C6010d0 m14936S() {
        C6010d0 c6010d0 = this.content_;
        return c6010d0 == null ? C6010d0.m22997U() : c6010d0;
    }

    /* renamed from: T */
    public Map<String, String> m14935T() {
        return Collections.unmodifiableMap(m14928a0());
    }

    /* renamed from: U */
    public C9368b m14934U() {
        if (this.payloadCase_ == 2) {
            return (C9368b) this.payload_;
        }
        return C9368b.m14939W();
    }

    /* renamed from: V */
    public boolean m14933V() {
        return this.isTestCampaign_;
    }

    /* renamed from: W */
    public EnumC9373c m14932W() {
        return EnumC9373c.m14927a(this.payloadCase_);
    }

    /* renamed from: X */
    public C6137h m14931X() {
        C6137h c6137h = this.priority_;
        return c6137h == null ? C6137h.m22638S() : c6137h;
    }

    /* renamed from: Y */
    public List<C6359k> m14930Y() {
        return this.triggeringConditions_;
    }

    /* renamed from: Z */
    public C9374d m14929Z() {
        if (this.payloadCase_ == 1) {
            return (C9374d) this.payload_;
        }
        return C9374d.m14921W();
    }
}
