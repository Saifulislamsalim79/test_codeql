package kotlin.p493j0.p494o.p495c.p496o0;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e;
import kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d;
import kotlin.p557z.C13706j;
/* compiled from: InternalUnderlyingValOfInlineClass.kt */
/* renamed from: kotlin.j0.o.c.o0.i */
/* loaded from: classes3.dex */
public abstract class AbstractC12021i implements InterfaceC11990d<Method> {

    /* renamed from: a */
    private final Type f26732a;

    /* renamed from: b */
    private final Method f26733b;

    /* renamed from: c */
    private final List<Type> f26734c;

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    /* renamed from: kotlin.j0.o.c.o0.i$a */
    /* loaded from: classes3.dex */
    public static final class C12022a extends AbstractC12021i implements InterfaceC11989c {

        /* renamed from: d */
        private final Object f26735d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C12022a(java.lang.reflect.Method r3, java.lang.Object r4) {
            /*
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                kotlin.e0.d.l.f(r3, r0)
                java.util.List r0 = kotlin.p557z.C13722p.m3941e()
                r1 = 0
                r2.<init>(r3, r0, r1)
                r2.f26735d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.AbstractC12021i.C12022a.<init>(java.lang.reflect.Method, java.lang.Object):void");
        }

        @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
        /* renamed from: a */
        public Object mo9985a(Object[] objArr) {
            l.f(objArr, "args");
            m9987c(objArr);
            return m9988b(this.f26735d, objArr);
        }
    }

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    /* renamed from: kotlin.j0.o.c.o0.i$b */
    /* loaded from: classes3.dex */
    public static final class C12023b extends AbstractC12021i {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C12023b(java.lang.reflect.Method r3) {
            /*
                r2 = this;
                java.lang.String r0 = "unboxMethod"
                kotlin.e0.d.l.f(r3, r0)
                java.lang.Class r0 = r3.getDeclaringClass()
                java.util.List r0 = kotlin.p557z.C13722p.m3946b(r0)
                r1 = 0
                r2.<init>(r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p496o0.AbstractC12021i.C12023b.<init>(java.lang.reflect.Method):void");
        }

        @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
        /* renamed from: a */
        public Object mo9985a(Object[] objArr) {
            Object[] m4090h;
            l.f(objArr, "args");
            m9987c(objArr);
            Object obj = objArr[0];
            AbstractC11992e.C11996d c11996d = AbstractC11992e.f26713e;
            if (objArr.length <= 1) {
                m4090h = new Object[0];
            } else {
                m4090h = C13706j.m4090h(objArr, 1, objArr.length);
                if (m4090h == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            return m9988b(obj, m4090h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC12021i(Method method, List<? extends Type> list) {
        this.f26733b = method;
        this.f26734c = list;
        Class<?> returnType = method.getReturnType();
        l.e(returnType, "unboxMethod.returnType");
        this.f26732a = returnType;
    }

    /* renamed from: b */
    protected final Object m9988b(Object obj, Object[] objArr) {
        l.f(objArr, "args");
        return this.f26733b.invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: c */
    public void m9987c(Object[] objArr) {
        l.f(objArr, "args");
        InterfaceC11990d.C11991a.m10006a(this, objArr);
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: d */
    public final Method mo9981l() {
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: j */
    public final Type mo9983j() {
        return this.f26732a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d
    /* renamed from: k */
    public final List<Type> mo9982k() {
        return this.f26734c;
    }

    public /* synthetic */ AbstractC12021i(Method method, List list, g gVar) {
        this(method, list);
    }
}
