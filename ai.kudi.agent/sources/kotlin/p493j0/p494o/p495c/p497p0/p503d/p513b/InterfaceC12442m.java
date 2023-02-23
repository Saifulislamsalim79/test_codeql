package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12904s;
/* compiled from: KotlinClassFinder.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.m */
/* loaded from: classes3.dex */
public interface InterfaceC12442m extends InterfaceC12904s {

    /* compiled from: KotlinClassFinder.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.m$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC12443a {

        /* compiled from: KotlinClassFinder.kt */
        /* renamed from: kotlin.j0.o.c.p0.d.b.m$a$a */
        /* loaded from: classes3.dex */
        public static final class C12444a extends AbstractC12443a {

            /* renamed from: a */
            private final byte[] f27628a;

            /* renamed from: b */
            public final byte[] m8887b() {
                return this.f27628a;
            }
        }

        /* compiled from: KotlinClassFinder.kt */
        /* renamed from: kotlin.j0.o.c.p0.d.b.m$a$b */
        /* loaded from: classes3.dex */
        public static final class C12445b extends AbstractC12443a {

            /* renamed from: a */
            private final InterfaceC12447o f27629a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12445b(InterfaceC12447o interfaceC12447o, byte[] bArr) {
                super(null);
                l.f(interfaceC12447o, "kotlinJvmBinaryClass");
                this.f27629a = interfaceC12447o;
            }

            /* renamed from: b */
            public final InterfaceC12447o m8886b() {
                return this.f27629a;
            }

            public /* synthetic */ C12445b(InterfaceC12447o interfaceC12447o, byte[] bArr, int i, g gVar) {
                this(interfaceC12447o, (i & 2) != 0 ? null : bArr);
            }
        }

        private AbstractC12443a() {
        }

        public /* synthetic */ AbstractC12443a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC12447o m8888a() {
            C12445b c12445b = this instanceof C12445b ? (C12445b) this : null;
            if (c12445b == null) {
                return null;
            }
            return c12445b.m8886b();
        }
    }

    /* renamed from: a */
    AbstractC12443a mo4920a(InterfaceC12277g interfaceC12277g);

    /* renamed from: c */
    AbstractC12443a mo4918c(C12608b c12608b);
}
