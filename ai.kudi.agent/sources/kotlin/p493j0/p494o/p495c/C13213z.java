package kotlin.p493j0.p494o.p495c;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13218k;
import kotlin.C13286n;
import kotlin.EnumC13285m;
import kotlin.InterfaceC11824h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.C11754a;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.C11875l;
import kotlin.p493j0.InterfaceC11864c;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.InterfaceC11873j;
import kotlin.p493j0.p494o.C11879a;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12974c1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13131v0;
import kotlin.p557z.C13706j;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.C13474b;
/* compiled from: KTypeImpl.kt */
/* renamed from: kotlin.j0.o.c.z */
/* loaded from: classes3.dex */
public final class C13213z implements InterfaceC11873j {

    /* renamed from: d */
    static final /* synthetic */ InterfaceC11872i[] f29358d = {C11813x.m10312f(new C11808s(C11813x.m10316b(C13213z.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C13213z.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* renamed from: a */
    private final C11916f0.C11917a<Type> f29359a;

    /* renamed from: b */
    private final C11916f0.C11917a f29360b;

    /* renamed from: c */
    private final AbstractC12965b0 f29361c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KTypeImpl.kt */
    /* renamed from: kotlin.j0.o.c.z$a */
    /* loaded from: classes3.dex */
    public static final class C13214a extends AbstractC11802m implements InterfaceC11756a<List<? extends C11875l>> {

        /* renamed from: d */
        final /* synthetic */ InterfaceC11756a f29363d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KTypeImpl.kt */
        /* renamed from: kotlin.j0.o.c.z$a$a */
        /* loaded from: classes3.dex */
        public static final class C13215a extends AbstractC11802m implements InterfaceC11756a<Type> {

            /* renamed from: c */
            final /* synthetic */ int f29364c;

            /* renamed from: d */
            final /* synthetic */ C13214a f29365d;

            /* renamed from: e */
            final /* synthetic */ InterfaceC11824h f29366e;

            /* renamed from: f */
            final /* synthetic */ InterfaceC11872i f29367f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13215a(int i, C13214a c13214a, InterfaceC11824h interfaceC11824h, InterfaceC11872i interfaceC11872i) {
                super(0);
                this.f29364c = i;
                this.f29365d = c13214a;
                this.f29366e = interfaceC11824h;
                this.f29367f = interfaceC11872i;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final Type invoke() {
                Type m5633c = C13213z.this.m5633c();
                if (m5633c instanceof Class) {
                    Class cls = (Class) m5633c;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    l.e(componentType, "if (javaType.isArray) ja…Type else Any::class.java");
                    return componentType;
                } else if (m5633c instanceof GenericArrayType) {
                    if (this.f29364c == 0) {
                        Type genericComponentType = ((GenericArrayType) m5633c).getGenericComponentType();
                        l.e(genericComponentType, "javaType.genericComponentType");
                        return genericComponentType;
                    }
                    throw new C11899d0("Array type has been queried for a non-0th argument: " + C13213z.this);
                } else if (m5633c instanceof ParameterizedType) {
                    Type type = (Type) ((List) this.f29366e.getValue()).get(this.f29364c);
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) type;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        l.e(lowerBounds, "argument.lowerBounds");
                        Type type2 = (Type) C13706j.m4075x(lowerBounds);
                        if (type2 != null) {
                            type = type2;
                        } else {
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            l.e(upperBounds, "argument.upperBounds");
                            type = (Type) C13706j.m4076w(upperBounds);
                        }
                    }
                    l.e(type, "if (argument !is Wildcar…ument.upperBounds.first()");
                    return type;
                } else {
                    throw new C11899d0("Non-generic type has been queried for arguments: " + C13213z.this);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: KTypeImpl.kt */
        /* renamed from: kotlin.j0.o.c.z$a$b */
        /* loaded from: classes3.dex */
        public static final class C13216b extends AbstractC11802m implements InterfaceC11756a<List<? extends Type>> {
            C13216b() {
                super(0);
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11756a
            /* renamed from: a */
            public final List<Type> invoke() {
                Type m5633c = C13213z.this.m5633c();
                l.d(m5633c);
                return C13474b.m4891c(m5633c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13214a(InterfaceC11756a interfaceC11756a) {
            super(0);
            this.f29363d = interfaceC11756a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final List<C11875l> invoke() {
            InterfaceC11824h m5626a;
            int m3867o;
            C11875l m10221d;
            List<C11875l> m3891e;
            List<InterfaceC13131v0> mo5780V0 = C13213z.this.m5632d().mo5780V0();
            if (mo5780V0.isEmpty()) {
                m3891e = C13726r.m3891e();
                return m3891e;
            }
            m5626a = C13218k.m5626a(EnumC13285m.PUBLICATION, new C13216b());
            m3867o = C13728s.m3867o(mo5780V0, 10);
            ArrayList arrayList = new ArrayList(m3867o);
            int i = 0;
            for (Object obj : mo5780V0) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC13131v0 interfaceC13131v0 = (InterfaceC13131v0) obj;
                    if (interfaceC13131v0.mo5757d()) {
                        m10221d = C11875l.f26551d.m10222c();
                    } else {
                        AbstractC12965b0 mo5758c = interfaceC13131v0.mo5758c();
                        l.e(mo5758c, "typeProjection.type");
                        C13213z c13213z = new C13213z(mo5758c, this.f29363d != null ? new C13215a(i, this, m5626a, null) : null);
                        int i3 = C13212y.f29357a[interfaceC13131v0.mo5760a().ordinal()];
                        if (i3 == 1) {
                            m10221d = C11875l.f26551d.m10221d(c13213z);
                        } else if (i3 == 2) {
                            m10221d = C11875l.f26551d.m10224a(c13213z);
                        } else if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            m10221d = C11875l.f26551d.m10223b(c13213z);
                        }
                    }
                    arrayList.add(m10221d);
                    i = i2;
                } else {
                    C13722p.m3923n();
                    throw null;
                }
            }
            return arrayList;
        }
    }

    /* compiled from: KTypeImpl.kt */
    /* renamed from: kotlin.j0.o.c.z$b */
    /* loaded from: classes3.dex */
    static final class C13217b extends AbstractC11802m implements InterfaceC11756a<InterfaceC11864c> {
        C13217b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC11864c invoke() {
            C13213z c13213z = C13213z.this;
            return c13213z.m5634b(c13213z.m5632d());
        }
    }

    public C13213z(AbstractC12965b0 abstractC12965b0, InterfaceC11756a<? extends Type> interfaceC11756a) {
        l.f(abstractC12965b0, "type");
        this.f29361c = abstractC12965b0;
        C11916f0.C11917a<Type> c11917a = null;
        C11916f0.C11917a<Type> c11917a2 = (C11916f0.C11917a) (!(interfaceC11756a instanceof C11916f0.C11917a) ? null : interfaceC11756a);
        if (c11917a2 != null) {
            c11917a = c11917a2;
        } else if (interfaceC11756a != null) {
            c11917a = C11916f0.m10164d(interfaceC11756a);
        }
        this.f29359a = c11917a;
        this.f29360b = C11916f0.m10164d(new C13217b());
        C11916f0.m10164d(new C13214a(interfaceC11756a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final InterfaceC11864c m5634b(AbstractC12965b0 abstractC12965b0) {
        AbstractC12965b0 mo5758c;
        InterfaceC13334h mo5206d = abstractC12965b0.mo5779W0().mo5206d();
        if (mo5206d instanceof InterfaceC13312e) {
            Class<?> m10029m = C11972m0.m10029m((InterfaceC13312e) mo5206d);
            if (m10029m != null) {
                if (m10029m.isArray()) {
                    InterfaceC13131v0 interfaceC13131v0 = (InterfaceC13131v0) C13722p.m3915s0(abstractC12965b0.mo5780V0());
                    if (interfaceC13131v0 != null && (mo5758c = interfaceC13131v0.mo5758c()) != null) {
                        l.e(mo5758c, "type.arguments.singleOrN…return KClassImpl(jClass)");
                        InterfaceC11864c m5634b = m5634b(mo5758c);
                        if (m5634b != null) {
                            return new C11923h(C11972m0.m10038d(C11754a.m10364b(C11879a.m10220a(m5634b))));
                        }
                        throw new C11899d0("Cannot determine classifier for array element type: " + this);
                    }
                    return new C11923h(m10029m);
                } else if (!C12974c1.m6290l(abstractC12965b0)) {
                    Class<?> m4890d = C13474b.m4890d(m10029m);
                    if (m4890d != null) {
                        m10029m = m4890d;
                    }
                    return new C11923h(m10029m);
                } else {
                    return new C11923h(m10029m);
                }
            }
            return null;
        } else if (mo5206d instanceof InterfaceC13562z0) {
            return new C11885b0(null, (InterfaceC13562z0) mo5206d);
        } else {
            if (mo5206d instanceof InterfaceC13559y0) {
                throw new C13286n("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
    }

    /* renamed from: c */
    public Type m5633c() {
        C11916f0.C11917a<Type> c11917a = this.f29359a;
        if (c11917a != null) {
            return c11917a.invoke();
        }
        return null;
    }

    /* renamed from: d */
    public final AbstractC12965b0 m5632d() {
        return this.f29361c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13213z) && l.b(this.f29361c, ((C13213z) obj).f29361c);
    }

    @Override // kotlin.p493j0.InterfaceC11873j
    /* renamed from: g */
    public InterfaceC11864c mo5631g() {
        return (InterfaceC11864c) this.f29360b.m10160b(this, f29358d[0]);
    }

    public int hashCode() {
        return this.f29361c.hashCode();
    }

    public String toString() {
        return C11949i0.f26645b.m10097h(this.f29361c);
    }

    public /* synthetic */ C13213z(AbstractC12965b0 abstractC12965b0, InterfaceC11756a interfaceC11756a, int i, g gVar) {
        this(abstractC12965b0, (i & 2) != 0 ? null : interfaceC11756a);
    }
}
