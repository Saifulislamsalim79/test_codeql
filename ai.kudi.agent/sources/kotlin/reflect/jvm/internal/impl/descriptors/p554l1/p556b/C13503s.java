package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12267a0;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12268b;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12288r;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13508w;
/* compiled from: ReflectJavaMethod.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.s */
/* loaded from: classes3.dex */
public final class C13503s extends AbstractC13502r implements InterfaceC12288r {

    /* renamed from: a */
    private final Method f29861a;

    public C13503s(Method method) {
        l.f(method, "member");
        this.f29861a = method;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12288r
    /* renamed from: T */
    public boolean mo4808T() {
        return InterfaceC12288r.C12289a.m9266a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13502r
    /* renamed from: e0 */
    public Method mo4807c0() {
        return this.f29861a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12288r
    /* renamed from: f0 */
    public AbstractC13508w mo4804j() {
        AbstractC13508w.C13509a c13509a = AbstractC13508w.f29866a;
        Type genericReturnType = mo4807c0().getGenericReturnType();
        l.e(genericReturnType, "member.genericReturnType");
        return c13509a.m4789a(genericReturnType);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12288r
    /* renamed from: k */
    public List<InterfaceC12267a0> mo4803k() {
        Type[] genericParameterTypes = mo4807c0().getGenericParameterTypes();
        l.e(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = mo4807c0().getParameterAnnotations();
        l.e(parameterAnnotations, "member.parameterAnnotations");
        return m4811d0(genericParameterTypes, parameterAnnotations, mo4807c0().isVarArgs());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12298z
    /* renamed from: l */
    public List<C13510x> mo4802l() {
        TypeVariable<Method>[] typeParameters = mo4807c0().getTypeParameters();
        l.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C13510x(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12288r
    /* renamed from: x */
    public InterfaceC12268b mo4801x() {
        Object defaultValue = mo4807c0().getDefaultValue();
        if (defaultValue == null) {
            return null;
        }
        return AbstractC13478d.f29837b.m4876a(defaultValue, null);
    }
}
