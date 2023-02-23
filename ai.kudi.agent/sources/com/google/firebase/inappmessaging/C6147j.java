package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: CommonTypesProto.java */
/* renamed from: com.google.firebase.inappmessaging.j */
/* loaded from: classes2.dex */
public final class C6147j extends AbstractC7141y<C6147j, C6148a> implements Object {
    private static final C6147j DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 5;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 4;
    public static final int INT_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC7007a1<C6147j> PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 2;
    private double doubleValue_;
    private float floatValue_;
    private long intValue_;
    private String name_ = "";
    private String stringValue_ = "";

    /* compiled from: CommonTypesProto.java */
    /* renamed from: com.google.firebase.inappmessaging.j$a */
    /* loaded from: classes2.dex */
    public static final class C6148a extends AbstractC7141y.AbstractC7142a<C6147j, C6148a> implements Object {
        /* synthetic */ C6148a(C6130f c6130f) {
            this();
        }

        private C6148a() {
            super(C6147j.DEFAULT_INSTANCE);
        }
    }

    static {
        C6147j c6147j = new C6147j();
        DEFAULT_INSTANCE = c6147j;
        AbstractC7141y.m19380P(C6147j.class, c6147j);
    }

    private C6147j() {
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6130f.f14968a[enumC7147f.ordinal()]) {
            case 1:
                return new C6147j();
            case 2:
                return new C6148a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0001\u0005\u0000", new Object[]{"name_", "stringValue_", "intValue_", "floatValue_", "doubleValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6147j> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6147j.class) {
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
