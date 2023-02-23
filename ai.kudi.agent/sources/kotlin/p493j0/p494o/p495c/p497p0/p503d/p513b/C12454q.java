package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p515e.p516a0.p517b.C12494e;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12903r;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.EnumC12844e;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12845f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13548v0;
/* compiled from: KotlinJvmBinarySourceElement.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.q */
/* loaded from: classes3.dex */
public final class C12454q implements InterfaceC12845f {

    /* renamed from: b */
    private final InterfaceC12447o f27631b;

    public C12454q(InterfaceC12447o interfaceC12447o, C12903r<C12494e> c12903r, boolean z, EnumC12844e enumC12844e) {
        l.f(interfaceC12447o, "binaryClass");
        l.f(enumC12844e, "abiStability");
        this.f27631b = interfaceC12447o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0
    /* renamed from: a */
    public InterfaceC13548v0 mo4706a() {
        InterfaceC13548v0 interfaceC13548v0 = InterfaceC13548v0.f29904a;
        l.e(interfaceC13548v0, "NO_SOURCE_FILE");
        return interfaceC13548v0;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.p536d0.InterfaceC12845f
    /* renamed from: c */
    public String mo6634c() {
        return "Class '" + this.f27631b.mo4922h().m7395b().m7382b() + '\'';
    }

    /* renamed from: d */
    public final InterfaceC12447o m8867d() {
        return this.f27631b;
    }

    public String toString() {
        return ((Object) C12454q.class.getSimpleName()) + ": " + this.f27631b;
    }
}
