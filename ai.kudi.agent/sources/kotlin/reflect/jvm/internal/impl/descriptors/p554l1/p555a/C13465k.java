package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a;

import java.util.List;
import kotlin.C13666w;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q.C12087f;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q.C12094g;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.p500q.C12107h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.InterfaceC12134g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12172g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12178k;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12426d;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12427e;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.C12755c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p530v.C12761b;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12889j;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12890k;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.C12928f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.C13038n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.InterfaceC13036m;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.C13313e0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13403i;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13442x;
/* compiled from: RuntimeModuleData.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.k */
/* loaded from: classes3.dex */
public final class C13465k {

    /* renamed from: c */
    public static final C13466a f29821c = new C13466a(null);

    /* renamed from: a */
    private final C12889j f29822a;

    /* renamed from: b */
    private final C13454a f29823b;

    /* compiled from: RuntimeModuleData.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.k$a */
    /* loaded from: classes3.dex */
    public static final class C13466a {
        private C13466a() {
        }

        public /* synthetic */ C13466a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C13465k m4908a(ClassLoader classLoader) {
            List m3891e;
            List m3888h;
            l.f(classLoader, "classLoader");
            C12928f c12928f = new C12928f("RuntimeModuleData");
            C12087f c12087f = new C12087f(c12928f, C12087f.EnumC12088a.FROM_DEPENDENCIES);
            C12614f m7346n = C12614f.m7346n("<runtime module for " + classLoader + '>');
            l.e(m7346n, "special(\"<runtime module for $classLoader>\")");
            C13442x c13442x = new C13442x(m7346n, c12928f, c12087f, null, null, null, 56, null);
            c12087f.m9931B0(c13442x);
            c12087f.m9737G0(c13442x, true);
            C13461g c13461g = new C13461g(classLoader);
            C12427e c12427e = new C12427e();
            C12178k c12178k = new C12178k();
            C13313e0 c13313e0 = new C13313e0(c12928f, c13442x);
            C12172g m4905c = C13467l.m4905c(classLoader, c13442x, c12928f, c13313e0, c13461g, c12427e, c12178k, null, 128, null);
            C12426d m4907a = C13467l.m4907a(c13442x, c12928f, c13313e0, m4905c, c13461g, c12427e);
            c12427e.m8931m(m4907a);
            InterfaceC12134g interfaceC12134g = InterfaceC12134g.f27075a;
            l.e(interfaceC12134g, "EMPTY");
            C12755c c12755c = new C12755c(m4905c, interfaceC12134g);
            c12178k.m9524c(c12755c);
            ClassLoader classLoader2 = C13666w.class.getClassLoader();
            l.e(classLoader2, "stdlibClassLoader");
            C13461g c13461g2 = new C13461g(classLoader2);
            C12094g m9738F0 = c12087f.m9738F0();
            C12094g m9738F02 = c12087f.m9738F0();
            InterfaceC12890k.C12891a c12891a = InterfaceC12890k.C12891a.f28912a;
            C13038n m6075a = InterfaceC13036m.f29127b.m6075a();
            m3891e = C13726r.m3891e();
            C12107h c12107h = new C12107h(c12928f, c13461g2, c13442x, c13313e0, m9738F0, m9738F02, c12891a, m6075a, new C12761b(c12928f, m3891e));
            c13442x.m4981j1(c13442x);
            m3888h = C13726r.m3888h(c12755c.m6838a(), c12107h);
            c13442x.m4987d1(new C13403i(m3888h));
            return new C13465k(m4907a.m8944a(), new C13454a(c12427e, c13461g), null);
        }
    }

    private C13465k(C12889j c12889j, C13454a c13454a) {
        this.f29822a = c12889j;
        this.f29823b = c13454a;
    }

    public /* synthetic */ C13465k(C12889j c12889j, C13454a c13454a, g gVar) {
        this(c12889j, c13454a);
    }

    /* renamed from: a */
    public final C12889j m4911a() {
        return this.f29822a;
    }

    /* renamed from: b */
    public final InterfaceC13305c0 m4910b() {
        return this.f29822a.m6496p();
    }

    /* renamed from: c */
    public final C13454a m4909c() {
        return this.f29823b;
    }
}
