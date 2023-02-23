package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.C12509c;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12588b;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.C12598g;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p519z.InterfaceC12593c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
/* compiled from: ProtoContainer.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.x */
/* loaded from: classes3.dex */
public abstract class AbstractC12916x {

    /* renamed from: a */
    private final InterfaceC12593c f28963a;

    /* renamed from: b */
    private final C12598g f28964b;

    /* renamed from: c */
    private final InterfaceC13545u0 f28965c;

    /* compiled from: ProtoContainer.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.x$a */
    /* loaded from: classes3.dex */
    public static final class C12917a extends AbstractC12916x {

        /* renamed from: d */
        private final C12509c f28966d;

        /* renamed from: e */
        private final C12917a f28967e;

        /* renamed from: f */
        private final C12608b f28968f;

        /* renamed from: g */
        private final C12509c.EnumC12512c f28969g;

        /* renamed from: h */
        private final boolean f28970h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12917a(C12509c c12509c, InterfaceC12593c interfaceC12593c, C12598g c12598g, InterfaceC13545u0 interfaceC13545u0, C12917a c12917a) {
            super(interfaceC12593c, c12598g, interfaceC13545u0, null);
            l.f(c12509c, "classProto");
            l.f(interfaceC12593c, "nameResolver");
            l.f(c12598g, "typeTable");
            this.f28966d = c12509c;
            this.f28967e = c12917a;
            this.f28968f = C12914v.m6431a(interfaceC12593c, c12509c.m8422r0());
            C12509c.EnumC12512c mo7435d = C12588b.f28322f.mo7435d(this.f28966d.m8423q0());
            this.f28969g = mo7435d == null ? C12509c.EnumC12512c.CLASS : mo7435d;
            Boolean mo7435d2 = C12588b.f28323g.mo7435d(this.f28966d.m8423q0());
            l.e(mo7435d2, "IS_INNER.get(classProto.flags)");
            this.f28970h = mo7435d2.booleanValue();
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.AbstractC12916x
        /* renamed from: a */
        public C12609c mo6419a() {
            C12609c m7395b = this.f28968f.m7395b();
            l.e(m7395b, "classId.asSingleFqName()");
            return m7395b;
        }

        /* renamed from: e */
        public final C12608b m6424e() {
            return this.f28968f;
        }

        /* renamed from: f */
        public final C12509c m6423f() {
            return this.f28966d;
        }

        /* renamed from: g */
        public final C12509c.EnumC12512c m6422g() {
            return this.f28969g;
        }

        /* renamed from: h */
        public final C12917a m6421h() {
            return this.f28967e;
        }

        /* renamed from: i */
        public final boolean m6420i() {
            return this.f28970h;
        }
    }

    /* compiled from: ProtoContainer.kt */
    /* renamed from: kotlin.j0.o.c.p0.j.b.x$b */
    /* loaded from: classes3.dex */
    public static final class C12918b extends AbstractC12916x {

        /* renamed from: d */
        private final C12609c f28971d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12918b(C12609c c12609c, InterfaceC12593c interfaceC12593c, C12598g c12598g, InterfaceC13545u0 interfaceC13545u0) {
            super(interfaceC12593c, c12598g, interfaceC13545u0, null);
            l.f(c12609c, "fqName");
            l.f(interfaceC12593c, "nameResolver");
            l.f(c12598g, "typeTable");
            this.f28971d = c12609c;
        }

        @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.AbstractC12916x
        /* renamed from: a */
        public C12609c mo6419a() {
            return this.f28971d;
        }
    }

    private AbstractC12916x(InterfaceC12593c interfaceC12593c, C12598g c12598g, InterfaceC13545u0 interfaceC13545u0) {
        this.f28963a = interfaceC12593c;
        this.f28964b = c12598g;
        this.f28965c = interfaceC13545u0;
    }

    public /* synthetic */ AbstractC12916x(InterfaceC12593c interfaceC12593c, C12598g c12598g, InterfaceC13545u0 interfaceC13545u0, g gVar) {
        this(interfaceC12593c, c12598g, interfaceC13545u0);
    }

    /* renamed from: a */
    public abstract C12609c mo6419a();

    /* renamed from: b */
    public final InterfaceC12593c m6427b() {
        return this.f28963a;
    }

    /* renamed from: c */
    public final InterfaceC13545u0 m6426c() {
        return this.f28965c;
    }

    /* renamed from: d */
    public final C12598g m6425d() {
        return this.f28964b;
    }

    public String toString() {
        return ((Object) getClass().getSimpleName()) + ": " + mo6419a();
    }
}
