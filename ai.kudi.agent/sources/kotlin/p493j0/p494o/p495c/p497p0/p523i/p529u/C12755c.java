package kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.EnumC12115d;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0.InterfaceC12134g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12172g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.C12210h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.EnumC12271c0;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p557z.C13722p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
/* compiled from: JavaDescriptorResolver.kt */
/* renamed from: kotlin.j0.o.c.p0.i.u.c */
/* loaded from: classes3.dex */
public final class C12755c {

    /* renamed from: a */
    private final C12172g f28606a;

    /* renamed from: b */
    private final InterfaceC12134g f28607b;

    public C12755c(C12172g c12172g, InterfaceC12134g interfaceC12134g) {
        l.f(c12172g, "packageFragmentProvider");
        l.f(interfaceC12134g, "javaResolverCache");
        this.f28606a = c12172g;
        this.f28607b = interfaceC12134g;
    }

    /* renamed from: a */
    public final C12172g m6838a() {
        return this.f28606a;
    }

    /* renamed from: b */
    public final InterfaceC13312e m6837b(InterfaceC12277g interfaceC12277g) {
        l.f(interfaceC12277g, "javaClass");
        C12609c mo4850f = interfaceC12277g.mo4850f();
        if (mo4850f != null && interfaceC12277g.mo4862Q() == EnumC12271c0.SOURCE) {
            return this.f28607b.mo9645a(mo4850f);
        }
        InterfaceC12277g mo4845m = interfaceC12277g.mo4845m();
        if (mo4845m != null) {
            InterfaceC13312e m6837b = m6837b(mo4845m);
            InterfaceC12777h mo5018I0 = m6837b == null ? null : m6837b.mo5018I0();
            InterfaceC13334h mo5794f = mo5018I0 == null ? null : mo5018I0.mo5794f(interfaceC12277g.mo4785b(), EnumC12115d.FROM_JAVA_LOADER);
            if (mo5794f instanceof InterfaceC13312e) {
                return (InterfaceC13312e) mo5794f;
            }
            return null;
        } else if (mo4850f == null) {
            return null;
        } else {
            C12172g c12172g = this.f28606a;
            C12609c m7379e = mo4850f.m7379e();
            l.e(m7379e, "fqName.parent()");
            C12210h c12210h = (C12210h) C13722p.m3952T(c12172g.mo5172a(m7379e));
            if (c12210h == null) {
                return null;
            }
            return c12210h.m9411W0(interfaceC12277g);
        }
    }
}
