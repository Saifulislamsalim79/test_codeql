package kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12039c;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.EnumC12052i;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p499p.EnumC12069c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12610d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12612e;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12616h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.EnumC12757e;
import kotlin.p557z.C13726r;
/* compiled from: JavaToKotlinClassMap.kt */
/* renamed from: kotlin.j0.o.c.p0.b.q.c */
/* loaded from: classes3.dex */
public final class C12080c {

    /* renamed from: a */
    public static final C12080c f26925a = new C12080c();

    /* renamed from: b */
    private static final String f26926b = EnumC12069c.Function.m9797e().toString() + '.' + EnumC12069c.Function.m9798b();

    /* renamed from: c */
    private static final String f26927c = EnumC12069c.KFunction.m9797e().toString() + '.' + EnumC12069c.KFunction.m9798b();

    /* renamed from: d */
    private static final String f26928d = EnumC12069c.SuspendFunction.m9797e().toString() + '.' + EnumC12069c.SuspendFunction.m9798b();

    /* renamed from: e */
    private static final String f26929e = EnumC12069c.KSuspendFunction.m9797e().toString() + '.' + EnumC12069c.KSuspendFunction.m9798b();

    /* renamed from: f */
    private static final C12608b f26930f;

    /* renamed from: g */
    private static final C12609c f26931g;

    /* renamed from: h */
    private static final C12608b f26932h;

    /* renamed from: i */
    private static final HashMap<C12610d, C12608b> f26933i;

    /* renamed from: j */
    private static final HashMap<C12610d, C12608b> f26934j;

    /* renamed from: k */
    private static final HashMap<C12610d, C12609c> f26935k;

    /* renamed from: l */
    private static final HashMap<C12610d, C12609c> f26936l;

    /* renamed from: m */
    private static final List<C12081a> f26937m;

    /* compiled from: JavaToKotlinClassMap.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.q.c$a */
    /* loaded from: classes3.dex */
    public static final class C12081a {

        /* renamed from: a */
        private final C12608b f26938a;

        /* renamed from: b */
        private final C12608b f26939b;

        /* renamed from: c */
        private final C12608b f26940c;

        public C12081a(C12608b c12608b, C12608b c12608b2, C12608b c12608b3) {
            l.f(c12608b, "javaClass");
            l.f(c12608b2, "kotlinReadOnly");
            l.f(c12608b3, "kotlinMutable");
            this.f26938a = c12608b;
            this.f26939b = c12608b2;
            this.f26940c = c12608b3;
        }

        /* renamed from: a */
        public final C12608b m9763a() {
            return this.f26938a;
        }

        /* renamed from: b */
        public final C12608b m9762b() {
            return this.f26939b;
        }

        /* renamed from: c */
        public final C12608b m9761c() {
            return this.f26940c;
        }

