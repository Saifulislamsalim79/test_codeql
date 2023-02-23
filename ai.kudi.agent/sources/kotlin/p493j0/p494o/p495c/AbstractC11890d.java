package kotlin.p493j0.p494o.p495c;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p474a0.C11703b;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13474b;
/* compiled from: RuntimeTypeMapper.kt */
/* renamed from: kotlin.j0.o.c.d */
/* loaded from: classes3.dex */
public abstract class AbstractC11890d {

    /* compiled from: RuntimeTypeMapper.kt */
    /* renamed from: kotlin.j0.o.c.d$a */
    /* loaded from: classes3.dex */
    public static final class C11891a extends AbstractC11890d {

        /* renamed from: a */
        private final List<Method> f26568a;

        /* renamed from: b */
        private final Class<?> f26569b;

        /* compiled from: Comparisons.kt */
        /* renamed from: kotlin.j0.o.c.d$a$a */
        /* loaded from: classes3.dex */
        public static final class C11892a<T> implements Comparator<T> {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int m10416a;
                Method method = (Method) t;
                l.e(method, "it");
                String name = method.getName();
                Method method2 = (Method) t2;
                l.e(method2, "it");
                m10416a = C11703b.m10416a(name, method2.getName());
                return m10416a;
            }
        }

        /* compiled from: RuntimeTypeMapper.kt */
        /* renamed from: kotlin.j0.o.c.d$a$b */
        /* loaded from: classes3.dex */
        static final class C11893b extends AbstractC11802m implements InterfaceC11767l<Method, CharSequence> {

            /* renamed from: c */
            public static final C11893b f26570c = new C11893b();

            C11893b() {
                super(1);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final CharSequence invoke(Method method) {
                l.e(method, "it");
                Class<?> returnType = method.getReturnType();
                l.e(returnType, "it.returnType");
                return C13474b.m4892b(returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11891a(Class<?> cls) {
            super(null);
            List<Method> m4034Q;
            l.f(cls, "jClass");
            this.f26569b = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            l.e(declaredMethods, "jClass.declaredMethods");
            m4034Q = C13715n.m4034Q(declaredMethods, new C11892a());
            this.f26568a = m4034Q;
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC11890d
        /* renamed from: a */
        public String mo10196a() {
            String m3797a0;
            m3797a0 = C13742z.m3797a0(this.f26568a, "", "<init>(", ")V", 0, null, C11893b.f26570c, 24, null);
            return m3797a0;
        }

        /* renamed from: b */
        public final List<Method> m10202b() {
            return this.f26568a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* renamed from: kotlin.j0.o.c.d$b */
    /* loaded from: classes3.dex */
    public static final class C11894b extends AbstractC11890d {

        /* renamed from: a */
        private final Constructor<?> f26571a;

        /* compiled from: RuntimeTypeMapper.kt */
        /* renamed from: kotlin.j0.o.c.d$b$a */
        /* loaded from: classes3.dex */
        static final class C11895a extends AbstractC11802m implements InterfaceC11767l<Class<?>, CharSequence> {

            /* renamed from: c */
            public static final C11895a f26572c = new C11895a();

            C11895a() {
                super(1);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            /* renamed from: a */
            public final CharSequence invoke(Class<?> cls) {
                l.e(cls, "it");
                return C13474b.m4892b(cls);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11894b(Constructor<?> constructor) {
            super(null);
            l.f(constructor, "constructor");
            this.f26571a = constructor;
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC11890d
        /* renamed from: a */
        public String mo10196a() {
            String m4044G;
            Class<?>[] parameterTypes = this.f26571a.getParameterTypes();
            l.e(parameterTypes, "constructor.parameterTypes");
            m4044G = C13715n.m4044G(parameterTypes, "", "<init>(", ")V", 0, null, C11895a.f26572c, 24, null);
            return m4044G;
        }

        /* renamed from: b */
        public final Constructor<?> m10200b() {
            return this.f26571a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* renamed from: kotlin.j0.o.c.d$c */
    /* loaded from: classes3.dex */
    public static final class C11896c extends AbstractC11890d {

        /* renamed from: a */
        private final Method f26573a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11896c(Method method) {
            super(null);
            l.f(method, "method");
            this.f26573a = method;
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC11890d
        /* renamed from: a */
        public String mo10196a() {
            String m10049b;
            m10049b = C11966k0.m10049b(this.f26573a);
            return m10049b;
        }

        /* renamed from: b */
        public final Method m10198b() {
            return this.f26573a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* renamed from: kotlin.j0.o.c.d$d */
    /* loaded from: classes3.dex */
    public static final class C11897d extends AbstractC11890d {

        /* renamed from: a */
        private final String f26574a;

        /* renamed from: b */
        private final AbstractC12491d.C12493b f26575b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11897d(AbstractC12491d.C12493b c12493b) {
            super(null);
            l.f(c12493b, "signature");
            this.f26575b = c12493b;
            this.f26574a = c12493b.mo8645a();
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC11890d
        /* renamed from: a */
        public String mo10196a() {
            return this.f26574a;
        }

        /* renamed from: b */
        public final String m10197b() {
            return this.f26575b.mo8644b();
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    /* renamed from: kotlin.j0.o.c.d$e */
    /* loaded from: classes3.dex */
    public static final class C11898e extends AbstractC11890d {

        /* renamed from: a */
        private final String f26576a;

        /* renamed from: b */
        private final AbstractC12491d.C12493b f26577b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11898e(AbstractC12491d.C12493b c12493b) {
            super(null);
            l.f(c12493b, "signature");
            this.f26577b = c12493b;
            this.f26576a = c12493b.mo8645a();
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC11890d
        /* renamed from: a */
        public String mo10196a() {
            return this.f26576a;
        }

        /* renamed from: b */
        public final String m10195b() {
            return this.f26577b.mo8644b();
        }

        /* renamed from: c */
        public final String m10194c() {
            return this.f26577b.mo8643c();
        }
    }

    private AbstractC11890d() {
    }

    /* renamed from: a */
    public abstract String mo10196a();

    public /* synthetic */ AbstractC11890d(g gVar) {
        this();
    }
}
