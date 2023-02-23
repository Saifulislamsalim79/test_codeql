package kotlin.p493j0.p494o.p495c;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.pin.KudiPin;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SortedMap;
import kotlin.C13666w;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.InterfaceC11786d;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.p549l0.C13262h;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p549l0.InterfaceC13257f;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC13544u;
import kotlin.reflect.jvm.internal.impl.descriptors.C13530t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a.C13458e;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a.C13465k;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13474b;
/* compiled from: KDeclarationContainerImpl.kt */
/* renamed from: kotlin.j0.o.c.j */
/* loaded from: classes3.dex */
public abstract class AbstractC11952j implements InterfaceC11786d {

    /* renamed from: e */
    public static final C11953a f26650e = new C11953a(null);

    /* renamed from: c */
    private static final Class<?> f26648c = Class.forName("kotlin.e0.d.g");

    /* renamed from: d */
    private static final C13262h f26649d = new C13262h("<v#(\\d+)>");

    /* compiled from: KDeclarationContainerImpl.kt */
    /* renamed from: kotlin.j0.o.c.j$a */
    /* loaded from: classes3.dex */
    public static final class C11953a {
        private C11953a() {
        }

        /* renamed from: a */
        public final C13262h m10079a() {
            return AbstractC11952j.f26649d;
        }

