package com.google.firebase.perf.p179k;

import com.google.firebase.perf.p179k.C6642a;
import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C7064k0;
import com.google.protobuf.C7076l0;
import com.google.protobuf.C7118t1;
import com.google.protobuf.InterfaceC7007a1;
import java.util.Map;
/* compiled from: ApplicationInfo.java */
/* renamed from: com.google.firebase.perf.k.c */
/* loaded from: classes2.dex */
public final class C6648c extends AbstractC7141y<C6648c, C6650b> implements Object {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final C6648c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC7007a1<C6648c> PARSER;
    private C6642a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private C7076l0<String, String> customAttributes_ = C7076l0.m19831e();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* compiled from: ApplicationInfo.java */
    /* renamed from: com.google.firebase.perf.k.c$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6649a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16020a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f16020a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16020a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16020a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16020a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16020a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16020a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16020a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: ApplicationInfo.java */
    /* renamed from: com.google.firebase.perf.k.c$b */
    /* loaded from: classes2.dex */
    public static final class C6650b extends AbstractC7141y.AbstractC7142a<C6648c, C6650b> implements Object {
        /* synthetic */ C6650b(C6649a c6649a) {
            this();
        }

        /* renamed from: F */
        public boolean m21347F() {
            return ((C6648c) this.f17082d).m21356b0();
        }

        /* renamed from: G */
        public C6650b m21346G(Map<String, String> map) {
            m19358z();
            ((C6648c) this.f17082d).m21358Z().putAll(map);
            return this;
        }

        /* renamed from: H */
        public C6650b m21345H(C6642a.C6644b c6644b) {
            m19358z();
            ((C6648c) this.f17082d).m21351g0(c6644b.build());
            return this;
        }

        /* renamed from: I */
        public C6650b m21344I(String str) {
            m19358z();
            ((C6648c) this.f17082d).m21350h0(str);
            return this;
        }

        /* renamed from: K */
        public C6650b m21343K(EnumC6652d enumC6652d) {
            m19358z();
            ((C6648c) this.f17082d).m21349i0(enumC6652d);
            return this;
        }

        /* renamed from: L */
        public C6650b m21342L(String str) {
            m19358z();
            ((C6648c) this.f17082d).m21348j0(str);
            return this;
        }

        private C6650b() {
            super(C6648c.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: ApplicationInfo.java */
    /* renamed from: com.google.firebase.perf.k.c$c */
    /* loaded from: classes2.dex */
    private static final class C6651c {

        /* renamed from: a */
        static final C7064k0<String, String> f16021a;

        static {
            C7118t1.EnumC7120b enumC7120b = C7118t1.EnumC7120b.f16951C;
            f16021a = C7064k0.m19868d(enumC7120b, "", enumC7120b, "");
        }
    }

    static {
        C6648c c6648c = new C6648c();
        DEFAULT_INSTANCE = c6648c;
        AbstractC7141y.m19380P(C6648c.class, c6648c);
    }

    private C6648c() {
    }

    /* renamed from: Y */
    public static C6648c m21359Y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public Map<String, String> m21358Z() {
        return m21353e0();
    }

    /* renamed from: e0 */
    private C7076l0<String, String> m21353e0() {
        if (!this.customAttributes_.m19827j()) {
            this.customAttributes_ = this.customAttributes_.m19824n();
        }
        return this.customAttributes_;
    }

    /* renamed from: f0 */
    public static C6650b m21352f0() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public void m21351g0(C6642a c6642a) {
        c6642a.getClass();
        this.androidAppInfo_ = c6642a;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void m21350h0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public void m21349i0(EnumC6652d enumC6652d) {
        this.applicationProcessState_ = enumC6652d.mo20225d();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public void m21348j0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6649a.f16020a[enumC7147f.ordinal()]) {
            case 1:
                return new C6648c();
            case 2:
                return new C6650b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", EnumC6652d.m21340b(), "customAttributes_", C6651c.f16021a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6648c> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6648c.class) {
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

    /* renamed from: X */
    public C6642a m21360X() {
        C6642a c6642a = this.androidAppInfo_;
        return c6642a == null ? C6642a.m21384V() : c6642a;
    }

    /* renamed from: a0 */
    public boolean m21357a0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: b0 */
    public boolean m21356b0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: c0 */
    public boolean m21355c0() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: d0 */
    public boolean m21354d0() {
        return (this.bitField0_ & 1) != 0;
    }
}
