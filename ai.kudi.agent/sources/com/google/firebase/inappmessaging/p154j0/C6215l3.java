package com.google.firebase.inappmessaging.p154j0;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.C7064k0;
import com.google.protobuf.C7076l0;
import com.google.protobuf.C7118t1;
import com.google.protobuf.InterfaceC7007a1;
import java.util.Map;
/* compiled from: RateLimitProto.java */
/* renamed from: com.google.firebase.inappmessaging.j0.l3 */
/* loaded from: classes2.dex */
public final class C6215l3 extends AbstractC7141y<C6215l3, C6216a> implements Object {
    private static final C6215l3 DEFAULT_INSTANCE;
    public static final int LIMITS_FIELD_NUMBER = 1;
    private static volatile InterfaceC7007a1<C6215l3> PARSER;
    private C7076l0<String, C6209k3> limits_ = C7076l0.m19831e();

    /* compiled from: RateLimitProto.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.l3$a */
    /* loaded from: classes2.dex */
    public static final class C6216a extends AbstractC7141y.AbstractC7142a<C6215l3, C6216a> implements Object {
        /* synthetic */ C6216a(C6204j3 c6204j3) {
            this();
        }

        /* renamed from: F */
        public C6216a m22542F(String str, C6209k3 c6209k3) {
            str.getClass();
            c6209k3.getClass();
            m19358z();
            ((C6215l3) this.f17082d).m22547V().put(str, c6209k3);
            return this;
        }

        private C6216a() {
            super(C6215l3.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: RateLimitProto.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.l3$b */
    /* loaded from: classes2.dex */
    private static final class C6217b {

        /* renamed from: a */
        static final C7064k0<String, C6209k3> f15095a = C7064k0.m19868d(C7118t1.EnumC7120b.f16951C, "", C7118t1.EnumC7120b.f16953E, C6209k3.m22563W());
    }

    static {
        C6215l3 c6215l3 = new C6215l3();
        DEFAULT_INSTANCE = c6215l3;
        AbstractC7141y.m19380P(C6215l3.class, c6215l3);
    }

    private C6215l3() {
    }

    /* renamed from: T */
    public static C6215l3 m22549T() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public Map<String, C6209k3> m22547V() {
        return m22545X();
    }

    /* renamed from: W */
    private C7076l0<String, C6209k3> m22546W() {
        return this.limits_;
    }

    /* renamed from: X */
    private C7076l0<String, C6209k3> m22545X() {
        if (!this.limits_.m19827j()) {
            this.limits_ = this.limits_.m19824n();
        }
        return this.limits_;
    }

    /* renamed from: Y */
    public static C6216a m22544Y(C6215l3 c6215l3) {
        return DEFAULT_INSTANCE.m19371y(c6215l3);
    }

    /* renamed from: Z */
    public static InterfaceC7007a1<C6215l3> m22543Z() {
        return DEFAULT_INSTANCE.mo19377g();
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6204j3.f15074a[enumC7147f.ordinal()]) {
            case 1:
                return new C6215l3();
            case 2:
                return new C6216a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"limits_", C6217b.f15095a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6215l3> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6215l3.class) {
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

    /* renamed from: U */
    public C6209k3 m22548U(String str, C6209k3 c6209k3) {
        str.getClass();
        C7076l0<String, C6209k3> m22546W = m22546W();
        return m22546W.containsKey(str) ? m22546W.get(str) : c6209k3;
    }
}
