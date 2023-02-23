package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b;

import java.util.Collection;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.EnumC12052i;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12293v;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.EnumC12757e;
import kotlin.p557z.C13726r;
/* compiled from: ReflectJavaPrimitiveType.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.b.v */
/* loaded from: classes3.dex */
public final class C13507v extends AbstractC13508w implements InterfaceC12293v {

    /* renamed from: b */
    private final Class<?> f29863b;

    /* renamed from: c */
    private final Collection<InterfaceC12265a> f29864c;

    /* renamed from: d */
    private final boolean f29865d;

    public C13507v(Class<?> cls) {
        List m3891e;
        l.f(cls, "reflectType");
        this.f29863b = cls;
        m3891e = C13726r.m3891e();
        this.f29864c = m3891e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p556b.AbstractC13508w
    /* renamed from: a0 */
    public Class<?> mo4774Z() {
        return this.f29863b;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12293v
    /* renamed from: c */
    public EnumC12052i mo4790c() {
        if (l.b(mo4774Z(), Void.TYPE)) {
            return null;
        }
        return EnumC12757e.m6828b(mo4774Z().getName()).m6824i();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: q */
    public boolean mo4771q() {
        return this.f29865d;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d
    /* renamed from: y */
    public Collection<InterfaceC12265a> mo4770y() {
        return this.f29864c;
    }
}
