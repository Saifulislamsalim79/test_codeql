package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: CommonTypesProto.java */
/* renamed from: com.google.firebase.inappmessaging.h */
/* loaded from: classes2.dex */
public final class C6137h extends AbstractC7141y<C6137h, C6138a> implements Object {
    private static final C6137h DEFAULT_INSTANCE;
    private static volatile InterfaceC7007a1<C6137h> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    /* compiled from: CommonTypesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.h$a */
    /* loaded from: classes2.dex */
    public static final class C6138a extends AbstractC7141y.AbstractC7142a<C6137h, C6138a> implements Object {
        /* synthetic */ C6138a(C6130f c6130f) {
            this();
        }

        private C6138a() {
            super(C6137h.DEFAULT_INSTANCE);
        }
    }

    static {
        C6137h c6137h = new C6137h();
        DEFAULT_INSTANCE = c6137h;
        AbstractC7141y.m19380P(C6137h.class, c6137h);
    }

    private C6137h() {
    }

    /* renamed from: S */
    public static C6137h m22638S() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6130f.f14968a[enumC7147f.ordinal()]) {
            case 1:
                return new C6137h();
            case 2:
                return new C6138a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6137h> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6137h.class) {
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
    public int m22637T() {
        return this.value_;
    }
}
