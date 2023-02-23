package kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
/* compiled from: ImplicitClassReceiver.kt */
/* renamed from: kotlin.j0.o.c.p0.i.w.o.c */
/* loaded from: classes3.dex */
public class C12796c implements InterfaceC12797d, InterfaceC12799f {

    /* renamed from: a */
    private final InterfaceC13312e f28688a;

    public C12796c(InterfaceC13312e interfaceC13312e, C12796c c12796c) {
        l.f(interfaceC13312e, "classDescriptor");
        this.f28688a = interfaceC13312e;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.InterfaceC12797d
    /* renamed from: b */
    public AbstractC13010i0 mo4724c() {
        AbstractC13010i0 mo5010x = this.f28688a.mo5010x();
        l.e(mo5010x, "classDescriptor.defaultType");
        return mo5010x;
    }

    public boolean equals(Object obj) {
        InterfaceC13312e interfaceC13312e = this.f28688a;
        C12796c c12796c = obj instanceof C12796c ? (C12796c) obj : null;
        return l.b(interfaceC13312e, c12796c != null ? c12796c.f28688a : null);
    }

    public int hashCode() {
        return this.f28688a.hashCode();
    }

    public String toString() {
        return "Class{" + mo4724c() + '}';
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.p532o.InterfaceC12799f
    /* renamed from: v */
    public final InterfaceC13312e mo6751v() {
        return this.f28688a;
    }
}
