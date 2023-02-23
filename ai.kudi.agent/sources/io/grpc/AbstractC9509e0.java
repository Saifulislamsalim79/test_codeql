package io.grpc;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.common.base.C5051n;
import io.grpc.AbstractC10020n0;
import io.grpc.C9477a;
/* compiled from: InternalConfigSelector.java */
/* renamed from: io.grpc.e0 */
/* loaded from: classes2.dex */
public abstract class AbstractC9509e0 {

    /* renamed from: a */
    public static final C9477a.C9480c<AbstractC9509e0> f22251a = C9477a.C9480c.m14623a("io.grpc.config-selector");

    /* compiled from: InternalConfigSelector.java */
    /* renamed from: io.grpc.e0$b */
    /* loaded from: classes2.dex */
    public static final class C9511b {

        /* renamed from: a */
        private final C9497c1 f22252a;

        /* renamed from: b */
        private final Object f22253b;

        /* renamed from: c */
        public InterfaceC9896i f22254c;

        /* compiled from: InternalConfigSelector.java */
        /* renamed from: io.grpc.e0$b$a */
        /* loaded from: classes2.dex */
        public static final class C9512a {

            /* renamed from: a */
            private Object f22255a;

            /* renamed from: b */
            private InterfaceC9896i f22256b;

            /* renamed from: a */
            public C9511b m14536a() {
                C5051n.m25773u(this.f22255a != null, "config is not set");
                return new C9511b(C9497c1.f22187f, this.f22255a, this.f22256b);
            }

            /* renamed from: b */
            public C9512a m14535b(Object obj) {
                C5051n.m25779o(obj, "config");
                this.f22255a = obj;
                return this;
            }

            private C9512a() {
            }
        }

        /* renamed from: d */
        public static C9512a m14537d() {
            return new C9512a();
        }

        /* renamed from: a */
        public Object m14540a() {
            return this.f22253b;
        }

        /* renamed from: b */
        public InterfaceC9896i m14539b() {
            return this.f22254c;
        }

        /* renamed from: c */
        public C9497c1 m14538c() {
            return this.f22252a;
        }

        private C9511b(C9497c1 c9497c1, Object obj, InterfaceC9896i interfaceC9896i) {
            C5051n.m25779o(c9497c1, TransactionField.STATUS);
            this.f22252a = c9497c1;
            this.f22253b = obj;
            this.f22254c = interfaceC9896i;
        }
    }

    /* renamed from: a */
    public abstract C9511b mo14180a(AbstractC10020n0.AbstractC10027f abstractC10027f);
}
