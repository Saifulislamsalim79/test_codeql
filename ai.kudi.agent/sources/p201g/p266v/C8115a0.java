package p201g.p266v;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* compiled from: ViewOverlayApi18.java */
/* renamed from: g.v.a0 */
/* loaded from: classes2.dex */
class C8115a0 implements InterfaceC8117b0 {

    /* renamed from: a */
    private final ViewOverlay f19479a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8115a0(View view) {
        this.f19479a = view.getOverlay();
    }

    @Override // p201g.p266v.InterfaceC8117b0
    /* renamed from: a */
    public void mo16564a(Drawable drawable) {
        this.f19479a.add(drawable);
    }

    @Override // p201g.p266v.InterfaceC8117b0
    /* renamed from: b */
    public void mo16563b(Drawable drawable) {
        this.f19479a.remove(drawable);
    }
}
