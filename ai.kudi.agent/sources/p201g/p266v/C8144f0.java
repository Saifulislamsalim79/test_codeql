package p201g.p266v;

import android.view.View;
/* compiled from: ViewUtilsApi22.java */
/* renamed from: g.v.f0 */
/* loaded from: classes2.dex */
class C8144f0 extends C8142e0 {

    /* renamed from: h */
    private static boolean f19532h = true;

    @Override // p201g.p266v.C8150i0
    /* renamed from: e */
    public void mo16673e(View view, int i, int i2, int i3, int i4) {
        if (f19532h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f19532h = false;
            }
        }
    }
}
