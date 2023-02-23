package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.annotation.Annotation;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12270c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.e */
/* loaded from: classes3.dex */
public final class C13480e extends AbstractC13478d implements InterfaceC12270c {

    /* renamed from: c */
    private final Annotation f29839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13480e(C12614f c12614f, Annotation annotation) {
        super(c12614f, null);
        l.f(annotation, "annotation");
        this.f29839c = annotation;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12270c
    /* renamed from: a */
    public InterfaceC12265a mo4875a() {
        return new C13477c(this.f29839c);
    }
}
