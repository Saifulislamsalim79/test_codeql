package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12276f;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13508w;
/* compiled from: ReflectJavaArrayType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.i */
/* loaded from: classes3.dex */
public final class C13485i extends AbstractC13508w implements InterfaceC12276f {

    /* renamed from: b */
    private final Type f29841b;

    /* renamed from: c */
    private final AbstractC13508w f29842c;

    /* renamed from: d */
    private final Collection<InterfaceC12265a> f29843d;

    /* renamed from: e */
    private final boolean f29844e;

    public C13485i(Type type) {
        AbstractC13508w m4789a;
        List m3891e;
        l.f(type, "reflectType");
        this.f29841b = type;
        Type mo4774Z = mo4774Z();
        if (!(mo4774Z instanceof GenericArrayType)) {
            if (mo4774Z instanceof Class) {
                Class cls = (Class) mo4774Z;
                if (cls.isArray()) {
                    AbstractC13508w.C13509a c13509a = AbstractC13508w.f29866a;
                    Class<?> componentType = cls.getComponentType();
                    l.e(componentType, "getComponentType()");
                    m4789a = c13509a.m4789a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + mo4774Z().getClass() + "): " + mo4774Z());
        }
        AbstractC13508w.C13509a c13509a2 = AbstractC13508w.f29866a;
        Type genericComponentType = ((GenericArrayType) mo4774Z).getGenericComponentType();
        l.e(genericComponentType, "genericComponentType");
        m4789a = c13509a2.m4789a(genericComponentType);
        this.f29842c = m4789a;
        m3891e = C13726r.m3891e();
        this.f29843d = m3891e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13508w
    /* renamed from: Z */
    protected Type mo4774Z() {
        return this.f29841b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12276f
    /* renamed from: a0 */
    public AbstractC13508w mo4867s() {
        return this.f29842c;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: q */
    public boolean mo4771q() {
        return this.f29844e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: y */
    public Collection<InterfaceC12265a> mo4770y() {
        return this.f29843d;
    }
}
