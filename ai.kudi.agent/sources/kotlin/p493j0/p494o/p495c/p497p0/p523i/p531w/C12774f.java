package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13360i;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13559y0;
/* compiled from: InnerClassesScopeWrapper.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.f */
/* loaded from: classes3.dex */
public final class C12774f extends AbstractC12781i {

    /* renamed from: b */
    private final InterfaceC12777h f28664b;

    public C12774f(InterfaceC12777h interfaceC12777h) {
        l.f(interfaceC12777h, "workerScope");
        this.f28664b = interfaceC12777h;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: b */
    public Set<C12614f> mo5116b() {
        return this.f28664b.mo5116b();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: d */
    public Set<C12614f> mo5114d() {
        return this.f28664b.mo5114d();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: e */
    public Set<C12614f> mo5113e() {
        return this.f28664b.mo5113e();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: f */
    public InterfaceC13334h mo5794f(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        InterfaceC13334h mo5794f = this.f28664b.mo5794f(c12614f, interfaceC12112b);
        if (mo5794f == null) {
            return null;
        }
        InterfaceC13312e interfaceC13312e = mo5794f instanceof InterfaceC13312e ? (InterfaceC13312e) mo5794f : null;
        if (interfaceC13312e == null) {
            if (mo5794f instanceof InterfaceC13559y0) {
                return (InterfaceC13559y0) mo5794f;
            }
            return null;
        }
        return interfaceC13312e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.AbstractC12781i, kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: h */
    public List<InterfaceC13334h> mo5112g(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        List<InterfaceC13334h> m3891e;
        l.f(c12768d, "kindFilter");
        l.f(interfaceC11767l, "nameFilter");
        C12768d m6798n = c12768d.m6798n(C12768d.f28635c.m6795c());
        if (m6798n == null) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        Collection<InterfaceC13513m> mo5112g = this.f28664b.mo5112g(m6798n, interfaceC11767l);
        ArrayList arrayList = new ArrayList();
        for (Object obj : mo5112g) {
            if (obj instanceof InterfaceC13360i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public String toString() {
        return l.m("Classes from ", this.f28664b);
    }
}
