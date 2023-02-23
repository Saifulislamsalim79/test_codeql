package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: CommonTypesProto.java */
/* renamed from: com.google.firebase.inappmessaging.k */
/* loaded from: classes2.dex */
public final class C6359k extends AbstractC7141y<C6359k, C6360a> implements Object {
    private static final C6359k DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int FIAM_TRIGGER_FIELD_NUMBER = 1;
    private static volatile InterfaceC7007a1<C6359k> PARSER;
    private int conditionCase_ = 0;
    private Object condition_;

    /* compiled from: CommonTypesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.k$a */
    /* loaded from: classes2.dex */
    public static final class C6360a extends AbstractC7141y.AbstractC7142a<C6359k, C6360a> implements Object {
        /* synthetic */ C6360a(C6130f c6130f) {
            this();
        }

        private C6360a() {
            super(C6359k.DEFAULT_INSTANCE);
        }
    }

    static {
        C6359k c6359k = new C6359k();
        DEFAULT_INSTANCE = c6359k;
        AbstractC7141y.m19380P(C6359k.class, c6359k);
    }

    private C6359k() {
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6130f.f14968a[enumC7147f.ordinal()]) {
            case 1:
                return new C6359k();
            case 2:
                return new C6360a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002<\u0000", new Object[]{"condition_", "conditionCase_", C6133g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6359k> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6359k.class) {
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
    public C6133g m22209S() {
        if (this.conditionCase_ == 2) {
            return (C6133g) this.condition_;
        }
        return C6133g.m22645S();
    }

    /* renamed from: T */
    public EnumC6141i m22208T() {
        if (this.conditionCase_ == 1) {
            EnumC6141i m22634a = EnumC6141i.m22634a(((Integer) this.condition_).intValue());
            return m22634a == null ? EnumC6141i.UNRECOGNIZED : m22634a;
        }
        return EnumC6141i.UNKNOWN_TRIGGER;
    }
}
