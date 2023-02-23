package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p537k.InterfaceC12954n;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.InterfaceC13125t0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13346g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: typeParameterUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c */
/* loaded from: classes3.dex */
public final class C13304c implements InterfaceC13562z0 {

    /* renamed from: c */
    private final InterfaceC13562z0 f29458c;

    /* renamed from: d */
    private final InterfaceC13513m f29459d;

    /* renamed from: e */
    private final int f29460e;

    public C13304c(InterfaceC13562z0 interfaceC13562z0, InterfaceC13513m interfaceC13513m, int i) {
        kotlin.e0.d.l.f(interfaceC13562z0, "originalDescriptor");
        kotlin.e0.d.l.f(interfaceC13513m, "declarationDescriptor");
        this.f29458c = interfaceC13562z0;
        this.f29459d = interfaceC13513m;
        this.f29460e = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
    /* renamed from: L */
    public boolean mo4652L() {
        return this.f29458c.mo4652L();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: S */
    public <R, D> R mo4769S(InterfaceC13517o<R, D> interfaceC13517o, D d) {
        return (R) this.f29458c.mo4769S(interfaceC13517o, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13310d0
    /* renamed from: b */
    public C12614f mo5012b() {
        return this.f29458c.mo5012b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13515n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: d */
    public InterfaceC13513m mo4687d() {
        return this.f29459d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
    public List<AbstractC12965b0> getUpperBounds() {
        return this.f29458c.getUpperBounds();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
    /* renamed from: h */
    public int mo4650h() {
        return this.f29460e + this.f29458c.mo4650h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13519p
    /* renamed from: m */
    public InterfaceC13545u0 mo4745m() {
        return this.f29458c.mo4745m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h
    /* renamed from: n */
    public InterfaceC13125t0 mo4649n() {
        return this.f29458c.mo4649n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
    /* renamed from: r */
    public EnumC13008h1 mo4648r() {
        return this.f29458c.mo4648r();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
    /* renamed from: r0 */
    public InterfaceC12954n mo4647r0() {
        return this.f29458c.mo4647r0();
    }

    public String toString() {
        return this.f29458c + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13334h
    /* renamed from: x */
    public AbstractC13010i0 mo5010x() {
        return this.f29458c.mo5010x();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13338a
    /* renamed from: y */
    public InterfaceC13346g mo4956y() {
        return this.f29458c.mo4956y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0
    /* renamed from: y0 */
    public boolean mo4646y0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13513m
    /* renamed from: a */
    public InterfaceC13562z0 mo4651a() {
        InterfaceC13562z0 mo4651a = this.f29458c.mo4651a();
        kotlin.e0.d.l.e(mo4651a, "originalDescriptor.original");
        return mo4651a;
    }
}
