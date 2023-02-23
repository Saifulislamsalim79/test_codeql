package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0;

import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12282l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12284n;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12287q;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
/* compiled from: JavaResolverCache.java */
/* renamed from: kotlin.j0.o.c.p0.d.a.b0.g */
/* loaded from: classes3.dex */
public interface InterfaceC12134g {

    /* renamed from: a */
    public static final InterfaceC12134g f27075a = new C12135a();

    /* compiled from: JavaResolverCache.java */
    /* renamed from: kotlin.j0.o.c.p0.d.a.b0.g$a */
    /* loaded from: classes3.dex */
    static class C12135a implements InterfaceC12134g {
        C12135a() {
        }

        /* renamed from: f */
        private static /* synthetic */ void m9640f(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.InterfaceC12134g
        /* renamed from: a */
        public InterfaceC13312e mo9645a(C12609c c12609c) {
            if (c12609c != null) {
                return null;
            }
            m9640f(0);
            throw null;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.InterfaceC12134g
        /* renamed from: b */
        public void mo9644b(InterfaceC12282l interfaceC12282l, InterfaceC13452l interfaceC13452l) {
            if (interfaceC12282l == null) {
                m9640f(3);
                throw null;
            } else if (interfaceC13452l != null) {
            } else {
                m9640f(4);
                throw null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.InterfaceC12134g
        /* renamed from: c */
        public void mo9643c(InterfaceC12277g interfaceC12277g, InterfaceC13312e interfaceC13312e) {
            if (interfaceC12277g == null) {
                m9640f(7);
                throw null;
            } else if (interfaceC13312e != null) {
            } else {
                m9640f(8);
                throw null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.InterfaceC12134g
        /* renamed from: d */
        public void mo9642d(InterfaceC12284n interfaceC12284n, InterfaceC13518o0 interfaceC13518o0) {
            if (interfaceC12284n == null) {
                m9640f(5);
                throw null;
            } else if (interfaceC13518o0 != null) {
            } else {
                m9640f(6);
                throw null;
            }
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.InterfaceC12134g
        /* renamed from: e */
        public void mo9641e(InterfaceC12287q interfaceC12287q, InterfaceC13543t0 interfaceC13543t0) {
            if (interfaceC12287q == null) {
                m9640f(1);
                throw null;
            } else if (interfaceC13543t0 != null) {
            } else {
                m9640f(2);
                throw null;
            }
        }
    }

    /* renamed from: a */
    InterfaceC13312e mo9645a(C12609c c12609c);

    /* renamed from: b */
    void mo9644b(InterfaceC12282l interfaceC12282l, InterfaceC13452l interfaceC13452l);

    /* renamed from: c */
    void mo9643c(InterfaceC12277g interfaceC12277g, InterfaceC13312e interfaceC13312e);

    /* renamed from: d */
    void mo9642d(InterfaceC12284n interfaceC12284n, InterfaceC13518o0 interfaceC13518o0);

    /* renamed from: e */
    void mo9641e(InterfaceC12287q interfaceC12287q, InterfaceC13543t0 interfaceC13543t0);
}
