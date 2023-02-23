package kotlin.reflect.jvm.internal.impl.descriptors.p552j1;

import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13517o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13545u0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* compiled from: PackageFragmentDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j1.z */
/* loaded from: classes3.dex */
public abstract class AbstractC13446z extends AbstractC13409k implements InterfaceC13320f0 {

    /* renamed from: w */
    private final C12609c f29804w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13446z(InterfaceC13305c0 interfaceC13305c0, C12609c c12609c) {
        super(interfaceC13305c0, InterfaceC13346g.f29516s.m5317b(), c12609c.m7376h(), InterfaceC13545u0.f29903a);
        l.f(interfaceC13305c0, "module");
        l.f(c12609c, "fqName");
        this.f29804w = c12609c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        l.f(interfaceC13517o, "visitor");
        return interfaceC13517o.mo4758f(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13320f0
    /* renamed from: f */
    public final C12609c mo4954f() {
        return this.f29804w;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13519p
    /* renamed from: m */
    public InterfaceC13545u0 mo4745m() {
        InterfaceC13545u0 interfaceC13545u0 = InterfaceC13545u0.f29903a;
        l.e(interfaceC13545u0, "NO_SOURCE");
        return interfaceC13545u0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13405j
    public String toString() {
        return l.m("package ", this.f29804w);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p552j1.AbstractC13409k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: d */
    public InterfaceC13305c0 mo4687d() {
        return (InterfaceC13305c0) super.mo4687d();
    }
}
