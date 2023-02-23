package kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b;

import kotlin.C13668y;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.C12880f;
import kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12881g;
/* compiled from: JavaClassDataFinder.kt */
/* renamed from: kotlin.j0.o.c.p0.d.b.f */
/* loaded from: classes3.dex */
public final class C12430f implements InterfaceC12881g {

    /* renamed from: a */
    private final InterfaceC12442m f27608a;

    /* renamed from: b */
    private final C12427e f27609b;

    public C12430f(InterfaceC12442m interfaceC12442m, C12427e c12427e) {
        l.f(interfaceC12442m, "kotlinClassFinder");
        l.f(c12427e, "deserializedDescriptorResolver");
        this.f27608a = interfaceC12442m;
        this.f27609b = c12427e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p533j.p534b.InterfaceC12881g
    /* renamed from: a */
    public C12880f mo6429a(C12608b c12608b) {
        l.f(c12608b, "classId");
        InterfaceC12447o m8884b = C12446n.m8884b(this.f27608a, c12608b);
        if (m8884b == null) {
            return null;
        }
        boolean b = l.b(m8884b.mo4922h(), c12608b);
        if (C13668y.f30115a && !b) {
            throw new AssertionError("Class with incorrect id found: expected " + c12608b + ", actual " + m8884b.mo4922h());
        }
        return this.f27609b.m8934j(m8884b);
    }
}
