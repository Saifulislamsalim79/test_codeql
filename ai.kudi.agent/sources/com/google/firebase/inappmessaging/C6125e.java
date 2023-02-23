package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: ClientAppInfo.java */
/* renamed from: com.google.firebase.inappmessaging.e */
/* loaded from: classes2.dex */
public final class C6125e extends AbstractC7141y<C6125e, C6127b> implements Object {
    private static final C6125e DEFAULT_INSTANCE;
    public static final int FIREBASE_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC7007a1<C6125e> PARSER;
    private int bitField0_;
    private String googleAppId_ = "";
    private String firebaseInstanceId_ = "";

    /* compiled from: ClientAppInfo.java */
    /* renamed from: com.google.firebase.inappmessaging.e$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C6126a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14967a;

        static {
            int[] iArr = new int[AbstractC7141y.EnumC7147f.values().length];
            f14967a = iArr;
            try {
                iArr[AbstractC7141y.EnumC7147f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14967a[AbstractC7141y.EnumC7147f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14967a[AbstractC7141y.EnumC7147f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14967a[AbstractC7141y.EnumC7147f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14967a[AbstractC7141y.EnumC7147f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14967a[AbstractC7141y.EnumC7147f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14967a[AbstractC7141y.EnumC7147f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: ClientAppInfo.java */
    /* renamed from: com.google.firebase.inappmessaging.e$b */
    /* loaded from: classes2.dex */
    public static final class C6127b extends AbstractC7141y.AbstractC7142a<C6125e, C6127b> implements Object {
        /* synthetic */ C6127b(C6126a c6126a) {
            this();
        }

        /* renamed from: F */
        public C6127b m22664F(String str) {
            m19358z();
            ((C6125e) this.f17082d).m22666V(str);
            return this;
        }

        /* renamed from: G */
        public C6127b m22663G(String str) {
            m19358z();
            ((C6125e) this.f17082d).m22665W(str);
            return this;
        }

        private C6127b() {
            super(C6125e.DEFAULT_INSTANCE);
        }
    }

    static {
        C6125e c6125e = new C6125e();
        DEFAULT_INSTANCE = c6125e;
        AbstractC7141y.m19380P(C6125e.class, c6125e);
    }

    private C6125e() {
    }

    /* renamed from: U */
    public static C6127b m22667U() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m22666V(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.firebaseInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m22665W(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6126a.f14967a[enumC7147f.ordinal()]) {
            case 1:
                return new C6125e();
            case 2:
                return new C6127b(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "googleAppId_", "firebaseInstanceId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6125e> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6125e.class) {
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
}
