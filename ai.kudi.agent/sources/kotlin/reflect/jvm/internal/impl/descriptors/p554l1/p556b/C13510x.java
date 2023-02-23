package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12297y;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.InterfaceC13481f;
/* compiled from: ReflectJavaTypeParameter.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.x */
/* loaded from: classes3.dex */
public final class C13510x extends AbstractC13498n implements InterfaceC13481f, InterfaceC12297y {

    /* renamed from: a */
    private final TypeVariable<?> f29867a;

    public C13510x(TypeVariable<?> typeVariable) {
        l.f(typeVariable, "typeVariable");
        this.f29867a = typeVariable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.InterfaceC13481f
    /* renamed from: C */
    public AnnotatedElement mo4788C() {
        TypeVariable<?> typeVariable = this.f29867a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: Z */
    public C13477c mo4777r(C12609c c12609c) {
        return InterfaceC13481f.C13482a.m4874a(this, c12609c);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: a0 */
    public List<C13477c> mo4770y() {
        return InterfaceC13481f.C13482a.m4873b(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12291t
    /* renamed from: b */
    public C12614f mo4785b() {
        C12614f m7349i = C12614f.m7349i(this.f29867a.getName());
        l.e(m7349i, "identifier(typeVariable.name)");
        return m7349i;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12297y
    /* renamed from: b0 */
    public List<C13496l> getUpperBounds() {
        List<C13496l> m3891e;
        Type[] bounds = this.f29867a.getBounds();
        l.e(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C13496l(type));
        }
        C13496l c13496l = (C13496l) C13722p.m3915s0(arrayList);
        if (l.b(c13496l == null ? null : c13496l.mo4774Z(), Object.class)) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13510x) && l.b(this.f29867a, ((C13510x) obj).f29867a);
    }

    public int hashCode() {
        return this.f29867a.hashCode();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: q */
    public boolean mo4771q() {
        return InterfaceC13481f.C13482a.m4872c(this);
    }

    public String toString() {
        return C13510x.class.getName() + ": " + this.f29867a;
    }
}
