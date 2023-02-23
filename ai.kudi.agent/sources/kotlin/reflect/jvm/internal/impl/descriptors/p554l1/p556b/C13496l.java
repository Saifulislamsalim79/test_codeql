package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12279i;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12280j;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12295x;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13728s;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13508w;
/* compiled from: ReflectJavaClassifierType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.l */
/* loaded from: classes3.dex */
public final class C13496l extends AbstractC13508w implements InterfaceC12280j {

    /* renamed from: b */
    private final Type f29855b;

    /* renamed from: c */
    private final InterfaceC12279i f29856c;

    public C13496l(Type type) {
        InterfaceC12279i c13486j;
        l.f(type, "reflectType");
        this.f29855b = type;
        Type mo4774Z = mo4774Z();
        if (mo4774Z instanceof Class) {
            c13486j = new C13486j((Class) mo4774Z);
        } else if (mo4774Z instanceof TypeVariable) {
            c13486j = new C13510x((TypeVariable) mo4774Z);
        } else if (!(mo4774Z instanceof ParameterizedType)) {
            throw new IllegalStateException("Not a classifier type (" + mo4774Z.getClass() + "): " + mo4774Z);
        } else {
            Type rawType = ((ParameterizedType) mo4774Z).getRawType();
            if (rawType == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
            }
            c13486j = new C13486j((Class) rawType);
        }
        this.f29856c = c13486j;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12280j
    /* renamed from: D */
    public boolean mo4831D() {
        Type mo4774Z = mo4774Z();
        if (mo4774Z instanceof Class) {
            TypeVariable[] typeParameters = ((Class) mo4774Z).getTypeParameters();
            l.e(typeParameters, "getTypeParameters()");
            return (typeParameters.length == 0) ^ true;
        }
        return false;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12280j
    /* renamed from: E */
    public String mo4830E() {
        throw new UnsupportedOperationException(l.m("Type not found: ", mo4774Z()));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12280j
    /* renamed from: L */
    public List<InterfaceC12295x> mo4829L() {
        int m3867o;
        List<Type> m4891c = C13474b.m4891c(mo4774Z());
        AbstractC13508w.C13509a c13509a = AbstractC13508w.f29866a;
        m3867o = C13728s.m3867o(m4891c, 10);
        ArrayList arrayList = new ArrayList(m3867o);
        for (Type type : m4891c) {
            arrayList.add(c13509a.m4789a(type));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13508w
    /* renamed from: Z */
    public Type mo4774Z() {
        return this.f29855b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12280j
    /* renamed from: g */
    public InterfaceC12279i mo4828g() {
        return this.f29856c;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: q */
    public boolean mo4771q() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13508w, kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: r */
    public InterfaceC12265a mo4777r(C12609c c12609c) {
        l.f(c12609c, "fqName");
        return null;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12280j
    /* renamed from: u */
    public String mo4827u() {
        return mo4774Z().toString();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: y */
    public Collection<InterfaceC12265a> mo4770y() {
        List m3891e;
        m3891e = C13726r.m3891e();
        return m3891e;
    }
}
