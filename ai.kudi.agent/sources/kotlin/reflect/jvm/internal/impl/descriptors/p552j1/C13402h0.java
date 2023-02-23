package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12765c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12768d;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13741y0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13448k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.utils.C13634a;
/* compiled from: SubpackagesScope.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.h0 */
/* loaded from: classes3.dex */
public class C13402h0 extends AbstractC12781i {

    /* renamed from: b */
    private final InterfaceC13305c0 f29674b;

    /* renamed from: c */
    private final C12609c f29675c;

    public C13402h0(InterfaceC13305c0 interfaceC13305c0, C12609c c12609c) {
        l.f(interfaceC13305c0, "moduleDescriptor");
        l.f(c12609c, "fqName");
        this.f29674b = interfaceC13305c0;
        this.f29675c = c12609c;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: e */
    public Set<C12614f> mo5113e() {
        Set<C12614f> m3831b;
        m3831b = C13741y0.m3831b();
        return m3831b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: g */
    public Collection<InterfaceC13513m> mo5112g(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        List m3891e;
        List m3891e2;
        l.f(c12768d, "kindFilter");
        l.f(interfaceC11767l, "nameFilter");
        if (!c12768d.m6811a(C12768d.f28635c.m6792f())) {
            m3891e2 = C13726r.m3891e();
            return m3891e2;
        } else if (this.f29675c.m7380d() && c12768d.m6800l().contains(AbstractC12765c.C12767b.f28634a)) {
            m3891e = C13726r.m3891e();
            return m3891e;
        } else {
            Collection<C12609c> mo4978t = this.f29674b.mo4978t(this.f29675c, interfaceC11767l);
            ArrayList arrayList = new ArrayList(mo4978t.size());
            for (C12609c c12609c : mo4978t) {
                C12614f m7377g = c12609c.m7377g();
                l.e(m7377g, "subFqName.shortName()");
                if (interfaceC11767l.invoke(m7377g).booleanValue()) {
                    C13634a.m4287a(arrayList, m5173h(m7377g));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: h */
    protected final InterfaceC13448k0 m5173h(C12614f c12614f) {
        l.f(c12614f, "name");
        if (c12614f.m7348j()) {
            return null;
        }
        InterfaceC13305c0 interfaceC13305c0 = this.f29674b;
        C12609c m7381c = this.f29675c.m7381c(c12614f);
        l.e(m7381c, "fqName.child(name)");
        InterfaceC13448k0 mo4996V = interfaceC13305c0.mo4996V(m7381c);
        if (mo4996V.isEmpty()) {
            return null;
        }
        return mo4996V;
    }
}
