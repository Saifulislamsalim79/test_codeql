package kotlin.reflect.jvm.internal.impl.descriptors.p550h1;
/* compiled from: AnnotatedImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.b */
/* loaded from: classes3.dex */
public class C13339b implements InterfaceC13338a {

    /* renamed from: c */
    private final InterfaceC13346g f29495c;

    public C13339b(InterfaceC13346g interfaceC13346g) {
        if (interfaceC13346g != null) {
            this.f29495c = interfaceC13346g;
        } else {
            m5326N(0);
            throw null;
        }
    }

    /* renamed from: N */
    private static /* synthetic */ void m5326N(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a
    /* renamed from: y */
    public InterfaceC13346g mo4956y() {
        InterfaceC13346g interfaceC13346g = this.f29495c;
        if (interfaceC13346g != null) {
            return interfaceC13346g;
        }
        m5326N(1);
        throw null;
    }
}
