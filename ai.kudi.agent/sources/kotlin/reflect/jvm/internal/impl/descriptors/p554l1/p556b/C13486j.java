package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11799i;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.C11815z;
import kotlin.p493j0.InterfaceC11865d;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.EnumC12271c0;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12280j;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12294w;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13333g1;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.InterfaceC13481f;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.InterfaceC13504t;
/* compiled from: ReflectJavaClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.j */
/* loaded from: classes3.dex */
public final class C13486j extends AbstractC13498n implements InterfaceC13481f, InterfaceC13504t, InterfaceC12277g {

    /* renamed from: a */
    private final Class<?> f29845a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.j$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13487a extends C11799i implements InterfaceC11767l<Member, Boolean> {

        /* renamed from: B */
        public static final C13487a f29846B = new C13487a();

        C13487a() {
            super(1);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "isSynthetic";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(Member.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(Member member) {
            return Boolean.valueOf(m4840l(member));
        }

        /* renamed from: l */
        public final boolean m4840l(Member member) {
            l.f(member, "p0");
            return member.isSynthetic();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.j$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13488b extends C11799i implements InterfaceC11767l<Constructor<?>, C13497m> {

        /* renamed from: B */
        public static final C13488b f29847B = new C13488b();

        C13488b() {
            super(1);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "<init>";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(C13497m.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: l */
        public final C13497m invoke(Constructor<?> constructor) {
            l.f(constructor, "p0");
            return new C13497m(constructor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.j$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13489c extends C11799i implements InterfaceC11767l<Member, Boolean> {

        /* renamed from: B */
        public static final C13489c f29848B = new C13489c();

        C13489c() {
            super(1);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "isSynthetic";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(Member.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(Member member) {
            return Boolean.valueOf(m4838l(member));
        }

        /* renamed from: l */
        public final boolean m4838l(Member member) {
            l.f(member, "p0");
            return member.isSynthetic();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.j$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13490d extends C11799i implements InterfaceC11767l<Field, C13500p> {

        /* renamed from: B */
        public static final C13490d f29849B = new C13490d();

        C13490d() {
            super(1);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "<init>";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(C13500p.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: l */
        public final C13500p invoke(Field field) {
            l.f(field, "p0");
            return new C13500p(field);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.j$e */
    /* loaded from: classes3.dex */
    public static final class C13491e extends AbstractC11802m implements InterfaceC11767l<Class<?>, Boolean> {

        /* renamed from: c */
        public static final C13491e f29850c = new C13491e();

        C13491e() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m4836a(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            l.e(simpleName, "it.simpleName");
            return simpleName.length() == 0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(Class<?> cls) {
            return Boolean.valueOf(m4836a(cls));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.j$f */
    /* loaded from: classes3.dex */
    public static final class C13492f extends AbstractC11802m implements InterfaceC11767l<Class<?>, C12614f> {

        /* renamed from: c */
        public static final C13492f f29851c = new C13492f();

        C13492f() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final C12614f invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            if (!C12614f.m7347m(simpleName)) {
                simpleName = null;
            }
            if (simpleName == null) {
                return null;
            }
            return C12614f.m7349i(simpleName);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.j$g */
    /* loaded from: classes3.dex */
    public static final class C13493g extends AbstractC11802m implements InterfaceC11767l<Method, Boolean> {
        C13493g() {
            super(1);
        }

        /* renamed from: a */
        public final boolean m4834a(Method method) {
            if (!method.isSynthetic()) {
                if (!C13486j.this.mo4865H()) {
                    return true;
                }
                C13486j c13486j = C13486j.this;
                l.e(method, "method");
                if (!c13486j.m4846i0(method)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ Boolean invoke(Method method) {
            return Boolean.valueOf(m4834a(method));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectJavaClass.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.j$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13494h extends C11799i implements InterfaceC11767l<Method, C13503s> {

        /* renamed from: B */
        public static final C13494h f29853B = new C13494h();

        C13494h() {
            super(1);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "<init>";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(C13503s.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: l */
        public final C13503s invoke(Method method) {
            l.f(method, "p0");
            return new C13503s(method);
        }
    }

    public C13486j(Class<?> cls) {
        l.f(cls, "klass");
        this.f29845a = cls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final boolean m4846i0(Method method) {
        String name = method.getName();
        if (l.b(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            l.e(parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (l.b(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: A */
    public boolean mo4866A() {
        return false;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: H */
    public boolean mo4865H() {
        return this.f29845a.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.InterfaceC13504t
    /* renamed from: K */
    public int mo4800K() {
        return this.f29845a.getModifiers();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: O */
    public boolean mo4863O() {
        return this.f29845a.isInterface();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12290s
    /* renamed from: P */
    public boolean mo4817P() {
        return InterfaceC13504t.C13505a.m4798b(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: Q */
    public EnumC12271c0 mo4862Q() {
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: V */
    public Collection<InterfaceC12280j> mo4859V() {
        List m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12290s
    /* renamed from: Y */
    public boolean mo4815Y() {
        return InterfaceC13504t.C13505a.m4796d(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: a */
    public Collection<InterfaceC12280j> mo4857a() {
        Class cls;
        List<Type> m3888h;
        int m3867o;
        List m3891e;
        cls = Object.class;
        if (l.b(this.f29845a, cls)) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        C11815z c11815z = new C11815z(2);
        Object genericSuperclass = this.f29845a.getGenericSuperclass();
        c11815z.m10309a(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = this.f29845a.getGenericInterfaces();
        l.e(genericInterfaces, "klass.genericInterfaces");
        c11815z.m10308b(genericInterfaces);
        m3888h = C13726r.m3888h(c11815z.m10306d(new Type[c11815z.m10307c()]));
        m3867o = C13728s.m3867o(m3888h, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (Type type : m3888h) {
            arrayList.add(new C13496l(type));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: a0 */
    public C13477c mo4777r(C12609c c12609c) {
        return InterfaceC13481f.C13482a.m4874a(this, c12609c);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12291t
    /* renamed from: b */
    public C12614f mo4785b() {
        C12614f m7349i = C12614f.m7349i(this.f29845a.getSimpleName());
        l.e(m7349i, "identifier(klass.simpleName)");
        return m7349i;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: b0 */
    public List<C13477c> mo4770y() {
        return InterfaceC13481f.C13482a.m4873b(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: c0 */
    public List<C13497m> mo4843p() {
        InterfaceC13230h m4008q;
        InterfaceC13230h m5573n;
        InterfaceC13230h m5569r;
        List<C13497m> m5563x;
        Constructor<?>[] declaredConstructors = this.f29845a.getDeclaredConstructors();
        l.e(declaredConstructors, "klass.declaredConstructors");
        m4008q = C13715n.m4008q(declaredConstructors);
        m5573n = C13242n.m5573n(m4008q, C13487a.f29846B);
        m5569r = C13242n.m5569r(m5573n, C13488b.f29847B);
        m5563x = C13242n.m5563x(m5569r);
        return m5563x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.InterfaceC13481f
    /* renamed from: d0 */
    public Class<?> mo4788C() {
        return this.f29845a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: e */
    public boolean mo4852e() {
        return false;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: e0 */
    public List<C13500p> mo4864J() {
        InterfaceC13230h m4008q;
        InterfaceC13230h m5573n;
        InterfaceC13230h m5569r;
        List<C13500p> m5563x;
        Field[] declaredFields = this.f29845a.getDeclaredFields();
        l.e(declaredFields, "klass.declaredFields");
        m4008q = C13715n.m4008q(declaredFields);
        m5573n = C13242n.m5573n(m4008q, C13489c.f29848B);
        m5569r = C13242n.m5569r(m5573n, C13490d.f29849B);
        m5563x = C13242n.m5563x(m5569r);
        return m5563x;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13486j) && l.b(this.f29845a, ((C13486j) obj).f29845a);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: f */
    public C12609c mo4850f() {
        C12609c m7395b = C13474b.m4893a(this.f29845a).m7395b();
        l.e(m7395b, "klass.classId.asSingleFqName()");
        return m7395b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: f0 */
    public List<C12614f> mo4861S() {
        InterfaceC13230h m4008q;
        InterfaceC13230h m5573n;
        InterfaceC13230h m5568s;
        List<C12614f> m5563x;
        Class<?>[] declaredClasses = this.f29845a.getDeclaredClasses();
        l.e(declaredClasses, "klass.declaredClasses");
        m4008q = C13715n.m4008q(declaredClasses);
        m5573n = C13242n.m5573n(m4008q, C13491e.f29850c);
        m5568s = C13242n.m5568s(m5573n, C13492f.f29851c);
        m5563x = C13242n.m5563x(m5568s);
        return m5563x;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: g0 */
    public List<C13503s> mo4860U() {
        InterfaceC13230h m4008q;
        InterfaceC13230h m5574m;
        InterfaceC13230h m5569r;
        List<C13503s> m5563x;
        Method[] declaredMethods = this.f29845a.getDeclaredMethods();
        l.e(declaredMethods, "klass.declaredMethods");
        m4008q = C13715n.m4008q(declaredMethods);
        m5574m = C13242n.m5574m(m4008q, new C13493g());
        m5569r = C13242n.m5569r(m5574m, C13494h.f29853B);
        m5563x = C13242n.m5563x(m5569r);
        return m5563x;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: h0 */
    public C13486j mo4845m() {
        Class<?> declaringClass = this.f29845a.getDeclaringClass();
        if (declaringClass == null) {
            return null;
        }
        return new C13486j(declaringClass);
    }

    public int hashCode() {
        return this.f29845a.hashCode();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12290s
    /* renamed from: i */
    public AbstractC13333g1 mo4810i() {
        return InterfaceC13504t.C13505a.m4799a(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12298z
    /* renamed from: l */
    public List<C13510x> mo4802l() {
        TypeVariable<Class<?>>[] typeParameters = this.f29845a.getTypeParameters();
        l.e(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new C13510x(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: o */
    public Collection<InterfaceC12294w> mo4844o() {
        List m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: q */
    public boolean mo4771q() {
        return InterfaceC13481f.C13482a.m4872c(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12290s
    /* renamed from: t */
    public boolean mo4809t() {
        return InterfaceC13504t.C13505a.m4797c(this);
    }

    public String toString() {
        return C13486j.class.getName() + ": " + this.f29845a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: w */
    public boolean mo4842w() {
        return this.f29845a.isAnnotation();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g
    /* renamed from: z */
    public boolean mo4841z() {
        return false;
    }
}
