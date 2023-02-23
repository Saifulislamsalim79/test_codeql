package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12277g;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12292u;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p557z.C13726r;
/* compiled from: ReflectJavaPackage.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.u */
/* loaded from: classes3.dex */
public final class C13506u extends AbstractC13498n implements InterfaceC12292u {

    /* renamed from: a */
    private final C12609c f29862a;

    public C13506u(C12609c c12609c) {
        l.f(c12609c, "fqName");
        this.f29862a = c12609c;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12292u
    /* renamed from: G */
    public Collection<InterfaceC12292u> mo4795G() {
        List m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: Z */
    public List<InterfaceC12265a> mo4770y() {
        List<InterfaceC12265a> m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13506u) && l.b(mo4793f(), ((C13506u) obj).mo4793f());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12292u
    /* renamed from: f */
    public C12609c mo4793f() {
        return this.f29862a;
    }

    public int hashCode() {
        return mo4793f().hashCode();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: q */
    public boolean mo4771q() {
        return false;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: r */
    public InterfaceC12265a mo4777r(C12609c c12609c) {
        l.f(c12609c, "fqName");
        return null;
    }

    public String toString() {
        return C13506u.class.getName() + ": " + mo4793f();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12292u
    /* renamed from: v */
    public Collection<InterfaceC12277g> mo4792v(InterfaceC11767l<? super C12614f, Boolean> interfaceC11767l) {
        List m3891e;
        l.f(interfaceC11767l, "nameFilter");
        m3891e = C13726r.m3891e();
        return m3891e;
    }
}
