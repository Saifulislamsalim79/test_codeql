package kotlin.p493j0.p494o.p495c;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p483e0.C11754a;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11799i;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11863b;
import kotlin.p493j0.InterfaceC11865d;
import kotlin.p493j0.InterfaceC11866e;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.AbstractC11952j;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12039c;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12041d;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.EnumC12115d;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0.C12408a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12542n;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.C12470a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12596e;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12673d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12907u;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.C12826d;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import kotlin.p557z.C13715n;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.C13550w;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13319f;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC13560z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13452l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a.C13459f;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a.C13465k;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC13580h;
import kotlin.reflect.jvm.internal.impl.utils.C13634a;
/* compiled from: KClassImpl.kt */
/* renamed from: kotlin.j0.o.c.h */
/* loaded from: classes3.dex */
public final class C11923h<T> extends AbstractC11952j implements InterfaceC11863b<T>, Object {

    /* renamed from: f */
    private final C11916f0.C11918b<C11923h<T>.C11924a> f26606f;

    /* renamed from: w */
    private final Class<T> f26607w;

    /* compiled from: KClassImpl.kt */
    /* renamed from: kotlin.j0.o.c.h$a */
    /* loaded from: classes3.dex */
    public final class C11924a extends AbstractC11952j.AbstractC11954b {