        /* renamed from: d */
        public final C12608b m9760d() {
            return this.f26938a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12081a) {
                C12081a c12081a = (C12081a) obj;
                return l.b(this.f26938a, c12081a.f26938a) && l.b(this.f26939b, c12081a.f26939b) && l.b(this.f26940c, c12081a.f26940c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f26938a.hashCode() * 31) + this.f26939b.hashCode()) * 31) + this.f26940c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f26938a + ", kotlinReadOnly=" + this.f26939b + ", kotlinMutable=" + this.f26940c + ')';
        }
    }

    static {
        List<C12081a> m3888h;
        C12608b m7384m = C12608b.m7384m(new C12609c("kotlin.jvm.functions.FunctionN"));
        l.e(m7384m, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        f26930f = m7384m;
        C12609c m7395b = m7384m.m7395b();
        l.e(m7395b, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f26931g = m7395b;
        C12608b m7384m2 = C12608b.m7384m(new C12609c("kotlin.reflect.KFunction"));
        l.e(m7384m2, "topLevel(FqName(\"kotlin.reflect.KFunction\"))");
        f26932h = m7384m2;
        l.e(C12608b.m7384m(new C12609c("kotlin.reflect.KClass")), "topLevel(FqName(\"kotlin.reflect.KClass\"))");
        f26925a.m9773h(Class.class);
        f26933i = new HashMap<>();
        f26934j = new HashMap<>();
        f26935k = new HashMap<>();
        f26936l = new HashMap<>();
        C12080c c12080c = f26925a;
        C12608b m7384m3 = C12608b.m7384m(C12059k.C12060a.f26814B);
        l.e(m7384m3, "topLevel(FqNames.iterable)");
        C12609c c12609c = C12059k.C12060a.f26822J;
        C12609c m7389h = m7384m3.m7389h();
        C12609c m7389h2 = m7384m3.m7389h();
        l.e(m7389h2, "kotlinReadOnly.packageFqName");
        C12609c m7355d = C12612e.m7355d(c12609c, m7389h2);
        int i = 0;
        C12608b c12608b = new C12608b(m7389h, m7355d, false);
        C12080c c12080c2 = f26925a;
        C12608b m7384m4 = C12608b.m7384m(C12059k.C12060a.f26813A);
        l.e(m7384m4, "topLevel(FqNames.iterator)");
        C12609c c12609c2 = C12059k.C12060a.f26821I;
        C12609c m7389h3 = m7384m4.m7389h();
        C12609c m7389h4 = m7384m4.m7389h();
        l.e(m7389h4, "kotlinReadOnly.packageFqName");
        C12608b c12608b2 = new C12608b(m7389h3, C12612e.m7355d(c12609c2, m7389h4), false);
        C12080c c12080c3 = f26925a;
        C12608b m7384m5 = C12608b.m7384m(C12059k.C12060a.f26815C);
        l.e(m7384m5, "topLevel(FqNames.collection)");
        C12609c c12609c3 = C12059k.C12060a.f26823K;
        C12609c m7389h5 = m7384m5.m7389h();
        C12609c m7389h6 = m7384m5.m7389h();
        l.e(m7389h6, "kotlinReadOnly.packageFqName");
        C12608b c12608b3 = new C12608b(m7389h5, C12612e.m7355d(c12609c3, m7389h6), false);
        C12080c c12080c4 = f26925a;
        C12608b m7384m6 = C12608b.m7384m(C12059k.C12060a.f26816D);
        l.e(m7384m6, "topLevel(FqNames.list)");
        C12609c c12609c4 = C12059k.C12060a.f26824L;
        C12609c m7389h7 = m7384m6.m7389h();
        C12609c m7389h8 = m7384m6.m7389h();
        l.e(m7389h8, "kotlinReadOnly.packageFqName");
        C12608b c12608b4 = new C12608b(m7389h7, C12612e.m7355d(c12609c4, m7389h8), false);
        C12080c c12080c5 = f26925a;
        C12608b m7384m7 = C12608b.m7384m(C12059k.C12060a.f26818F);
        l.e(m7384m7, "topLevel(FqNames.set)");
        C12609c c12609c5 = C12059k.C12060a.f26826N;
        C12609c m7389h9 = m7384m7.m7389h();
        C12609c m7389h10 = m7384m7.m7389h();
        l.e(m7389h10, "kotlinReadOnly.packageFqName");
        C12608b c12608b5 = new C12608b(m7389h9, C12612e.m7355d(c12609c5, m7389h10), false);
        C12080c c12080c6 = f26925a;
        C12608b m7384m8 = C12608b.m7384m(C12059k.C12060a.f26817E);
        l.e(m7384m8, "topLevel(FqNames.listIterator)");
        C12609c c12609c6 = C12059k.C12060a.f26825M;
        C12609c m7389h11 = m7384m8.m7389h();
        C12609c m7389h12 = m7384m8.m7389h();
        l.e(m7389h12, "kotlinReadOnly.packageFqName");
        C12608b c12608b6 = new C12608b(m7389h11, C12612e.m7355d(c12609c6, m7389h12), false);
        C12080c c12080c7 = f26925a;
        C12608b m7384m9 = C12608b.m7384m(C12059k.C12060a.f26819G);
        l.e(m7384m9, "topLevel(FqNames.map)");
        C12609c c12609c7 = C12059k.C12060a.f26827O;
        C12609c m7389h13 = m7384m9.m7389h();
        C12609c m7389h14 = m7384m9.m7389h();
        l.e(m7389h14, "kotlinReadOnly.packageFqName");
        C12608b c12608b7 = new C12608b(m7389h13, C12612e.m7355d(c12609c7, m7389h14), false);
        C12080c c12080c8 = f26925a;
        C12608b m7393d = C12608b.m7384m(C12059k.C12060a.f26819G).m7393d(C12059k.C12060a.f26820H.m7377g());
        l.e(m7393d, "topLevel(FqNames.map).createNestedClassId(FqNames.mapEntry.shortName())");
        C12609c c12609c8 = C12059k.C12060a.f26828P;
        C12609c m7389h15 = m7393d.m7389h();
        C12609c m7389h16 = m7393d.m7389h();
        l.e(m7389h16, "kotlinReadOnly.packageFqName");
        m3888h = C13726r.m3888h(new C12081a(c12080c.m9773h(Iterable.class), m7384m3, c12608b), new C12081a(c12080c2.m9773h(Iterator.class), m7384m4, c12608b2), new C12081a(c12080c3.m9773h(Collection.class), m7384m5, c12608b3), new C12081a(c12080c4.m9773h(List.class), m7384m6, c12608b4), new C12081a(c12080c5.m9773h(Set.class), m7384m7, c12608b5), new C12081a(c12080c6.m9773h(ListIterator.class), m7384m8, c12608b6), new C12081a(c12080c7.m9773h(Map.class), m7384m9, c12608b7), new C12081a(c12080c8.m9773h(Map.Entry.class), m7393d, new C12608b(m7389h15, C12612e.m7355d(c12609c8, m7389h16), false)));
        f26937m = m3888h;
        f26925a.m9774g(Object.class, C12059k.C12060a.f26841b);
        f26925a.m9774g(String.class, C12059k.C12060a.f26851g);
        f26925a.m9774g(CharSequence.class, C12059k.C12060a.f26849f);
        f26925a.m9775f(Throwable.class, C12059k.C12060a.f26859l);
        f26925a.m9774g(Cloneable.class, C12059k.C12060a.f26845d);
        f26925a.m9774g(Number.class, C12059k.C12060a.f26857j);
        f26925a.m9775f(Comparable.class, C12059k.C12060a.f26860m);
        f26925a.m9774g(Enum.class, C12059k.C12060a.f26858k);
        f26925a.m9775f(Annotation.class, C12059k.C12060a.f26866s);
        for (C12081a c12081a : f26937m) {
            f26925a.m9776e(c12081a);
        }
        EnumC12757e[] values = EnumC12757e.values();
        int length = values.length;
        int i2 = 0;
        while (i2 < length) {
            EnumC12757e enumC12757e = values[i2];
            i2++;
            C12080c c12080c9 = f26925a;
            C12608b m7384m10 = C12608b.m7384m(enumC12757e.m6823j());
            l.e(m7384m10, "topLevel(jvmType.wrapperFqName)");
            C12059k c12059k = C12059k.f26798a;
            EnumC12052i m6824i = enumC12757e.m6824i();
            l.e(m6824i, "jvmType.primitiveType");
            C12608b m7384m11 = C12608b.m7384m(C12059k.m9836c(m6824i));
            l.e(m7384m11, "topLevel(StandardNames.getPrimitiveFqName(jvmType.primitiveType))");
            c12080c9.m9779b(m7384m10, m7384m11);
        }
        for (C12608b c12608b8 : C12039c.f26758a.m9958a()) {
            C12080c c12080c10 = f26925a;
            C12608b m7384m12 = C12608b.m7384m(new C12609c("kotlin.jvm.internal." + c12608b8.m7387j().m7353b() + "CompanionObject"));
            l.e(m7384m12, "topLevel(FqName(\"kotlin.jvm.internal.\" + classId.shortClassName.asString() + \"CompanionObject\"))");
            C12608b m7393d2 = c12608b8.m7393d(C12616h.f28388b);
            l.e(m7393d2, "classId.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)");
            c12080c10.m9779b(m7384m12, m7393d2);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            C12080c c12080c11 = f26925a;
            C12608b m7384m13 = C12608b.m7384m(new C12609c(l.m("kotlin.jvm.functions.Function", Integer.valueOf(i3))));
            l.e(m7384m13, "topLevel(FqName(\"kotlin.jvm.functions.Function$i\"))");
            C12059k c12059k2 = C12059k.f26798a;
            c12080c11.m9779b(m7384m13, C12059k.m9838a(i3));
            f26925a.m9777d(new C12609c(l.m(f26927c, Integer.valueOf(i3))), f26932h);
            if (i4 >= 23) {
                break;
            }
            i3 = i4;
        }
        while (true) {
            int i5 = i + 1;
            EnumC12069c enumC12069c = EnumC12069c.KSuspendFunction;
            f26925a.m9777d(new C12609c(l.m(enumC12069c.m9797e().toString() + '.' + enumC12069c.m9798b(), Integer.valueOf(i))), f26932h);
            if (i5 >= 22) {
                C12080c c12080c12 = f26925a;
                C12609c m7361l = C12059k.C12060a.f26843c.m7361l();
                l.e(m7361l, "nothing.toSafe()");
                c12080c12.m9777d(m7361l, f26925a.m9773h(Void.class));
                return;
            }
            i = i5;
        }
    }

    private C12080c() {
    }

    /* renamed from: b */
    private final void m9779b(C12608b c12608b, C12608b c12608b2) {
        m9778c(c12608b, c12608b2);
        C12609c m7395b = c12608b2.m7395b();
        l.e(m7395b, "kotlinClassId.asSingleFqName()");
        m9777d(m7395b, c12608b);
    }

    /* renamed from: c */
    private final void m9778c(C12608b c12608b, C12608b c12608b2) {
        HashMap<C12610d, C12608b> hashMap = f26933i;
        C12610d m7374j = c12608b.m7395b().m7374j();
        l.e(m7374j, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(m7374j, c12608b2);
    }

    /* renamed from: d */
    private final void m9777d(C12609c c12609c, C12608b c12608b) {
        HashMap<C12610d, C12608b> hashMap = f26934j;
        C12610d m7374j = c12609c.m7374j();
        l.e(m7374j, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(m7374j, c12608b);
    }

    /* renamed from: e */
    private final void m9776e(C12081a c12081a) {
        C12608b m9763a = c12081a.m9763a();
        C12608b m9762b = c12081a.m9762b();
        C12608b m9761c = c12081a.m9761c();
        m9779b(m9763a, m9762b);
        C12609c m7395b = m9761c.m7395b();
        l.e(m7395b, "mutableClassId.asSingleFqName()");
        m9777d(m7395b, m9763a);
        C12609c m7395b2 = m9762b.m7395b();
        l.e(m7395b2, "readOnlyClassId.asSingleFqName()");
        C12609c m7395b3 = m9761c.m7395b();
        l.e(m7395b3, "mutableClassId.asSingleFqName()");
        HashMap<C12610d, C12609c> hashMap = f26935k;
        C12610d m7374j = m9761c.m7395b().m7374j();
        l.e(m7374j, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(m7374j, m7395b2);
        HashMap<C12610d, C12609c> hashMap2 = f26936l;
        C12610d m7374j2 = m7395b2.m7374j();
        l.e(m7374j2, "readOnlyFqName.toUnsafe()");
        hashMap2.put(m7374j2, m7395b3);
    }

    /* renamed from: f */
    private final void m9775f(Class<?> cls, C12609c c12609c) {
        C12608b m9773h = m9773h(cls);
        C12608b m7384m = C12608b.m7384m(c12609c);
        l.e(m7384m, "topLevel(kotlinFqName)");
        m9779b(m9773h, m7384m);
    }

    /* renamed from: g */
    private final void m9774g(Class<?> cls, C12610d c12610d) {
        C12609c m7361l = c12610d.m7361l();
        l.e(m7361l, "kotlinFqName.toSafe()");
        m9775f(cls, m7361l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final C12608b m9773h(Class<?> cls) {
        boolean z = (cls.isPrimitive() || cls.isArray()) ? false : true;
        if (!C13668y.f30115a || z) {
            Class<?> declaringClass = cls.getDeclaringClass();
            if (declaringClass == null) {
                C12608b m7384m = C12608b.m7384m(new C12609c(cls.getCanonicalName()));
                l.e(m7384m, "topLevel(FqName(clazz.canonicalName))");
                return m7384m;
            }
            C12608b m7393d = m9773h(declaringClass).m7393d(C12614f.m7349i(cls.getSimpleName()));
            l.e(m7393d, "classId(outer).createNestedClassId(Name.identifier(clazz.simpleName))");
            return m7393d;
        }
        throw new AssertionError(l.m("Invalid class: ", cls));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        r5 = kotlin.p549l0.C13275r.m5455k(r5);
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m9770k(kotlin.p493j0.p494o.p495c.p497p0.p520f.C12610d r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r5 = r5.m7371b()
            java.lang.String r0 = "kotlinFqName.asString()"
            kotlin.e0.d.l.e(r5, r0)
            java.lang.String r0 = ""
            java.lang.String r5 = kotlin.p549l0.C13265j.m5512A0(r5, r6, r0)
            int r6 = r5.length()
            r0 = 1
            r1 = 0
            if (r6 <= 0) goto L19
            r6 = 1
            goto L1a
        L19:
            r6 = 0
        L1a:
            if (r6 == 0) goto L37
            r6 = 48
            r2 = 2
            r3 = 0
            boolean r6 = kotlin.p549l0.C13265j.m5467w0(r5, r6, r1, r2, r3)
            if (r6 != 0) goto L37
            java.lang.Integer r5 = kotlin.p549l0.C13265j.m5481k(r5)
            if (r5 == 0) goto L35
            int r5 = r5.intValue()
            r6 = 23
            if (r5 < r6) goto L35
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q.C12080c.m9770k(kotlin.j0.o.c.p0.f.d, java.lang.String):boolean");
    }

    /* renamed from: i */
    public final C12609c m9772i() {
        return f26931g;
    }

    /* renamed from: j */
    public final List<C12081a> m9771j() {
        return f26937m;
    }

    /* renamed from: l */
    public final boolean m9769l(C12610d c12610d) {
        HashMap<C12610d, C12609c> hashMap = f26935k;
        if (hashMap != null) {
            return hashMap.containsKey(c12610d);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    /* renamed from: m */
    public final boolean m9768m(C12610d c12610d) {
        HashMap<C12610d, C12609c> hashMap = f26936l;
        if (hashMap != null) {
            return hashMap.containsKey(c12610d);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    /* renamed from: n */
    public final C12608b m9767n(C12609c c12609c) {
        l.f(c12609c, "fqName");
        return f26933i.get(c12609c.m7374j());
    }

    /* renamed from: o */
    public final C12608b m9766o(C12610d c12610d) {
        l.f(c12610d, "kotlinFqName");
        if (!m9770k(c12610d, f26926b) && !m9770k(c12610d, f26928d)) {
            if (!m9770k(c12610d, f26927c) && !m9770k(c12610d, f26929e)) {
                return f26934j.get(c12610d);
            }
            return f26932h;
        }
        return f26930f;
    }

    /* renamed from: p */
    public final C12609c m9765p(C12610d c12610d) {
        return f26935k.get(c12610d);
    }

    /* renamed from: q */
    public final C12609c m9764q(C12610d c12610d) {
        return f26936l.get(c12610d);
    }
}
