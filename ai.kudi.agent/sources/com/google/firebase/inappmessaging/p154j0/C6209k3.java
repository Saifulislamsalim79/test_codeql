package com.google.firebase.inappmessaging.p154j0;

import com.google.protobuf.AbstractC7141y;
import com.google.protobuf.InterfaceC7007a1;
/* compiled from: RateLimitProto.java */
/* renamed from: com.google.firebase.inappmessaging.j0.k3 */
/* loaded from: classes2.dex */
public final class C6209k3 extends AbstractC7141y<C6209k3, C6210a> implements Object {
    private static final C6209k3 DEFAULT_INSTANCE;
    private static volatile InterfaceC7007a1<C6209k3> PARSER = null;
    public static final int START_TIME_EPOCH_FIELD_NUMBER = 2;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long startTimeEpoch_;
    private long value_;

    /* compiled from: RateLimitProto.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.k3$a */
    /* loaded from: classes2.dex */
    public static final class C6210a extends AbstractC7141y.AbstractC7142a<C6209k3, C6210a> implements Object {
        /* synthetic */ C6210a(C6204j3 c6204j3) {
            this();
        }

        /* renamed from: F */
        public C6210a m22556F() {
            m19358z();
            ((C6209k3) this.f17082d).m22564V();
            return this;
        }

        /* renamed from: G */
        public C6210a m22555G(long j) {
            m19358z();
            ((C6209k3) this.f17082d).m22558b0(j);
            return this;
        }

        /* renamed from: H */
        public C6210a m22554H(long j) {
            m19358z();
            ((C6209k3) this.f17082d).m22557c0(j);
            return this;
        }

        private C6210a() {
            super(C6209k3.DEFAULT_INSTANCE);
        }
    }

    static {
        C6209k3 c6209k3 = new C6209k3();
        DEFAULT_INSTANCE = c6209k3;
        AbstractC7141y.m19380P(C6209k3.class, c6209k3);
    }

    private C6209k3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m22564V() {
        this.value_ = 0L;
    }

    /* renamed from: W */
    public static C6209k3 m22563W() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Z */
    public static C6210a m22560Z() {
        return DEFAULT_INSTANCE.m19372x();
    }

    /* renamed from: a0 */
    public static C6210a m22559a0(C6209k3 c6209k3) {
        return DEFAULT_INSTANCE.m19371y(c6209k3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m22558b0(long j) {
        this.startTimeEpoch_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public void m22557c0(long j) {
        this.value_ = j;
    }

    @Override // com.google.protobuf.AbstractC7141y
    /* renamed from: B */
    protected final Object mo14874B(AbstractC7141y.EnumC7147f enumC7147f, Object obj, Object obj2) {
        switch (C6204j3.f15074a[enumC7147f.ordinal()]) {
            case 1:
                return new C6209k3();
            case 2:
                return new C6210a(null);
            case 3:
                return AbstractC7141y.m19383M(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"value_", "startTimeEpoch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC7007a1<C6209k3> interfaceC7007a1 = PARSER;
                if (interfaceC7007a1 == null) {
                    synchronized (C6209k3.class) {
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
    public long m22562X() {
        return this.startTimeEpoch_;
    }

    /* renamed from: Y */
    public long m22561Y() {
        return this.value_;
    }
}
