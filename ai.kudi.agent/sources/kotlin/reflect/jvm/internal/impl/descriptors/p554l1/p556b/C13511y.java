package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12267a0;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
/* compiled from: ReflectJavaValueParameter.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.y */
/* loaded from: classes3.dex */
public final class C13511y extends AbstractC13498n implements InterfaceC12267a0 {

    /* renamed from: a */
    private final AbstractC13508w f29868a;

    /* renamed from: b */
    private final Annotation[] f29869b;

    /* renamed from: c */
    private final String f29870c;

    /* renamed from: d */
    private final boolean f29871d;

    public C13511y(AbstractC13508w abstractC13508w, Annotation[] annotationArr, String str, boolean z) {
        l.f(abstractC13508w, "type");
        l.f(annotationArr, "reflectAnnotations");
        this.f29868a = abstractC13508w;
        this.f29869b = annotationArr;
        this.f29870c = str;
        this.f29871d = z;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: Z */
    public C13477c mo4777r(C12609c c12609c) {
        l.f(c12609c, "fqName");
        return C13483g.m4871a(this.f29869b, c12609c);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: a0 */
    public List<C13477c> mo4770y() {
        return C13483g.m4870b(this.f29869b);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12267a0
    /* renamed from: b */
    public C12614f mo4781b() {
        String str = this.f29870c;
        if (str == null) {
            return null;
        }
        return C12614f.m7350h(str);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12267a0
    /* renamed from: b0 */
    public AbstractC13508w mo4779c() {
        return this.f29868a;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12267a0
    /* renamed from: d */
    public boolean mo4778d() {
        return this.f29871d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: q */
    public boolean mo4771q() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C13511y.class.getName());
        sb.append(": ");
        sb.append(mo4778d() ? "vararg " : "");
        sb.append(mo4781b());
        sb.append(": ");
        sb.append(mo4779c());
        return sb.toString();
    }
}
