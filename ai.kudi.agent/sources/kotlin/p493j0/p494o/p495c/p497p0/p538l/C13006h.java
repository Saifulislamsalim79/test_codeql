package kotlin.p493j0.p494o.p495c.p497p0.p538l;

import kotlin.e0.d.l;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KotlinTypeFactory.kt */
/* renamed from: kotlin.j0.o.c.p0.l.h */
/* loaded from: classes3.dex */
public final class C13006h extends AbstractC13093n {

    /* renamed from: e */
    private final InterfaceC13346g f29083e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13006h(AbstractC13010i0 abstractC13010i0, InterfaceC13346g interfaceC13346g) {
        super(abstractC13010i0);
        l.f(abstractC13010i0, "delegate");
        l.f(interfaceC13346g, "annotations");
        this.f29083e = interfaceC13346g;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m
    /* renamed from: j1 */
    public C13006h mo5907h1(AbstractC13010i0 abstractC13010i0) {
        l.f(abstractC13010i0, "delegate");
        return new C13006h(abstractC13010i0, mo4956y());
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13088m, kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a
    /* renamed from: y */
    public InterfaceC13346g mo4956y() {
        return this.f29083e;
    }
}
