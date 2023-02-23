package p201g.p266v;

import android.graphics.Matrix;
import android.view.View;
/* compiled from: ViewUtilsApi29.java */
/* renamed from: g.v.h0 */
/* loaded from: classes2.dex */
class C8148h0 extends C8146g0 {
    @Override // p201g.p266v.C8136d0, p201g.p266v.C8150i0
    /* renamed from: c */
    public float mo16675c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p201g.p266v.C8144f0, p201g.p266v.C8150i0
    /* renamed from: e */
    public void mo16673e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p201g.p266v.C8136d0, p201g.p266v.C8150i0
    /* renamed from: f */
    public void mo16672f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p201g.p266v.C8146g0, p201g.p266v.C8150i0
    /* renamed from: g */
    public void mo16671g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p201g.p266v.C8142e0, p201g.p266v.C8150i0
    /* renamed from: h */
    public void mo16670h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p201g.p266v.C8142e0, p201g.p266v.C8150i0
    /* renamed from: i */
    public void mo16669i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
