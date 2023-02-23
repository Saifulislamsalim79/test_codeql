package kotlin.p493j0.p494o.p495c.p497p0.p544m;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p528t.C12747a;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.AbstractC13153f;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.AbstractC13164k;
import kotlin.p493j0.p494o.p495c.p497p0.p544m.AbstractC13171l;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.j0.o.c.p0.m.i */
/* loaded from: classes3.dex */
public final class C13159i extends AbstractC13141a {

    /* renamed from: a */
    public static final C13159i f29243a = new C13159i();

    /* renamed from: b */
    private static final List<C13148d> f29244b;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.i$a */
    /* loaded from: classes3.dex */
    static final class C13160a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13554x, String> {

        /* renamed from: c */
        public static final C13160a f29245c = new C13160a();

        C13160a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final String invoke(InterfaceC13554x interfaceC13554x) {
            Boolean valueOf;
            l.f(interfaceC13554x, "$this$$receiver");
            List<InterfaceC13307c1> mo5072k = interfaceC13554x.mo5072k();
            l.e(mo5072k, "valueParameters");
            InterfaceC13307c1 interfaceC13307c1 = (InterfaceC13307c1) C13722p.m3940e0(mo5072k);
            if (interfaceC13307c1 == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(!C12747a.m6869a(interfaceC13307c1) && interfaceC13307c1.mo5131v0() == null);
            }
            boolean b = l.b(valueOf, Boolean.TRUE);
            C13159i c13159i = C13159i.f29243a;
            if (b) {
                return null;
            }
            return "last parameter should not have a default value or be a vararg";
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.i$b */
    /* loaded from: classes3.dex */
    static final class C13161b extends AbstractC11802m implements InterfaceC11767l<InterfaceC13554x, String> {

        /* renamed from: c */
        public static final C13161b f29246c = new C13161b();

        C13161b() {
            super(1);
        }

        /* renamed from: b */
        private static final boolean m5723b(InterfaceC13513m interfaceC13513m) {
            return (interfaceC13513m instanceof InterfaceC13312e) && AbstractC12046h.m9908Z((InterfaceC13312e) interfaceC13513m);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final String invoke(InterfaceC13554x interfaceC13554x) {
            boolean z;
            l.f(interfaceC13554x, "$this$$receiver");
            C13159i c13159i = C13159i.f29243a;
            InterfaceC13513m mo4687d = interfaceC13554x.mo4687d();
            l.e(mo4687d, "containingDeclaration");
            boolean z2 = true;
            if (!m5723b(mo4687d)) {
                Collection<? extends InterfaceC13554x> mo4685g = interfaceC13554x.mo4685g();
                l.e(mo4685g, "overriddenDescriptors");
                if (!mo4685g.isEmpty()) {
                    for (InterfaceC13554x interfaceC13554x2 : mo4685g) {
                        InterfaceC13513m mo4687d2 = interfaceC13554x2.mo4687d();
                        l.e(mo4687d2, "it.containingDeclaration");
                        if (m5723b(mo4687d2)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    z2 = false;
                }
            }
            if (z2) {
                return null;
            }
            return "must override ''equals()'' in Any";
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.i$c */
    /* loaded from: classes3.dex */
    static final class C13162c extends AbstractC11802m implements InterfaceC11767l<InterfaceC13554x, String> {

        /* renamed from: c */
        public static final C13162c f29247c = new C13162c();

        C13162c() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final String invoke(InterfaceC13554x interfaceC13554x) {
            boolean m5895l;
            l.f(interfaceC13554x, "$this$$receiver");
            InterfaceC13524r0 mo5066p0 = interfaceC13554x.mo5066p0();
            if (mo5066p0 == null) {
                mo5066p0 = interfaceC13554x.mo5056w0();
            }
            C13159i c13159i = C13159i.f29243a;
            boolean z = false;
            if (mo5066p0 != null) {
                AbstractC12965b0 mo4943j = interfaceC13554x.mo4943j();
                if (mo4943j == null) {
                    m5895l = false;
                } else {
                    AbstractC12965b0 mo5121c = mo5066p0.mo5121c();
                    l.e(mo5121c, "receiver.type");
                    m5895l = C13090a.m5895l(mo4943j, mo5121c);
                }
                if (m5895l) {
                    z = true;
                }
            }
            if (z) {
                return null;
            }
            return "receiver must be a supertype of the return type";
        }
    }

    static {
        List m3888h;
        List<C13148d> m3888h2;
        C12614f c12614f = C13163j.f29264i;
        InterfaceC13142b[] interfaceC13142bArr = {AbstractC13153f.C13155b.f29239b, new AbstractC13171l.C13172a(1)};
        C12614f c12614f2 = C13163j.f29265j;
        InterfaceC13142b[] interfaceC13142bArr2 = {AbstractC13153f.C13155b.f29239b, new AbstractC13171l.C13172a(2)};
        C12614f c12614f3 = C13163j.f29256a;
        InterfaceC13142b[] interfaceC13142bArr3 = {AbstractC13153f.C13155b.f29239b, C13158h.f29241a, new AbstractC13171l.C13172a(2), C13152e.f29235a};
        C12614f c12614f4 = C13163j.f29257b;
        InterfaceC13142b[] interfaceC13142bArr4 = {AbstractC13153f.C13155b.f29239b, C13158h.f29241a, new AbstractC13171l.C13172a(3), C13152e.f29235a};
        C12614f c12614f5 = C13163j.f29258c;
        InterfaceC13142b[] interfaceC13142bArr5 = {AbstractC13153f.C13155b.f29239b, C13158h.f29241a, new AbstractC13171l.C13173b(2), C13152e.f29235a};
        C12614f c12614f6 = C13163j.f29262g;
        InterfaceC13142b[] interfaceC13142bArr6 = {AbstractC13153f.C13155b.f29239b};
        C12614f c12614f7 = C13163j.f29261f;
        InterfaceC13142b[] interfaceC13142bArr7 = {AbstractC13153f.C13155b.f29239b, AbstractC13171l.C13175d.f29295b, C13158h.f29241a, AbstractC13164k.C13165a.f29285d};
        C12614f c12614f8 = C13163j.f29263h;
        InterfaceC13142b[] interfaceC13142bArr8 = {AbstractC13153f.C13155b.f29239b, AbstractC13171l.C13174c.f29294b};
        C12614f c12614f9 = C13163j.f29266k;
        InterfaceC13142b[] interfaceC13142bArr9 = {AbstractC13153f.C13155b.f29239b, AbstractC13171l.C13174c.f29294b};
        C12614f c12614f10 = C13163j.f29267l;
        InterfaceC13142b[] interfaceC13142bArr10 = {AbstractC13153f.C13155b.f29239b, AbstractC13171l.C13174c.f29294b, AbstractC13164k.C13165a.f29285d};
        C12614f c12614f11 = C13163j.f29280y;
        InterfaceC13142b[] interfaceC13142bArr11 = {AbstractC13153f.C13155b.f29239b, AbstractC13171l.C13175d.f29295b, C13158h.f29241a};
        C12614f c12614f12 = C13163j.f29259d;
        InterfaceC13142b[] interfaceC13142bArr12 = {AbstractC13153f.C13154a.f29238b};
        C12614f c12614f13 = C13163j.f29260e;
        InterfaceC13142b[] interfaceC13142bArr13 = {AbstractC13153f.C13155b.f29239b, AbstractC13164k.C13167b.f29287d, AbstractC13171l.C13175d.f29295b, C13158h.f29241a};
        Set<C12614f> set = C13163j.f29254G;
        InterfaceC13142b[] interfaceC13142bArr14 = {AbstractC13153f.C13155b.f29239b, AbstractC13171l.C13175d.f29295b, C13158h.f29241a};
        Set<C12614f> set2 = C13163j.f29253F;
        InterfaceC13142b[] interfaceC13142bArr15 = {AbstractC13153f.C13155b.f29239b, AbstractC13171l.C13174c.f29294b};
        m3888h = C13726r.m3888h(C13163j.f29269n, C13163j.f29270o);
        m3888h2 = C13726r.m3888h(new C13148d(c12614f, interfaceC13142bArr, (InterfaceC11767l) null, 4, (g) null), new C13148d(c12614f2, interfaceC13142bArr2, C13160a.f29245c), new C13148d(c12614f3, interfaceC13142bArr3, (InterfaceC11767l) null, 4, (g) null), new C13148d(c12614f4, interfaceC13142bArr4, (InterfaceC11767l) null, 4, (g) null), new C13148d(c12614f5, interfaceC13142bArr5, (InterfaceC11767l) null, 4, (g) null), new C13148d(c12614f6, interfaceC13142bArr6, (InterfaceC11767l) null, 4, (g) null), new C13148d(c12614f7, interfaceC13142bArr7, (InterfaceC11767l) null, 4, (g) null), new C13148d(c12614f8, interfaceC13142bArr8, (InterfaceC11767l) null, 4, (g) null), new C13148d(c12614f9, interfaceC13142bArr9, (InterfaceC11767l) null, 4, (g) null), new C13148d(c12614f10, interfaceC13142bArr10, (InterfaceC11767l) null, 4, (g) null), new C13148d(c12614f11, interfaceC13142bArr11, (InterfaceC11767l) null, 4, (g) null), new C13148d(c12614f12, interfaceC13142bArr12, C13161b.f29246c), new C13148d(c12614f13, interfaceC13142bArr13, (InterfaceC11767l) null, 4, (g) null), new C13148d(set, interfaceC13142bArr14, (InterfaceC11767l) null, 4, (g) null), new C13148d(set2, interfaceC13142bArr15, (InterfaceC11767l) null, 4, (g) null), new C13148d(m3888h, new InterfaceC13142b[]{AbstractC13153f.C13155b.f29239b}, C13162c.f29247c), new C13148d(C13163j.f29255H, new InterfaceC13142b[]{AbstractC13153f.C13155b.f29239b, AbstractC13164k.C13169c.f29289d, AbstractC13171l.C13175d.f29295b, C13158h.f29241a}, (InterfaceC11767l) null, 4, (g) null), new C13148d(C13163j.f29268m, new InterfaceC13142b[]{AbstractC13153f.C13155b.f29239b, AbstractC13171l.C13174c.f29294b}, (InterfaceC11767l) null, 4, (g) null));
        f29244b = m3888h2;
    }

    private C13159i() {
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p544m.AbstractC13141a
    /* renamed from: b */
    public List<C13148d> mo5726b() {
        return f29244b;
    }
}
