package kotlin.p493j0.p494o.p495c;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11783c;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p483e0.p485d.InterfaceC11798h;
import kotlin.p493j0.InterfaceC11866e;
import kotlin.p493j0.InterfaceC11868g;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.AbstractC11890d;
import kotlin.p493j0.p494o.p495c.C11916f0;
import kotlin.p493j0.p494o.p495c.InterfaceC11887c;
import kotlin.p493j0.p494o.p495c.p496o0.AbstractC11992e;
import kotlin.p493j0.p494o.p495c.p496o0.C11980a;
import kotlin.p493j0.p494o.p495c.p496o0.C12017f;
import kotlin.p493j0.p494o.p495c.p496o0.C12020h;
import kotlin.p493j0.p494o.p495c.p496o0.InterfaceC11990d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.C12754b;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: KFunctionImpl.kt */
/* renamed from: kotlin.j0.o.c.k */
/* loaded from: classes3.dex */
public final class C11962k extends AbstractC11906f<Object> implements InterfaceC11798h<Object>, InterfaceC11866e<Object>, InterfaceC11887c {

    /* renamed from: y */
    static final /* synthetic */ InterfaceC11872i[] f26663y = {C11813x.m10312f(new C11808s(C11813x.m10316b(C11962k.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11962k.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;")), C11813x.m10312f(new C11808s(C11813x.m10316b(C11962k.class), "defaultCaller", "getDefaultCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

    /* renamed from: d */
    private final C11916f0.C11917a f26664d;

    /* renamed from: e */
    private final C11916f0.C11918b f26665e;

    /* renamed from: f */
    private final AbstractC11952j f26666f;

    /* renamed from: w */
    private final String f26667w;

    /* renamed from: x */
    private final Object f26668x;

    /* compiled from: KFunctionImpl.kt */
    /* renamed from: kotlin.j0.o.c.k$a */
    /* loaded from: classes3.dex */
    static final class C11963a extends AbstractC11802m implements InterfaceC11756a<InterfaceC11990d<? extends Member>> {
        C11963a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC11990d<Member> invoke() {
            int m3867o;
            Object m10200b;
            InterfaceC11990d m10058t;
            int m3867o2;
            AbstractC11890d m10065g = C11961j0.f26662b.m10065g(C11962k.this.mo5650h());
            if (m10065g instanceof AbstractC11890d.C11897d) {
                if (C11962k.this.m10176j()) {
                    Class<?> mo9979a = C11962k.this.mo5657g().mo9979a();
                    List<InterfaceC11868g> m10177i = C11962k.this.m10177i();
                    m3867o2 = C13728s.m3867o(m10177i, 10);
                    ArrayList arrayList = new ArrayList(m3867o2);
                    for (InterfaceC11868g interfaceC11868g : m10177i) {
                        String mo5706b = interfaceC11868g.mo5706b();
                        l.d(mo5706b);
                        arrayList.add(mo5706b);
                    }
                    return new C11980a(mo9979a, arrayList, C11980a.EnumC11981a.POSITIONAL_CALL, C11980a.EnumC11982b.KOTLIN, null, 16, null);
                }
                m10200b = C11962k.this.mo5657g().m10091i(((AbstractC11890d.C11897d) m10065g).m10197b());
            } else if (m10065g instanceof AbstractC11890d.C11898e) {
                AbstractC11890d.C11898e c11898e = (AbstractC11890d.C11898e) m10065g;
                m10200b = C11962k.this.mo5657g().m10087m(c11898e.m10194c(), c11898e.m10195b());
            } else if (m10065g instanceof AbstractC11890d.C11896c) {
                m10200b = ((AbstractC11890d.C11896c) m10065g).m10198b();
            } else if (!(m10065g instanceof AbstractC11890d.C11894b)) {
                if (m10065g instanceof AbstractC11890d.C11891a) {
                    List<Method> m10202b = ((AbstractC11890d.C11891a) m10065g).m10202b();
                    Class<?> mo9979a2 = C11962k.this.mo5657g().mo9979a();
                    m3867o = C13728s.m3867o(m10202b, 10);
                    ArrayList arrayList2 = new ArrayList(m3867o);
                    for (Method method : m10202b) {
                        l.e(method, "it");
                        arrayList2.add(method.getName());
                    }
                    return new C11980a(mo9979a2, arrayList2, C11980a.EnumC11981a.POSITIONAL_CALL, C11980a.EnumC11982b.JAVA, m10202b);
                }
                throw new NoWhenBranchMatchedException();
            } else {
                m10200b = ((AbstractC11890d.C11894b) m10065g).m10200b();
            }
            if (m10200b instanceof Constructor) {
                C11962k c11962k = C11962k.this;
                m10058t = c11962k.m10059s((Constructor) m10200b, c11962k.mo5650h());
            } else if (m10200b instanceof Method) {
                Method method2 = (Method) m10200b;
                m10058t = !Modifier.isStatic(method2.getModifiers()) ? C11962k.this.m10058t(method2) : C11962k.this.mo5650h().mo4956y().mo5302r(C11972m0.m10034h()) != null ? C11962k.this.m10057u(method2) : C11962k.this.m10056v(method2);
            } else {
                throw new C11899d0("Could not compute caller for function: " + C11962k.this.mo5650h() + " (member = " + m10200b + ')');
            }
            return C12020h.m9995c(m10058t, C11962k.this.mo5650h(), false, 2, null);
        }
    }

    /* compiled from: KFunctionImpl.kt */
    /* renamed from: kotlin.j0.o.c.k$b */
    /* loaded from: classes3.dex */
    static final class C11964b extends AbstractC11802m implements InterfaceC11756a<InterfaceC11990d<? extends Member>> {
        C11964b() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.reflect.Member, java.lang.Object] */
        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC11990d<Member> invoke() {
            GenericDeclaration genericDeclaration;
            int m3867o;
            int m3867o2;
            InterfaceC11990d interfaceC11990d;
            ?? mo9981l;
            AbstractC11890d m10065g = C11961j0.f26662b.m10065g(C11962k.this.mo5650h());
            if (m10065g instanceof AbstractC11890d.C11898e) {
                AbstractC11952j mo5657g = C11962k.this.mo5657g();
                AbstractC11890d.C11898e c11898e = (AbstractC11890d.C11898e) m10065g;
                String m10194c = c11898e.m10194c();
                String m10195b = c11898e.m10195b();
                l.d((Object) C11962k.this.mo5651f().mo9981l());
                genericDeclaration = mo5657g.m10089k(m10194c, m10195b, !Modifier.isStatic(mo9981l.getModifiers()));
            } else if (m10065g instanceof AbstractC11890d.C11897d) {
                if (C11962k.this.m10176j()) {
                    Class<?> mo9979a = C11962k.this.mo5657g().mo9979a();
                    List<InterfaceC11868g> m10177i = C11962k.this.m10177i();
                    m3867o2 = C13728s.m3867o(m10177i, 10);
                    ArrayList arrayList = new ArrayList(m3867o2);
                    for (InterfaceC11868g interfaceC11868g : m10177i) {
                        String mo5706b = interfaceC11868g.mo5706b();
                        l.d(mo5706b);
                        arrayList.add(mo5706b);
                    }
                    return new C11980a(mo9979a, arrayList, C11980a.EnumC11981a.CALL_BY_NAME, C11980a.EnumC11982b.KOTLIN, null, 16, null);
                }
                genericDeclaration = C11962k.this.mo5657g().m10090j(((AbstractC11890d.C11897d) m10065g).m10197b());
            } else if (m10065g instanceof AbstractC11890d.C11891a) {
                List<Method> m10202b = ((AbstractC11890d.C11891a) m10065g).m10202b();
                Class<?> mo9979a2 = C11962k.this.mo5657g().mo9979a();
                m3867o = C13728s.m3867o(m10202b, 10);
                ArrayList arrayList2 = new ArrayList(m3867o);
                for (Method method : m10202b) {
                    l.e(method, "it");
                    arrayList2.add(method.getName());
                }
                return new C11980a(mo9979a2, arrayList2, C11980a.EnumC11981a.CALL_BY_NAME, C11980a.EnumC11982b.JAVA, m10202b);
            } else {
                genericDeclaration = null;
            }
            if (genericDeclaration instanceof Constructor) {
                C11962k c11962k = C11962k.this;
                interfaceC11990d = c11962k.m10059s((Constructor) genericDeclaration, c11962k.mo5650h());
            } else if (genericDeclaration instanceof Method) {
                if (C11962k.this.mo5650h().mo4956y().mo5302r(C11972m0.m10034h()) != null) {
                    InterfaceC13513m mo4687d = C11962k.this.mo5650h().mo4687d();
                    if (mo4687d == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                    if (!((InterfaceC13312e) mo4687d).mo4974F()) {
                        interfaceC11990d = C11962k.this.m10057u((Method) genericDeclaration);
                    }
                }
                interfaceC11990d = C11962k.this.m10056v((Method) genericDeclaration);
            } else {
                interfaceC11990d = null;
            }
            if (interfaceC11990d != null) {
                return C12020h.m9996b(interfaceC11990d, C11962k.this.mo5650h(), true);
            }
            return null;
        }
    }

    /* compiled from: KFunctionImpl.kt */
    /* renamed from: kotlin.j0.o.c.k$c */
    /* loaded from: classes3.dex */
    static final class C11965c extends AbstractC11802m implements InterfaceC11756a<InterfaceC13554x> {

        /* renamed from: d */
        final /* synthetic */ String f26672d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11965c(String str) {
            super(0);
            this.f26672d = str;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC13554x invoke() {
            return C11962k.this.mo5657g().m10088l(this.f26672d, C11962k.this.f26667w);
        }
    }

    /* synthetic */ C11962k(AbstractC11952j abstractC11952j, String str, String str2, InterfaceC13554x interfaceC13554x, Object obj, int i, g gVar) {
        this(abstractC11952j, str, str2, interfaceC13554x, (i & 16) != 0 ? AbstractC11783c.f26476y : obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final AbstractC11992e<Constructor<?>> m10059s(Constructor<?> constructor, InterfaceC13554x interfaceC13554x) {
        if (C12754b.m6839f(interfaceC13554x)) {
            if (mo5656l()) {
                return new AbstractC11992e.C11993a(constructor, m10055w());
            }
            return new AbstractC11992e.C11994b(constructor);
        } else if (mo5656l()) {
            return new AbstractC11992e.C11995c(constructor, m10055w());
        } else {
            return new AbstractC11992e.C11997e(constructor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final AbstractC11992e.AbstractC12010h m10058t(Method method) {
        return mo5656l() ? new AbstractC11992e.AbstractC12010h.C12011a(method, m10055w()) : new AbstractC11992e.AbstractC12010h.C12014d(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final AbstractC11992e.AbstractC12010h m10057u(Method method) {
        return mo5656l() ? new AbstractC11992e.AbstractC12010h.C12012b(method) : new AbstractC11992e.AbstractC12010h.C12015e(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final AbstractC11992e.AbstractC12010h m10056v(Method method) {
        return mo5656l() ? new AbstractC11992e.AbstractC12010h.C12013c(method, m10055w()) : new AbstractC11992e.AbstractC12010h.C12016f(method);
    }

    /* renamed from: w */
    private final Object m10055w() {
        return C12020h.m9997a(this.f26668x, mo5650h());
    }

    @Override // kotlin.p493j0.InterfaceC11862a
    /* renamed from: b */
    public String mo4699b() {
        String m7353b = mo5650h().mo5012b().m7353b();
        l.e(m7353b, "descriptor.name.asString()");
        return m7353b;
    }

    public boolean equals(Object obj) {
        C11962k m10041a = C11972m0.m10041a(obj);
        return m10041a != null && l.b(mo5657g(), m10041a.mo5657g()) && l.b(mo4699b(), m10041a.mo4699b()) && l.b(this.f26667w, m10041a.f26667w) && l.b(this.f26668x, m10041a.f26668x);
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC11906f
    /* renamed from: f */
    public InterfaceC11990d<?> mo5651f() {
        return (InterfaceC11990d) this.f26665e.m10160b(this, f26663y[1]);
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC11906f
    /* renamed from: g */
    public AbstractC11952j mo5657g() {
        return this.f26666f;
    }

    @Override // kotlin.p483e0.p485d.InterfaceC11798h
    public int getArity() {
        return C12017f.m10001a(mo5651f());
    }

    public int hashCode() {
        return (((mo5657g().hashCode() * 31) + mo4699b().hashCode()) * 31) + this.f26667w.hashCode();
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public Object invoke() {
        return InterfaceC11887c.C11888a.m10207a(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC11906f
    /* renamed from: l */
    public boolean mo5656l() {
        return !l.b(this.f26668x, AbstractC11783c.f26476y);
    }

    public String toString() {
        return C11949i0.f26645b.m10101d(mo5650h());
    }

    @Override // kotlin.p493j0.p494o.p495c.AbstractC11906f
    /* renamed from: x */
    public InterfaceC13554x mo5650h() {
        return (InterfaceC13554x) this.f26664d.m10160b(this, f26663y[0]);
    }

    private C11962k(AbstractC11952j abstractC11952j, String str, String str2, InterfaceC13554x interfaceC13554x, Object obj) {
        this.f26666f = abstractC11952j;
        this.f26667w = str2;
        this.f26668x = obj;
        this.f26664d = C11916f0.m10165c(interfaceC13554x, new C11965c(str));
        this.f26665e = C11916f0.m10166b(new C11963a());
        C11916f0.m10166b(new C11964b());
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public Object invoke(Object obj) {
        return InterfaceC11887c.C11888a.m10206b(this, obj);
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public Object invoke(Object obj, Object obj2) {
        return InterfaceC11887c.C11888a.m10205c(this, obj, obj2);
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11772q
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return InterfaceC11887c.C11888a.m10204d(this, obj, obj2, obj3);
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11773r
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return InterfaceC11887c.C11888a.m10203e(this, obj, obj2, obj3, obj4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11962k(AbstractC11952j abstractC11952j, String str, String str2, Object obj) {
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
    public C11962k(kotlin.p493j0.p494o.p495c.AbstractC11952j r10, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.e0.d.l.f(r10, r0)
            java.lang.String r0 = "descriptor"
            kotlin.e0.d.l.f(r11, r0)
            kotlin.j0.o.c.p0.f.f r0 = r11.mo5012b()
            java.lang.String r3 = r0.m7353b()
            java.lang.String r0 = "descriptor.name.asString()"
            kotlin.e0.d.l.e(r3, r0)
            kotlin.j0.o.c.j0 r0 = kotlin.p493j0.p494o.p495c.C11961j0.f26662b
            kotlin.j0.o.c.d r0 = r0.m10065g(r11)
            java.lang.String r4 = r0.mo10196a()
            r6 = 0
            r7 = 16
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.C11962k.<init>(kotlin.j0.o.c.j, kotlin.reflect.jvm.internal.impl.descriptors.x):void");
    }
}
