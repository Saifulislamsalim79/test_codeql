package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C13218k;
import kotlin.EnumC13285m;
import kotlin.InterfaceC11824h;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12144c;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12377q;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12384t;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.EnumC12119a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12298z;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0.C12311i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13331g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
import kotlin.reflect.jvm.internal.impl.utils.EnumC13652f;
/* compiled from: context.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.d0.a */
/* loaded from: classes3.dex */
public final class C12161a {

    /* compiled from: context.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.a$a */
    /* loaded from: classes3.dex */
    public static final class C12162a extends AbstractC11802m implements InterfaceC11756a<C12384t> {

        /* renamed from: c */
        final /* synthetic */ C12174h f27114c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC13331g f27115d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12162a(C12174h c12174h, InterfaceC13331g interfaceC13331g) {
            super(0);
            this.f27114c = c12174h;
            this.f27115d = interfaceC13331g;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C12384t invoke() {
            return C12161a.m9579g(this.f27114c, this.f27115d.mo4956y());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: context.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.d0.a$b */
    /* loaded from: classes3.dex */
    public static final class C12163b extends AbstractC11802m implements InterfaceC11756a<C12384t> {

        /* renamed from: c */
        final /* synthetic */ C12174h f27116c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC13346g f27117d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12163b(C12174h c12174h, InterfaceC13346g interfaceC13346g) {
            super(0);
            this.f27116c = c12174h;
            this.f27117d = interfaceC13346g;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        /* renamed from: a */
        public final C12384t invoke() {
            return C12161a.m9579g(this.f27116c, this.f27117d);
        }
    }

    /* renamed from: a */
    private static final C12174h m9585a(C12174h c12174h, InterfaceC13513m interfaceC13513m, InterfaceC12298z interfaceC12298z, int i, InterfaceC11824h<C12384t> interfaceC11824h) {
        C12165c m9538a = c12174h.m9538a();
        C12175i c12175i = interfaceC12298z == null ? null : new C12175i(c12174h, interfaceC13513m, interfaceC12298z, i);
        if (c12175i == null) {
            c12175i = c12174h.m9533f();
        }
        return new C12174h(m9538a, c12175i, interfaceC11824h);
    }

    /* renamed from: b */
    public static final C12174h m9584b(C12174h c12174h, InterfaceC12179l interfaceC12179l) {
        l.f(c12174h, "<this>");
        l.f(interfaceC12179l, "typeParameterResolver");
        return new C12174h(c12174h.m9538a(), interfaceC12179l, c12174h.m9536c());
    }

    /* renamed from: c */
    public static final C12174h m9583c(C12174h c12174h, InterfaceC13331g interfaceC13331g, InterfaceC12298z interfaceC12298z, int i) {
        InterfaceC11824h m5626a;
        l.f(c12174h, "<this>");
        l.f(interfaceC13331g, "containingDeclaration");
        m5626a = C13218k.m5626a(EnumC13285m.NONE, new C12162a(c12174h, interfaceC13331g));
        return m9585a(c12174h, interfaceC13331g, interfaceC12298z, i, m5626a);
    }

    /* renamed from: d */
    public static /* synthetic */ C12174h m9582d(C12174h c12174h, InterfaceC13331g interfaceC13331g, InterfaceC12298z interfaceC12298z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC12298z = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m9583c(c12174h, interfaceC13331g, interfaceC12298z, i);
    }

    /* renamed from: e */
    public static final C12174h m9581e(C12174h c12174h, InterfaceC13513m interfaceC13513m, InterfaceC12298z interfaceC12298z, int i) {
        l.f(c12174h, "<this>");
        l.f(interfaceC13513m, "containingDeclaration");
        l.f(interfaceC12298z, "typeParameterOwner");
        return m9585a(c12174h, interfaceC13513m, interfaceC12298z, i, c12174h.m9536c());
    }

    /* renamed from: f */
    public static /* synthetic */ C12174h m9580f(C12174h c12174h, InterfaceC13513m interfaceC13513m, InterfaceC12298z interfaceC12298z, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m9581e(c12174h, interfaceC13513m, interfaceC12298z, i);
    }

    /* renamed from: g */
    public static final C12384t m9579g(C12174h c12174h, InterfaceC13346g interfaceC13346g) {
        EnumMap<EnumC12119a, C12377q> m9081b;
        l.f(c12174h, "<this>");
        l.f(interfaceC13346g, "additionalAnnotations");
        if (c12174h.m9538a().m9565i().m4260a()) {
            return c12174h.m9537b();
        }
        ArrayList<C12377q> arrayList = new ArrayList();
        Iterator<InterfaceC13340c> it = interfaceC13346g.iterator();
        while (it.hasNext()) {
            C12377q m9577i = m9577i(c12174h, it.next());
            if (m9577i != null) {
                arrayList.add(m9577i);
            }
        }
        if (arrayList.isEmpty()) {
            return c12174h.m9537b();
        }
        C12384t m9537b = c12174h.m9537b();
        EnumMap enumMap = null;
        if (m9537b != null && (m9081b = m9537b.m9081b()) != null) {
            enumMap = new EnumMap((EnumMap) m9081b);
        }
        if (enumMap == null) {
            enumMap = new EnumMap(EnumC12119a.class);
        }
        boolean z = false;
        for (C12377q c12377q : arrayList) {
            for (EnumC12119a enumC12119a : c12377q.m9097f()) {
                enumMap.put((EnumMap) enumC12119a, (EnumC12119a) c12377q);
                z = true;
            }
        }
        return !z ? c12174h.m9537b() : new C12384t(enumMap);
    }

    /* renamed from: h */
    public static final C12174h m9578h(C12174h c12174h, InterfaceC13346g interfaceC13346g) {
        InterfaceC11824h m5626a;
        l.f(c12174h, "<this>");
        l.f(interfaceC13346g, "additionalAnnotations");
        if (interfaceC13346g.isEmpty()) {
            return c12174h;
        }
        C12165c m9538a = c12174h.m9538a();
        InterfaceC12179l m9533f = c12174h.m9533f();
        m5626a = C13218k.m5626a(EnumC13285m.NONE, new C12163b(c12174h, interfaceC13346g));
        return new C12174h(m9538a, m9533f, m5626a);
    }

    /* renamed from: i */
    private static final C12377q m9577i(C12174h c12174h, InterfaceC13340c interfaceC13340c) {
        C12144c m9573a = c12174h.m9538a().m9573a();
        C12377q m9618l = m9573a.m9618l(interfaceC13340c);
        if (m9618l == null) {
            C12144c.C12145a m9616n = m9573a.m9616n(interfaceC13340c);
            if (m9616n == null) {
                return null;
            }
            InterfaceC13340c m9613a = m9616n.m9613a();
            List<EnumC12119a> m9612b = m9616n.m9612b();
            EnumC13652f m9619k = m9573a.m9619k(interfaceC13340c);
            if (m9619k == null) {
                m9619k = m9573a.m9620j(m9613a);
            }
            if (m9619k.m4250e()) {
                return null;
            }
            C12311i m9187h = c12174h.m9538a().m9556r().m9187h(m9613a, c12174h.m9538a().m9557q().mo9547c(), false);
            C12311i m9231b = m9187h == null ? null : C12311i.m9231b(m9187h, null, m9619k.m4249g(), 1, null);
            if (m9231b == null) {
                return null;
            }
            return new C12377q(m9231b, m9612b, false, 4, null);
        }
        return m9618l;
    }

    /* renamed from: j */
    public static final C12174h m9576j(C12174h c12174h, C12165c c12165c) {
        l.f(c12174h, "<this>");
        l.f(c12165c, "components");
        return new C12174h(c12165c, c12174h.m9533f(), c12174h.m9536c());
    }
}
