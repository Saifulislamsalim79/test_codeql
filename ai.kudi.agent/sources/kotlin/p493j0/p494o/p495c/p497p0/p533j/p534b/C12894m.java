package kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.reflect.jvm.internal.impl.descriptors.C13361i0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13332g0;
/* compiled from: DeserializedClassDataFinder.kt */
/* renamed from: kotlin.j0.o.c.p0.j.b.m */
/* loaded from: classes3.dex */
public final class C12894m implements InterfaceC12881g {

    /* renamed from: a */
    private final InterfaceC13332g0 f28922a;

    public C12894m(InterfaceC13332g0 interfaceC13332g0) {
        l.f(interfaceC13332g0, "packageFragmentProvider");
        this.f28922a = interfaceC13332g0;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12881g
    /* renamed from: a */
    public C12880f mo6429a(C12608b c12608b) {
        C12880f mo6429a;
        l.f(c12608b, "classId");
        InterfaceC13332g0 interfaceC13332g0 = this.f28922a;
        C12609c m7389h = c12608b.m7389h();
        l.e(m7389h, "classId.packageFqName");
        for (InterfaceC13320f0 interfaceC13320f0 : C13361i0.m5296c(interfaceC13332g0, m7389h)) {
            if ((interfaceC13320f0 instanceof AbstractC12895n) && (mo6429a = ((AbstractC12895n) interfaceC13320f0).mo6464U0().mo6429a(c12608b)) != null) {
                return mo6429a;
            }
        }
        return null;
    }
}