        /* renamed from: n */
        static final /* synthetic */ InterfaceC11872i[] f26608n = {C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "annotations", "getAnnotations()Ljava/util/List;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "simpleName", "getSimpleName()Ljava/lang/String;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "constructors", "getConstructors()Ljava/util/Collection;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "typeParameters", "getTypeParameters()Ljava/util/List;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "supertypes", "getSupertypes()Ljava/util/List;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11924a.class), "allMembers", "getAllMembers()Ljava/util/Collection;"))};

        /* renamed from: d */
        private final C11916f0.C11917a f26609d;

        /* renamed from: e */
        private final C11916f0.C11917a f26610e;

        /* renamed from: f */
        private final C11916f0.C11917a f26611f;

        /* renamed from: g */
        private final C11916f0.C11917a f26612g;

        /* renamed from: h */
        private final C11916f0.C11917a f26613h;

        /* renamed from: i */
        private final C11916f0.C11917a f26614i;

        /* renamed from: j */
        private final C11916f0.C11917a f26615j;

        /* renamed from: k */
        private final C11916f0.C11917a f26616k;

        /* renamed from: l */
        private final C11916f0.C11917a f26617l;

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$a */
        /* loaded from: classes3.dex */
        static final class C11925a extends AbstractC11802m implements InterfaceC11756a<List<? extends AbstractC11906f<?>>> {
            C11925a() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<AbstractC11906f<?>> invoke() {
                List<AbstractC11906f<?>> m3784n0;
                m3784n0 = C13742z.m3784n0(C11924a.this.m10132g(), C11924a.this.m10131h());
                return m3784n0;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$b */
        /* loaded from: classes3.dex */
        static final class C11926b extends AbstractC11802m implements InterfaceC11756a<List<? extends AbstractC11906f<?>>> {
            C11926b() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<AbstractC11906f<?>> invoke() {
                List<AbstractC11906f<?>> m3784n0;
                m3784n0 = C13742z.m3784n0(C11924a.this.m10130i(), C11924a.this.m10127l());
                return m3784n0;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$c */
        /* loaded from: classes3.dex */
        static final class C11927c extends AbstractC11802m implements InterfaceC11756a<List<? extends AbstractC11906f<?>>> {
            C11927c() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<AbstractC11906f<?>> invoke() {
                List<AbstractC11906f<?>> m3784n0;
                m3784n0 = C13742z.m3784n0(C11924a.this.m10129j(), C11924a.this.m10126m());
                return m3784n0;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$d */
        /* loaded from: classes3.dex */
        static final class C11928d extends AbstractC11802m implements InterfaceC11756a<List<? extends Annotation>> {
            C11928d() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<Annotation> invoke() {
                return C11972m0.m10039c(C11924a.this.m10128k());
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$e */
        /* loaded from: classes3.dex */
        static final class C11929e extends AbstractC11802m implements InterfaceC11756a<List<? extends InterfaceC11866e<? extends T>>> {
            C11929e() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<InterfaceC11866e<T>> invoke() {
                int m3867o;
                Collection<InterfaceC13452l> mo9978o = C11923h.this.mo9978o();
                m3867o = C13728s.m3867o(mo9978o, 10);
                ArrayList arrayList = new ArrayList(m3867o);
                for (InterfaceC13452l interfaceC13452l : mo9978o) {
                    arrayList.add(new C11962k(C11923h.this, interfaceC13452l));
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$f */
        /* loaded from: classes3.dex */
        static final class C11930f extends AbstractC11802m implements InterfaceC11756a<List<? extends AbstractC11906f<?>>> {
            C11930f() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<AbstractC11906f<?>> invoke() {
                List<AbstractC11906f<?>> m3784n0;
                m3784n0 = C13742z.m3784n0(C11924a.this.m10130i(), C11924a.this.m10129j());
                return m3784n0;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$g */
        /* loaded from: classes3.dex */
        static final class C11931g extends AbstractC11802m implements InterfaceC11756a<Collection<? extends AbstractC11906f<?>>> {
            C11931g() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final Collection<AbstractC11906f<?>> invoke() {
                C11923h c11923h = C11923h.this;
                return c11923h.m10085s(c11923h.m10144G(), AbstractC11952j.EnumC11956c.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$h */
        /* loaded from: classes3.dex */
        static final class C11932h extends AbstractC11802m implements InterfaceC11756a<Collection<? extends AbstractC11906f<?>>> {
            C11932h() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final Collection<AbstractC11906f<?>> invoke() {
                C11923h c11923h = C11923h.this;
                return c11923h.m10085s(c11923h.m10143H(), AbstractC11952j.EnumC11956c.DECLARED);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$i */
        /* loaded from: classes3.dex */
        static final class C11933i extends AbstractC11802m implements InterfaceC11756a<InterfaceC13312e> {
            C11933i() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final InterfaceC13312e invoke() {
                C12608b m10147D = C11923h.this.m10147D();
                C13465k m10078a = C11923h.this.m10146E().invoke().m10078a();
                InterfaceC13312e m6510b = m10147D.m7386k() ? m10078a.m4911a().m6510b(m10147D) : C13550w.m4703a(m10078a.m4910b(), m10147D);
                if (m6510b != null) {
                    return m6510b;
                }
                C11923h.m10148C(C11923h.this);
                throw null;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$j */
        /* loaded from: classes3.dex */
        static final class C11934j extends AbstractC11802m implements InterfaceC11756a<Collection<? extends AbstractC11906f<?>>> {
            C11934j() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final Collection<AbstractC11906f<?>> invoke() {
                C11923h c11923h = C11923h.this;
                return c11923h.m10085s(c11923h.m10144G(), AbstractC11952j.EnumC11956c.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$k */
        /* loaded from: classes3.dex */
        static final class C11935k extends AbstractC11802m implements InterfaceC11756a<Collection<? extends AbstractC11906f<?>>> {
            C11935k() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final Collection<AbstractC11906f<?>> invoke() {
                C11923h c11923h = C11923h.this;
                return c11923h.m10085s(c11923h.m10143H(), AbstractC11952j.EnumC11956c.INHERITED);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$l */
        /* loaded from: classes3.dex */
        static final class C11936l extends AbstractC11802m implements InterfaceC11756a<List<? extends C11923h<? extends Object>>> {
            C11936l() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<C11923h<? extends Object>> invoke() {
                Collection m6774a = InterfaceC12783k.C12784a.m6774a(C11924a.this.m10128k().mo5018I0(), null, null, 3, null);
                ArrayList<InterfaceC13513m> arrayList = new ArrayList();
                for (T t : m6774a) {
                    if (!C12673d.m7046B((InterfaceC13513m) t)) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC13513m interfaceC13513m : arrayList) {
                    if (interfaceC13513m != null) {
                        Class<?> m10029m = C11972m0.m10029m((InterfaceC13312e) interfaceC13513m);
                        C11923h c11923h = m10029m != null ? new C11923h(m10029m) : null;
                        if (c11923h != null) {
                            arrayList2.add(c11923h);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                }
                return arrayList2;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$m */
        /* loaded from: classes3.dex */
        static final class C11937m extends AbstractC11802m implements InterfaceC11756a<T> {
            C11937m() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            public final T invoke() {
                Field declaredField;
                InterfaceC13312e m10128k = C11924a.this.m10128k();
                if (m10128k.mo4957w() != EnumC13319f.OBJECT) {
                    return null;
                }
                if (m10128k.mo4974F() && !C12041d.m9955a(C12039c.f26758a, m10128k)) {
                    declaredField = C11923h.this.mo9979a().getEnclosingClass().getDeclaredField(m10128k.mo5012b().m7353b());
                } else {
                    declaredField = C11923h.this.mo9979a().getDeclaredField("INSTANCE");
                }
                T t = (T) declaredField.get(null);
                if (t != null) {
                    return t;
                }
                throw new NullPointerException("null cannot be cast to non-null type T");
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$n */
        /* loaded from: classes3.dex */
        static final class C11938n extends AbstractC11802m implements InterfaceC11756a<String> {
            C11938n() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            public final String invoke() {
                if (C11923h.this.mo9979a().isAnonymousClass()) {
                    return null;
                }
                C12608b m10147D = C11923h.this.m10147D();
                if (m10147D.m7386k()) {
                    return null;
                }
                return m10147D.m7395b().m7382b();
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$o */
        /* loaded from: classes3.dex */
        static final class C11939o extends AbstractC11802m implements InterfaceC11756a<List<? extends C11923h<? extends T>>> {
            C11939o() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<C11923h<? extends T>> invoke() {
                Collection<InterfaceC13312e> mo4971P = C11924a.this.m10128k().mo4971P();
                l.e(mo4971P, "descriptor.sealedSubclasses");
                ArrayList arrayList = new ArrayList();
                for (InterfaceC13312e interfaceC13312e : mo4971P) {
                    if (interfaceC13312e != null) {
                        Class<?> m10029m = C11972m0.m10029m(interfaceC13312e);
                        C11923h c11923h = m10029m != null ? new C11923h(m10029m) : null;
                        if (c11923h != null) {
                            arrayList.add(c11923h);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                }
                return arrayList;
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$p */
        /* loaded from: classes3.dex */
        static final class C11940p extends AbstractC11802m implements InterfaceC11756a<String> {
            C11940p() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            public final String invoke() {
                if (C11923h.this.mo9979a().isAnonymousClass()) {
                    return null;
                }
                C12608b m10147D = C11923h.this.m10147D();
                if (m10147D.m7386k()) {
                    C11924a c11924a = C11924a.this;
                    return c11924a.m10133f(C11923h.this.mo9979a());
                }
                String m7353b = m10147D.m7387j().m7353b();
                l.e(m7353b, "classId.shortClassName.asString()");
                return m7353b;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$q */
        /* loaded from: classes3.dex */
        public static final class C11941q extends AbstractC11802m implements InterfaceC11756a<List<? extends C13213z>> {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: KClassImpl.kt */
            /* renamed from: kotlin.j0.o.c.h$a$q$a */
            /* loaded from: classes3.dex */
            public static final class C11942a extends AbstractC11802m implements InterfaceC11756a<Type> {

                /* renamed from: c */
                final /* synthetic */ AbstractC12965b0 f26636c;

                /* renamed from: d */
                final /* synthetic */ C11941q f26637d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11942a(AbstractC12965b0 abstractC12965b0, C11941q c11941q) {
                    super(0);
                    this.f26636c = abstractC12965b0;
                    this.f26637d = c11941q;
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11756a
                /* renamed from: a */
                public final Type invoke() {
                    int m4047D;
                    InterfaceC13334h mo5206d = this.f26636c.mo5779W0().mo5206d();
                    if (mo5206d instanceof InterfaceC13312e) {
                        Class<?> m10029m = C11972m0.m10029m((InterfaceC13312e) mo5206d);
                        if (m10029m != null) {
                            if (l.b(C11923h.this.mo9979a().getSuperclass(), m10029m)) {
                                Type genericSuperclass = C11923h.this.mo9979a().getGenericSuperclass();
                                l.e(genericSuperclass, "jClass.genericSuperclass");
                                return genericSuperclass;
                            }
                            Class<?>[] interfaces = C11923h.this.mo9979a().getInterfaces();
                            l.e(interfaces, "jClass.interfaces");
                            m4047D = C13715n.m4047D(interfaces, m10029m);
                            if (m4047D >= 0) {
                                Type type = C11923h.this.mo9979a().getGenericInterfaces()[m4047D];
                                l.e(type, "jClass.genericInterfaces[index]");
                                return type;
                            }
                            throw new C11899d0("No superclass of " + C11924a.this + " in Java reflection for " + mo5206d);
                        }
                        throw new C11899d0("Unsupported superclass of " + C11924a.this + ": " + mo5206d);
                    }
                    throw new C11899d0("Supertype not a class: " + mo5206d);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: KClassImpl.kt */
            /* renamed from: kotlin.j0.o.c.h$a$q$b */
            /* loaded from: classes3.dex */
            public static final class C11943b extends AbstractC11802m implements InterfaceC11756a<Type> {

                /* renamed from: c */
                public static final C11943b f26638c = new C11943b();

                C11943b() {
                    super(0);
                }

                @Override // kotlin.p483e0.p484c.InterfaceC11756a
                /* renamed from: a */
                public final Type invoke() {
                    return Object.class;
                }
            }

            C11941q() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<C13213z> invoke() {
                boolean z;
                InterfaceC13125t0 mo4649n = C11924a.this.m10128k().mo4649n();
                l.e(mo4649n, "descriptor.typeConstructor");
                Collection<AbstractC12965b0> mo5218a = mo4649n.mo5218a();
                l.e(mo5218a, "descriptor.typeConstructor.supertypes");
                ArrayList<C13213z> arrayList = new ArrayList(mo5218a.size());
                for (AbstractC12965b0 abstractC12965b0 : mo5218a) {
                    l.e(abstractC12965b0, "kotlinType");
                    arrayList.add(new C13213z(abstractC12965b0, new C11942a(abstractC12965b0, this)));
                }
                if (!AbstractC12046h.m9873r0(C11924a.this.m10128k())) {
                    boolean z2 = false;
                    if (!arrayList.isEmpty()) {
                        for (C13213z c13213z : arrayList) {
                            InterfaceC13312e m7030e = C12673d.m7030e(c13213z.m5632d());
                            l.e(m7030e, "DescriptorUtils.getClassDescriptorForType(it.type)");
                            EnumC13319f mo4957w = m7030e.mo4957w();
                            l.e(mo4957w, "DescriptorUtils.getClass…ptorForType(it.type).kind");
                            if (mo4957w == EnumC13319f.INTERFACE || mo4957w == EnumC13319f.ANNOTATION_CLASS) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (!z) {
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2) {
                        AbstractC13010i0 m9892i = C12747a.m6863g(C11924a.this.m10128k()).m9892i();
                        l.e(m9892i, "descriptor.builtIns.anyType");
                        arrayList.add(new C13213z(m9892i, C11943b.f26638c));
                    }
                }
                return C13634a.m4285c(arrayList);
            }
        }

        /* compiled from: KClassImpl.kt */
        /* renamed from: kotlin.j0.o.c.h$a$r */
        /* loaded from: classes3.dex */
        static final class C11944r extends AbstractC11802m implements InterfaceC11756a<List<? extends C11885b0>> {
            C11944r() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<C11885b0> invoke() {
                int m3867o;
                List<InterfaceC13562z0> mo4975B = C11924a.this.m10128k().mo4975B();
                l.e(mo4975B, "descriptor.declaredTypeParameters");
                m3867o = C13728s.m3867o(mo4975B, 10);
                ArrayList arrayList = new ArrayList(m3867o);
                for (InterfaceC13562z0 interfaceC13562z0 : mo4975B) {
                    C11923h c11923h = C11923h.this;
                    l.e(interfaceC13562z0, "descriptor");
                    arrayList.add(new C11885b0(c11923h, interfaceC13562z0));
                }
                return arrayList;
            }
        }

        public C11924a() {
            super();
            this.f26609d = C11916f0.m10164d(new C11933i());
            C11916f0.m10164d(new C11928d());
            this.f26610e = C11916f0.m10164d(new C11940p());
            this.f26611f = C11916f0.m10164d(new C11938n());
            C11916f0.m10164d(new C11929e());
            C11916f0.m10164d(new C11936l());
            C11916f0.m10166b(new C11937m());
            C11916f0.m10164d(new C11944r());
            C11916f0.m10164d(new C11941q());
            C11916f0.m10164d(new C11939o());
            this.f26612g = C11916f0.m10164d(new C11931g());
            this.f26613h = C11916f0.m10164d(new C11932h());
            this.f26614i = C11916f0.m10164d(new C11934j());
            this.f26615j = C11916f0.m10164d(new C11935k());
            this.f26616k = C11916f0.m10164d(new C11926b());
            this.f26617l = C11916f0.m10164d(new C11927c());
            C11916f0.m10164d(new C11930f());
            C11916f0.m10164d(new C11925a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final String m10133f(Class<?> cls) {
            String m5433B0;
            String m5432C0;
            String m5432C02;
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                l.e(simpleName, "name");
                m5432C02 = C13277t.m5432C0(simpleName, enclosingMethod.getName() + "$", null, 2, null);
                return m5432C02;
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                l.e(simpleName, "name");
                m5432C0 = C13277t.m5432C0(simpleName, enclosingConstructor.getName() + "$", null, 2, null);
                return m5432C0;
            }
            l.e(simpleName, "name");
            m5433B0 = C13277t.m5433B0(simpleName, '$', null, 2, null);
            return m5433B0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public final Collection<AbstractC11906f<?>> m10129j() {
            return (Collection) this.f26613h.m10160b(this, f26608n[11]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public final Collection<AbstractC11906f<?>> m10127l() {
            return (Collection) this.f26614i.m10160b(this, f26608n[12]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public final Collection<AbstractC11906f<?>> m10126m() {
            return (Collection) this.f26615j.m10160b(this, f26608n[13]);
        }

        /* renamed from: g */
        public final Collection<AbstractC11906f<?>> m10132g() {
            return (Collection) this.f26616k.m10160b(this, f26608n[14]);
        }

        /* renamed from: h */
        public final Collection<AbstractC11906f<?>> m10131h() {
            return (Collection) this.f26617l.m10160b(this, f26608n[15]);
        }

        /* renamed from: i */
        public final Collection<AbstractC11906f<?>> m10130i() {
            return (Collection) this.f26612g.m10160b(this, f26608n[10]);
        }

        /* renamed from: k */
        public final InterfaceC13312e m10128k() {
            return (InterfaceC13312e) this.f26609d.m10160b(this, f26608n[0]);
        }

        /* renamed from: n */
        public final String m10125n() {
            return (String) this.f26611f.m10160b(this, f26608n[3]);
        }

        /* renamed from: o */
        public final String m10124o() {
            return (String) this.f26610e.m10160b(this, f26608n[2]);
        }
    }

    /* compiled from: KClassImpl.kt */
    /* renamed from: kotlin.j0.o.c.h$b */
    /* loaded from: classes3.dex */
    static final class C11945b extends AbstractC11802m implements InterfaceC11756a<C11923h<T>.C11924a> {
        C11945b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C11923h<T>.C11924a invoke() {
            return new C11924a();
        }
    }

    /* compiled from: KClassImpl.kt */
    /* renamed from: kotlin.j0.o.c.h$c */
    /* loaded from: classes3.dex */
    static final /* synthetic */ class C11946c extends C11799i implements InterfaceC11771p<C12907u, C12542n, InterfaceC13518o0> {

        /* renamed from: B */
        public static final C11946c f26641B = new C11946c();

        C11946c() {
            super(2);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c, kotlin.p493j0.InterfaceC11862a
        /* renamed from: b */
        public final String mo4699b() {
            return "loadProperty";
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: g */
        public final InterfaceC11865d mo4698g() {
            return C11813x.m10316b(C12907u.class);
        }

        @Override // kotlin.p483e0.p485d.AbstractC11783c
        /* renamed from: i */
        public final String mo4697i() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: l */
        public final InterfaceC13518o0 invoke(C12907u c12907u, C12542n c12542n) {
            l.f(c12907u, "p1");
            l.f(c12542n, "p2");
            return c12907u.m6440p(c12542n);
        }
    }

    public C11923h(Class<T> cls) {
        l.f(cls, "jClass");
        this.f26607w = cls;
        C11916f0.C11918b<C11923h<T>.C11924a> m10166b = C11916f0.m10166b(new C11945b());
        l.e(m10166b, "ReflectProperties.lazy { Data() }");
        this.f26606f = m10166b;
    }

    /* renamed from: C */
    public static final /* synthetic */ Void m10148C(C11923h c11923h) {
        c11923h.m10142I();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final C12608b m10147D() {
        return C11961j0.f26662b.m10069c(mo9979a());
    }

    /* renamed from: I */
    private final Void m10142I() {
        C12408a mo4926a;
        C13459f m4921a = C13459f.f29814c.m4921a(mo9979a());
        C12408a.EnumC12409a m8997c = (m4921a == null || (mo4926a = m4921a.mo4926a()) == null) ? null : mo4926a.m8997c();
        if (m8997c != null) {
            switch (C11948i.f26643a[m8997c.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new UnsupportedOperationException("Packages and file facades are not yet supported in Kotlin reflection. Meanwhile please use Java reflection to inspect this class: " + mo9979a());
                case 4:
                    throw new UnsupportedOperationException("This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection library has no idea what declarations does it have. Please use Java reflection to inspect this class: " + mo9979a());
                case 5:
                    throw new C11899d0("Unknown class: " + mo9979a() + " (kind = " + m8997c + ')');
                case 6:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        throw new C11899d0("Unresolved class: " + mo9979a());
    }

    /* renamed from: E */
    public final C11916f0.C11918b<C11923h<T>.C11924a> m10146E() {
        return this.f26606f;
    }

    /* renamed from: F */
    public InterfaceC13312e m10145F() {
        return this.f26606f.invoke().m10128k();
    }

    /* renamed from: G */
    public final InterfaceC12777h m10144G() {
        return m10145F().mo5010x().mo5775u();
    }

    /* renamed from: H */
    public final InterfaceC12777h m10143H() {
        InterfaceC12777h mo4960a0 = m10145F().mo4960a0();
        l.e(mo4960a0, "descriptor.staticScope");
        return mo4960a0;
    }

    @Override // kotlin.p483e0.p485d.InterfaceC11786d
    /* renamed from: a */
    public Class<T> mo9979a() {
        return this.f26607w;
    }

    @Override // kotlin.p493j0.InterfaceC11863b
    /* renamed from: e */
    public boolean mo10141e() {
        return m10145F().mo4658o() == EnumC13560z.SEALED;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11923h) && l.b(C11754a.m10363c(this), C11754a.m10363c((InterfaceC11863b) obj));
    }

    @Override // kotlin.p493j0.InterfaceC11863b
    /* renamed from: f */
    public String mo10140f() {
        return this.f26606f.invoke().m10125n();
    }

    @Override // kotlin.p493j0.InterfaceC11863b
    /* renamed from: g */
    public String mo10139g() {
        return this.f26606f.invoke().m10124o();
    }

    @Override // kotlin.p493j0.InterfaceC11863b
    /* renamed from: h */
    public boolean mo10138h() {
        return m10145F().mo4974F();
    }

    public int hashCode() {
        return C11754a.m10363c(this).hashCode();
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC11952j
    /* renamed from: o */
    public Collection<InterfaceC13452l> mo9978o() {
        List m3891e;
        InterfaceC13312e m10145F = m10145F();
        if (m10145F.mo4957w() != EnumC13319f.INTERFACE && m10145F.mo4957w() != EnumC13319f.OBJECT) {
            Collection<InterfaceC13309d> mo4958p = m10145F.mo4958p();
            l.e(mo4958p, "descriptor.constructors");
            return mo4958p;
        }
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC11952j
    /* renamed from: p */
    public Collection<InterfaceC13554x> mo9977p(C12614f c12614f) {
        List m3784n0;
        l.f(c12614f, "name");
        m3784n0 = C13742z.m3784n0(m10144G().mo5117a(c12614f, EnumC12115d.FROM_REFLECTION), m10143H().mo5117a(c12614f, EnumC12115d.FROM_REFLECTION));
        return m3784n0;
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC11952j
    /* renamed from: q */
    public InterfaceC13518o0 mo9976q(int i) {
        Class<?> declaringClass;
        if (l.b(mo9979a().getSimpleName(), "DefaultImpls") && (declaringClass = mo9979a().getDeclaringClass()) != null && declaringClass.isInterface()) {
            InterfaceC11863b m10361e = C11754a.m10361e(declaringClass);
            if (m10361e != null) {
                return ((C11923h) m10361e).mo9976q(i);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
        }
        InterfaceC13312e m10145F = m10145F();
        if (!(m10145F instanceof C12826d)) {
            m10145F = null;
        }
        C12826d c12826d = (C12826d) m10145F;
        if (c12826d != null) {
            C12509c m6666i1 = c12826d.m6666i1();
            AbstractC13580h.C13587f<C12509c, List<C12542n>> c13587f = C12470a.f27661j;
            l.e(c13587f, "JvmProtoBuf.classLocalVariable");
            C12542n c12542n = (C12542n) C12596e.m7429b(m6666i1, c13587f, i);
            if (c12542n != null) {
                return (InterfaceC13518o0) C11972m0.m10036f(mo9979a(), c12542n, c12826d.m6667h1().m6470g(), c12826d.m6667h1().m6467j(), c12826d.m6664k1(), C11946c.f26641B);
            }
            return null;
        }
        return null;
    }

    public String toString() {
        String str;
        String m5435z;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        C12608b m10147D = m10147D();
        C12609c m7389h = m10147D.m7389h();
        l.e(m7389h, "classId.packageFqName");
        if (m7389h.m7380d()) {
            str = "";
        } else {
            str = m7389h.m7382b() + ".";
        }
        String m7382b = m10147D.m7388i().m7382b();
        l.e(m7382b, "classId.relativeClassName.asString()");
        m5435z = C13276s.m5435z(m7382b, '.', '$', false, 4, null);
        sb.append(str + m5435z);
        return sb.toString();
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC11952j
    /* renamed from: u */
    public Collection<InterfaceC13518o0> mo9974u(C12614f c12614f) {
        List m3784n0;
        l.f(c12614f, "name");
        m3784n0 = C13742z.m3784n0(m10144G().mo5115c(c12614f, EnumC12115d.FROM_REFLECTION), m10143H().mo5115c(c12614f, EnumC12115d.FROM_REFLECTION));
        return m3784n0;
    }
}
