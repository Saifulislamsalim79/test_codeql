package kotlin.p493j0.p494o.p495c.p496o0;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p491i0.C11837e;
import kotlin.p493j0.p494o.p495c.C11972m0;
/* compiled from: InlineClassAwareCaller.kt */
/* renamed from: kotlin.j0.o.c.o0.g */
/* loaded from: classes3.dex */
public final class C12018g<M extends Member> implements InterfaceC11990d<M> {

    /* renamed from: a */
    private final C12019a f26726a;

    /* renamed from: b */
    private final InterfaceC11990d<M> f26727b;

    /* renamed from: c */
    private final boolean f26728c;

    /* compiled from: InlineClassAwareCaller.kt */
    /* renamed from: kotlin.j0.o.c.o0.g$a */
    /* loaded from: classes3.dex */
    private static final class C12019a {

        /* renamed from: a */
        private final C11837e f26729a;

        /* renamed from: b */
        private final Method[] f26730b;

        /* renamed from: c */
        private final Method f26731c;

        public C12019a(C11837e c11837e, Method[] methodArr, Method method) {
            l.f(c11837e, "argumentRange");
            l.f(methodArr, "unbox");
            this.f26729a = c11837e;
            this.f26730b = methodArr;
            this.f26731c = method;
        }

        /* renamed from: a */
        public final C11837e m10000a() {
            return this.f26729a;
        }

        /* renamed from: b */
        public final Method[] m9999b() {
            return this.f26730b;
        }

        /* renamed from: c */
        public final Method m9998c() {
            return this.f26731c;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
        if ((r0 instanceof kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11989c) != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12018g(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b r8, kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d<? extends M> r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.C12018g.<init>(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.j0.o.c.o0.d, boolean):void");
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: a */
    public Object mo9985a(Object[] objArr) {
        Object invoke;
        l.f(objArr, "args");
        C12019a c12019a = this.f26726a;
        C11837e m10000a = c12019a.m10000a();
        Method[] m9999b = c12019a.m9999b();
        Method m9998c = c12019a.m9998c();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l.e(copyOf, "java.util.Arrays.copyOf(this, size)");
        if (copyOf != null) {
            int m10292l = m10000a.m10292l();
            int m10291m = m10000a.m10291m();
            if (m10292l <= m10291m) {
                while (true) {
                    Method method = m9999b[m10292l];
                    Object obj = objArr[m10292l];
                    if (method != null) {
                        if (obj != null) {
                            obj = method.invoke(obj, new Object[0]);
                        } else {
                            Class<?> returnType = method.getReturnType();
                            l.e(returnType, "method.returnType");
                            obj = C11972m0.m10037e(returnType);
                        }
                    }
                    copyOf[m10292l] = obj;
                    if (m10292l == m10291m) {
                        break;
                    }
                    m10292l++;
                }
            }
            Object mo9985a = this.f26727b.mo9985a(copyOf);
            return (m9998c == null || (invoke = m9998c.invoke(null, mo9985a)) == null) ? mo9985a : invoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: j */
    public Type mo9983j() {
        return this.f26727b.mo9983j();
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: k */
    public List<Type> mo9982k() {
        return this.f26727b.mo9982k();
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: l */
    public M mo9981l() {
        return this.f26727b.mo9981l();
    }
}
