package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12283m;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.o */
/* loaded from: classes3.dex */
public final class C13499o extends AbstractC13478d implements InterfaceC12283m {

    /* renamed from: c */
    private final Enum<?> f29858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13499o(C12614f c12614f, Enum<?> r3) {
        super(c12614f, null);
        l.f(r3, "value");
        this.f29858c = r3;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12283m
    /* renamed from: c */
    public C12608b mo4824c() {
        Class<?> cls = this.f29858c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        l.e(cls, "enumClass");
        return C13474b.m4893a(cls);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12283m
    /* renamed from: e */
    public C12614f mo4823e() {
        return C12614f.m7349i(this.f29858c.name());
    }
}
