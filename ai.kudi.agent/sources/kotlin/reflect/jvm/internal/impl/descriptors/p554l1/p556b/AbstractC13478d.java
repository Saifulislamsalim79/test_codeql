package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.annotation.Annotation;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12268b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.d */
/* loaded from: classes3.dex */
public abstract class AbstractC13478d implements InterfaceC12268b {

    /* renamed from: b */
    public static final C13479a f29837b = new C13479a(null);

    /* renamed from: a */
    private final C12614f f29838a;

    /* compiled from: ReflectJavaAnnotationArguments.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.d$a */
    /* loaded from: classes3.dex */
    public static final class C13479a {
        private C13479a() {
        }

        public /* synthetic */ C13479a(g gVar) {
            this();
        }

        /* renamed from: a */
        public final AbstractC13478d m4876a(Object obj, C12614f c12614f) {
            l.f(obj, "value");
            return C13474b.m4887g(obj.getClass()) ? new C13499o(c12614f, (Enum) obj) : obj instanceof Annotation ? new C13480e(c12614f, (Annotation) obj) : obj instanceof Object[] ? new C13484h(c12614f, (Object[]) obj) : obj instanceof Class ? new C13495k(c12614f, (Class) obj) : new C13501q(c12614f, obj);
        }
    }

    private AbstractC13478d(C12614f c12614f) {
        this.f29838a = c12614f;
    }

    public /* synthetic */ AbstractC13478d(C12614f c12614f, g gVar) {
        this(c12614f);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12268b
    /* renamed from: b */
    public C12614f mo4877b() {
        return this.f29838a;
    }
}
