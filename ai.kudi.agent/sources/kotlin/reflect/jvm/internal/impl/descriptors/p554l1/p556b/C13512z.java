package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12269b0;
import kotlin.p557z.C13706j;
import kotlin.p557z.C13726r;
import kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13508w;
/* compiled from: ReflectJavaWildcardType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.z */
/* loaded from: classes3.dex */
public final class C13512z extends AbstractC13508w implements InterfaceC12269b0 {

    /* renamed from: b */
    private final WildcardType f29872b;

    /* renamed from: c */
    private final Collection<InterfaceC12265a> f29873c;

    /* renamed from: d */
    private final boolean f29874d;

    public C13512z(WildcardType wildcardType) {
        List m3891e;
        l.f(wildcardType, "reflectType");
        this.f29872b = wildcardType;
        m3891e = C13726r.m3891e();
        this.f29873c = m3891e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12269b0
    /* renamed from: R */
    public boolean mo4775R() {
        Type[] upperBounds = mo4774Z().getUpperBounds();
        l.e(upperBounds, "reflectType.upperBounds");
        return !l.b(C13706j.m4075x(upperBounds), Object.class);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12269b0
    /* renamed from: a0 */
    public AbstractC13508w mo4776I() {
        Type[] upperBounds = mo4774Z().getUpperBounds();
        Type[] lowerBounds = mo4774Z().getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            if (lowerBounds.length == 1) {
                AbstractC13508w.C13509a c13509a = AbstractC13508w.f29866a;
                l.e(lowerBounds, "lowerBounds");
                Object m4106N = C13706j.m4106N(lowerBounds);
                l.e(m4106N, "lowerBounds.single()");
                return c13509a.m4789a((Type) m4106N);
            } else if (upperBounds.length == 1) {
                l.e(upperBounds, "upperBounds");
                Type type = (Type) C13706j.m4106N(upperBounds);
                if (l.b(type, Object.class)) {
                    return null;
                }
                AbstractC13508w.C13509a c13509a2 = AbstractC13508w.f29866a;
                l.e(type, "ub");
                return c13509a2.m4789a(type);
            } else {
                return null;
            }
        }
        throw new UnsupportedOperationException(l.m("Wildcard types with many bounds are not yet supported: ", mo4774Z()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13508w
    /* renamed from: b0 */
    public WildcardType mo4774Z() {
        return this.f29872b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: q */
    public boolean mo4771q() {
        return this.f29874d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: y */
    public Collection<InterfaceC12265a> mo4770y() {
        return this.f29873c;
    }
}
