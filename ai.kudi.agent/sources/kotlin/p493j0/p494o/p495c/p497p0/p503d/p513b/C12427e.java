package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.C13287o;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0.C12408a;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12536l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12494e;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12495f;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12497g;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12880f;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12889j;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12903r;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.C12871i;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.EnumC12844e;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13739x0;
import kotlin.p557z.C13741y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
/* compiled from: DeserializedDescriptorResolver.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.e */
/* loaded from: classes3.dex */
public final class C12427e {

    /* renamed from: b */
    public static final C12428a f27600b = new C12428a(null);

    /* renamed from: c */
    private static final Set<C12408a.EnumC12409a> f27601c;

    /* renamed from: d */
    private static final Set<C12408a.EnumC12409a> f27602d;

    /* renamed from: e */
    private static final C12494e f27603e;

    /* renamed from: f */
    private static final C12494e f27604f;

    /* renamed from: g */
    private static final C12494e f27605g;

    /* renamed from: a */
    public C12889j f27606a;

    /* compiled from: DeserializedDescriptorResolver.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.e$a */
    /* loaded from: classes3.dex */
    public static final class C12428a {
        private C12428a() {
        }

        public /* synthetic */ C12428a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final C12494e m8929a() {
            return C12427e.f27605g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeserializedDescriptorResolver.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.b.e$b */
    /* loaded from: classes3.dex */
    public static final class C12429b extends AbstractC11802m implements InterfaceC11756a<Collection<? extends C12614f>> {

        /* renamed from: c */
        public static final C12429b f27607c = new C12429b();

        C12429b() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final Collection<C12614f> invoke() {
            List m3891e;
            m3891e = C13726r.m3891e();
            return m3891e;
        }
    }

    static {
        Set<C12408a.EnumC12409a> m3832a;
        Set<C12408a.EnumC12409a> m3827f;
        m3832a = C13739x0.m3832a(C12408a.EnumC12409a.CLASS);
        f27601c = m3832a;
        m3827f = C13741y0.m3827f(C12408a.EnumC12409a.FILE_FACADE, C12408a.EnumC12409a.MULTIFILE_CLASS_PART);
        f27602d = m3827f;
        f27603e = new C12494e(1, 1, 2);
        f27604f = new C12494e(1, 1, 11);
        f27605g = new C12494e(1, 1, 13);
    }

    /* renamed from: d */
    private final EnumC12844e m8940d(InterfaceC12447o interfaceC12447o) {
        return m8939e().m6505g().mo6489b() ? EnumC12844e.STABLE : interfaceC12447o.mo4926a().m8990j() ? EnumC12844e.FIR_UNSTABLE : interfaceC12447o.mo4926a().m8989k() ? EnumC12844e.IR_UNSTABLE : EnumC12844e.STABLE;
    }

    /* renamed from: f */
    private final C12903r<C12494e> m8938f(InterfaceC12447o interfaceC12447o) {
        if (m8937g() || interfaceC12447o.mo4926a().m8996d().m8642h()) {
            return null;
        }
        return new C12903r<>(interfaceC12447o.mo4926a().m8996d(), C12494e.f27750g, interfaceC12447o.getLocation(), interfaceC12447o.mo4922h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final boolean m8937g() {
        return m8939e().m6505g().mo6487d();
    }

    /* renamed from: h */
    private final boolean m8936h(InterfaceC12447o interfaceC12447o) {
        return !m8939e().m6505g().mo6488c() && interfaceC12447o.mo4926a().m8991i() && l.b(interfaceC12447o.mo4926a().m8996d(), f27604f);
    }

    /* renamed from: i */
    private final boolean m8935i(InterfaceC12447o interfaceC12447o) {
        return (m8939e().m6505g().mo6486e() && (interfaceC12447o.mo4926a().m8991i() || l.b(interfaceC12447o.mo4926a().m8996d(), f27603e))) || m8936h(interfaceC12447o);
    }

    /* renamed from: k */
    private final String[] m8933k(InterfaceC12447o interfaceC12447o, Set<? extends C12408a.EnumC12409a> set) {
        C12408a mo4926a = interfaceC12447o.mo4926a();
        String[] m8999a = mo4926a.m8999a();
        if (m8999a == null) {
            m8999a = mo4926a.m8998b();
        }
        if (m8999a != null && set.contains(mo4926a.m8997c())) {
            return m8999a;
        }
        return null;
    }

    /* renamed from: c */
    public final InterfaceC12777h m8941c(InterfaceC13320f0 interfaceC13320f0, InterfaceC12447o interfaceC12447o) {
        String[] m8993g;
        C13287o<C12495f, C12536l> c13287o;
        l.f(interfaceC13320f0, "descriptor");
        l.f(interfaceC12447o, "kotlinClass");
        String[] m8933k = m8933k(interfaceC12447o, f27602d);
        if (m8933k == null || (m8993g = interfaceC12447o.mo4926a().m8993g()) == null) {
            return null;
        }
        try {
            try {
                C12497g c12497g = C12497g.f27759a;
                c13287o = C12497g.m8628m(m8933k, m8993g);
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalStateException(l.m("Could not read data from ", interfaceC12447o.getLocation()), e);
            }
        } catch (Throwable th) {
            if (m8937g() || interfaceC12447o.mo4926a().m8996d().m8642h()) {
                throw th;
            }
            c13287o = null;
        }
        if (c13287o == null) {
            return null;
        }
        C12495f m5366a = c13287o.m5366a();
        C12536l m5365b = c13287o.m5365b();
        return new C12871i(interfaceC13320f0, m5365b, m5366a, interfaceC12447o.mo4926a().m8996d(), new C12433i(interfaceC12447o, m5365b, m5366a, m8938f(interfaceC12447o), m8935i(interfaceC12447o), m8940d(interfaceC12447o)), m8939e(), C12429b.f27607c);
    }

    /* renamed from: e */
    public final C12889j m8939e() {
        C12889j c12889j = this.f27606a;
        if (c12889j != null) {
            return c12889j;
        }
        l.u("components");
        throw null;
    }

    /* renamed from: j */
    public final C12880f m8934j(InterfaceC12447o interfaceC12447o) {
        C13287o<C12495f, C12509c> c13287o;
        l.f(interfaceC12447o, "kotlinClass");
        String[] m8933k = m8933k(interfaceC12447o, f27601c);
        if (m8933k == null) {
            return null;
        }
        String[] m8993g = interfaceC12447o.mo4926a().m8993g();
        try {
        } catch (Throwable th) {
            if (m8937g() || interfaceC12447o.mo4926a().m8996d().m8642h()) {
                throw th;
            }
            c13287o = null;
        }
        if (m8993g == null) {
            return null;
        }
        try {
            C12497g c12497g = C12497g.f27759a;
            c13287o = C12497g.m8632i(m8933k, m8993g);
            if (c13287o == null) {
                return null;
            }
            return new C12880f(c13287o.m5366a(), c13287o.m5365b(), interfaceC12447o.mo4926a().m8996d(), new C12454q(interfaceC12447o, m8938f(interfaceC12447o), m8935i(interfaceC12447o), m8940d(interfaceC12447o)));
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalStateException(l.m("Could not read data from ", interfaceC12447o.getLocation()), e);
        }
    }

    /* renamed from: l */
    public final InterfaceC13312e m8932l(InterfaceC12447o interfaceC12447o) {
        l.f(interfaceC12447o, "kotlinClass");
        C12880f m8934j = m8934j(interfaceC12447o);
        if (m8934j == null) {
            return null;
        }
        return m8939e().m6506f().m6519d(interfaceC12447o.mo4922h(), m8934j);
    }

    /* renamed from: m */
    public final void m8931m(C12426d c12426d) {
        l.f(c12426d, "components");
        m8930n(c12426d.m8944a());
    }

    /* renamed from: n */
    public final void m8930n(C12889j c12889j) {
        l.f(c12889j, "<set-?>");
        this.f27606a = c12889j;
    }
}
