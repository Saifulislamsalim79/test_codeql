package kotlin.p493j0.p494o.p495c;

import java.lang.reflect.Field;
import kotlin.C13666w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11783c;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11866e;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.AbstractC11900e;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.p493j0.p494o.p495c.p496o0.C12020h;
import kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12367k;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.AbstractC12491d;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12497g;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12671c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13516n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13520p0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13522q0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: KPropertyImpl.kt */
/* renamed from: kotlin.j0.o.c.w */
/* loaded from: classes3.dex */
public abstract class AbstractC13198w<V> extends AbstractC11906f<V> implements InterfaceC11872i<V> {

    /* renamed from: z */
    private static final Object f29332z = new Object();

    /* renamed from: d */
    private final C11916f0.C11918b<Field> f29333d;

    /* renamed from: e */
    private final C11916f0.C11917a<InterfaceC13518o0> f29334e;

    /* renamed from: f */
    private final AbstractC11952j f29335f;

    /* renamed from: w */
    private final String f29336w;

    /* renamed from: x */
    private final String f29337x;

    /* renamed from: y */
    private final Object f29338y;

    /* compiled from: KPropertyImpl.kt */
    /* renamed from: kotlin.j0.o.c.w$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC13199a<PropertyType, ReturnType> extends AbstractC11906f<ReturnType> implements InterfaceC11866e<ReturnType> {
        @Override // kotlin.p493j0.p494o.p495c.AbstractC11906f
        /* renamed from: g */
        public AbstractC11952j mo5657g() {
            return mo5655n().mo5657g();
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC11906f
        /* renamed from: l */
        public boolean mo5656l() {
            return mo5655n().mo5656l();
        }

        /* renamed from: m */
        public abstract InterfaceC13516n0 mo5649m();

        /* renamed from: n */
        public abstract AbstractC13198w<PropertyType> mo5655n();
    }

