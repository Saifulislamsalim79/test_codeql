package androidx.lifecycle;

import androidx.lifecycle.AbstractC1565i;
/* loaded from: classes2.dex */
class CompositeGeneratedAdaptersObserver implements InterfaceC1572l {

    /* renamed from: c */
    private final InterfaceC1555g[] f4692c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(InterfaceC1555g[] interfaceC1555gArr) {
        this.f4692c = interfaceC1555gArr;
    }

    @Override // androidx.lifecycle.InterfaceC1572l
    /* renamed from: m */
    public void mo34271m(o oVar, AbstractC1565i.b bVar) {
        C1582t c1582t = new C1582t();
        for (InterfaceC1555g interfaceC1555g : this.f4692c) {
            interfaceC1555g.callMethods(oVar, bVar, false, c1582t);
        }
        for (InterfaceC1555g interfaceC1555g2 : this.f4692c) {
            interfaceC1555g2.callMethods(oVar, bVar, true, c1582t);
        }
    }
}
