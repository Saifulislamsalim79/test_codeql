package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
/* compiled from: PackageFragmentProvider.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.i0 */
/* loaded from: classes3.dex */
public final class C13361i0 {
    /* renamed from: a */
    public static final void m5298a(InterfaceC13332g0 interfaceC13332g0, C12609c c12609c, Collection<InterfaceC13320f0> collection) {
        kotlin.e0.d.l.f(interfaceC13332g0, "<this>");
        kotlin.e0.d.l.f(c12609c, "fqName");
        kotlin.e0.d.l.f(collection, "packageFragments");
        if (interfaceC13332g0 instanceof InterfaceC13372j0) {
            ((InterfaceC13372j0) interfaceC13332g0).mo5171b(c12609c, collection);
        } else {
            collection.addAll(interfaceC13332g0.mo5172a(c12609c));
        }
    }

    /* renamed from: b */
    public static final boolean m5297b(InterfaceC13332g0 interfaceC13332g0, C12609c c12609c) {
        kotlin.e0.d.l.f(interfaceC13332g0, "<this>");
        kotlin.e0.d.l.f(c12609c, "fqName");
        return interfaceC13332g0 instanceof InterfaceC13372j0 ? ((InterfaceC13372j0) interfaceC13332g0).mo5170c(c12609c) : m5296c(interfaceC13332g0, c12609c).isEmpty();
    }

    /* renamed from: c */
    public static final List<InterfaceC13320f0> m5296c(InterfaceC13332g0 interfaceC13332g0, C12609c c12609c) {
        kotlin.e0.d.l.f(interfaceC13332g0, "<this>");
        kotlin.e0.d.l.f(c12609c, "fqName");
        ArrayList arrayList = new ArrayList();
        m5298a(interfaceC13332g0, c12609c, arrayList);
        return arrayList;
    }
}
