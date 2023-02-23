package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
import kotlin.reflect.jvm.internal.impl.utils.C13643d;
/* compiled from: MemberScopeImpl.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.i */
/* loaded from: classes3.dex */
public abstract class AbstractC12781i implements InterfaceC12777h {
    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: a */
    public Collection<? extends InterfaceC13543t0> mo5117a(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        List m3891e;
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: b */
    public Set<C12614f> mo5116b() {
        Collection<InterfaceC13513m> mo5112g = mo5112g(C12768d.f28650r, C13643d.m4266a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : mo5112g) {
            if (obj instanceof InterfaceC13543t0) {
                C12614f mo5012b = ((InterfaceC13543t0) obj).mo5012b();
                l.e(mo5012b, "it.name");
                linkedHashSet.add(mo5012b);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: c */
    public Collection<? extends InterfaceC13518o0> mo5115c(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        List m3891e;
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: d */
    public Set<C12614f> mo5114d() {
        Collection<InterfaceC13513m> mo5112g = mo5112g(C12768d.f28651s, C13643d.m4266a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : mo5112g) {
            if (obj instanceof InterfaceC13543t0) {
                C12614f mo5012b = ((InterfaceC13543t0) obj).mo5012b();
                l.e(mo5012b, "it.name");
                linkedHashSet.add(mo5012b);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: e */
    public Set<C12614f> mo5113e() {
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: f */
    public InterfaceC13334h mo5794f(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: g */
    public Collection<InterfaceC13513m> mo5112g(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        List m3891e;
        l.f(c12768d, "kindFilter");
        l.f(interfaceC11767l, "nameFilter");
        m3891e = C13726r.m3891e();
        return m3891e;
    }
}
