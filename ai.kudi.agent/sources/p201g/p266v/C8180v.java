package p201g.p266v;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* compiled from: ViewGroupOverlayApi18.java */
/* renamed from: g.v.v */
/* loaded from: classes2.dex */
class C8180v implements InterfaceC8181w {

    /* renamed from: a */
    private final ViewGroupOverlay f19634a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8180v(ViewGroup viewGroup) {
        this.f19634a = viewGroup.getOverlay();
    }

    @Override // p201g.p266v.InterfaceC8117b0
    /* renamed from: a */
    public void mo16564a(Drawable drawable) {
        this.f19634a.add(drawable);
    }

    @Override // p201g.p266v.InterfaceC8117b0
    /* renamed from: b */
    public void mo16563b(Drawable drawable) {
        this.f19634a.remove(drawable);
    }

    @Override // p201g.p266v.InterfaceC8181w
    /* renamed from: c */
    public void mo16571c(View view) {
        this.f19634a.add(view);
    }

    @Override // p201g.p266v.InterfaceC8181w
    /* renamed from: d */
    public void mo16570d(View view) {
        this.f19634a.remove(view);
    }
}
