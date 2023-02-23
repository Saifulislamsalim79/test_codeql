package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12267a0;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12281k;
import kotlin.p557z.C13706j;
import kotlin.p557z.C13726r;
/* compiled from: ReflectJavaConstructor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.m */
/* loaded from: classes3.dex */
public final class C13497m extends AbstractC13502r implements InterfaceC12281k {

    /* renamed from: a */
    private final Constructor<?> f29857a;

    public C13497m(Constructor<?> constructor) {
        l.f(constructor, "member");
        this.f29857a = constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13502r
    /* renamed from: e0 */
    public Constructor<?> mo4807c0() {
        return this.f29857a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12281k
    /* renamed from: k */
    public List<InterfaceC12267a0> mo4825k() {
        List<InterfaceC12267a0> m3891e;
        Type[] genericParameterTypes = mo4807c0().getGenericParameterTypes();
        l.e(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            m3891e = C13726r.m3891e();
            return m3891e;
        }
        Class<?> declaringClass = mo4807c0().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C13706j.m4090h(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = mo4807c0().getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                l.e(parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) C13706j.m4090h(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            l.e(genericParameterTypes, "realTypes");
            l.e(parameterAnnotations, "realAnnotations");
            return m4811d0(genericParameterTypes, parameterAnnotations, mo4807c0().isVarArgs());
        }
        throw new IllegalStateException(l.m("Illegal generic signature: ", mo4807c0()));
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12298z
    /* renamed from: l */
    public List<C13510x> mo4802l() {
        TypeVariable<Constructor<?>>[] typeParameters = mo4807c0().getTypeParameters();
        l.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new C13510x(typeVariable));
        }
        return arrayList;
    }
}