    /* compiled from: KPropertyImpl.kt */
    /* renamed from: kotlin.j0.o.c.w$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC13200b<V> extends AbstractC13199a<V, V> implements Object<V> {

        /* renamed from: f */
        static final /* synthetic */ InterfaceC11872i[] f29339f = {C11813x.m10312f(new C11808s(C11813x.m10316b(AbstractC13200b.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C11813x.m10312f(new C11808s(C11813x.m10316b(AbstractC13200b.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: d */
        private final C11916f0.C11917a f29340d = C11916f0.m10164d(new C13202b());

        /* renamed from: e */
        private final C11916f0.C11918b f29341e = C11916f0.m10166b(new C13201a());

        /* compiled from: KPropertyImpl.kt */
        /* renamed from: kotlin.j0.o.c.w$b$a */
        /* loaded from: classes3.dex */
        static final class C13201a extends AbstractC11802m implements InterfaceC11756a<InterfaceC11990d<?>> {
            C13201a() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final InterfaceC11990d<?> invoke() {
                return C13208x.m5643a(AbstractC13200b.this, true);
            }
        }

        /* compiled from: KPropertyImpl.kt */
        /* renamed from: kotlin.j0.o.c.w$b$b */
        /* loaded from: classes3.dex */
        static final class C13202b extends AbstractC11802m implements InterfaceC11756a<InterfaceC13520p0> {
            C13202b() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final InterfaceC13520p0 invoke() {
                InterfaceC13520p0 mo4747q = AbstractC13200b.this.mo5655n().mo5650h().mo4747q();
                return mo4747q != null ? mo4747q : C12671c.m7061b(AbstractC13200b.this.mo5655n().mo5650h(), InterfaceC13346g.f29516s.m5317b());
            }
        }

        @Override // kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public String mo4699b() {
            return "<get-" + mo5655n().mo4699b() + '>';
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            return (obj instanceof AbstractC13200b) && l.b(mo5655n(), ((AbstractC13200b) obj).mo5655n());
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC11906f
        /* renamed from: f */
        public InterfaceC11990d<?> mo5651f() {
            return (InterfaceC11990d) this.f29341e.m10160b(this, f29339f[1]);
        }

        @Override // java.lang.Object
        public int hashCode() {
            return mo5655n().hashCode();
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC13198w.AbstractC13199a
        /* renamed from: o */
        public InterfaceC13520p0 mo5649m() {
            return (InterfaceC13520p0) this.f29340d.m10160b(this, f29339f[0]);
        }

        @Override // java.lang.Object
        public String toString() {
            return "getter of " + mo5655n();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    /* renamed from: kotlin.j0.o.c.w$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC13203c<V> extends AbstractC13199a<V, C13666w> implements Object<V> {

        /* renamed from: f */
        static final /* synthetic */ InterfaceC11872i[] f29344f = {C11813x.m10312f(new C11808s(C11813x.m10316b(AbstractC13203c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C11813x.m10312f(new C11808s(C11813x.m10316b(AbstractC13203c.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: d */
        private final C11916f0.C11917a f29345d = C11916f0.m10164d(new C13205b());

        /* renamed from: e */
        private final C11916f0.C11918b f29346e = C11916f0.m10166b(new C13204a());

        /* compiled from: KPropertyImpl.kt */
        /* renamed from: kotlin.j0.o.c.w$c$a */
        /* loaded from: classes3.dex */
        static final class C13204a extends AbstractC11802m implements InterfaceC11756a<InterfaceC11990d<?>> {
            C13204a() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final InterfaceC11990d<?> invoke() {
                return C13208x.m5643a(AbstractC13203c.this, false);
            }
        }

        /* compiled from: KPropertyImpl.kt */
        /* renamed from: kotlin.j0.o.c.w$c$b */
        /* loaded from: classes3.dex */
        static final class C13205b extends AbstractC11802m implements InterfaceC11756a<InterfaceC13522q0> {
            C13205b() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final InterfaceC13522q0 invoke() {
                InterfaceC13522q0 mo4748i0 = AbstractC13203c.this.mo5655n().mo5650h().mo4748i0();
                return mo4748i0 != null ? mo4748i0 : C12671c.m7060c(AbstractC13203c.this.mo5655n().mo5650h(), InterfaceC13346g.f29516s.m5317b(), InterfaceC13346g.f29516s.m5317b());
            }
        }

        @Override // kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public String mo4699b() {
            return "<set-" + mo5655n().mo4699b() + '>';
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            return (obj instanceof AbstractC13203c) && l.b(mo5655n(), ((AbstractC13203c) obj).mo5655n());
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC11906f
        /* renamed from: f */
        public InterfaceC11990d<?> mo5651f() {
            return (InterfaceC11990d) this.f29346e.m10160b(this, f29344f[1]);
        }

        @Override // java.lang.Object
        public int hashCode() {
            return mo5655n().hashCode();
        }

        @Override // kotlin.p493j0.p494o.p495c.AbstractC13198w.AbstractC13199a
        /* renamed from: o */
        public InterfaceC13522q0 mo5649m() {
            return (InterfaceC13522q0) this.f29345d.m10160b(this, f29344f[0]);
        }

        @Override // java.lang.Object
        public String toString() {
            return "setter of " + mo5655n();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    /* renamed from: kotlin.j0.o.c.w$d */
    /* loaded from: classes3.dex */
    static final class C13206d extends AbstractC11802m implements InterfaceC11756a<InterfaceC13518o0> {
        C13206d() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC13518o0 invoke() {
            return AbstractC13198w.this.mo5657g().m10086n(AbstractC13198w.this.mo4699b(), AbstractC13198w.this.m5658t());
        }
    }

    /* compiled from: KPropertyImpl.kt */
    /* renamed from: kotlin.j0.o.c.w$e */
    /* loaded from: classes3.dex */
    static final class C13207e extends AbstractC11802m implements InterfaceC11756a<Field> {
        C13207e() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Field invoke() {
            Class<?> enclosingClass;
            AbstractC11900e m10066f = C11961j0.f26662b.m10066f(AbstractC13198w.this.mo5650h());
            if (m10066f instanceof AbstractC11900e.C11903c) {
                AbstractC11900e.C11903c c11903c = (AbstractC11900e.C11903c) m10066f;
                InterfaceC13518o0 m10190b = c11903c.m10190b();
                AbstractC12491d.C12492a m8637d = C12497g.m8637d(C12497g.f27759a, c11903c.m10187e(), c11903c.m10188d(), c11903c.m10185g(), false, 8, null);
                if (m8637d != null) {
                    if (!C12367k.m9109e(m10190b) && !C12497g.m8635f(c11903c.m10187e())) {
                        InterfaceC13513m mo4687d = m10190b.mo4687d();
                        enclosingClass = mo4687d instanceof InterfaceC13312e ? C11972m0.m10029m((InterfaceC13312e) mo4687d) : AbstractC13198w.this.mo5657g().mo9979a();
                    } else {
                        enclosingClass = AbstractC13198w.this.mo5657g().mo9979a().getEnclosingClass();
                    }
                    if (enclosingClass != null) {
                        try {
                            return enclosingClass.getDeclaredField(m8637d.mo8643c());
                        } catch (NoSuchFieldException unused) {
                            return null;
                        }
                    }
                    return null;
                }
                return null;
            } else if (m10066f instanceof AbstractC11900e.C11901a) {
                return ((AbstractC11900e.C11901a) m10066f).m10193b();
            } else {
                if ((m10066f instanceof AbstractC11900e.C11902b) || (m10066f instanceof AbstractC11900e.C11904d)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private AbstractC13198w(AbstractC11952j abstractC11952j, String str, String str2, InterfaceC13518o0 interfaceC13518o0, Object obj) {
        this.f29335f = abstractC11952j;
        this.f29336w = str;
        this.f29337x = str2;
        this.f29338y = obj;
        C11916f0.C11918b<Field> m10166b = C11916f0.m10166b(new C13207e());
        l.e(m10166b, "ReflectProperties.lazy {…y -> null\n        }\n    }");
        this.f29333d = m10166b;
        C11916f0.C11917a<InterfaceC13518o0> m10165c = C11916f0.m10165c(interfaceC13518o0, new C13206d());
        l.e(m10165c, "ReflectProperties.lazySo…or(name, signature)\n    }");
        this.f29334e = m10165c;
    }

    @Override // kotlin.p493j0.InterfaceC11862a
    /* renamed from: b */
    public String mo4699b() {
        return this.f29336w;
    }

    public boolean equals(Object obj) {
        AbstractC13198w<?> m10040b = C11972m0.m10040b(obj);
        return m10040b != null && l.b(mo5657g(), m10040b.mo5657g()) && l.b(mo4699b(), m10040b.mo4699b()) && l.b(this.f29337x, m10040b.f29337x) && l.b(this.f29338y, m10040b.f29338y);
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC11906f
    /* renamed from: f */
    public InterfaceC11990d<?> mo5651f() {
        return mo5660r().mo5651f();
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC11906f
    /* renamed from: g */
    public AbstractC11952j mo5657g() {
        return this.f29335f;
    }

    public int hashCode() {
        return (((mo5657g().hashCode() * 31) + mo4699b().hashCode()) * 31) + this.f29337x.hashCode();
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC11906f
    /* renamed from: l */
    public boolean mo5656l() {
        return !l.b(this.f29338y, AbstractC11783c.f26476y);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final Field m5664m() {
        if (mo5650h().mo5266W()) {
            return m5659s();
        }
        return null;
    }

    /* renamed from: n */
    public final Object m5663n() {
        return C12020h.m9997a(this.f29338y, mo5650h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return r2.get(r3);
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5662o(java.lang.reflect.Field r2, java.lang.Object r3) {
        /*
            r1 = this;
            java.lang.Object r0 = kotlin.p493j0.p494o.p495c.AbstractC13198w.f29332z     // Catch: java.lang.IllegalAccessException -> L39
            if (r3 != r0) goto L30
            kotlin.reflect.jvm.internal.impl.descriptors.o0 r0 = r1.mo5650h()     // Catch: java.lang.IllegalAccessException -> L39
            kotlin.reflect.jvm.internal.impl.descriptors.r0 r0 = r0.mo5056w0()     // Catch: java.lang.IllegalAccessException -> L39
            if (r0 == 0) goto Lf
            goto L30
        Lf:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.IllegalAccessException -> L39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> L39
            r3.<init>()     // Catch: java.lang.IllegalAccessException -> L39
            r0 = 39
            r3.append(r0)     // Catch: java.lang.IllegalAccessException -> L39
            r3.append(r1)     // Catch: java.lang.IllegalAccessException -> L39
            java.lang.String r0 = "' is not an extension property and thus getExtensionDelegate() "
            r3.append(r0)     // Catch: java.lang.IllegalAccessException -> L39
            java.lang.String r0 = "is not going to work, use getDelegate() instead"
            r3.append(r0)     // Catch: java.lang.IllegalAccessException -> L39
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalAccessException -> L39
            r2.<init>(r3)     // Catch: java.lang.IllegalAccessException -> L39
            throw r2     // Catch: java.lang.IllegalAccessException -> L39
        L30:
            if (r2 == 0) goto L37
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.IllegalAccessException -> L39
            goto L38
        L37:
            r2 = 0
        L38:
            return r2
        L39:
            r2 = move-exception
            kotlin.reflect.full.IllegalPropertyDelegateAccessException r3 = new kotlin.reflect.full.IllegalPropertyDelegateAccessException
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.AbstractC13198w.m5662o(java.lang.reflect.Field, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC11906f
    /* renamed from: p */
    public InterfaceC13518o0 mo5650h() {
        InterfaceC13518o0 invoke = this.f29334e.invoke();
        l.e(invoke, "_descriptor()");
        return invoke;
    }

    /* renamed from: r */
    public abstract AbstractC13200b<V> mo5660r();

    /* renamed from: s */
    public final Field m5659s() {
        return this.f29333d.invoke();
    }

    /* renamed from: t */
    public final String m5658t() {
        return this.f29337x;
    }

    public String toString() {
        return C11949i0.f26645b.m10098g(mo5650h());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC13198w(AbstractC11952j abstractC11952j, String str, String str2, Object obj) {
        this(abstractC11952j, str, str2, null, obj);
        l.f(abstractC11952j, "container");
        l.f(str, "name");
        l.f(str2, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC13198w(kotlin.p493j0.p494o.p495c.AbstractC11952j r8, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.e0.d.l.f(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.e0.d.l.f(r9, r0)
            kotlin.j0.o.c.p0.f.f r0 = r9.mo5012b()
            java.lang.String r3 = r0.m7353b()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.e0.d.l.e(r3, r0)
            kotlin.j0.o.c.j0 r0 = kotlin.p493j0.p494o.p495c.C11961j0.f26662b
            kotlin.j0.o.c.e r0 = r0.m10066f(r9)
            java.lang.String r4 = r0.mo10184a()
            java.lang.Object r6 = kotlin.p483e0.p485d.AbstractC11783c.f26476y
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.AbstractC13198w.<init>(kotlin.j0.o.c.j, kotlin.reflect.jvm.internal.impl.descriptors.o0):void");
    }
}
