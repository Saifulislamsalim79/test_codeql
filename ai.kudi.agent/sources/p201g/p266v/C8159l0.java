package p201g.p266v;

import android.view.View;
import android.view.WindowId;
/* compiled from: WindowIdApi18.java */
/* renamed from: g.v.l0 */
/* loaded from: classes2.dex */
class C8159l0 implements InterfaceC8167m0 {

    /* renamed from: a */
    private final WindowId f19566a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8159l0(View view) {
        this.f19566a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8159l0) && ((C8159l0) obj).f19566a.equals(this.f19566a);
    }

    public int hashCode() {
        return this.f19566a.hashCode();
    }
}
