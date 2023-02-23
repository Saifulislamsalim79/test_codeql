package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0;

import java.util.Collections;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12288r;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: SignaturePropagator.java */
/* renamed from: kotlin.j0.o.c.p0.d.a.b0.j */
/* loaded from: classes3.dex */
public interface InterfaceC12140j {

    /* renamed from: a */
    public static final InterfaceC12140j f27082a = new C12141a();

    /* compiled from: SignaturePropagator.java */
    /* renamed from: kotlin.j0.o.c.p0.d.a.b0.j$a */
    /* loaded from: classes3.dex */
    static class C12141a implements InterfaceC12140j {
        C12141a() {
        }

        /* renamed from: c */
        private static /* synthetic */ void m9637c(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i == 5 || i == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.InterfaceC12140j
        /* renamed from: a */
        public C12142b mo9639a(InterfaceC12288r interfaceC12288r, InterfaceC13312e interfaceC13312e, AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02, List<InterfaceC13307c1> list, List<InterfaceC13562z0> list2) {
            if (interfaceC12288r == null) {
                m9637c(0);
                throw null;
            } else if (interfaceC13312e == null) {
                m9637c(1);
                throw null;
            } else if (abstractC12965b0 == null) {
                m9637c(2);
                throw null;
            } else if (list == null) {
                m9637c(3);
                throw null;
            } else if (list2 != null) {
                return new C12142b(abstractC12965b0, abstractC12965b02, list, list2, Collections.emptyList(), false);
            } else {
                m9637c(4);
                throw null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.InterfaceC12140j
        /* renamed from: b */
        public void mo9638b(InterfaceC13300b interfaceC13300b, List<String> list) {
            if (interfaceC13300b == null) {
                m9637c(5);
                throw null;
            } else if (list != null) {
                throw new UnsupportedOperationException("Should not be called");
            } else {
                m9637c(6);
                throw null;
            }
        }
    }

    /* compiled from: SignaturePropagator.java */
    /* renamed from: kotlin.j0.o.c.p0.d.a.b0.j$b */
    /* loaded from: classes3.dex */
    public static class C12142b {

        /* renamed from: a */
        private final AbstractC12965b0 f27083a;

        /* renamed from: b */
        private final AbstractC12965b0 f27084b;

        /* renamed from: c */
        private final List<InterfaceC13307c1> f27085c;

        /* renamed from: d */
        private final List<InterfaceC13562z0> f27086d;

        /* renamed from: e */
        private final List<String> f27087e;

        /* renamed from: f */
        private final boolean f27088f;

        public C12142b(AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02, List<InterfaceC13307c1> list, List<InterfaceC13562z0> list2, List<String> list3, boolean z) {
            if (abstractC12965b0 == null) {
                m9636a(0);
                throw null;
            } else if (list == null) {
                m9636a(1);
                throw null;
            } else if (list2 == null) {
                m9636a(2);
                throw null;
            } else if (list3 != null) {
                this.f27083a = abstractC12965b0;
                this.f27084b = abstractC12965b02;
                this.f27085c = list;
                this.f27086d = list2;
                this.f27087e = list3;
                this.f27088f = z;
            } else {
                m9636a(3);
                throw null;
            }
        }

        /* renamed from: a */
        private static /* synthetic */ void m9636a(int i) {
            String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
            switch (i) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i == 4) {
                objArr[1] = "getReturnType";
            } else if (i == 5) {
                objArr[1] = "getValueParameters";
            } else if (i == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 4 && i != 5 && i != 6 && i != 7) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* renamed from: b */
        public List<String> m9635b() {
            List<String> list = this.f27087e;
            if (list != null) {
                return list;
            }
            m9636a(7);
            throw null;
        }

        /* renamed from: c */
        public AbstractC12965b0 m9634c() {
            return this.f27084b;
        }

        /* renamed from: d */
        public AbstractC12965b0 m9633d() {
            AbstractC12965b0 abstractC12965b0 = this.f27083a;
            if (abstractC12965b0 != null) {
                return abstractC12965b0;
            }
            m9636a(4);
            throw null;
        }

        /* renamed from: e */
        public List<InterfaceC13562z0> m9632e() {
            List<InterfaceC13562z0> list = this.f27086d;
            if (list != null) {
                return list;
            }
            m9636a(6);
            throw null;
        }

        /* renamed from: f */
        public List<InterfaceC13307c1> m9631f() {
            List<InterfaceC13307c1> list = this.f27085c;
            if (list != null) {
                return list;
            }
            m9636a(5);
            throw null;
        }

        /* renamed from: g */
        public boolean m9630g() {
            return this.f27088f;
        }
    }

    /* renamed from: a */
    C12142b mo9639a(InterfaceC12288r interfaceC12288r, InterfaceC13312e interfaceC13312e, AbstractC12965b0 abstractC12965b0, AbstractC12965b0 abstractC12965b02, List<InterfaceC13307c1> list, List<InterfaceC13562z0> list2);

    /* renamed from: b */
    void mo9638b(InterfaceC13300b interfaceC13300b, List<String> list);
}
