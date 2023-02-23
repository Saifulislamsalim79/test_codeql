package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p510e0.InterfaceC12260a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p510e0.InterfaceC12261b;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12282l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13548v0;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13498n;
/* compiled from: RuntimeSourceElementFactory.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.m */
/* loaded from: classes3.dex */
public final class C13469m implements InterfaceC12261b {

    /* renamed from: a */
    public static final C13469m f29824a = new C13469m();

    /* compiled from: RuntimeSourceElementFactory.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.m$a */
    /* loaded from: classes3.dex */
    public static final class C13470a implements InterfaceC12260a {

        /* renamed from: b */
        private final AbstractC13498n f29825b;

        public C13470a(AbstractC13498n abstractC13498n) {
            l.f(abstractC13498n, "javaElement");
            this.f29825b = abstractC13498n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0
        /* renamed from: a */
        public InterfaceC13548v0 mo4706a() {
            InterfaceC13548v0 interfaceC13548v0 = InterfaceC13548v0.f29904a;
            l.e(interfaceC13548v0, "NO_SOURCE_FILE");
            return interfaceC13548v0;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p510e0.InterfaceC12260a
        /* renamed from: d */
        public AbstractC13498n mo4902b() {
            return this.f29825b;
        }

        public String toString() {
            return C13470a.class.getName() + ": " + mo4902b();
        }
    }

    private C13469m() {
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p510e0.InterfaceC12261b
    /* renamed from: a */
    public InterfaceC12260a mo4903a(InterfaceC12282l interfaceC12282l) {
        l.f(interfaceC12282l, "javaElement");
        return new C13470a((AbstractC13498n) interfaceC12282l);
    }
}