        public /* synthetic */ C11953a(g gVar) {
            this();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    /* renamed from: kotlin.j0.o.c.j$b */
    /* loaded from: classes3.dex */
    public abstract class AbstractC11954b {

        /* renamed from: c */
        static final /* synthetic */ InterfaceC11872i[] f26651c = {C11813x.m10312f(new C11808s(C11813x.m10316b(AbstractC11954b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a */
        private final C11916f0.C11917a f26652a = C11916f0.m10164d(new C11955a());

        /* compiled from: KDeclarationContainerImpl.kt */
        /* renamed from: kotlin.j0.o.c.j$b$a */
        /* loaded from: classes3.dex */
        static final class C11955a extends AbstractC11802m implements InterfaceC11756a<C13465k> {
            C11955a() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final C13465k invoke() {
                return C11905e0.m10181a(AbstractC11952j.this.mo9979a());
            }
        }

        public AbstractC11954b() {
        }

        /* renamed from: a */
        public final C13465k m10078a() {
            return (C13465k) this.f26652a.m10160b(this, f26651c[0]);
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    /* renamed from: kotlin.j0.o.c.j$c */
    /* loaded from: classes3.dex */
    protected enum EnumC11956c {
        DECLARED,
        INHERITED;

        /* renamed from: a */
        public final boolean m10076a(InterfaceC13300b interfaceC13300b) {
            l.f(interfaceC13300b, "member");
            InterfaceC13300b.EnumC13301a mo5057w = interfaceC13300b.mo5057w();
            l.e(mo5057w, "member.kind");
            return mo5057w.m5347a() == (this == DECLARED);
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    /* renamed from: kotlin.j0.o.c.j$d */
    /* loaded from: classes3.dex */
    static final class C11957d extends AbstractC11802m implements InterfaceC11767l<InterfaceC13554x, CharSequence> {

        /* renamed from: c */
        public static final C11957d f26658c = new C11957d();

        C11957d() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC13554x interfaceC13554x) {
            l.f(interfaceC13554x, "descriptor");
            return AbstractC12624c.f28405c.mo7207q(interfaceC13554x) + " | " + C11961j0.f26662b.m10065g(interfaceC13554x).mo10196a();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    /* renamed from: kotlin.j0.o.c.j$e */
    /* loaded from: classes3.dex */
    static final class C11958e extends AbstractC11802m implements InterfaceC11767l<InterfaceC13518o0, CharSequence> {

        /* renamed from: c */
        public static final C11958e f26659c = new C11958e();

        C11958e() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC13518o0 interfaceC13518o0) {
            l.f(interfaceC13518o0, "descriptor");
            return AbstractC12624c.f28405c.mo7207q(interfaceC13518o0) + " | " + C11961j0.f26662b.m10066f(interfaceC13518o0).mo10184a();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    /* renamed from: kotlin.j0.o.c.j$f */
    /* loaded from: classes3.dex */
    static final class C11959f<T> implements Comparator<AbstractC13544u> {

        /* renamed from: c */
        public static final C11959f f26660c = new C11959f();

        C11959f() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public final int compare(AbstractC13544u abstractC13544u, AbstractC13544u abstractC13544u2) {
            Integer m4731d = C13530t.m4731d(abstractC13544u, abstractC13544u2);
            if (m4731d != null) {
                return m4731d.intValue();
            }
            return 0;
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    /* renamed from: kotlin.j0.o.c.j$g */
    /* loaded from: classes3.dex */
    public static final class C11960g extends C11882a {
        C11960g(AbstractC11952j abstractC11952j, AbstractC11952j abstractC11952j2) {
            super(abstractC11952j2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13411l, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo4756h(InterfaceC13452l interfaceC13452l, Object obj) {
            m10072r(interfaceC13452l, (C13666w) obj);
            throw null;
        }

        /* renamed from: r */
        public AbstractC11906f<?> m10072r(InterfaceC13452l interfaceC13452l, C13666w c13666w) {
            l.f(interfaceC13452l, "descriptor");
            l.f(c13666w, TransactionBreakDownItemType.DATA);
            throw new IllegalStateException("No constructors should appear here: " + interfaceC13452l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[LOOP:0: B:7:0x0029->B:18:0x005a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[SYNTHETIC] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.reflect.Method m10094A(java.lang.Class<?> r7, java.lang.String r8, java.lang.Class<?>[] r9, java.lang.Class<?> r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = r9.length     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r9, r1)     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r8, r1)     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.String r2 = "result"
            kotlin.e0.d.l.e(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.Class r2 = r1.getReturnType()     // Catch: java.lang.NoSuchMethodException -> L5d
            boolean r2 = kotlin.e0.d.l.b(r2, r10)     // Catch: java.lang.NoSuchMethodException -> L5d
            if (r2 == 0) goto L1d
            r0 = r1
            goto L5d
        L1d:
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.String r1 = "declaredMethods"
            kotlin.e0.d.l.e(r7, r1)     // Catch: java.lang.NoSuchMethodException -> L5d
            int r1 = r7.length     // Catch: java.lang.NoSuchMethodException -> L5d
            r2 = 0
            r3 = 0
        L29:
            if (r3 >= r1) goto L5d
            r4 = r7[r3]     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.String r5 = "method"
            kotlin.e0.d.l.e(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L5d
            java.lang.String r5 = r4.getName()     // Catch: java.lang.NoSuchMethodException -> L5d
            boolean r5 = kotlin.e0.d.l.b(r5, r8)     // Catch: java.lang.NoSuchMethodException -> L5d
            if (r5 == 0) goto L55
            java.lang.Class r5 = r4.getReturnType()     // Catch: java.lang.NoSuchMethodException -> L5d
            boolean r5 = kotlin.e0.d.l.b(r5, r10)     // Catch: java.lang.NoSuchMethodException -> L5d
            if (r5 == 0) goto L55
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> L5d
            kotlin.e0.d.l.d(r5)     // Catch: java.lang.NoSuchMethodException -> L5d
            boolean r5 = java.util.Arrays.equals(r5, r9)     // Catch: java.lang.NoSuchMethodException -> L5d
            if (r5 == 0) goto L55
            r5 = 1
            goto L56
        L55:
            r5 = 0
        L56:
            if (r5 == 0) goto L5a
            r0 = r4
            goto L5d
        L5a:
            int r3 = r3 + 1
            goto L29
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.AbstractC11952j.m10094A(java.lang.Class, java.lang.String, java.lang.Class[], java.lang.Class):java.lang.reflect.Method");
    }

    /* renamed from: d */
    private final void m10092d(List<Class<?>> list, String str, boolean z) {
        List<Class<?>> m10084v = m10084v(str);
        list.addAll(m10084v);
        int size = ((m10084v.size() + 32) - 1) / 32;
        for (int i = 0; i < size; i++) {
            Class<?> cls = Integer.TYPE;
            l.e(cls, "Integer.TYPE");
            list.add(cls);
        }
        Class cls2 = z ? f26648c : Object.class;
        l.e(cls2, "if (isConstructor) DEFAU…RKER else Any::class.java");
        list.add(cls2);
    }

    /* renamed from: v */
    private final List<Class<?>> m10084v(String str) {
        boolean m5423I;
        int m5405V;
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            m5423I = C13277t.m5423I("VZCBSIFJD", charAt, false, 2, null);
            if (m5423I) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                m5405V = C13277t.m5405V(str, ';', i2, false, 4, null);
                i = m5405V + 1;
            } else {
                throw new C11899d0("Unknown type prefix in the method signature: " + str);
            }
            arrayList.add(m10081y(str, i2, i));
            i2 = i;
        }
        return arrayList;
    }

    /* renamed from: w */
    private final Class<?> m10083w(String str) {
        int m5405V;
        m5405V = C13277t.m5405V(str, ')', 0, false, 6, null);
        return m10081y(str, m5405V + 1, str.length());
    }

    /* renamed from: x */
    private final Method m10082x(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z) {
        Class<?>[] interfaces;
        Method m10082x;
        if (z) {
            clsArr[0] = cls;
        }
        Method m10094A = m10094A(cls, str, clsArr, cls2);
        if (m10094A != null) {
            return m10094A;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || (m10082x = m10082x(superclass, str, clsArr, cls2, z)) == null) {
            for (Class<?> cls3 : cls.getInterfaces()) {
                l.e(cls3, "superInterface");
                Method m10082x2 = m10082x(cls3, str, clsArr, cls2, z);
                if (m10082x2 != null) {
                    return m10082x2;
                }
                if (z) {
                    Class<?> m4927a = C13458e.m4927a(C13474b.m4889e(cls3), cls3.getName() + "$DefaultImpls");
                    if (m4927a != null) {
                        clsArr[0] = cls3;
                        Method m10094A2 = m10094A(m4927a, str, clsArr, cls2);
                        if (m10094A2 != null) {
                            return m10094A2;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        }
        return m10082x;
    }

    /* renamed from: y */
    private final Class<?> m10081y(String str, int i, int i2) {
        String m5435z;
        char charAt = str.charAt(i);
        if (charAt != 'F') {
            if (charAt == 'L') {
                ClassLoader m4889e = C13474b.m4889e(mo9979a());
                int i3 = i + 1;
                int i4 = i2 - 1;
                if (str != null) {
                    String substring = str.substring(i3, i4);
                    l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    m5435z = C13276s.m5435z(substring, '/', '.', false, 4, null);
                    Class<?> loadClass = m4889e.loadClass(m5435z);
                    l.e(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
                    return loadClass;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } else if (charAt != 'S') {
                if (charAt == 'V') {
                    Class<?> cls = Void.TYPE;
                    l.e(cls, "Void.TYPE");
                    return cls;
                } else if (charAt != 'I') {
                    if (charAt != 'J') {
                        if (charAt != 'Z') {
                            if (charAt != '[') {
                                switch (charAt) {
                                    case 'B':
                                        return Byte.TYPE;
                                    case 'C':
                                        return Character.TYPE;
                                    case 'D':
                                        return Double.TYPE;
                                    default:
                                        throw new C11899d0("Unknown type prefix in the method signature: " + str);
                                }
                            }
                            return C11972m0.m10038d(m10081y(str, i + 1, i2));
                        }
                        return Boolean.TYPE;
                    }
                    return Long.TYPE;
                } else {
                    return Integer.TYPE;
                }
            } else {
                return Short.TYPE;
            }
        }
        return Float.TYPE;
    }

    /* renamed from: z */
    private final Constructor<?> m10080z(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Object[] array = list.toArray(new Class[0]);
            if (array != null) {
                Class[] clsArr = (Class[]) array;
                return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public final Constructor<?> m10091i(String str) {
        l.f(str, KudiPin.KUDI_PIN_DESC);
        return m10080z(mo9979a(), m10084v(str));
    }

    /* renamed from: j */
    public final Constructor<?> m10090j(String str) {
        l.f(str, KudiPin.KUDI_PIN_DESC);
        Class<?> mo9979a = mo9979a();
        ArrayList arrayList = new ArrayList();
        m10092d(arrayList, str, true);
        C13666w c13666w = C13666w.f30112a;
        return m10080z(mo9979a, arrayList);
    }

    /* renamed from: k */
    public final Method m10089k(String str, String str2, boolean z) {
        l.f(str, "name");
        l.f(str2, KudiPin.KUDI_PIN_DESC);
        if (l.b(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(mo9979a());
        }
        m10092d(arrayList, str2, false);
        Class<?> mo9975t = mo9975t();
        String str3 = str + "$default";
        Object[] array = arrayList.toArray(new Class[0]);
        if (array != null) {
            return m10082x(mo9975t, str3, (Class[]) array, m10083w(str2), z);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: l */
    public final InterfaceC13554x m10088l(String str, String str2) {
        Collection<InterfaceC13554x> mo9977p;
        String m3797a0;
        l.f(str, "name");
        l.f(str2, "signature");
        if (l.b(str, "<init>")) {
            mo9977p = C13742z.m3825B0(mo9978o());
        } else {
            C12614f m7349i = C12614f.m7349i(str);
            l.e(m7349i, "Name.identifier(name)");
            mo9977p = mo9977p(m7349i);
        }
        Collection<InterfaceC13554x> collection = mo9977p;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (l.b(C11961j0.f26662b.m10065g((InterfaceC13554x) obj).mo10196a(), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != 1) {
            m3797a0 = C13742z.m3797a0(collection, "\n", null, null, 0, null, C11957d.f26658c, 30, null);
            StringBuilder sb = new StringBuilder();
            sb.append("Function '");
            sb.append(str);
            sb.append("' (JVM signature: ");
            sb.append(str2);
            sb.append(") not resolved in ");
            sb.append(this);
            sb.append(':');
            sb.append(m3797a0.length() == 0 ? " no members found" : '\n' + m3797a0);
            throw new C11899d0(sb.toString());
        }
        return (InterfaceC13554x) C13722p.m3918q0(arrayList);
    }

    /* renamed from: m */
    public final Method m10087m(String str, String str2) {
        Method m10082x;
        l.f(str, "name");
        l.f(str2, KudiPin.KUDI_PIN_DESC);
        if (l.b(str, "<init>")) {
            return null;
        }
        Object[] array = m10084v(str2).toArray(new Class[0]);
        if (array != null) {
            Class<?>[] clsArr = (Class[]) array;
            Class<?> m10083w = m10083w(str2);
            Method m10082x2 = m10082x(mo9975t(), str, clsArr, m10083w, false);
            if (m10082x2 != null) {
                return m10082x2;
            }
            if (!mo9975t().isInterface() || (m10082x = m10082x(Object.class, str, clsArr, m10083w, false)) == null) {
                return null;
            }
            return m10082x;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: n */
    public final InterfaceC13518o0 m10086n(String str, String str2) {
        SortedMap m3894j;
        String m3797a0;
        l.f(str, "name");
        l.f(str2, "signature");
        InterfaceC13257f m5523d = f26649d.m5523d(str2);
        if (m5523d != null) {
            String str3 = m5523d.mo5534a().m5535a().mo5533b().get(1);
            InterfaceC13518o0 mo9976q = mo9976q(Integer.parseInt(str3));
            if (mo9976q != null) {
                return mo9976q;
            }
            throw new C11899d0("Local property #" + str3 + " not found in " + mo9979a());
        }
        C12614f m7349i = C12614f.m7349i(str);
        l.e(m7349i, "Name.identifier(name)");
        Collection<InterfaceC13518o0> mo9974u = mo9974u(m7349i);
        ArrayList arrayList = new ArrayList();
        for (Object obj : mo9974u) {
            if (l.b(C11961j0.f26662b.m10066f((InterfaceC13518o0) obj).mo10184a(), str2)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    AbstractC13544u mo4659i = ((InterfaceC13518o0) obj2).mo4659i();
                    Object obj3 = linkedHashMap.get(mo4659i);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(mo4659i, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                m3894j = C13725q0.m3894j(linkedHashMap, C11959f.f26660c);
                Collection values = m3894j.values();
                l.e(values, "properties\n             …                }).values");
                List list = (List) C13722p.m3945b0(values);
                if (list.size() == 1) {
                    l.e(list, "mostVisibleProperties");
                    return (InterfaceC13518o0) C13722p.m3954R(list);
                }
                C12614f m7349i2 = C12614f.m7349i(str);
                l.e(m7349i2, "Name.identifier(name)");
                m3797a0 = C13742z.m3797a0(mo9974u(m7349i2), "\n", null, null, 0, null, C11958e.f26659c, 30, null);
                StringBuilder sb = new StringBuilder();
                sb.append("Property '");
                sb.append(str);
                sb.append("' (JVM signature: ");
                sb.append(str2);
                sb.append(") not resolved in ");
                sb.append(this);
                sb.append(':');
                sb.append(m3797a0.length() == 0 ? " no members found" : '\n' + m3797a0);
                throw new C11899d0(sb.toString());
            }
            return (InterfaceC13518o0) C13722p.m3918q0(arrayList);
        }
        throw new C11899d0("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + this);
    }

    /* renamed from: o */
    public abstract Collection<InterfaceC13452l> mo9978o();

    /* renamed from: p */
    public abstract Collection<InterfaceC13554x> mo9977p(C12614f c12614f);

    /* renamed from: q */
    public abstract InterfaceC13518o0 mo9976q(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x001e A[SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<kotlin.p493j0.p494o.p495c.AbstractC11906f<?>> m10085s(kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h r8, kotlin.p493j0.p494o.p495c.AbstractC11952j.EnumC11956c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.e0.d.l.f(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.e0.d.l.f(r9, r0)
            kotlin.j0.o.c.j$g r0 = new kotlin.j0.o.c.j$g
            r0.<init>(r7, r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k.C12784a.m6774a(r8, r1, r1, r2, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b
            if (r4 == 0) goto L4e
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.b r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13300b) r4
            kotlin.reflect.jvm.internal.impl.descriptors.u r5 = r4.mo4659i()
            kotlin.reflect.jvm.internal.impl.descriptors.u r6 = kotlin.reflect.jvm.internal.impl.descriptors.C13530t.f29895h
            boolean r5 = kotlin.e0.d.l.b(r5, r6)
            r5 = r5 ^ 1
            if (r5 == 0) goto L4e
            boolean r4 = r9.m10076a(r4)
            if (r4 == 0) goto L4e
            kotlin.w r4 = kotlin.C13666w.f30112a
            java.lang.Object r3 = r3.mo4769S(r0, r4)
            kotlin.j0.o.c.f r3 = (kotlin.p493j0.p494o.p495c.AbstractC11906f) r3
            goto L4f
        L4e:
            r3 = r1
        L4f:
            if (r3 == 0) goto L1e
            r2.add(r3)
            goto L1e
        L55:
            java.util.List r8 = kotlin.p557z.C13722p.m3972B0(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.AbstractC11952j.m10085s(kotlin.j0.o.c.p0.i.w.h, kotlin.j0.o.c.j$c):java.util.Collection");
    }

    /* renamed from: t */
    protected Class<?> mo9975t() {
        Class<?> m4888f = C13474b.m4888f(mo9979a());
        return m4888f != null ? m4888f : mo9979a();
    }

    /* renamed from: u */
    public abstract Collection<InterfaceC13518o0> mo9974u(C12614f c12614f);
}
