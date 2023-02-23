package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w;

import java.util.Collection;
import java.util.Set;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p501c.p502b.InterfaceC12112b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
/* compiled from: AbstractScopeAdapter.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.a */
/* loaded from: classes3.dex */
public abstract class AbstractC12762a implements InterfaceC12777h {
    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: a */
    public Collection<InterfaceC13543t0> mo5117a(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        return mo6761i().mo5117a(c12614f, interfaceC12112b);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: b */
    public Set<C12614f> mo5116b() {
        return mo6761i().mo5116b();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: c */
    public Collection<InterfaceC13518o0> mo5115c(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        return mo6761i().mo5115c(c12614f, interfaceC12112b);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: d */
    public Set<C12614f> mo5114d() {
        return mo6761i().mo5114d();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h
    /* renamed from: e */
    public Set<C12614f> mo5113e() {
        return mo6761i().mo5113e();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: f */
    public InterfaceC13334h mo5794f(C12614f c12614f, InterfaceC12112b interfaceC12112b) {
        l.f(c12614f, "name");
        l.f(interfaceC12112b, "location");
        return mo6761i().mo5794f(c12614f, interfaceC12112b);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12783k
    /* renamed from: g */
    public Collection<InterfaceC13513m> mo5112g(C12768d c12768d, InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        l.f(c12768d, "kindFilter");
        l.f(interfaceC11767l, "nameFilter");
        return mo6761i().mo5112g(c12768d, interfaceC11767l);
    }

    /* renamed from: h */
    public final InterfaceC12777h m6816h() {
        if (mo6761i() instanceof AbstractC12762a) {
            return ((AbstractC12762a) mo6761i()).m6816h();
        }
        return mo6761i();
    }

    /* renamed from: i */
    protected abstract InterfaceC12777h mo6761i();
}
