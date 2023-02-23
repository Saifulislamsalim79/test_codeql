package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.C13361i0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13372j0;
/* compiled from: CompositePackageFragmentProvider.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.i */
/* loaded from: classes3.dex */
public final class C13403i implements InterfaceC13372j0 {

    /* renamed from: a */
    private final List<InterfaceC13332g0> f29676a;

    /* JADX WARN: Multi-variable type inference failed */
    public C13403i(List<? extends InterfaceC13332g0> list) {
        Set m3821F0;
        Set m3821F02;
        l.f(list, "providers");
        this.f29676a = list;
        int size = list.size();
        m3821F0 = C13742z.m3821F0(this.f29676a);
        boolean z = size == m3821F0.size();
        if (!C13668y.f30115a || z) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("providers.size is ");
        sb.append(this.f29676a.size());
        sb.append(" while only ");
        m3821F02 = C13742z.m3821F0(this.f29676a);
        sb.append(m3821F02.size());
        sb.append(" unique providers");
        throw new AssertionError(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0
    /* renamed from: a */
    public List<InterfaceC13320f0> mo5172a(C12609c c12609c) {
        List<InterfaceC13320f0> m3825B0;
        l.f(c12609c, "fqName");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC13332g0 interfaceC13332g0 : this.f29676a) {
            C13361i0.m5298a(interfaceC13332g0, c12609c, arrayList);
        }
        m3825B0 = C13742z.m3825B0(arrayList);
        return m3825B0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13372j0
    /* renamed from: b */
    public void mo5171b(C12609c c12609c, Collection<InterfaceC13320f0> collection) {
        l.f(c12609c, "fqName");
        l.f(collection, "packageFragments");
        for (InterfaceC13332g0 interfaceC13332g0 : this.f29676a) {
            C13361i0.m5298a(interfaceC13332g0, c12609c, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13372j0
    /* renamed from: c */
    public boolean mo5170c(C12609c c12609c) {
        l.f(c12609c, "fqName");
        List<InterfaceC13332g0> list = this.f29676a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (InterfaceC13332g0 interfaceC13332g0 : list) {
            if (!C13361i0.m5297b(interfaceC13332g0, c12609c)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0
    /* renamed from: t */
    public Collection<C12609c> mo5169t(C12609c c12609c, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        l.f(c12609c, "fqName");
        l.f(interfaceC11767l, "nameFilter");
        HashSet hashSet = new HashSet();
        for (InterfaceC13332g0 interfaceC13332g0 : this.f29676a) {
            hashSet.addAll(interfaceC13332g0.mo5169t(c12609c, interfaceC11767l));
        }
        return hashSet;
    }
}
