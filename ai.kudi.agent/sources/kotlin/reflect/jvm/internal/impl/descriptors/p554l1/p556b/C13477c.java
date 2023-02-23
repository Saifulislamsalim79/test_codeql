package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.e0.d.l;
import kotlin.p483e0.C11754a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12268b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13478d;
/* compiled from: ReflectJavaAnnotation.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.c */
/* loaded from: classes3.dex */
public final class C13477c extends AbstractC13498n implements InterfaceC12265a {

    /* renamed from: a */
    private final Annotation f29836a;

    public C13477c(Annotation annotation) {
        l.f(annotation, "annotation");
        this.f29836a = annotation;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a
    /* renamed from: B */
    public boolean mo4884B() {
        return InterfaceC12265a.C12266a.m9273a(this);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a
    /* renamed from: N */
    public Collection<InterfaceC12268b> mo4882N() {
        Method[] declaredMethods = C11754a.m10364b(C11754a.m10365a(this.f29836a)).getDeclaredMethods();
        l.e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC13478d.C13479a c13479a = AbstractC13478d.f29837b;
            Object invoke = method.invoke(m4881Z(), new Object[0]);
            l.e(invoke, "method.invoke(annotation)");
            arrayList.add(c13479a.m4876a(invoke, C12614f.m7349i(method.getName())));
        }
        return arrayList;
    }

    /* renamed from: Z */
    public final Annotation m4881Z() {
        return this.f29836a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a
    /* renamed from: a0 */
    public C13486j mo4883F() {
        return new C13486j(C11754a.m10364b(C11754a.m10365a(this.f29836a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13477c) && l.b(this.f29836a, ((C13477c) obj).f29836a);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a
    /* renamed from: h */
    public C12608b mo4879h() {
        return C13474b.m4893a(C11754a.m10364b(C11754a.m10365a(this.f29836a)));
    }

    public int hashCode() {
        return this.f29836a.hashCode();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a
    /* renamed from: n */
    public boolean mo4878n() {
        return InterfaceC12265a.C12266a.m9272b(this);
    }

    public String toString() {
        return C13477c.class.getName() + ": " + this.f29836a;
    }
}
