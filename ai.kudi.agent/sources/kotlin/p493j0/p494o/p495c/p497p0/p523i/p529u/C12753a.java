package kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p557z.C13736w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13309d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
/* compiled from: SyntheticJavaPartsProvider.kt */
/* renamed from: kotlin.j0.o.c.p0.i.u.a */
/* loaded from: classes3.dex */
public final class C12753a implements InterfaceC12758f {

    /* renamed from: b */
    private final List<InterfaceC12758f> f28605b;

    /* JADX WARN: Multi-variable type inference failed */
    public C12753a(List<? extends InterfaceC12758f> list) {
        l.f(list, "inner");
        this.f28605b = list;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.InterfaceC12758f
    /* renamed from: a */
    public List<C12614f> mo6822a(InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13312e, "thisDescriptor");
        List<InterfaceC12758f> list = this.f28605b;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC12758f interfaceC12758f : list) {
            C13736w.m3850v(arrayList, interfaceC12758f.mo6822a(interfaceC13312e));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.InterfaceC12758f
    /* renamed from: b */
    public void mo6821b(InterfaceC13312e interfaceC13312e, C12614f c12614f, Collection<InterfaceC13543t0> collection) {
        l.f(interfaceC13312e, "thisDescriptor");
        l.f(c12614f, "name");
        l.f(collection, "result");
        for (InterfaceC12758f interfaceC12758f : this.f28605b) {
            interfaceC12758f.mo6821b(interfaceC13312e, c12614f, collection);
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.InterfaceC12758f
    /* renamed from: c */
    public void mo6820c(InterfaceC13312e interfaceC13312e, List<InterfaceC13309d> list) {
        l.f(interfaceC13312e, "thisDescriptor");
        l.f(list, "result");
        for (InterfaceC12758f interfaceC12758f : this.f28605b) {
            interfaceC12758f.mo6820c(interfaceC13312e, list);
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.InterfaceC12758f
    /* renamed from: d */
    public List<C12614f> mo6819d(InterfaceC13312e interfaceC13312e) {
        l.f(interfaceC13312e, "thisDescriptor");
        List<InterfaceC12758f> list = this.f28605b;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC12758f interfaceC12758f : list) {
            C13736w.m3850v(arrayList, interfaceC12758f.mo6819d(interfaceC13312e));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.InterfaceC12758f
    /* renamed from: e */
    public void mo6818e(InterfaceC13312e interfaceC13312e, C12614f c12614f, Collection<InterfaceC13543t0> collection) {
        l.f(interfaceC13312e, "thisDescriptor");
        l.f(c12614f, "name");
        l.f(collection, "result");
        for (InterfaceC12758f interfaceC12758f : this.f28605b) {
            interfaceC12758f.mo6818e(interfaceC13312e, c12614f, collection);
        }
    }
}
