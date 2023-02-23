package androidx.lifecycle;

import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1542b;
/* loaded from: classes2.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC1572l {

    /* renamed from: c */
    private final Object f4722c;

    /* renamed from: d */
    private final C1542b.C1543a f4723d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4722c = obj;
        this.f4723d = C1542b.f4735c.m35557c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1572l
    /* renamed from: m */
    public void mo34271m(o oVar, AbstractC1565i.b bVar) {
        this.f4723d.m35554a(oVar, bVar, this.f4722c);
    }
}
