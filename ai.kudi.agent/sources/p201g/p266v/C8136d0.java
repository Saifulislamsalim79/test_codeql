package p201g.p266v;

import android.view.View;
/* compiled from: ViewUtilsApi19.java */
/* renamed from: g.v.d0 */
/* loaded from: classes2.dex */
class C8136d0 extends C8150i0 {

    /* renamed from: e */
    private static boolean f19518e = true;

    @Override // p201g.p266v.C8150i0
    /* renamed from: a */
    public void mo16677a(View view) {
    }

    @Override // p201g.p266v.C8150i0
    /* renamed from: c */
    public float mo16675c(View view) {
        if (f19518e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f19518e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p201g.p266v.C8150i0
    /* renamed from: d */
    public void mo16674d(View view) {
    }

    @Override // p201g.p266v.C8150i0
    /* renamed from: f */
    public void mo16672f(View view, float f) {
        if (f19518e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f19518e = false;
            }
        }
        view.setAlpha(f);
    }
}
