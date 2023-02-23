package p201g.p219f.p223b.p224k.p225m;

import p201g.p219f.p223b.p224k.p225m.C7579f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DimensionDependency.java */
/* renamed from: g.f.b.k.m.g */
/* loaded from: classes2.dex */
public class C7581g extends C7579f {

    /* renamed from: m */
    public int f18238m;

    public C7581g(AbstractC7593p abstractC7593p) {
        super(abstractC7593p);
        if (abstractC7593p instanceof C7586l) {
            this.f18221e = C7579f.EnumC7580a.HORIZONTAL_DIMENSION;
        } else {
            this.f18221e = C7579f.EnumC7580a.VERTICAL_DIMENSION;
        }
    }

    @Override // p201g.p219f.p223b.p224k.p225m.C7579f
    /* renamed from: d */
    public void mo18122d(int i) {
        if (this.f18226j) {
            return;
        }
        this.f18226j = true;
        this.f18223g = i;
        for (InterfaceC7577d interfaceC7577d : this.f18227k) {
            interfaceC7577d.mo18089a(interfaceC7577d);
        }
    }
}
