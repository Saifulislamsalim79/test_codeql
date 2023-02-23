package androidx.fragment.app;

import android.view.View;
/* compiled from: DialogFragment.java */
/* loaded from: classes2.dex */
class h$e extends AbstractC1499k {

    /* renamed from: a */
    final /* synthetic */ AbstractC1499k f4574a;

    /* renamed from: b */
    final /* synthetic */ h f4575b;

    h$e(h hVar, AbstractC1499k abstractC1499k) {
        this.f4575b = hVar;
        this.f4574a = abstractC1499k;
    }

    @Override // androidx.fragment.app.AbstractC1499k
    /* renamed from: c */
    public View mo35680c(int i) {
        if (this.f4574a.mo35679d()) {
            return this.f4574a.mo35680c(i);
        }
        return this.f4575b.onFindViewById(i);
    }

    @Override // androidx.fragment.app.AbstractC1499k
    /* renamed from: d */
    public boolean mo35679d() {
        return this.f4574a.mo35679d() || this.f4575b.onHasView();
    }
}
