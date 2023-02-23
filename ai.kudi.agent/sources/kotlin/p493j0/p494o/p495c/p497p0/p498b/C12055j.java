package kotlin.p493j0.p494o.p495c.p497p0.p498b;

import java.util.List;
import kotlin.C13218k;
import kotlin.EnumC13285m;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.C11808s;
import kotlin.p483e0.p485d.C11813x;
import kotlin.p493j0.InterfaceC11872i;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.EnumC12115d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C12969c0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.C13094n0;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.p545m.C13176a;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13724q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13313e0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13550w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: ReflectionTypes.kt */
/* renamed from: kotlin.j0.o.c.p0.b.j */
/* loaded from: classes3.dex */
public final class C12055j {

    /* renamed from: d */
    public static final C12057b f26791d;

    /* renamed from: e */
    static final /* synthetic */ InterfaceC11872i<Object>[] f26792e;

    /* renamed from: a */
    private final C13313e0 f26793a;

    /* renamed from: b */
    private final InterfaceC11824h f26794b;

    /* renamed from: c */
    private final C12056a f26795c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReflectionTypes.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.j$a */
    /* loaded from: classes3.dex */
    public static final class C12056a {

        /* renamed from: a */
        private final int f26796a;

        public C12056a(int i) {
            this.f26796a = i;
        }

        /* renamed from: a */
        public final InterfaceC13312e m9841a(C12055j c12055j, InterfaceC11872i<?> interfaceC11872i) {
            l.f(c12055j, "types");
            l.f(interfaceC11872i, "property");
            return c12055j.m9844b(C13176a.m5715a(interfaceC11872i.mo4699b()), this.f26796a);
        }
    }

    /* compiled from: ReflectionTypes.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.j$b */
    /* loaded from: classes3.dex */
    public static final class C12057b {
        private C12057b() {
        }

        public /* synthetic */ C12057b(g gVar) {
            this();
        }

        /* renamed from: a */
        public final AbstractC12965b0 m9840a(InterfaceC13305c0 interfaceC13305c0) {
            List m3901b;
            l.f(interfaceC13305c0, "module");
            InterfaceC13312e m4703a = C13550w.m4703a(interfaceC13305c0, C12059k.C12060a.f26831S);
            if (m4703a == null) {
                return null;
            }
            C12969c0 c12969c0 = C12969c0.f29026a;
            InterfaceC13346g m5317b = InterfaceC13346g.f29516s.m5317b();
            List<InterfaceC13562z0> mo5207c = m4703a.mo4649n().mo5207c();
            l.e(mo5207c, "kPropertyClass.typeConstructor.parameters");
            Object m3918q0 = C13722p.m3918q0(mo5207c);
            l.e(m3918q0, "kPropertyClass.typeConstructor.parameters.single()");
            m3901b = C13724q.m3901b(new C13094n0((InterfaceC13562z0) m3918q0));
            return C12969c0.m6311g(m5317b, m4703a, m3901b);
        }
    }

    /* compiled from: ReflectionTypes.kt */
    /* renamed from: kotlin.j0.o.c.p0.b.j$c */
    /* loaded from: classes3.dex */
    static final class C12058c extends AbstractC11802m implements InterfaceC11756a<InterfaceC12777h> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC13305c0 f26797c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12058c(InterfaceC13305c0 interfaceC13305c0) {
            super(0);
            this.f26797c = interfaceC13305c0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final InterfaceC12777h invoke() {
            return this.f26797c.mo4996V(C12059k.f26806i).mo4949u();
        }
    }

    static {
        InterfaceC11872i<Object>[] interfaceC11872iArr = new InterfaceC11872i[9];
        interfaceC11872iArr[1] = C11813x.m10312f(new C11808s(C11813x.m10316b(C12055j.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        interfaceC11872iArr[2] = C11813x.m10312f(new C11808s(C11813x.m10316b(C12055j.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        interfaceC11872iArr[3] = C11813x.m10312f(new C11808s(C11813x.m10316b(C12055j.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        interfaceC11872iArr[4] = C11813x.m10312f(new C11808s(C11813x.m10316b(C12055j.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        interfaceC11872iArr[5] = C11813x.m10312f(new C11808s(C11813x.m10316b(C12055j.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        interfaceC11872iArr[6] = C11813x.m10312f(new C11808s(C11813x.m10316b(C12055j.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        interfaceC11872iArr[7] = C11813x.m10312f(new C11808s(C11813x.m10316b(C12055j.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        interfaceC11872iArr[8] = C11813x.m10312f(new C11808s(C11813x.m10316b(C12055j.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        f26792e = interfaceC11872iArr;
        f26791d = new C12057b(null);
    }

    public C12055j(InterfaceC13305c0 interfaceC13305c0, C13313e0 c13313e0) {
        InterfaceC11824h m5626a;
        l.f(interfaceC13305c0, "module");
        l.f(c13313e0, "notFoundClasses");
        this.f26793a = c13313e0;
        m5626a = C13218k.m5626a(EnumC13285m.PUBLICATION, new C12058c(interfaceC13305c0));
        this.f26794b = m5626a;
        this.f26795c = new C12056a(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final InterfaceC13312e m9844b(String str, int i) {
        List<Integer> m3901b;
        C12614f m7349i = C12614f.m7349i(str);
        l.e(m7349i, "identifier(className)");
        InterfaceC13334h mo5794f = m9842d().mo5794f(m7349i, EnumC12115d.FROM_REFLECTION);
        InterfaceC13312e interfaceC13312e = mo5794f instanceof InterfaceC13312e ? (InterfaceC13312e) mo5794f : null;
        if (interfaceC13312e == null) {
            C13313e0 c13313e0 = this.f26793a;
            C12608b c12608b = new C12608b(C12059k.f26806i, m7349i);
            m3901b = C13724q.m3901b(Integer.valueOf(i));
            return c13313e0.m5340d(c12608b, m3901b);
        }
        return interfaceC13312e;
    }

    /* renamed from: d */
    private final InterfaceC12777h m9842d() {
        return (InterfaceC12777h) this.f26794b.getValue();
    }

    /* renamed from: c */
    public final InterfaceC13312e m9843c() {
        return this.f26795c.m9841a(this, f26792e[1]);
    }
}
