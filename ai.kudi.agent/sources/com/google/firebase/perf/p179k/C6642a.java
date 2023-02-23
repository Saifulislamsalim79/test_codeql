package com.google.firebase.perf.p179k;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: AndroidApplicationInfo.java */
/* renamed from: com.google.firebase.perf.k.a */
/* loaded from: classes2.dex */
public final class C6642a extends AbstractC7141y<C6642a, C6644b> implements Object {
    private static final C6642a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC7007a1<C6642a> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* compiled from: AndroidApplicationInfo.java */
    /* renamed from: com.google.firebase.perf.k.a$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6643a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16018a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f16018a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16018a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16018a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16018a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16018a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16018a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16018a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AndroidApplicationInfo.java */
    /* renamed from: com.google.firebase.perf.k.a$b */
    /* loaded from: classes2.dex */
    public static final class C6644b extends AbstractC7141y.AbstractC7142a<C6642a, C6644b> implements Object {
        /* synthetic */ C6644b(C6643a c6643a) {
            this();
        }

        /* renamed from: F */
        public C6644b m21377F(String str) {
            m19358z();
            ((C6642a) this.f17082d).m21380Z(str);
            return this;
        }

        /* renamed from: G */
        public C6644b m21376G(String str) {
            m19358z();
            ((C6642a) this.f17082d).m21379a0(str);
            return this;
        }

        /* renamed from: H */
        public C6644b m21375H(String str) {
            m19358z();
            ((C6642a) this.f17082d).m21378b0(str);
            return this;
        }

        private C6644b() {
            super(C6642a.DEFAULT_INSTANCE);
        }
    }

    static {
        C6642a c6642a = new C6642a();
        DEFAULT_INSTANCE = c6642a;
        AbstractC7141y.m19380P(C6642a.class, c6642a);
    }

    private C6642a() {
    }

    /* renamed from: V */
    public static C6642a m21384V() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Y */
    public static C6644b m21381Y() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public void m21380Z(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public void m21379a0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m21378b0(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6643a.f16018a[enumC7147f.ordinal()]) {
            case 1:
                return new C6642a();
            case 2:
                return new C6644b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6642a> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6642a.class) {
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

    /* renamed from: W */
    public boolean m21383W() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: X */
    public boolean m21382X() {
        return (this.bitField0_ & 2) != 0;
    }
}
