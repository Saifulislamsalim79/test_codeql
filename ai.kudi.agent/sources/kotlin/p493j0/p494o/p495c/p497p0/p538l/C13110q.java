package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.InterfaceC12650f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p539j1.AbstractC13026h;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1.InterfaceC13070f;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.p542m1.C13090a;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: dynamicTypes.kt */
/* renamed from: kotlin.j0.o.c.p0.l.q */
/* loaded from: classes3.dex */
public final class C13110q extends AbstractC13130v implements InterfaceC13070f {

    /* renamed from: f */
    private final InterfaceC13346g f29185f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13110q(kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h r3, kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g r4) {
        /*
            r2 = this;
            java.lang.String r0 = "builtIns"
            kotlin.e0.d.l.f(r3, r0)
            java.lang.String r0 = "annotations"
            kotlin.e0.d.l.f(r4, r0)
            kotlin.j0.o.c.p0.l.i0 r0 = r3.m9925H()
            java.lang.String r1 = "builtIns.nothingType"
            kotlin.e0.d.l.e(r0, r1)
            kotlin.j0.o.c.p0.l.i0 r3 = r3.m9924I()
            java.lang.String r1 = "builtIns.nullableAnyType"
            kotlin.e0.d.l.e(r3, r1)
            r2.<init>(r0, r3)
            r2.f29185f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p493j0.p494o.p495c.p497p0.p538l.C13110q.<init>(kotlin.j0.o.c.p0.b.h, kotlin.reflect.jvm.internal.impl.descriptors.h1.g):void");
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v, kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: X0 */
    public boolean mo5778X0() {
        return false;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0
    /* renamed from: Y0 */
    public /* bridge */ /* synthetic */ AbstractC12965b0 mo5768Y0(AbstractC13026h abstractC13026h) {
        m5838i1(abstractC13026h);
        return this;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: a1 */
    public /* bridge */ /* synthetic */ AbstractC13005g1 mo5767a1(boolean z) {
        m5839h1(z);
        return this;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: b1 */
    public /* bridge */ /* synthetic */ AbstractC13005g1 mo5766b1(AbstractC13026h abstractC13026h) {
        m5838i1(abstractC13026h);
        return this;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v
    /* renamed from: d1 */
    public AbstractC13010i0 mo5764d1() {
        return m5776f1();
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v
    /* renamed from: g1 */
    public String mo5763g1(AbstractC12624c abstractC12624c, InterfaceC12650f interfaceC12650f) {
        l.f(abstractC12624c, "renderer");
        l.f(interfaceC12650f, "options");
        return "dynamic";
    }

    /* renamed from: h1 */
    public C13110q m5839h1(boolean z) {
        return this;
    }

    /* renamed from: i1 */
    public C13110q m5838i1(AbstractC13026h abstractC13026h) {
        l.f(abstractC13026h, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13005g1
    /* renamed from: j1 */
    public C13110q mo5765c1(InterfaceC13346g interfaceC13346g) {
        l.f(interfaceC13346g, "newAnnotations");
        return new C13110q(C13090a.m5899h(mo5764d1()), interfaceC13346g);
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13130v, kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a
    /* renamed from: y */
    public InterfaceC13346g mo4956y() {
        return this.f29185f;
    }
}
